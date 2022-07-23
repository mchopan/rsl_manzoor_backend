package com.project_news.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "user", schema = "news")
public class User {
    @Id
    @SequenceGenerator(
            name="user_seq",
            sequenceName = "user_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_seq"
    )
    private Long id;

    @Column
    private String name;

    @Column
    private String userName;

    @Column
    private String password;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "locationId")
    private Location location;
}
