package com.my.team.online_exam.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {

    private String province;

    private String city;

    private String street;

    private String alley;

    private String no;

    private String unitNumber;

    private String zipcode;

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", alley='" + alley + '\'' +
                ", no='" + no + '\'' +
                ", unitNumber='" + unitNumber + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
