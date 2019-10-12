package com.web.elijah;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author:王旭
 * @date:2019/9/26 16:35
 * </p>
 * Description:
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.web.elijah.mapper"})
@ComponentScan(basePackages = {"com.web.elijah.*"})
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class,args);
    }
}
