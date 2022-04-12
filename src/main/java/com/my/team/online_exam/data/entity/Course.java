package com.my.team.online_exam.data.entity;

import com.my.team.online_exam.data.entity.person.Student;
import com.my.team.online_exam.data.entity.person.Teacher;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    @ManyToOne
    private Classification classification;

    @ManyToMany(mappedBy = "courseSet")
    private Set<Teacher> teachers = new HashSet<>();//how a course can have many teachers???????

    @ManyToMany(mappedBy = "courseSet")
    private Set<Student> students = new HashSet<>();

    @OneToMany(mappedBy = "course")
    private List<Exam> examList = new ArrayList<>();

}