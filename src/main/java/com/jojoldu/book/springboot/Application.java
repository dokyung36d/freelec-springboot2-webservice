package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing //jpa auditing 활성화
@SpringBootApplication // 스프링 부트의 자동 설정, 스프링 bean읽기. 모두 자동 설정
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        //위의 줄을 통해 웹 애플리케이션 서버를 실행
        //스프링으로 구성된 jar(java 패키징 파일)로 실행
    }
}
