package com.zwickyc.zwycpicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@MapperScan("com.zwickyc.zwycpicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class ZwycPictureBackendApplication {

    public static void main(String[] args) {

        SpringApplication.run(ZwycPictureBackendApplication.class, args);

    }

}
