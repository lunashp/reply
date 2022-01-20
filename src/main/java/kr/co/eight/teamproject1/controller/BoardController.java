package kr.co.eight.teamproject1.controller;

import kr.co.eight.teamproject1.dto.PageRequestDTO;
import kr.co.eight.teamproject1.repository.BoardRepository;
import kr.co.eight.teamproject1.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private BoardService boardService;

    @Autowired
    private BoardRepository boardRepository;

    @GetMapping("/list")
    public void list(PageRequestDTO pageRequestDTO, Model model){
        model.addAttribute(
                "boardList",
                boardService.findBoardList((Pageable) pageRequestDTO));

    }
//    @GetMapping("register")
//    public void register(){

    }



