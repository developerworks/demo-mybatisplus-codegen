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
 * 患者信息
 * </p>
 *
 * @author developerworks
 * @since 2023-03-14
 */
@Data
@Accessors(chain = true)
@TableName("trauma_patient")
@Schema(name = "Patient", description = "$!{table.comment}")
public class Patient {

    @Schema(description = "医院 SASS ID")
    @TableField(value = "saas_id")
    private String saasId;

    @Schema(description = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "患者 ID")
    @TableField(value = "patient_id")
    private String patientId;

    @Schema(description = "病案号/住院号")
    @TableField(value = "admission_number")
    private String admissionNumber;

    @Schema(description = "病历 ID")
    @TableField(value = "in_hospital_number")
    private String inHospitalNumber;

    @Schema(description = "姓名")
    @TableField(value = "name")
    private String name;

    @Schema(description = "急诊号")
    @TableField(value = "emergency_number")
    private String emergencyNumber;

    @Schema(description = "入院次数")
    @TableField(value = "number_of_admission")
    private Integer numberOfAdmission;

    @Schema(description = "是否住院患者(默认为 0, 暂时未使用)")
    @TableField(value = "be_in_hospitalization")
    private Boolean beInHospitalization;

    @Schema(description = "是否绿色通道患者(0:不是, 1:是)")
    @TableField(value = "the_green_channel")
    private Boolean theGreenChannel;

    @Schema(description = "是否军人身份(0:普通, 1:军人)")
    @TableField(value = "the_soldier")
    private Boolean theSoldier;

    @Schema(description = "是否急诊(0:普通, 1:急诊)")
    @TableField(value = "be_emergency_case")
    private Boolean beEmergencyCase;

    @Schema(description = "是否转院(0:本院首诊, 1:他院转入)")
    @TableField(value = "be_transfer_hospital")
    private Boolean beTransferHospital;

    @Schema(description = "证件种类")
    @TableField(value = "identification_type")
    private String identificationType;

    @Schema(description = "证件号")
    @TableField(value = "identification_card")
    private String identificationCard;

    @Schema(description = "出生日期")
    @TableField(value = "birthday")
    private String birthday;

    @Schema(description = "年龄单位")
    @TableField(value = "age_unit")
    private String ageUnit;

    @Schema(description = "年龄")
    @TableField(value = "age")
    private String age;

    @Schema(description = "性别")
    @TableField(value = "gender")
    private String gender;

    @Schema(description = "名族")
    @TableField(value = "nation")
    private String nation;

    @Schema(description = "职业")
    @TableField(value = "occupation")
    private String occupation;

    @Schema(description = "婚姻状况")
    @TableField(value = "marriage")
    private String marriage;

    @Schema(description = "入院时间")
    @TableField(value = "be_admission_time")
    private LocalDateTime beAdmissionTime;

    @Schema(description = "救治医院")
    @TableField(value = "be_admission_hospital")
    private String beAdmissionHospital;

    @Schema(description = "入院科室")
    @TableField(value = "be_admission_department")
    private String beAdmissionDepartment;

    @Schema(description = "所属省市区")
    @TableField(value = "region_id")
    private String regionId;

    @Schema(description = "国籍")
    @TableField(value = "nationality")
    private String nationality;

    @Schema(description = "国籍")
    @TableField(value = "country")
    private String country;

    @Schema(description = "省/直辖市")
    @TableField(value = "province")
    private String province;

    @Schema(description = "市")
    @TableField(value = "city")
    private String city;

    @Schema(description = "县/区")
    @TableField(value = "district")
    private String district;

    @Schema(description = "家庭地址")
    @TableField(value = "address")
    private String address;

    @Schema(description = "联系电话")
    @TableField(value = "telephone")
    private String telephone;

    @Schema(description = "联系人")
    @TableField(value = "contact")
    private String contact;

    @Schema(description = "联系人电话")
    @TableField(value = "contact_telephone")
    private String contactTelephone;

    @Schema(description = "计算字段: 总完成率")
    @TableField(value = "completion_ratio")
    private Double completionRatio;

    @Schema(description = "计算字段: 患者信息完成率")
    @TableField(value = "patient_info_completion_ratio")
    private Double patientInfoCompletionRatio;

    @Schema(description = "录入时间")
    @TableField(value = "created_at")
    private LocalDateTime createdAt;

    @Schema(description = "录入人")
    @TableField(value = "created_by")
    private String createdBy;

    @Schema(description = "录入人用户 ID")
    @TableField(value = "created_by_user_id")
    private String createdByUserId;

    @Schema(description = "录入科室/部门")
    @TableField(value = "created_dept")
    private String createdDept;

    @Schema(description = "病历状态: 0: 初始状态, 1: 已审核, 2: 未审核, 3: 已驳回, 4: 未提交")
    @TableField(value = "state")
    private String state;

    @Schema(description = "开始急救时间")
    @TableField(value = "begin_rescue_time")
    private LocalDateTime beginRescueTime;

    @Schema(description = "患者到达时间")
    @TableField(value = "delivery_time")
    private LocalDateTime deliveryTime;

    @Schema(description = "医生到达时间")
    @TableField(value = "doctor_delivery_time")
    private LocalDateTime doctorDeliveryTime;

    @Schema(description = "最后由谁更新")
    @TableField(value = "updated_by")
    private String updatedBy;

    @Schema(description = "最后更新时间")
    @TableField(value = "updated_at")
    private LocalDateTime updatedAt;

    @Schema(description = "审核人")
    @TableField(value = "approved_by")
    private String approvedBy;

    @Schema(description = "审核时间")
    @TableField(value = "approved_at")
    private LocalDateTime approvedAt;

    @Schema(description = "审核说明")
    @TableField(value = "approved_desc")
    private String approvedDesc;

    @Schema(description = "逻辑删除标记")
    @TableField(value = "deleted")
    private Boolean deleted;

    @Schema(description = "删除时间")
    @TableField(value = "deleted_at")
    private LocalDateTime deletedAt;

    @Schema(description = "删除人")
    @TableField(value = "deleted_by")
    private String deletedBy;

    @Schema(description = "离院时间")
    @TableField(value = "leave_hospital_time")
    private LocalDateTime leaveHospitalTime;

    @Schema(description = "主治医生")
    @TableField(value = "doctor")
    private String doctor;

    @Schema(description = "计算字段: 住院天数")
    @TableField(value = "inhospital_days")
    private Integer inhospitalDays;

    @Schema(description = "计算字段: ICU天数")
    @TableField(value = "icu_days")
    private Integer icuDays;

    @Schema(description = "当前机构信息")
    @TableField(value = "current_org")
    private String currentOrg;

    @Schema(description = "机构信息")
    @TableField(value = "org_list")
    private String orgList;

    @Schema(description = "上报标记,0: 未上报, 1: 已上报")
    @TableField(value = "uploaded")
    private String uploaded;

    @Schema(description = "上报时间")
    @TableField(value = "uploaded_at")
    private LocalDateTime uploadedAt;

    @Schema(description = "上报人")
    @TableField(value = "uploaded_by")
    private String uploadedBy;

    @Schema(description = "是否急诊")
    @TableField(value = "is_emergency")
    private String isEmergency;

    @Schema(description = "是否住院")
    @TableField(value = "is_inhospital")
    private String isInhospital;

    @Schema(description = "负责人/责任人")
    @TableField(value = "responsible_person")
    private String responsiblePerson;

    @Schema(description = "负责人科室")
    @TableField(value = "responsible_person_dept")
    private String responsiblePersonDept;

    @Schema(description = "负责人机构")
    @TableField(value = "responsible_person_org")
    private String responsiblePersonOrg;

    @Schema(description = "创伤中心等级")
    @TableField(value = "trauma_level")
    private String traumaLevel;

    @Schema(description = "医院等级")
    @TableField(value = "hospital_level")
    private String hospitalLevel;

    @TableField(value = "eci_cr_dtime")
    private String eciCrDtime;

    @TableField(value = "eci_up_dtime")
    private String eciUpDtime;

    @Schema(description = "医院所在区域 ID, 一般按省/市")
    @TableField(value = "zone_id")
    private String zoneId;

    public static final String SAAS_ID = "saas_id";

    public static final String ID = "id";

    public static final String PATIENT_ID = "patient_id";

    public static final String ADMISSION_NUMBER = "admission_number";

    public static final String IN_HOSPITAL_NUMBER = "in_hospital_number";

    public static final String NAME = "name";

    public static final String EMERGENCY_NUMBER = "emergency_number";

    public static final String NUMBER_OF_ADMISSION = "number_of_admission";

    public static final String BE_IN_HOSPITALIZATION = "be_in_hospitalization";

    public static final String THE_GREEN_CHANNEL = "the_green_channel";

    public static final String THE_SOLDIER = "the_soldier";

    public static final String BE_EMERGENCY_CASE = "be_emergency_case";

    public static final String BE_TRANSFER_HOSPITAL = "be_transfer_hospital";

    public static final String IDENTIFICATION_TYPE = "identification_type";

    public static final String IDENTIFICATION_CARD = "identification_card";

    public static final String BIRTHDAY = "birthday";

    public static final String AGE_UNIT = "age_unit";

    public static final String AGE = "age";

    public static final String GENDER = "gender";

    public static final String NATION = "nation";

    public static final String OCCUPATION = "occupation";

    public static final String MARRIAGE = "marriage";

    public static final String BE_ADMISSION_TIME = "be_admission_time";

    public static final String BE_ADMISSION_HOSPITAL = "be_admission_hospital";

    public static final String BE_ADMISSION_DEPARTMENT = "be_admission_department";

    public static final String REGION_ID = "region_id";

    public static final String NATIONALITY = "nationality";

    public static final String COUNTRY = "country";

    public static final String PROVINCE = "province";

    public static final String CITY = "city";

    public static final String DISTRICT = "district";

    public static final String ADDRESS = "address";

    public static final String TELEPHONE = "telephone";

    public static final String CONTACT = "contact";

    public static final String CONTACT_TELEPHONE = "contact_telephone";

    public static final String COMPLETION_RATIO = "completion_ratio";

    public static final String PATIENT_INFO_COMPLETION_RATIO = "patient_info_completion_ratio";

    public static final String CREATED_AT = "created_at";

    public static final String CREATED_BY = "created_by";

    public static final String CREATED_BY_USER_ID = "created_by_user_id";

    public static final String CREATED_DEPT = "created_dept";

    public static final String STATE = "state";

    public static final String BEGIN_RESCUE_TIME = "begin_rescue_time";

    public static final String DELIVERY_TIME = "delivery_time";

    public static final String DOCTOR_DELIVERY_TIME = "doctor_delivery_time";

    public static final String UPDATED_BY = "updated_by";

    public static final String UPDATED_AT = "updated_at";

    public static final String APPROVED_BY = "approved_by";

    public static final String APPROVED_AT = "approved_at";

    public static final String APPROVED_DESC = "approved_desc";

    public static final String DELETED = "deleted";

    public static final String DELETED_AT = "deleted_at";

    public static final String DELETED_BY = "deleted_by";

    public static final String LEAVE_HOSPITAL_TIME = "leave_hospital_time";

    public static final String DOCTOR = "doctor";

    public static final String INHOSPITAL_DAYS = "inhospital_days";

    public static final String ICU_DAYS = "icu_days";

    public static final String CURRENT_ORG = "current_org";

    public static final String ORG_LIST = "org_list";

    public static final String UPLOADED = "uploaded";

    public static final String UPLOADED_AT = "uploaded_at";

    public static final String UPLOADED_BY = "uploaded_by";

    public static final String IS_EMERGENCY = "is_emergency";

    public static final String IS_INHOSPITAL = "is_inhospital";

    public static final String RESPONSIBLE_PERSON = "responsible_person";

    public static final String RESPONSIBLE_PERSON_DEPT = "responsible_person_dept";

    public static final String RESPONSIBLE_PERSON_ORG = "responsible_person_org";

    public static final String TRAUMA_LEVEL = "trauma_level";

    public static final String HOSPITAL_LEVEL = "hospital_level";

    public static final String ECI_CR_DTIME = "eci_cr_dtime";

    public static final String ECI_UP_DTIME = "eci_up_dtime";

    public static final String ZONE_ID = "zone_id";
}
