package com.develuxe.gaeng.daeng.dto.dialog;

import com.develuxe.gaeng.daeng.dto.base.BaseDto;
import com.develuxe.gaeng.daeng.dto.message.MessageDto;

import java.util.List;

public class DialogDto extends BaseDto {

    private Integer unreadCount;
    private Long conversationPartner1;
    private Long conversationPartner2;
    private List<MessageDto> lastMessage;

    @Override
    public String toString() {
        return "DialogDto{" +
                "unreadCount=" + unreadCount +
                ", conversationPartner1=" + conversationPartner1 +
                ", conversationPartner2=" + conversationPartner2 +
                ", lastMessage=" + lastMessage +
                '}';
    }

}
