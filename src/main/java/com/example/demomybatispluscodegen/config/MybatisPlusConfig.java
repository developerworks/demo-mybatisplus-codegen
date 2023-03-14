package com.example.demomybatispluscodegen.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.dcy.mapper*")
@MapperScan(basePackages = {
        // MyBatis 通配包下面的类只能是 MyBatis 的 Mapper 接口, 不能有其他业务类
        "com.gf.ms.businesses.**.mapper"
})
public class MybatisPlusConfig {


}