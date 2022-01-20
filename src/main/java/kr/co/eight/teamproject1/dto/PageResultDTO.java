package kr.co.eight.teamproject1.dto;

import java.util.List;

public class PageResultDTO <DTO, EN> {

    private List<DTO> dtoList;

    private int totalPage, start, end;
    private int page;
    private int size;

    private boolean prev, next;
}
