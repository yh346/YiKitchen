package com.qfedu.yikitchen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan(value = "com.qfedu.yikitchen.mapper")
public class YikitchenApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(YikitchenApplication.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(YikitchenApplication.class, args);
    }
}
