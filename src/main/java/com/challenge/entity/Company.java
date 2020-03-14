package com.challenge.entity;


import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.util.List;

@EntityListeners(EntityManagerFactory.class)
@Entity
@Table(name = "company")
public class Company {

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

    @CreatedDate
    private Timestamp createdAt;

    @OneToMany(mappedBy = "id.company")
    private List<Candidate> candidates;

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
    
}
