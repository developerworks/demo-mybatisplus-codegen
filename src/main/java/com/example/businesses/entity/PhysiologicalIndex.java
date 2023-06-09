package com.example.businesses.entity;

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
@TableName("trauma_physiological_index")
@Schema(name = "PhysiologicalIndex", description = "$!{table.comment}")
public class PhysiologicalIndex {

    @Schema(description = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "患者 ID")
    @TableField(value = "patient_id")
    private String patientId;

    @Schema(description = "关联的病案号")
    @TableField(value = "admission_number")
    private String admissionNumber;

    @Schema(description = "是否胸部穿透伤")
    @TableField(value = "chest_of_belly")
    private Boolean chestOfBelly;

    @Schema(description = "生命体征 体温(℃)")
    @TableField(value = "temperature")
    private Double temperature;

    @Schema(description = "生命体征 呼吸评率(次/分)")
    @TableField(value = "respiration_rate")
    private Byte respirationRate;

    @Schema(description = "脉搏(次/分)")
    @TableField(value = "pulse")
    private Long pulse;

    @Schema(description = "收缩压(mmHg)")
    @TableField(value = "systolic_pressure")
    private Long systolicPressure;

    @Schema(description = "睁眼反应")
    @TableField(value = "eyes_open_response")
    private String eyesOpenResponse;

    @Schema(description = "语言反应")
    @TableField(value = "speech_response")
    private String speechResponse;

    @Schema(description = "运动反应")
    @TableField(value = "sport_response")
    private String sportResponse;

    @Schema(description = "气管插管(0:未插管,1:插管)")
    @TableField(value = "endotracheal_intubation")
    private Boolean endotrachealIntubation;

    @Schema(description = "是否使用镇静剂(0:未使用,1:使用)")
    @TableField(value = "sedative")
    private Byte sedative;

    @Schema(description = "是否使用肌松剂(0:未使用,1:使用)")
    @TableField(value = "muscle_relaxant")
    private String muscleRelaxant;

    @Schema(description = "体表出血(0:不是 1:是)")
    @TableField(value = "surface_hemorrhage")
    private String surfaceHemorrhage;

    @TableField(value = "gcs_restrict")
    private String gcsRestrict;

    @Schema(description = "呼吸状态")
    @TableField(value = "respiratory_state")
    private String respiratoryState;

    @Schema(description = "胸腹部压痛")
    @TableField(value = "pressing_pain")
    private String pressingPain;

    @Schema(description = "PHI 呼吸状态")
    @TableField(value = "phi_respiratory_state")
    private String phiRespiratoryState;

    @Schema(description = "毛细血管充盈")
    @TableField(value = "capillary_filling")
    private String capillaryFilling;

    @Schema(description = "舒张压(mmHg)")
    @TableField(value = "diastolic_pressure")
    private Long diastolicPressure;

    @Schema(description = "临床反应")
    @TableField(value = "clinic_response")
    private String clinicResponse;

    @Schema(description = "TI 损伤部位")
    @TableField(value = "ti_damage_parts")
    private String tiDamageParts;

    @Schema(description = "计算字段:每个部位分别计算的创伤指数")
    @TableField(value = "ti_damage_parts_score")
    private String tiDamagePartsScore;

    @Schema(description = "TI 损伤类型")
    @TableField(value = "ti_damage_types")
    private String tiDamageTypes;

    @Schema(description = "评分时间")
    @TableField(value = "score_time")
    private LocalDateTime scoreTime;

    @Schema(description = "RTS,RTS评分P38")
    @TableField(value = "rts")
    private String rts;

    @Schema(description = "T-RTS,T-RTS评分P39")
    @TableField(value = "t_rts")
    private String tRts;

    @Schema(description = "GCS,GCS评分P34")
    @TableField(value = "gcs")
    private String gcs;

    @Schema(description = "CRAMS,CRAMS评分P33")
    @TableField(value = "crams")
    private String crams;

    @Schema(description = "PHI,院前指数P36")
    @TableField(value = "phi")
    private String phi;

    @Schema(description = "TI,创伤指数P36-P37")
    @TableField(value = "ti")
    private String ti;

    @Schema(description = "TS,创伤评分P37")
    @TableField(value = "ts")
    private String ts;

    @Schema(description = "ISS将AIS对伤情描述的九个部位改为六个部位")
    @TableField(value = "iss")
    private String iss;

    @Schema(description = "AIS评分")
    @TableField(value = "ais")
    private String ais;

    @Schema(description = "NISS评分方法是把创伤病人3个最严重损伤的AIS值的平方相加，而不考虑损伤的具体部位")
    @TableField(value = "niss")
    private String niss;

    @Schema(description = "TRISS,严重创伤结局研究方法P55")
    @TableField(value = "triss")
    private String triss;

    @Schema(description = "ASCOT,创伤严重程度描述评分P57")
    @TableField(value = "ascot")
    private String ascot;

    @Schema(description = "救治阶段(0:现场救治,1:转院救治,2:急诊救治,3:院内救治)")
    @TableField(value = "stage")
    private String stage;

    @Schema(description = "评分来源 现场(cure_of_scene), 急诊(emergency), 住院(in_hospital)")
    @TableField(value = "source")
    private String source;

    @Schema(description = "录入时间")
    @TableField(value = "created_at")
    private String createdAt;

    @Schema(description = "录入人")
    @TableField(value = "created_by")
    private String createdBy;

    @Schema(description = "修改时间")
    @TableField(value = "updated_at")
    private LocalDateTime updatedAt;

    @Schema(description = "修改人")
    @TableField(value = "updated_by")
    private String updatedBy;

    @Schema(description = "逻辑删除标记")
    @TableField(value = "deleted")
    private Boolean deleted;

    @TableField(value = "eci_cr_dtime")
    private String eciCrDtime;

    @TableField(value = "eci_up_dtime")
    private String eciUpDtime;

    public static final String ID = "id";

    public static final String PATIENT_ID = "patient_id";

    public static final String ADMISSION_NUMBER = "admission_number";

    public static final String CHEST_OF_BELLY = "chest_of_belly";

    public static final String TEMPERATURE = "temperature";

    public static final String RESPIRATION_RATE = "respiration_rate";

    public static final String PULSE = "pulse";

    public static final String SYSTOLIC_PRESSURE = "systolic_pressure";

    public static final String EYES_OPEN_RESPONSE = "eyes_open_response";

    public static final String SPEECH_RESPONSE = "speech_response";

    public static final String SPORT_RESPONSE = "sport_response";

    public static final String ENDOTRACHEAL_INTUBATION = "endotracheal_intubation";

    public static final String SEDATIVE = "sedative";

    public static final String MUSCLE_RELAXANT = "muscle_relaxant";

    public static final String SURFACE_HEMORRHAGE = "surface_hemorrhage";

    public static final String GCS_RESTRICT = "gcs_restrict";

    public static final String RESPIRATORY_STATE = "respiratory_state";

    public static final String PRESSING_PAIN = "pressing_pain";

    public static final String PHI_RESPIRATORY_STATE = "phi_respiratory_state";

    public static final String CAPILLARY_FILLING = "capillary_filling";

    public static final String DIASTOLIC_PRESSURE = "diastolic_pressure";

    public static final String CLINIC_RESPONSE = "clinic_response";

    public static final String TI_DAMAGE_PARTS = "ti_damage_parts";

    public static final String TI_DAMAGE_PARTS_SCORE = "ti_damage_parts_score";

    public static final String TI_DAMAGE_TYPES = "ti_damage_types";

    public static final String SCORE_TIME = "score_time";

    public static final String RTS = "rts";

    public static final String T_RTS = "t_rts";

    public static final String GCS = "gcs";

    public static final String CRAMS = "crams";

    public static final String PHI = "phi";

    public static final String TI = "ti";

    public static final String TS = "ts";

    public static final String ISS = "iss";

    public static final String AIS = "ais";

    public static final String NISS = "niss";

    public static final String TRISS = "triss";

    public static final String ASCOT = "ascot";

    public static final String STAGE = "stage";

    public static final String SOURCE = "source";

    public static final String CREATED_AT = "created_at";

    public static final String CREATED_BY = "created_by";

    public static final String UPDATED_AT = "updated_at";

    public static final String UPDATED_BY = "updated_by";

    public static final String DELETED = "deleted";

    public static final String ECI_CR_DTIME = "eci_cr_dtime";

    public static final String ECI_UP_DTIME = "eci_up_dtime";
}
