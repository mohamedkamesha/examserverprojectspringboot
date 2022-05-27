package com.exam.examserver.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private boolean enabled = true;

    private String about;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="user_role",
    joinColumns = {@JoinColumn(name = "user_id")},
    inverseJoinColumns = {@JoinColumn(name = "role_id")}
    )
    @JsonIgnore
    private Set<Role> roles = new HashSet<>();

}
