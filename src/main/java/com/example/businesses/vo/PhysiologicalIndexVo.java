package com.example.businesses.vo;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(name = "PhysiologicalIndex", description = "$!{table.comment}")
public class PhysiologicalIndexVo {

    @Schema(description = "主键")
    private Long id;

    @Schema(description = "患者 ID")
    private String patientId;

    @Schema(description = "关联的病案号")
    private String admissionNumber;

    @Schema(description = "是否胸部穿透伤")
    private Boolean chestOfBelly;

    @Schema(description = "生命体征 体温(℃)")
    private Double temperature;

    @Schema(description = "生命体征 呼吸评率(次/分)")
    private Byte respirationRate;

    @Schema(description = "脉搏(次/分)")
    private Long pulse;

    @Schema(description = "收缩压(mmHg)")
    private Long systolicPressure;

    @Schema(description = "睁眼反应")
    private String eyesOpenResponse;

    @Schema(description = "语言反应")
    private String speechResponse;

    @Schema(description = "运动反应")
    private String sportResponse;

    @Schema(description = "气管插管(0:未插管,1:插管)")
    private Boolean endotrachealIntubation;

    @Schema(description = "是否使用镇静剂(0:未使用,1:使用)")
    private Byte sedative;

    @Schema(description = "是否使用肌松剂(0:未使用,1:使用)")
    private String muscleRelaxant;

    @Schema(description = "体表出血(0:不是 1:是)")
    private String surfaceHemorrhage;

    private String gcsRestrict;

    @Schema(description = "呼吸状态")
    private String respiratoryState;

    @Schema(description = "胸腹部压痛")
    private String pressingPain;

    @Schema(description = "PHI 呼吸状态")
    private String phiRespiratoryState;

    @Schema(description = "毛细血管充盈")
    private String capillaryFilling;

    @Schema(description = "舒张压(mmHg)")
    private Long diastolicPressure;

    @Schema(description = "临床反应")
    private String clinicResponse;

    @Schema(description = "TI 损伤部位")
    private String tiDamageParts;

    @Schema(description = "计算字段:每个部位分别计算的创伤指数")
    private String tiDamagePartsScore;

    @Schema(description = "TI 损伤类型")
    private String tiDamageTypes;

    @Schema(description = "评分时间")
    private LocalDateTime scoreTime;

    @Schema(description = "RTS,RTS评分P38")
    private String rts;

    @Schema(description = "T-RTS,T-RTS评分P39")
    private String tRts;

    @Schema(description = "GCS,GCS评分P34")
    private String gcs;

    @Schema(description = "CRAMS,CRAMS评分P33")
    private String crams;

    @Schema(description = "PHI,院前指数P36")
    private String phi;

    @Schema(description = "TI,创伤指数P36-P37")
    private String ti;

    @Schema(description = "TS,创伤评分P37")
    private String ts;

    @Schema(description = "ISS将AIS对伤情描述的九个部位改为六个部位")
    private String iss;

    @Schema(description = "AIS评分")
    private String ais;

    @Schema(description = "NISS评分方法是把创伤病人3个最严重损伤的AIS值的平方相加，而不考虑损伤的具体部位")
    private String niss;

    @Schema(description = "TRISS,严重创伤结局研究方法P55")
    private String triss;

    @Schema(description = "ASCOT,创伤严重程度描述评分P57")
    private String ascot;

    @Schema(description = "救治阶段(0:现场救治,1:转院救治,2:急诊救治,3:院内救治)")
    private String stage;

    @Schema(description = "评分来源 现场(cure_of_scene), 急诊(emergency), 住院(in_hospital)")
    private String source;

    @Schema(description = "录入时间")
    private String createdAt;

    @Schema(description = "录入人")
    private String createdBy;

    @Schema(description = "修改时间")
    private LocalDateTime updatedAt;

    @Schema(description = "修改人")
    private String updatedBy;

    @Schema(description = "逻辑删除标记")
    private Boolean deleted;

    private String eciCrDtime;

    private String eciUpDtime;

}
