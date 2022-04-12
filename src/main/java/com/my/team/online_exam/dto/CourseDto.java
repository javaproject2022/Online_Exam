package com.my.team.online_exam.dto;

import javax.validation.constraints.NotNull;

public class CourseDto {
    @NotNull(message = "field cannot be null")
    private String name;

}
