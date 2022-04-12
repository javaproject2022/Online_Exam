package com.my.team.online_exam.data.entity;

import com.my.team.online_exam.data.entity.person.Teacher;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Classification classification;

    @ManyToMany(mappedBy = "courseSet")
    private Set<Teacher> teachers = new HashSet<>();

}
