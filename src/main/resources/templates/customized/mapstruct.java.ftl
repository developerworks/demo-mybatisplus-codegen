package ${package.Parent}.mapstruct;

import ${package.Entity}.${entity};
import ${package.Parent}.vo.${entity}Vo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ${entity}MapStruct {
    ${entity}MapStruct mapper = Mappers.getMapper(${entity}MapStruct.class);

    ${entity}Vo toVo(${entity} ${entity?uncap_first});
}