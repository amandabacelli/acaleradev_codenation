package com.challenge.entity;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@EntityListeners(EntityManagerFactory.class)
@Entity
@Table(name = "candidate")
public class Candidate {

    @EmbeddedId
    private CandidateId id;

    @Column
    @NotNull
    private Integer status;

    @CreatedDate
    private Timestamp createdAt;

}


