package com.develuxe.gaeng.daeng.dto.message;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UnreadCountDto implements Serializable {
    private Integer count;

}
