package com.example.eurekaClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //특정행동 수행시 변경된 설정파일의 설정이 애플리케이션의 재배포과정 없이 실시간으로 반영
public class configClientController {

    @Value("${who.am.i}")
    private String identity;

    @GetMapping("/test")
    public String test() {
        return identity;
    }
}