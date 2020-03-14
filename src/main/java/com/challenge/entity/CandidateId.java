package com.challenge.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.EntityListeners;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@Embeddable
@EntityListeners(EntityManagerFactory.class)
public class CandidateId  implements Serializable {

    @ManyToOne
    private User user;

    @ManyToOne
    private Acceleration acceleration;

    @ManyToOne
    private Company company;

}

