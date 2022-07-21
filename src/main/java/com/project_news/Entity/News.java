package com.project_news.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class News {
    @Id
    @SequenceGenerator(
                name = "news_seq",
                sequenceName = "news_seq",
                allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "news_seq"
    )
    private Long newsId;
    private  String newsTitle;
    private String newsDescription;
    private Long category;
    private Long location;
}
