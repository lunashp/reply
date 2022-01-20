package kr.co.eight.teamproject1.repository;

import kr.co.eight.teamproject1.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
}