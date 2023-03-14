package com.example.businesses.controller;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.codegen.BaseController;

import com.example.businesses.entity.PhysiologicalIndex;
import com.example.businesses.service.PhysiologicalIndexService;
import com.example.businesses.utils.Result;
import com.example.businesses.utils.ResultUtil;
import com.example.businesses.dto.PhysiologicalIndexDto;
import com.example.businesses.vo.PhysiologicalIndexVo;

/**
 * <p>
 * 创伤评分生理指标包含(现场,急救)两个方面,  检查的指标都是一样的, 是否需要标记来源? 
 * </p>
 *
 * @author developerworks
 * @since 2023-03-14
 */
@RestController
@RequestMapping("/businesses/physiologicalIndex")
@RequiredArgsConstructor
public class PhysiologicalIndexController extends BaseController<PhysiologicalIndexService, PhysiologicalIndex> {

   private final PhysiologicalIndexService physiologicalIndexService;

   @ApiOperation(value = "创伤评分生理指标包含(现场,急救)两个方面,  检查的指标都是一样的, 是否需要标记来源? ")
   @PostMapping
   public Result<PhysiologicalIndexVo> save(@RequestBody PhysiologicalIndexDto dto) {
       return ResultUtil.ok(null);
   }

}
