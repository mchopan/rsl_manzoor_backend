package com.project_news.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LikedCategory {
    @Id
    @SequenceGenerator(
            name="likedCateSeq",
            sequenceName = "likedCateSeq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "likedCateSeq"
    )
    private Long id;


    @Column
    private Integer categoryId;

//    @OneToOne(cascade = CascadeType.MERGE)
//    @JoinColumn(name = "categoryId")
//    private Category category;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "userId")
    private User user;
}
