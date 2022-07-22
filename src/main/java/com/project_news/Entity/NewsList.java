package com.project_news.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewsList {
    @Id
    @SequenceGenerator(
            name="newsListSeq",
            sequenceName = "newsListSeq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "newsListSeq"
    )
    private Long categoryId;
    private Long newsId;
}
