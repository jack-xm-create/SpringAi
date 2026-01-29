package org.example.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 系统服务启动类
 */
@SpringBootApplication
// ⚠️ 关键点：告诉 MyBatis 你的 Mapper 接口在哪里，否则会报错 "Mapper not found"
@MapperScan("org.example.system.mapper")
public class SystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
    }
}