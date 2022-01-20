package kr.co.eight.teamproject1.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "writer")
public class Board extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long BOARD_NUMBER;
    @Column
    private String BOARD_TITLE;
    @Column
    private String BOARD_CONTENT;
//    @Column
//    private String BOARD_IP;
    @Column
    private String BOARD_NICKNAME;
    @Column
    private Long BOARD_READCNT;


    @ManyToOne(fetch = FetchType.LAZY)
    private Member writer;



}
