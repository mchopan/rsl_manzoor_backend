package com.project_news.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "news", schema = "news")
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
    private Long id;

    @Column
    private  String newsTitle;

    @Column
    private String newsDescription;

    @Column
    private Integer categoryId;




    @OneToOne(cascade = CascadeType.MERGE )
    @JoinColumn(name = "locationId")
    private Location location;

}

//    @Column(name="DESC", nullable=false, length=512)
//    public String getDescription() { return description; }
//
//     Example 2:
//
//@Column(name="DESC",
//        columnDefinition="CLOB NOT NULL",
//        table="EMP_DETAIL")
//@Lob
//public String getDescription() { return description; }
//
//        Example 3:
//
//@Column(name="ORDER_COST", updatable=false, precision=12, scale=2)
//public BigDecimal getCost() { return cost; }