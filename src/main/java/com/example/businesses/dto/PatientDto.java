package com.example.businesses.dto;
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
 * 患者信息
 * </p>
 *
 * @author developerworks
 * @since 2023-03-14
 */
@Data
@Accessors(chain = true)
@Schema(name = "Patient", description = "$!{table.comment}")
public class PatientDto {

    @Schema(description = "医院 SASS ID")
    private String saasId;

    @Schema(description = "主键")
    private Long id;

    @Schema(description = "患者 ID")
    private String patientId;

    @Schema(description = "病案号/住院号")
    private String admissionNumber;

    @Schema(description = "病历 ID")
    private String inHospitalNumber;

    @Schema(description = "姓名")
    private String name;

    @Schema(description = "急诊号")
    private String emergencyNumber;

    @Schema(description = "入院次数")
    private Integer numberOfAdmission;

    @Schema(description = "是否住院患者(默认为 0, 暂时未使用)")
    private Boolean beInHospitalization;

    @Schema(description = "是否绿色通道患者(0:不是, 1:是)")
    private Boolean theGreenChannel;

    @Schema(description = "是否军人身份(0:普通, 1:军人)")
    private Boolean theSoldier;

    @Schema(description = "是否急诊(0:普通, 1:急诊)")
    private Boolean beEmergencyCase;

    @Schema(description = "是否转院(0:本院首诊, 1:他院转入)")
    private Boolean beTransferHospital;

    @Schema(description = "证件种类")
    private String identificationType;

    @Schema(description = "证件号")
    private String identificationCard;

    @Schema(description = "出生日期")
    private String birthday;

    @Schema(description = "年龄单位")
    private String ageUnit;

    @Schema(description = "年龄")
    private String age;

    @Schema(description = "性别")
    private String gender;

    @Schema(description = "名族")
    private String nation;

    @Schema(description = "职业")
    private String occupation;

    @Schema(description = "婚姻状况")
    private String marriage;

    @Schema(description = "入院时间")
    private LocalDateTime beAdmissionTime;

    @Schema(description = "救治医院")
    private String beAdmissionHospital;

    @Schema(description = "入院科室")
    private String beAdmissionDepartment;

    @Schema(description = "所属省市区")
    private String regionId;

    @Schema(description = "国籍")
    private String nationality;

    @Schema(description = "国籍")
    private String country;

    @Schema(description = "省/直辖市")
    private String province;

    @Schema(description = "市")
    private String city;

    @Schema(description = "县/区")
    private String district;

    @Schema(description = "家庭地址")
    private String address;

    @Schema(description = "联系电话")
    private String telephone;

    @Schema(description = "联系人")
    private String contact;

    @Schema(description = "联系人电话")
    private String contactTelephone;

    @Schema(description = "计算字段: 总完成率")
    private Double completionRatio;

    @Schema(description = "计算字段: 患者信息完成率")
    private Double patientInfoCompletionRatio;

    @Schema(description = "录入时间")
    private LocalDateTime createdAt;

    @Schema(description = "录入人")
    private String createdBy;

    @Schema(description = "录入人用户 ID")
    private String createdByUserId;

    @Schema(description = "录入科室/部门")
    private String createdDept;

    @Schema(description = "病历状态: 0: 初始状态, 1: 已审核, 2: 未审核, 3: 已驳回, 4: 未提交")
    private String state;

    @Schema(description = "开始急救时间")
    private LocalDateTime beginRescueTime;

    @Schema(description = "患者到达时间")
    private LocalDateTime deliveryTime;

    @Schema(description = "医生到达时间")
    private LocalDateTime doctorDeliveryTime;

    @Schema(description = "最后由谁更新")
    private String updatedBy;

    @Schema(description = "最后更新时间")
    private LocalDateTime updatedAt;

    @Schema(description = "审核人")
    private String approvedBy;

    @Schema(description = "审核时间")
    private LocalDateTime approvedAt;

    @Schema(description = "审核说明")
    private String approvedDesc;

    @Schema(description = "逻辑删除标记")
    private Boolean deleted;

    @Schema(description = "删除时间")
    private LocalDateTime deletedAt;

    @Schema(description = "删除人")
    private String deletedBy;

    @Schema(description = "离院时间")
    private LocalDateTime leaveHospitalTime;

    @Schema(description = "主治医生")
    private String doctor;

    @Schema(description = "计算字段: 住院天数")
    private Integer inhospitalDays;

    @Schema(description = "计算字段: ICU天数")
    private Integer icuDays;

    @Schema(description = "当前机构信息")
    private String currentOrg;

    @Schema(description = "机构信息")
    private String orgList;

    @Schema(description = "上报标记,0: 未上报, 1: 已上报")
    private String uploaded;

    @Schema(description = "上报时间")
    private LocalDateTime uploadedAt;

    @Schema(description = "上报人")
    private String uploadedBy;

    @Schema(description = "是否急诊")
    private String isEmergency;

    @Schema(description = "是否住院")
    private String isInhospital;

    @Schema(description = "负责人/责任人")
    private String responsiblePerson;

    @Schema(description = "负责人科室")
    private String responsiblePersonDept;

    @Schema(description = "负责人机构")
    private String responsiblePersonOrg;

    @Schema(description = "创伤中心等级")
    private String traumaLevel;

    @Schema(description = "医院等级")
    private String hospitalLevel;

    private String eciCrDtime;

    private String eciUpDtime;

    @Schema(description = "医院所在区域 ID, 一般按省/市")
    private String zoneId;

}
