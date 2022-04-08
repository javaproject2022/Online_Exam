package com.my.team.online_exam.dto;

import com.my.team.online_exam.data.entity.Address;
import com.my.team.online_exam.data.enums.Role;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    @Size(min = 3, max = 10, message = "length should be in between 3 to 10")
    private String name;

    @Size(min = 5, max = 15, message = "length should be in between 5 to 15")
    private String surname;

    @Email(message = "Email has invalid format")
    private String email;

    @NotBlank(message = "should not be empty")
    private String username;

    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", message = "length must be 8,include number,character,capital word")
    private String password;

    @OneToOne
    private Address address;

    private Role role;
    private Date registerDate;

}
