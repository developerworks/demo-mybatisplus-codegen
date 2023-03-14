package com.example.businesses.vo;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 创伤评分生理指标包含(现场,急救)两个方面,  检查的指标都是一样的, 是否需要标记来源? 
 * </p>
 *
 * @author developerworks
 * @since 2023-03-14
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "PhysiologicalIndex对象", description = "创伤评分生理指标包含(现场,急救)两个方面,  检查的指标都是一样的, 是否需要标记来源? ")
public class PhysiologicalIndexVo {

    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "患者 ID")
    private String patientId;

    @ApiModelProperty(value = "关联的病案号")
    private String admissionNumber;

    @ApiModelProperty(value = "是否胸部穿透伤")
    private Boolean chestOfBelly;

    @ApiModelProperty(value = "生命体征 体温(℃)")
    private Double temperature;

    @ApiModelProperty(value = "生命体征 呼吸评率(次/分)")
    private Byte respirationRate;

    @ApiModelProperty(value = "脉搏(次/分)")
    private Long pulse;

    @ApiModelProperty(value = "收缩压(mmHg)")
    private Long systolicPressure;

    @ApiModelProperty(value = "睁眼反应")
    private String eyesOpenResponse;

    @ApiModelProperty(value = "语言反应")
    private String speechResponse;

    @ApiModelProperty(value = "运动反应")
    private String sportResponse;

    @ApiModelProperty(value = "气管插管(0:未插管,1:插管)")
    private Boolean endotrachealIntubation;

    @ApiModelProperty(value = "是否使用镇静剂(0:未使用,1:使用)")
    private Byte sedative;

    @ApiModelProperty(value = "是否使用肌松剂(0:未使用,1:使用)")
    private String muscleRelaxant;

    @ApiModelProperty(value = "体表出血(0:不是 1:是)")
    private String surfaceHemorrhage;

    private String gcsRestrict;

    @ApiModelProperty(value = "呼吸状态")
    private String respiratoryState;

    @ApiModelProperty(value = "胸腹部压痛")
    private String pressingPain;

    @ApiModelProperty(value = "PHI 呼吸状态")
    private String phiRespiratoryState;

    @ApiModelProperty(value = "毛细血管充盈")
    private String capillaryFilling;

    @ApiModelProperty(value = "舒张压(mmHg)")
    private Long diastolicPressure;

    @ApiModelProperty(value = "临床反应")
    private String clinicResponse;

    @ApiModelProperty(value = "TI 损伤部位")
    private String tiDamageParts;

    @ApiModelProperty(value = "计算字段:每个部位分别计算的创伤指数")
    private String tiDamagePartsScore;

    @ApiModelProperty(value = "TI 损伤类型")
    private String tiDamageTypes;

    @ApiModelProperty(value = "评分时间")
    private LocalDateTime scoreTime;

    @ApiModelProperty(value = "RTS,RTS评分P38")
    private String rts;

    @ApiModelProperty(value = "T-RTS,T-RTS评分P39")
    private String tRts;

    @ApiModelProperty(value = "GCS,GCS评分P34")
    private String gcs;

    @ApiModelProperty(value = "CRAMS,CRAMS评分P33")
    private String crams;

    @ApiModelProperty(value = "PHI,院前指数P36")
    private String phi;

    @ApiModelProperty(value = "TI,创伤指数P36-P37")
    private String ti;

    @ApiModelProperty(value = "TS,创伤评分P37")
    private String ts;

    @ApiModelProperty(value = "ISS将AIS对伤情描述的九个部位改为六个部位")
    private String iss;

    @ApiModelProperty(value = "AIS评分")
    private String ais;

    @ApiModelProperty(value = "NISS评分方法是把创伤病人3个最严重损伤的AIS值的平方相加，而不考虑损伤的具体部位")
    private String niss;

    @ApiModelProperty(value = "TRISS,严重创伤结局研究方法P55")
    private String triss;

    @ApiModelProperty(value = "ASCOT,创伤严重程度描述评分P57")
    private String ascot;

    @ApiModelProperty(value = "救治阶段(0:现场救治,1:转院救治,2:急诊救治,3:院内救治)")
    private String stage;

    @ApiModelProperty(value = "评分来源 现场(cure_of_scene), 急诊(emergency), 住院(in_hospital)")
    private String source;

    @ApiModelProperty(value = "录入时间")
    private String createdAt;

    @ApiModelProperty(value = "录入人")
    private String createdBy;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updatedAt;

    @ApiModelProperty(value = "修改人")
    private String updatedBy;

    @ApiModelProperty(value = "逻辑删除标记")
    private Boolean deleted;

    private String eciCrDtime;

    private String eciUpDtime;

}
