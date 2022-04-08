package com.my.team.online_exam.dto;

import com.my.team.online_exam.data.enums.Role;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AdminDto {
    private int id;

    @NotNull(message = "Username cannot be null")
    private String username;

    //@NotBlank(message = "field empty")
    @NotNull(message = "Password cannot be null")
    private String password;

    private Role role;

}
