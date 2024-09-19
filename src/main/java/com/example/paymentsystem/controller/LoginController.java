package com.example.paymentsystem.controller;

import com.example.paymentsystem.dto.LoginDto;
import com.example.paymentsystem.dto.LoginStatusDto;
import com.example.paymentsystem.service.LoginService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Tag(name = "LoginController")
public class LoginController {
    private final LoginService loginService;

    @GetMapping("/login")
    @Operation(summary = "로그인 API", description = "이메일과 비밀번호를 통해 로그인 성공 여부를 확인합니다.")
    public ResponseEntity<LoginStatusDto> login(LoginDto loginDto){
        LoginStatusDto loginStatusDto = loginService.login(loginDto);
        if (loginStatusDto.getStatusCode().equals(HttpStatus.BAD_REQUEST) ) {
            return ResponseEntity.badRequest().body(loginStatusDto);
        }
        return ResponseEntity.ok(loginStatusDto);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "Goodbye, World!";
    }
}
