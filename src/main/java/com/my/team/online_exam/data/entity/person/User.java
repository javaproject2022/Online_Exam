package com.my.team.online_exam.data.entity.person;

import com.my.team.online_exam.data.entity.Address;
import com.my.team.online_exam.data.enums.UserStatus;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * @author fh.kazemi
 **/
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USERS", schema = "ONLINE_EXAM")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME",length = 20)
    private String name;

    @Column(name = "SURNAME",length = 30)
    private String surname;

    @Column(name = "EMAIL", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "USERNAME", nullable = false, length = 20)
    private String username;

    @Column(name = "PASSWORD", nullable = false, length = 16)
    private String password;

    @OneToOne
    private Address address;

    @Column(name = "REGISTER_DATE")
    @CreationTimestamp
    private Date registerDate;

    @Column(name = "MODIFY_DATE")
    @UpdateTimestamp
    private Date modifyDate;

    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    private UserStatus status;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof User))
            return false;
        User user = (User) o;
        return getId().equals(user.getId())
                && getName().equals(user.getName())
                && getSurname().equals(user.getSurname())
                && getEmail().equals(user.getEmail())
                && getUsername().equals(user.getUsername())
                && getPassword().equals(user.getPassword())
                && getAddress().equals(user.getAddress())
                && getRegisterDate().equals(user.getRegisterDate())
                && getModifyDate().equals(user.getModifyDate())
                && getStatus() == user.getStatus();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSurname(),
                getEmail(), getUsername(), getPassword(), getAddress(),
                getRegisterDate(), getModifyDate(), getStatus());
    }
}
