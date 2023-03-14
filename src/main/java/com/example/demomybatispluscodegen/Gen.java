package com.example.demomybatispluscodegen;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Gen {

    public static String projectDirectory = System.getProperty("user.dir");


    public static void main(String[] args) throws IOException {

//        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
//        String currentPath = classLoader.getResource("").getPath();
//        System.out.println("当前路径：" + currentPath);

        System.out.println("当前路径:" + System.getProperty("user.dir"));




        File directory = new File("");// 参数为空
        String courseFile = directory.getCanonicalPath();
        System.out.println("当前路径:" + courseFile);

        FastAutoGenerator
                .create(
                        "jdbc:mysql://10.0.0.59:4000/trauma?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2b8&useSSL=false&allowMultiQueries=true",
                        "root",
                        "#029pRe6%31cVdgz-*"
                )
                .globalConfig(builder -> {
                    builder
                            .fileOverride()
                            .author("developerworks") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .outputDir(projectDirectory + "/src/main/java"); // 指定输出目录
                })
                .packageConfig(
                        builder -> {
                            builder
                                    // 设置父包名
                                    .parent("com.example")
                                    // 设置父包模块名
                                    .moduleName("system")
                                    // 设置mapperXml生成路径
                                    .pathInfo(Collections.singletonMap(OutputFile.xml, projectDirectory + "/src/main/resources/mapper"));
                        })
                .strategyConfig(builder -> {
                    builder
                            // 设置需要生成的表名
                            .addInclude(List.of(
                                    "trauma_patient",
                                    "trauma_physiological_index"
                            ))
                            // 设置过滤表前缀
                            .addTablePrefix(
                                    List.of(
                                            "trauma_"
                                    )
                            );
                })
                // 控制器
                .strategyConfig(builder ->
                        builder.controllerBuilder().enableRestStyle().enableFileOverride()
                )
                // 实体类
                .strategyConfig(builder ->
                        builder.entityBuilder()
                                .enableLombok()
                                .enableFileOverride()
                                .enableTableFieldAnnotation()
                                .disableSerialVersionUID()
                                .enableColumnConstant()
                )
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
