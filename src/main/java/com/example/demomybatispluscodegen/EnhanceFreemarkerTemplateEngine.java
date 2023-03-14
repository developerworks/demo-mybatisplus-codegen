package com.example.demomybatispluscodegen;

import com.alibaba.fastjson2.JSON;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.builder.CustomFile;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * 代码生成器支持自定义[DTO\VO等]模版
 */

@Slf4j
public class EnhanceFreemarkerTemplateEngine extends FreemarkerTemplateEngine {

    private final static String projectPath = System.getProperty("user.dir");

    @Override
    protected void outputCustomFile(@NotNull List<CustomFile> customFiles, @NotNull TableInfo tableInfo, @NotNull Map<String, Object> objectMap) {

        String entityName = tableInfo.getEntityName();
        String otherPath = this.getPathInfo(OutputFile.other);
        //        objectMap.forEach((s, o) -> {
        //            log.debug("key: " + s);
        //        });
        // log.debug("package: " + JSON.toJSONString(objectMap.get("package")));
        Map<String, String> o = (Map<String, String>) objectMap.get("package");
        String parent = o.get("Parent");
        // log.debug("parent: " + parent);
        customFiles.forEach(customFile -> {
            String[] split = customFile.getFileName().split("\\.");
            String packageName = split[0].toLowerCase();
            String absoluteFileName = String.format(
                    "%s/src/main/java/%s/%s/%s%s",
                    projectPath, (parent.replaceAll("\\.", "/")), packageName, entityName, customFile.getFileName()
            );
            log.info(String.format("生成的文件名称: %s", absoluteFileName));
            this.outputFile(new File(absoluteFileName), objectMap, customFile.getTemplatePath(), true);
        });
    }

}