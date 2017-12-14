package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @AUTHOR licy
 * @create 2017-12-11-15:26
 */
@SpringBootApplication
@MapperScan("com.baizhi.dao")
public class Application {
    public static void main(String[] licy){
        SpringApplication.run(Application.class,licy);
    }
}
