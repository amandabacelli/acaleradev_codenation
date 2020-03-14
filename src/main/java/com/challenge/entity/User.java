package com.challenge.entity;



import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.util.Set;

@EntityListeners(EntityManagerFactory.class)
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    @Size(max = 100)
    private String fullName;

    @Column
    @NotNull
    @Email
    @Size(max = 100)
    private String email;

    @Column
    @NotNull
    @Size(max = 50)
    private String nickname;

    @Column
    @NotNull
    @Size(max = 255)
    private String password;

    @CreatedDate
    private Timestamp createdAt;

    @OneToMany(mappedBy = "id.user")
    private Set<Candidate> candidates;

    @OneToMany(mappedBy = "id.user")
    private Set<Submission> submissions;

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getfullName() {
        return fullName;
    }

    public void setfullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getcreatedAt() {
        return createdAt;
    }

}
