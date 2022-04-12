package com.my.team.online_exam.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Course course;
    private String description;
    private String time;
    private Timestamp startTime;
    private Timestamp endTime;
    private int score;
}
