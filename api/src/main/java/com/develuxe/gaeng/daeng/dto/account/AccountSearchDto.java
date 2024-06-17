package com.develuxe.gaeng.daeng.dto.account;

import com.develuxe.gaeng.daeng.dto.base.BaseSearchDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountSearchDto extends BaseSearchDto {
    private List<Long> ids;
    private List<Long> blockedByIds;
    private String author;
    private String firstName;
    private String lastName;
    private String city;
    private String country;
    private Boolean isBlocked;
    private StatusCode statusCode;
    private Integer ageTo;
    private Integer ageFrom;

    @Override
    public String toString() {
        return "AccountSearchDto{" +
                "ids=" + ids +
                ", blockedByIds=" + blockedByIds +
                ", author='" + author + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", isBlocked=" + isBlocked +
                ", statusCode=" + statusCode +
                ", ageTo=" + ageTo +
                ", ageFrom=" + ageFrom +
                '}';
    }

}
