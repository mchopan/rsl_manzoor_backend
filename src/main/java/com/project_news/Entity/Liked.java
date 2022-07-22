package com.project_news.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Liked {
    @Id
    @SequenceGenerator(
            name="likedSeq",
            sequenceName = "likedSeq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "likedSeq"
    )
    private Long newsId;
    private Long userId;
}
