package com.challenge.entity;


import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@EntityListeners(EntityManagerFactory.class)
@Table(name = "acceleration")
public class Acceleration {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    @NotNull
    @Size(max = 100)
    private String name;

    @Column
    @NotNull
    @Size (max = 50)
    private String slug;

    @CreatedDate
    private Timestamp createdAt;

    @OneToMany(mappedBy = "id.acceleration")
    private Set<Candidate> candidates;

    @ManyToOne
    private Challenge challenge;
}
