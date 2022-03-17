package com.my.team.online_exam.data.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author fh.kazemi
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ADDRESS" , schema = "ONLINE_EXAM")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "PROVINCE")
    private String province;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STREET")
    private String street;

    @Column(name = "ALLEY")
    private String alley;

    @Column(name = "NO")
    private String no;

    @Column(name = "UNIT_NUMBER")
    private String unitNumber;

    @Column(name = "ZIP_CODE")
    private String zipcode;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Address))
            return false;
        Address address = (Address) o;
        return Objects.equals(getId(), address.getId())
                && Objects.equals(getProvince(), address.getProvince())
                && Objects.equals(getCity(), address.getCity())
                && Objects.equals(getStreet(), address.getStreet())
                && Objects.equals(getAlley(), address.getAlley())
                && Objects.equals(getNo(), address.getNo())
                && Objects.equals(getUnitNumber(), address.getUnitNumber())
                && Objects.equals(getZipcode(), address.getZipcode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getProvince(), getCity(), getStreet(),
                getAlley(), getNo(), getUnitNumber(), getZipcode());
    }
}
