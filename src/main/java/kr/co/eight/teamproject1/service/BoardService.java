package kr.co.eight.teamproject1.service;

import kr.co.eight.teamproject1.dto.PageRequestDTO;
import kr.co.eight.teamproject1.dto.PageResultDTO;
import kr.co.eight.teamproject1.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BoardService {

    //목록보기
    //public PageResultDTO<Board, Object[]> getList(PageRequestDTO dto);

    Page<Board> findBoardList(Pageable pageable);
    Board findBoardByIdx(Long idx);

    //게시물 등록
    //public Long register(Board dto);

}
