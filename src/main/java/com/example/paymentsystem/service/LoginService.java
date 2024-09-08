package com.example.paymentsystem.service;

import com.example.paymentsystem.dto.LoginStatusDto;
import com.example.paymentsystem.entity.Member;
import com.example.paymentsystem.repository.MemberRepository;
import com.example.paymentsystem.dto.LoginDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final MemberRepository loginRepository;

    public LoginStatusDto login(LoginDto loginDto) {
        Optional<Member> findMemberByEmail = loginRepository.findByEmail(loginDto.getEmail());

        if (findMemberByEmail.isEmpty()) {
            return new LoginStatusDto(HttpStatus.BAD_REQUEST, "존재하는 회원이 없습니다.");
        }

        Member member = findMemberByEmail.get();

        if (!member.getPw().equals(loginDto.getPw())) {
            return new LoginStatusDto(HttpStatus.BAD_REQUEST, "비밀번호가 틀렸습니다.");
        }

        return new LoginStatusDto(HttpStatus.OK, "로그인 성공하셨습니다.");
    }
}
