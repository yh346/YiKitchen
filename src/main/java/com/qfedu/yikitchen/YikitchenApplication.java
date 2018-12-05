package com.qfedu.yikitchen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.qfedu.yikitchen.mapper")
public class YikitchenApplication {

    public static void main(String[] args) {
        SpringApplication.run(YikitchenApplication.class, args);
    }
}
