package com.example.paymentsystem.controller;

import com.example.paymentsystem.dto.LoginDto;
import com.example.paymentsystem.dto.LoginStatusDto;
import com.example.paymentsystem.entity.Member;
import com.example.paymentsystem.repository.MemberRepository;
import com.example.paymentsystem.service.LoginService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;

import java.util.Optional;


@WebMvcTest()
@TestPropertySource(locations = "classpath:application-test.yml")
public class LoginControllerTest {

    @Autowired
    MockMvc mvc;

    @MockBean
    LoginService loginService;

    @Autowired
    ObjectMapper objectMapper;

//    @Autowired
//    MemberRepository memberRepository;

//    @BeforeEach
//    void setUp() {
//        Member member = Member.builder()
//                .email("lsm0506@midasin.com")
//                .pw("1234")
//                .memberName("이상민")
//                .build();
//        memberRepository.save(member);
//    }

    @Test
    @DisplayName("로그인 성공 여부 확인")
    void loginSuccessTest() throws Exception {
        //memberRepository.save(new Member(1, "lsm0506@midasin.com", "1234", "이상민"));
        LoginDto loginDto = new LoginDto("lsm0506@midasin.com", "1234");

        //Optional<Member> member = memberRepository.findByEmail(loginDto.getEmail());


        //Assertions.assertNotNull(member);
        //Assertions.assertEquals(member.get().getEmail(), loginDto.getEmail());
        //Assertions.assertEquals(member.get().getPw(), loginDto.getPw());

//        LoginStatusDto loginStatusDto = loginService.login(member);
//        ResponseEntity<LoginStatusDto> responseEntity;
//
//        if(loginStatusDto.getStatusCode().equals(HttpStatus.OK)) {
//            responseEntity = ResponseEntity.ok(loginStatusDto);
//        } else {
//            responseEntity = ResponseEntity.badRequest().body(loginStatusDto);
//        }
//
//        Assertions.assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);

//        mvc.perform(MockMvcRequestBuilders.get("/login")
//                        .contentType(MediaType.APPLICATION_JSON_VALUE)
//                        .content(objectMapper.writeValueAsString(loginDto)))
//                .andExpect(MockMvcResultMatchers.status().isOk());

        //Assertions.assertThat(status.getStatusCode()).isEqualTo("tes1@naver.com");
        // given
        //ResponseEntity<LoginStatusDto> loginStatus =  loginController.login(new LoginDto("test1@naver.com", "1234"));

//        LoginDto member = new LoginDto("lsm0506@midasin.com", "1234");
//        LoginStatusDto status = new LoginStatusDto(HttpStatus.OK, "로그인 성공하셨습니다.");
//
//        Mockito.when(loginService.login(member)).thenReturn(status);
//
//        MockHttpServletRequestBuilder param = MockMvcRequestBuilders.get("/login");
//
//        ResultActions perform = mvc.perform(param);
//
//        perform
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath(status.getStatusCode().toString()).value("OK"))
//                .andExpect(MockMvcResultMatchers.jsonPath(status.getMsg()).value("로그인 성공하셨습니다."));


//                .andExpect(MockMvcResultMatchers.jsonPath("$.statusCode").value("OK"))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.msg").value("로그인 성공하셨습니다."));

    }

    @Test
    @DisplayName("로그인 성공 여부 확인")
    void loginSuccess2Test() throws Exception {
        mvc.perform(
                MockMvcRequestBuilders.get("/login")
                        .param("email", "lsm0506@midasin.com")
                        .param("pw", "1234")
        ).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.statusCode").value(HttpStatus.OK))
                .andExpect(MockMvcResultMatchers.jsonPath("$.msg").value("로그인 성공하셨습니다."));
    }

}
