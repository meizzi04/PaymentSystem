package com.example.paymentsystem.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Tag(name = "LogBackTestController")
public class LogbackTestController {
    @GetMapping("/test")
    public void login(){
        log.trace("TRACE!!");
        log.debug("DEBUG!!");
        log.info("INFO!!"); // default: 여기까지 출력
        log.warn("WARN!!");
        log.error("ERROR!!");
    }
}
