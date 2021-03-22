package org.home.simple.service;

import org.home.simple.dao.MemberRepository;
import org.home.simple.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService{

    MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    @Override
    public Member findById(int theId) {
        Optional<Member> result = memberRepository.findById(theId);

        Member theMember = null;

        if (result.isPresent()) {
            theMember = result.get();
        } else {
            // we didn't find the employee
            throw new RuntimeException("Did not find word id - " + theId);
        }

        return theMember;
    }

    @Override
    public List<Member> findFromTill(int theIdFrom, int theIdTill){
        return memberRepository.findFromTill(theIdFrom, theIdTill);
    }

    @Override
    public void save(Member member) {
      memberRepository.save(member);
    }

    @Override
    public void deleteById(int theId) {
         memberRepository.deleteById(theId);
    }
}
