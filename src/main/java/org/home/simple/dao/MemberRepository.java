package org.home.simple.dao;

import org.home.simple.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Integer> {

    // that's it ... no need to write any code LOL!

    public List<Member> findAllByOrderByLastNameAsc();

    @Query("SELECT w FROM Member w WHERE  w.id between :fromId and :tillId")
    public List<Member> findFromTill(@Param("fromId") Integer fid, @Param("tillId") Integer tid);

}

