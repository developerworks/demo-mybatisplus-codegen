package ${package.Controller};

import ${package.Parent}.mapstruct.${entity}MapStruct;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
<#if restControllerStyle>
import org.springframework.web.bind.annotation.RestController;
<#else>
import org.springframework.stereotype.Controller;
</#if>
<#if superControllerClassPackage??>
import ${superControllerClassPackage};
</#if>

import ${package.Entity}.${entity};
import ${package.Service}.${table.serviceName};
import ${package.Parent}.utils.Result;
import ${package.Parent}.utils.ResultUtil;
import ${package.Parent}.dto.${entity}Dto;
import ${package.Parent}.vo.${entity}Vo;

/**
 * <p>
 * ${table.comment!}
 * </p>
 *
 * @author ${author}
 * @since ${date}
 */
<#if restControllerStyle>
@RestController
<#else>
@Controller
</#if>
@RequestMapping("<#if package.ModuleName?? && package.ModuleName != "">/${package.ModuleName}</#if>/<#if controllerMappingHyphenStyle>${controllerMappingHyphen}<#else>${table.entityPath}</#if>")
<#if kotlin>
class ${table.controllerName}<#if superControllerClass??> : ${superControllerClass}()</#if>
<#else>
@RequiredArgsConstructor
<#if superControllerClass??>
public class ${table.controllerName} extends ${superControllerClass}<${entity}Service, ${entity}> {
<#else>
public class ${table.controllerName} {
</#if>

    // private final ${table.serviceName} ${table.serviceName?uncap_first};

    // @ApiOperation(value = "${table.comment}")
    // @PostMapping
    // public Result<${entity}Vo> save(@RequestBody ${entity}Dto dto) {
    //     return ResultUtil.ok(null);
    // }

    @ApiOperation(value = "获取 ${entity} 对象")
    @GetMapping(value = "/{id}")
    public Result<${entity}Vo> getById(@PathVariable Long id) {
        ${entity} ${entity?uncap_first} = service.getById(id);
        ${entity}Vo ${entity?uncap_first}Vo = ${entity}MapStruct.mapper.toVo(${entity?uncap_first});
        return ResultUtil.ok(${entity?uncap_first}Vo);
    }

}
</#if>
