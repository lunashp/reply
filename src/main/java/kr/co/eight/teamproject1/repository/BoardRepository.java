package kr.co.eight.teamproject1.repository;

import kr.co.eight.teamproject1.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BoardRepository  extends JpaRepository<Board, Long> {

//    @Query("select b, w from Board b left join b.writer w where b.bno = :bno")
//    Object getBoardWithWriter(@Param("bno") Long bno);


}
