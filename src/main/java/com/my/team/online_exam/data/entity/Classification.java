package com.my.team.online_exam.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Classification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String tile;
    @OneToMany(mappedBy = "classification",fetch = FetchType.LAZY)
    private Set<Course> courses = new HashSet<>();
}
