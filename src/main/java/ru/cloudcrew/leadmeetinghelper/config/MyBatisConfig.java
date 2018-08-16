package ru.cloudcrew.leadmeetinghelper.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("ru.cloudcrew.leadmeetinghelper.mappers")
public class MyBatisConfig {

}
