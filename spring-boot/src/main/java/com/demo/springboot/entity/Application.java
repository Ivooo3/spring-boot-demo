package com.demo.springboot.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "application_id")
    private Integer id;

    @Column(name = "app_name", nullable = false)
    private String name;

    @Column(length = 2000)
    private String description;
    private String owner;

    public Application(final String name, final String description, final String owner) {
        this.name = name;
        this.owner = description;
        this.owner = owner;
    }

}
