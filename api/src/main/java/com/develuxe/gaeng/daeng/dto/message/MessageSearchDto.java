package com.develuxe.gaeng.daeng.dto.message;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
public class MessageSearchDto {

    private ZonedDateTime time;
    private Long conversationPartner1;
    private Long conversationPartner2;
    private String messageText;
    private ReadStatus readStatus;
    private Long dialogId;

}
