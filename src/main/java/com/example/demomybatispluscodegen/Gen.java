package com.example.demomybatispluscodegen;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.builder.CustomFile;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.example.codegen.BaseController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gen {

    public static String projectPath = System.getProperty("user.dir");


    public static void main(String[] args) throws IOException {

        System.out.println("当前路径:" + System.getProperty("user.dir"));
        //    GlobalConfig.Builder gc = new GlobalConfig.Builder();
        //    gc.disableOpenDir();
        //    gc.author("developerworks");
        //    gc.enableSwagger();
        //
        //    PackageConfig.Builder pc = new PackageConfig.Builder();
        //    pc.parent("com.example");
        //    pc.moduleName("businesses");
        //    pc.service("service");
        //    pc.serviceImpl("service.impl");
        //    pc.controller("controller");
        //    pc.entity("entity");
        //    pc.mapper("mapper");
        //    pc.pathInfo(Collections.singletonMap(OutputFile.xml, projectDirectory + "/src/main/resources/mapper"));

        // 路径信息
        Map<OutputFile, String> pathInfo = new HashMap<>();
        pathInfo.put(OutputFile.other, projectPath + "/src/main/java/com/example/businesses/other");
        pathInfo.put(OutputFile.xml, projectPath + "/src/main/resources/mapper");


        FastAutoGenerator
                .create(
                        "jdbc:mysql://10.0.0.59:4000/trauma?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2b8&useSSL=false&allowMultiQueries=true",
                        "root",
                        "#029pRe6%31cVdgz-*"
                )
                .globalConfig(builder -> builder
                        // 不打开生成目录
                        .disableOpenDir()
                        // 设置作者
                        .author("developerworks")
                        // 开启 swagger 模式
                        // .enableSwagger()
                        .enableSpringdoc()
                        // 指定输出目录
                        .outputDir(projectPath + "/src/main/java")
                )
                .packageConfig(builder -> builder
                        // 设置父包名
                        .parent("com.example")
                        // 设置父包模块名
                        .moduleName("businesses")
                        // 设置mapperXml生成路径
                        .pathInfo(pathInfo)
                )
                .strategyConfig(builder -> builder
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
                        )
                )
                // 实体类
                .strategyConfig(builder -> builder.entityBuilder()
                        .naming(NamingStrategy.underline_to_camel)
                        .columnNaming(NamingStrategy.underline_to_camel)
                        .enableLombok()
                        .enableChainModel()
                        .enableFileOverride()
                        .enableTableFieldAnnotation()
                        .disableSerialVersionUID()
                        .enableColumnConstant()
                        .formatFileName("%s")
                )
                // Mapper
                .strategyConfig(builder -> builder.mapperBuilder()
                        .enableFileOverride()
                )
                // 服务
                .strategyConfig(builder -> builder.serviceBuilder()
                        .enableFileOverride()
                        .formatServiceFileName("%sService")
                        .formatServiceImplFileName("%sServiceImpl")
                )
                // 控制器
                .strategyConfig(builder -> builder.controllerBuilder()
                        // 覆盖
                        .enableFileOverride()
                        // 使用 @RestController 而非 @Controller
                        .enableRestStyle()
                        // 控制器父类
                        .superClass(BaseController.class)
                        .superClass("com.example.codegen.BaseController")
                )
                // 自定义对象生成(Dto,Vo,MapStruct)
                .injectionConfig(builder -> {
                            List<CustomFile> customFiles = new ArrayList<>();
                            customFiles.add(new CustomFile.Builder()
                                    // DTO 包路径
                                    .packageName("com.example.businesses.dto")
                                    // 文件后缀
                                    .fileName("Dto.java")
                                    // 模板
                                    .templatePath("templates/customized/dto.java.ftl")
                                    .build()
                            );
                            customFiles.add(new CustomFile.Builder()
                                    // VO 包路径
                                    .packageName("com.example.businesses.dto")
                                    // 文件后缀
                                    .fileName("Vo.java")
                                    // VO 模板
                                    .templatePath("templates/customized/vo.java.ftl")
                                    .build()
                            );
                            customFiles.add(new CustomFile.Builder()
                                    // 包路径
                                    .packageName("com.example.businesses.mapstruct")
                                    // 文件后缀
                                    .fileName("MapStruct.java")
                                    // 模板
                                    .templatePath("templates/customized/mapstruct.java.ftl")
                                    .build()
                            );
                            builder.customFile(customFiles);
                        }
                )
                // 自定义模板引擎
                .templateEngine(new EnhanceFreemarkerTemplateEngine())
                .execute();
    }
}
