package org.home.simple.service;

import org.home.simple.entity.Member;

import java.util.List;

public interface MemberService {

    public List<Member> findAll();

    public Member findById(int theId);

    public List<Member> findFromTill(int theIdFrom, int theIdTill);

    public void save(Member member);

    public void deleteById(int theId);

}
