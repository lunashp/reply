package kr.co.eight.teamproject1.service;

import kr.co.eight.teamproject1.dto.PageRequestDTO;
import kr.co.eight.teamproject1.dto.PageResultDTO;
import kr.co.eight.teamproject1.entity.Board;
import kr.co.eight.teamproject1.entity.Member;
import kr.co.eight.teamproject1.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
@RequiredArgsConstructor
@Log4j2

public class BoardServiceImpl implements BoardService{

@Autowired
private BoardRepository boardRepository;

//    @Override
//    public PageResultDTO<Board, Object[]> getList(PageRequestDTO dto) {
//        Page<Object []> result = boardRepository.getBoardWithReplyCount(
//                dto.getPageable(Sort.by("bno").descending()));
//        Function<Object[], BoardDTO> fn = (
//                en -> entityToDTO((Board)en[0],
//                        (Member)en[1],
//                        (Long)en[2]));
//        return new PageResultDTO<>(result, fn);
//    }
//
//    @Override
//    public Long register(Board dto) {
//        Board board = dtoToEntity(dto);
//        boardRepository.save(board);
//        return board.getBno();
//    }

    @Override
    public Page<Board> findBoardList(Pageable pageable) {
        pageable = PageRequest.of(pageable.getPageNumber() <= 0 ? 0 : pageable.getPageNumber() - 1,
                pageable.getPageSize());
        return boardRepository.findAll(pageable);
    }

    @Override
    public Board findBoardByIdx(Long idx) {
        return boardRepository.findById(idx).orElse(new Board());
    }
}
