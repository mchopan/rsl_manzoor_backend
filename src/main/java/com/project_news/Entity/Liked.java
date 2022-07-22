package com.project_news.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "liked", schema = "news")
public class Liked {
    @Id
    @SequenceGenerator(
            name="liked_seq",
            sequenceName = "liked_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "liked_seq"
    )
    private Long id;


    @Column(name="News", nullable=false, length=512)
    private Integer newsId;

    @Column(name="User", nullable=false, length=512)
    private Integer userId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "newsId")
    private News news;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private  User user;
}
