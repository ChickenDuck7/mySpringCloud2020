package com.cd7.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.cd7.springcloud.dao"})
public class MyBatisConfig {
}
