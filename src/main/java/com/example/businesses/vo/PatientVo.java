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
 * 患者信息
 * </p>
 *
 * @author developerworks
 * @since 2023-03-14
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "Patient对象", description = "患者信息")
public class PatientVo {

    @ApiModelProperty(value = "医院 SASS ID")
    private String saasId;

    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "患者 ID")
    private String patientId;

    @ApiModelProperty(value = "病案号/住院号")
    private String admissionNumber;

    @ApiModelProperty(value = "病历 ID")
    private String inHospitalNumber;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "急诊号")
    private String emergencyNumber;

    @ApiModelProperty(value = "入院次数")
    private Integer numberOfAdmission;

    @ApiModelProperty(value = "是否住院患者(默认为 0, 暂时未使用)")
    private Boolean beInHospitalization;

    @ApiModelProperty(value = "是否绿色通道患者(0:不是, 1:是)")
    private Boolean theGreenChannel;

    @ApiModelProperty(value = "是否军人身份(0:普通, 1:军人)")
    private Boolean theSoldier;

    @ApiModelProperty(value = "是否急诊(0:普通, 1:急诊)")
    private Boolean beEmergencyCase;

    @ApiModelProperty(value = "是否转院(0:本院首诊, 1:他院转入)")
    private Boolean beTransferHospital;

    @ApiModelProperty(value = "证件种类")
    private String identificationType;

    @ApiModelProperty(value = "证件号")
    private String identificationCard;

    @ApiModelProperty(value = "出生日期")
    private String birthday;

    @ApiModelProperty(value = "年龄单位")
    private String ageUnit;

    @ApiModelProperty(value = "年龄")
    private String age;

    @ApiModelProperty(value = "性别")
    private String gender;

    @ApiModelProperty(value = "名族")
    private String nation;

    @ApiModelProperty(value = "职业")
    private String occupation;

    @ApiModelProperty(value = "婚姻状况")
    private String marriage;

    @ApiModelProperty(value = "入院时间")
    private LocalDateTime beAdmissionTime;

    @ApiModelProperty(value = "救治医院")
    private String beAdmissionHospital;

    @ApiModelProperty(value = "入院科室")
    private String beAdmissionDepartment;

    @ApiModelProperty(value = "所属省市区")
    private String regionId;

    @ApiModelProperty(value = "国籍")
    private String nationality;

    @ApiModelProperty(value = "国籍")
    private String country;

    @ApiModelProperty(value = "省/直辖市")
    private String province;

    @ApiModelProperty(value = "市")
    private String city;

    @ApiModelProperty(value = "县/区")
    private String district;

    @ApiModelProperty(value = "家庭地址")
    private String address;

    @ApiModelProperty(value = "联系电话")
    private String telephone;

    @ApiModelProperty(value = "联系人")
    private String contact;

    @ApiModelProperty(value = "联系人电话")
    private String contactTelephone;

    @ApiModelProperty(value = "计算字段: 总完成率")
    private Double completionRatio;

    @ApiModelProperty(value = "计算字段: 患者信息完成率")
    private Double patientInfoCompletionRatio;

    @ApiModelProperty(value = "录入时间")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "录入人")
    private String createdBy;

    @ApiModelProperty(value = "录入人用户 ID")
    private String createdByUserId;

    @ApiModelProperty(value = "录入科室/部门")
    private String createdDept;

    @ApiModelProperty(value = "病历状态: 0: 初始状态, 1: 已审核, 2: 未审核, 3: 已驳回, 4: 未提交")
    private String state;

    @ApiModelProperty(value = "开始急救时间")
    private LocalDateTime beginRescueTime;

    @ApiModelProperty(value = "患者到达时间")
    private LocalDateTime deliveryTime;

    @ApiModelProperty(value = "医生到达时间")
    private LocalDateTime doctorDeliveryTime;

    @ApiModelProperty(value = "最后由谁更新")
    private String updatedBy;

    @ApiModelProperty(value = "最后更新时间")
    private LocalDateTime updatedAt;

    @ApiModelProperty(value = "审核人")
    private String approvedBy;

    @ApiModelProperty(value = "审核时间")
    private LocalDateTime approvedAt;

    @ApiModelProperty(value = "审核说明")
    private String approvedDesc;

    @ApiModelProperty(value = "逻辑删除标记")
    private Boolean deleted;

    @ApiModelProperty(value = "删除时间")
    private LocalDateTime deletedAt;

    @ApiModelProperty(value = "删除人")
    private String deletedBy;

    @ApiModelProperty(value = "离院时间")
    private LocalDateTime leaveHospitalTime;

    @ApiModelProperty(value = "主治医生")
    private String doctor;

    @ApiModelProperty(value = "计算字段: 住院天数")
    private Integer inhospitalDays;

    @ApiModelProperty(value = "计算字段: ICU天数")
    private Integer icuDays;

    @ApiModelProperty(value = "当前机构信息")
    private String currentOrg;

    @ApiModelProperty(value = "机构信息")
    private String orgList;

    @ApiModelProperty(value = "上报标记,0: 未上报, 1: 已上报")
    private String uploaded;

    @ApiModelProperty(value = "上报时间")
    private LocalDateTime uploadedAt;

    @ApiModelProperty(value = "上报人")
    private String uploadedBy;

    @ApiModelProperty(value = "是否急诊")
    private String isEmergency;

    @ApiModelProperty(value = "是否住院")
    private String isInhospital;

    @ApiModelProperty(value = "负责人/责任人")
    private String responsiblePerson;

    @ApiModelProperty(value = "负责人科室")
    private String responsiblePersonDept;

    @ApiModelProperty(value = "负责人机构")
    private String responsiblePersonOrg;

    @ApiModelProperty(value = "创伤中心等级")
    private String traumaLevel;

    @ApiModelProperty(value = "医院等级")
    private String hospitalLevel;

    private String eciCrDtime;

    private String eciUpDtime;

    @ApiModelProperty(value = "医院所在区域 ID, 一般按省/市")
    private String zoneId;

}
