package kr.co.eight.teamproject1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReplyVO {

    private Long REPLY_ID;
    private Long BOARD_ID;
    private String MEMBER_NICKNAME;
    private String REPLY_CONTENT;
    private String REPLY_IP;
    private String REPLY_SECRET;
    private String REPLY_PASSWORD;

    private LocalDateTime REPLY_WRITHDATE;

}
