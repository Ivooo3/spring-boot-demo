package com.demo.springboot.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Release {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "releaseDate")
    private String releaseDate;

    @Column(name = "description")
    private String description;

    public Release(final String releaseDate, final String description) {
        this.releaseDate = releaseDate;
        this.description = description;
    }

}
