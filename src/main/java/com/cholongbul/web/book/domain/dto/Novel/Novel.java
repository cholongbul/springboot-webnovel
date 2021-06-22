package com.cholongbul.web.book.domain.dto.Novel;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.soap.Text;

@NoArgsConstructor
@Entity
public class Novel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long n_id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String storyline;

    @Column(columnDefinition = "TEXT")
    private String image;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EndingState endingState;


}
