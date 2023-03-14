package com.example.codegen;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BaseEntity implements Serializable {

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updatedAt;

    @ApiModelProperty(value = "创建人ID")
    private String createdById;

    @ApiModelProperty(value = "创建人名字")
    private String createdByName;

    @ApiModelProperty(value = "更新人ID")
    private String updatedById;

    @ApiModelProperty(value = "更新人名字")
    private String updatedByName;

    
    @ApiModelProperty(value = "逻辑删除")
    @TableLogic
    private Boolean deleted;
}