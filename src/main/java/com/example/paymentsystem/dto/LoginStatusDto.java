package com.example.paymentsystem.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginStatusDto {
    @Schema(description = "로그인 상태 코드")
    private HttpStatus statusCode;
    @Schema(description="로그인 상태 메시지")
    private String msg;
}
