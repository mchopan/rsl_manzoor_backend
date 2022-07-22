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

    @Column(name="UserName", nullable=false, length=512)
    private String userName;

    @Column(name="Password", nullable=false, length=512)
    private String password;

    @Column(name="Location", nullable=false, length=512)
    private Integer locationId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "locationId")
    private Location location;
}
