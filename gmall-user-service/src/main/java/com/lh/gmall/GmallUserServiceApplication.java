package com.lh.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.lh.gmall.mapper")
public class GmallUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserServiceApplication.class, args);
    }

}
