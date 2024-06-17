package com.develuxe.gaeng.daeng.dto.account;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountOnlineDto {

    private Long id;
    private ZonedDateTime lastOnlineTime;
    private Boolean isOnline;
}
