package com.demo.springboot.entity;

import javax.persistence.*;

@Entity
public class Release {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "releaseDate")
    private String releaseDate;

    @Column(name = "description")
    private String description;

    public Release() {
    }

    public Release(final String releaseDate, final String description) {
        this.releaseDate = releaseDate;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
