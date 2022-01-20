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
    private int BOARD_NUMBER;
    @Column
    private String BOARD_TITLE;
    @Column
    private String BOARD_CONTENT;


    @ManyToOne(fetch = FetchType.LAZY)
    private Member writer;



}
