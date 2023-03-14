package com.example.businesses.controller;

import com.example.businesses.mapstruct.PatientMapStruct;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import com.example.codegen.BaseController;

import com.example.businesses.entity.Patient;
import com.example.businesses.service.PatientService;
import com.example.businesses.utils.Result;
import com.example.businesses.utils.ResultUtil;
import com.example.businesses.dto.PatientDto;
import com.example.businesses.vo.PatientVo;

/**
 * <p>
 * 患者信息
 * </p>
 *
 * @author developerworks
 * @since 2023-03-14
 */
@RestController
@RequestMapping("/businesses/patient")
@RequiredArgsConstructor
public class PatientController extends BaseController<PatientService, Patient> {

    // private final PatientService patientService;

    // @ApiOperation(value = "患者信息")
    // @PostMapping
    // public Result<PatientVo> save(@RequestBody PatientDto dto) {
    //     return ResultUtil.ok(null);
    // }

    @ApiOperation(value = "获取 Patient 对象")
    @GetMapping(value = "/{id}")
    public Result<PatientVo> getById(@PathVariable Long id) {
        Patient patient = service.getById(id);
        PatientVo patientVo = PatientMapStruct.mapper.toVo(patient);
        return ResultUtil.ok(patientVo);
    }

}
