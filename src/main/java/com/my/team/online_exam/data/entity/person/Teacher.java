package com.my.team.online_exam.data.entity.person;

import com.my.team.online_exam.data.entity.Course;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Teacher extends User{
    @ManyToMany
    private Set<Course> courseSet = new HashSet<>();
}
