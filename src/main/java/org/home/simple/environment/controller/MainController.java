package org.home.simple.environment.controller;

import org.home.simple.domain.Utils;
import org.home.simple.entity.*;
import org.home.simple.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import static org.home.simple.domain.Utils.getNameTimeBased;

@Controller
public class MainController {

    private MemberService memberService;

    public MainController(MemberService theMemberService) {
        memberService=theMemberService;
    }

    @GetMapping("/")
    public String getHome(Model model){
        System.out.println("In get /");
        System.out.println("Schowing home");
        return "home";
    }
    @PostMapping("/")
    public String homeSubmit(Model model) {
        return "home";
    }

    //--------/search get mappings-----------------------------
    @GetMapping("/search")
    public String getSearch(Model model){
        System.out.println("In getSearch get /search");
        List<Member> members=memberService.findAll();
        System.out.println("Found members="+members.size());
        model.addAttribute("members", members);
        System.out.println("Showing search");
        return "search";
    }

}

