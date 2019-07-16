package com.demo.springboot.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "application_id")
    private Application application;

    @ManyToOne
    @JoinTable(name = "ticket_release", joinColumns = @JoinColumn(name = "ticket_fk"), inverseJoinColumns = @JoinColumn(name = "release_fk"))
    private Release release;

    private String title;
    private String description;
    private String status;

    public Ticket(final String title, final String description, final String status, final Application application, final Release release) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.application = application;
        this.release = release;
    }
}
