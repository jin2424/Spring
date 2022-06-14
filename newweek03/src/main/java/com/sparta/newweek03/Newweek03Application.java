package com.sparta.newweek03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing //생성,수정시간 자동업데이트
@SpringBootApplication
public class Newweek03Application {

    public static void main(String[] args) {
        SpringApplication.run(Newweek03Application.class, args);
    }

}
