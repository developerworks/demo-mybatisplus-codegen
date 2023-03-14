package com.example.businesses.mapstruct;

import com.example.businesses.entity.Patient;
import com.example.businesses.vo.PatientVo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PatientMapStruct {
    PatientMapStruct mapper = Mappers.getMapper(PatientMapStruct.class);

    PatientVo toVo(Patient patient);
}