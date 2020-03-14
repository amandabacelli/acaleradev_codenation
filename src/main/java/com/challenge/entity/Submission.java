package com.challenge.entity;


import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@EntityListeners(EntityManagerFactory.class)
@Table(name =  "submision")
public class Submission {

    @EmbeddedId
    private SubmissionId id;

    @Column
    @NotNull
    private float score;

    @CreatedDate
    private Timestamp createdAt;

    public SubmissionId getId() {
        return id;
    }

    public void setId(SubmissionId id) {
        this.id = id;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Timestamp getcreatedAt() {
        return createdAt;
    }

}
