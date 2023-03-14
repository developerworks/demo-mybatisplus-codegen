package com.example.businesses.mapstruct;

import com.example.businesses.entity.PhysiologicalIndex;
import com.example.businesses.vo.PhysiologicalIndexVo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PhysiologicalIndexMapStruct {
    PhysiologicalIndexMapStruct mapper = Mappers.getMapper(PhysiologicalIndexMapStruct.class);

    PhysiologicalIndexVo toVo(PhysiologicalIndex physiologicalIndex);
}