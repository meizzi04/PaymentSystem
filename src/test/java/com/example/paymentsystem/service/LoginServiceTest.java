package com.example.paymentsystem.service;

import com.example.paymentsystem.dto.LoginDto;
import com.example.paymentsystem.entity.Member;
import com.example.paymentsystem.repository.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.Optional;

//@SpringBootTest
//@ExtendWith(SpringExtension.class)
public class LoginServiceTest {

    //LoginService loginService;

    //@MockBean
    //MemberRepository memberRepository;

    @Test
    void findEmailTest() {
        // given
        // 로그인 정보(ID, PASSWORD)
        //Member member = new Member(1, "test1@naver.com", "0000", "test1");
        //LoginDto loginDto = new LoginDto("test1@naver.com", "0000");
        // when
        // login 메서드를 수행한다.
        //Optional<Member> findMemberByEmail = memberRepository.findByEmail(member.getEmail());

        // Boolean loginSuccessYn = loginService.login(loginDto);
        // then
        // 결과로 로그인 성공 여부를 확인한다.
//        if(!findMemberByEmail.isEmpty()) {
//            Assertions.assertThat(findMemberByEmail.get().getEmail()).isEqualTo("tes1@naver.com");
//        }
    }
}
