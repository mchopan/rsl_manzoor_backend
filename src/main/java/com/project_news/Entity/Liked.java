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


    @Column
    private Integer newsId;


    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "userId")
    private  User user;
}
