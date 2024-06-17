package com.develuxe.gaeng.daeng.dto.auth;

import com.develuxe.gaeng.daeng.dto.base.BaseDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Данные пользователя", required = true)
public class UserDto extends BaseDto {

    @Schema(description = "Имя")
    private String firstName;
    @Schema(description = "Фамилия")
    private String lastName;
    @Schema(description = "Электронная почта")
    private String email;
    @Schema(description = "Пароль")
    private String password;
}
