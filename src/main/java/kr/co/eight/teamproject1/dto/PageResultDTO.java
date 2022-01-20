package kr.co.eight.teamproject1.dto;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;
@Data
public class PageResultDTO <DTO, EN> {

    private List<DTO> dtoList;

    private int totalPage, start, end;
    private int page;
    private int size;

    private boolean prev, next;

    private List<Integer> pageList;

    private Page<EN> result;
}
