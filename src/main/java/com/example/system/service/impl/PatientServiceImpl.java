package com.example.system.service.impl;

import com.example.system.entity.Patient;
import com.example.system.mapper.PatientMapper;
import com.example.system.service.IPatientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 患者信息 服务实现类
 * </p>
 *
 * @author developerworks
 * @since 2023-02-13
 */
@Service
public class PatientServiceImpl extends ServiceImpl<PatientMapper, Patient> implements IPatientService {

}
