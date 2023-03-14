package com.example.codegen;

import com.baomidou.mybatisplus.extension.service.IService;
import io.swagger.annotations.Api;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@Api(tags = "BaseController")
@RestController
public class BaseController<M extends IService<T>, T> {

    @Resource
    private M service;
}