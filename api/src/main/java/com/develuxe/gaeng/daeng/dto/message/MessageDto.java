package com.develuxe.gaeng.daeng.dto.message;

import com.develuxe.gaeng.daeng.dto.base.BaseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class MessageDto extends BaseDto {


    @JsonProperty("time")
    private ZonedDateTime time;
    @JsonProperty("conversationPartner1")
    private Long conversationPartner1;
    @JsonProperty("conversationPartner2")
    private Long conversationPartner2;
    @JsonProperty("messageText")
    private String messageText;
    @JsonProperty("readStatus")
    private ReadStatus readStatus;
    @JsonProperty("dialogId")
    private Long dialogId;

}
