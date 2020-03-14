package com.challenge.entity;


import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.util.List;


@Entity
@EntityListeners(EntityManagerFactory.class)
@Table(name = "challenge")
public class Challenge {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    @NotNull
    @Size (max = 100)
    private String name;

    @Column
    @NotNull
    @Size(max = 50)
    private String slug;

    @OneToMany(mappedBy = "challenge")
    private List<Acceleration> accelerations;

    @OneToMany(mappedBy = "id.challenge")
    private List<Submission> submissions;

    @CreatedDate
    private Timestamp createdAt;

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Timestamp getcreatedAt() {
        return createdAt;
    }

    public void setcreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
