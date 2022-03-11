package com.cckoolu.github;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cckoolu.github.mapper")
public class LeLvApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeLvApiApplication.class, args);
    }
}
