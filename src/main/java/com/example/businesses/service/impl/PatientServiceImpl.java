package com.example.businesses.service.impl;

import com.example.businesses.entity.Patient;
import com.example.businesses.mapper.PatientMapper;
import com.example.businesses.service.PatientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 患者信息 服务实现类
 * </p>
 *
 * @author developerworks
 * @since 2023-03-14
 */
@Service
public class PatientServiceImpl extends ServiceImpl<PatientMapper, Patient> implements PatientService {

}
