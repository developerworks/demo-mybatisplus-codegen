package ${package.Parent}.vo;
<#list table.importPackages as pkg>
import ${pkg};
</#list>

<#if springdoc>
import io.swagger.v3.oas.annotations.media.Schema;
<#elseif swagger>
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
</#if>
<#if entityLombokModel>
import lombok.Data;
<#if chainModel>
import lombok.experimental.Accessors;
</#if>
</#if>

/**
 * <p>
 * ${table.comment!}
 * </p>
 *
 * @author ${author}
 * @since ${date}
 */
<#if entityLombokModel>
@Data
<#if chainModel>
@Accessors(chain = true)
</#if>
</#if>
<#if springdoc>
@Schema(name = "${entity}", description = "$!{table.comment}")
<#elseif swagger>
@ApiModel(value = "${entity}对象", description = "${table.comment!}")
</#if>
<#if entitySerialVersionUID>
public class ${entity}Vo implements Serializable {
<#else>
public class ${entity}Vo {
</#if>
<#if entitySerialVersionUID>

    private static final long serialVersionUID = 1L;
</#if>
<#-- ----------  BEGIN 字段循环遍历  ---------->
<#list table.fields as field>
<#if field.keyFlag>
<#assign keyPropertyName="${field.propertyName}"/>
</#if>

<#if field.comment!?length gt 0>
<#if springdoc>
    @Schema(description = "${field.comment}")
<#elseif swagger>
    @ApiModelProperty(value = "${field.comment}")
<#else>
    /**
     * ${field.comment}
     */
</#if>
</#if>
    private ${field.propertyType} ${field.propertyName};
</#list>
<#------------  END 字段循环遍历  ---------->

}
