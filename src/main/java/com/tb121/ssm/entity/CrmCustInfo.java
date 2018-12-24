package com.tb121.ssm.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 客户信息表
 * </p>
 *
 * @author zuoshuai
 * @since 2018-11-30
 */
@TableName("crm_cust_info")
public class CrmCustInfo extends Model<CrmCustInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 学生名称
     */
    private String name;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 性别 M男 F女
     */
    private String sex;
    /**
     * 一级地址
     */
    private Integer addr1;
    /**
     * 二级地址
     */
    private Integer addr2;
    /**
     * 三级地址
     */
    private Integer addr3;
    /**
     * 详细地址
     */
    private String address;
    /**
     * 父亲姓名
     */
    @TableField("father_name")
    private String fatherName;
    /**
     * 父亲手机号
     */
    @TableField("father_phone")
    private String fatherPhone;
    /**
     * 父亲工作单位或工种
     */
    @TableField("father_work")
    private String fatherWork;
    /**
     * 父亲工作职位
     */
    @TableField("father_job")
    private String fatherJob;
    /**
     * 母亲姓名
     */
    @TableField("mother_name")
    private String motherName;
    /**
     * 母亲手机号
     */
    @TableField("mother_phone")
    private String motherPhone;
    /**
     * 母亲工作单位或工种
     */
    @TableField("mother_work")
    private String motherWork;
    /**
     * 母亲工作职位
     */
    @TableField("mother_job")
    private String motherJob;
    /**
     * 学校标识
     */
    @TableField("school_id")
    private Integer schoolId;
    /**
     * 学校名称
     */
    @TableField("school_name")
    private String schoolName;
    /**
     * 年级
     */
    private Integer grade;
    /**
     * 班级
     */
    private String classes;
    /**
     * 学习类型 1文科 2理科 4艺考
     */
    @TableField("learn_type")
    private Integer learnType;
    /**
     * 当前跟进销售
     */
    @TableField("sale_id")
    private String saleId;
    /**
     * 电销销售
     */
    @TableField("call_sale_id")
    private String callSaleId;
    /**
     * 拨打电话次数
     */
    private Integer count;
    /**
     * 入库时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 最后跟进时间
     */
    @TableField("last_follow_time")
    private Date lastFollowTime;
    /**
     * 网点标识
     */
    @TableField("site_id")
    private Integer siteId;
    /**
     * 商户标识
     */
    @TableField("agent_id")
    private Integer agentId;
    /**
     * 账户标识
     */
    @TableField("account_id")
    private String accountId;
    /**
     * 父母关注度 1关注 2一般 4不关注
     */
    @TableField("parent_focus")
    private Integer parentFocus;
    /**
     * 付费能力 1好 2中 4差
     */
    @TableField("pay_ability")
    private String payAbility;
    /**
     * 备注
     */
    private String comment;
    /**
     * 数据来源
     */
    @TableField("source_type")
    private Integer sourceType;
    /**
     * 来源id
     */
    @TableField("source_id")
    private String sourceId;
    /**
     * 状态 删除,未分配,已分配,号码有误,0阶客户,1阶客户,2阶客户,3阶客户,4阶客户,5阶客户,经济有困难,未成单、可能成单
     */
    private Integer status;
    /**
     * 流程中的环节
     */
    private String segment;


    public Integer getId() {
        return id;
    }

    public CrmCustInfo setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CrmCustInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public CrmCustInfo setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public CrmCustInfo setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public Integer getAddr1() {
        return addr1;
    }

    public CrmCustInfo setAddr1(Integer addr1) {
        this.addr1 = addr1;
        return this;
    }

    public Integer getAddr2() {
        return addr2;
    }

    public CrmCustInfo setAddr2(Integer addr2) {
        this.addr2 = addr2;
        return this;
    }

    public Integer getAddr3() {
        return addr3;
    }

    public CrmCustInfo setAddr3(Integer addr3) {
        this.addr3 = addr3;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public CrmCustInfo setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getFatherName() {
        return fatherName;
    }

    public CrmCustInfo setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public String getFatherPhone() {
        return fatherPhone;
    }

    public CrmCustInfo setFatherPhone(String fatherPhone) {
        this.fatherPhone = fatherPhone;
        return this;
    }

    public String getFatherWork() {
        return fatherWork;
    }

    public CrmCustInfo setFatherWork(String fatherWork) {
        this.fatherWork = fatherWork;
        return this;
    }

    public String getFatherJob() {
        return fatherJob;
    }

    public CrmCustInfo setFatherJob(String fatherJob) {
        this.fatherJob = fatherJob;
        return this;
    }

    public String getMotherName() {
        return motherName;
    }

    public CrmCustInfo setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public String getMotherPhone() {
        return motherPhone;
    }

    public CrmCustInfo setMotherPhone(String motherPhone) {
        this.motherPhone = motherPhone;
        return this;
    }

    public String getMotherWork() {
        return motherWork;
    }

    public CrmCustInfo setMotherWork(String motherWork) {
        this.motherWork = motherWork;
        return this;
    }

    public String getMotherJob() {
        return motherJob;
    }

    public CrmCustInfo setMotherJob(String motherJob) {
        this.motherJob = motherJob;
        return this;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public CrmCustInfo setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
        return this;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public CrmCustInfo setSchoolName(String schoolName) {
        this.schoolName = schoolName;
        return this;
    }

    public Integer getGrade() {
        return grade;
    }

    public CrmCustInfo setGrade(Integer grade) {
        this.grade = grade;
        return this;
    }

    public String getClasses() {
        return classes;
    }

    public CrmCustInfo setClasses(String classes) {
        this.classes = classes;
        return this;
    }

    public Integer getLearnType() {
        return learnType;
    }

    public CrmCustInfo setLearnType(Integer learnType) {
        this.learnType = learnType;
        return this;
    }

    public String getSaleId() {
        return saleId;
    }

    public CrmCustInfo setSaleId(String saleId) {
        this.saleId = saleId;
        return this;
    }

    public String getCallSaleId() {
        return callSaleId;
    }

    public CrmCustInfo setCallSaleId(String callSaleId) {
        this.callSaleId = callSaleId;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public CrmCustInfo setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public CrmCustInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getLastFollowTime() {
        return lastFollowTime;
    }

    public CrmCustInfo setLastFollowTime(Date lastFollowTime) {
        this.lastFollowTime = lastFollowTime;
        return this;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public CrmCustInfo setSiteId(Integer siteId) {
        this.siteId = siteId;
        return this;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public CrmCustInfo setAgentId(Integer agentId) {
        this.agentId = agentId;
        return this;
    }

    public String getAccountId() {
        return accountId;
    }

    public CrmCustInfo setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public Integer getParentFocus() {
        return parentFocus;
    }

    public CrmCustInfo setParentFocus(Integer parentFocus) {
        this.parentFocus = parentFocus;
        return this;
    }

    public String getPayAbility() {
        return payAbility;
    }

    public CrmCustInfo setPayAbility(String payAbility) {
        this.payAbility = payAbility;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public CrmCustInfo setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public CrmCustInfo setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    public String getSourceId() {
        return sourceId;
    }

    public CrmCustInfo setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public CrmCustInfo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getSegment() {
        return segment;
    }

    public CrmCustInfo setSegment(String segment) {
        this.segment = segment;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "CrmCustInfo{" +
        "id=" + id +
        ", name=" + name +
        ", phone=" + phone +
        ", sex=" + sex +
        ", addr1=" + addr1 +
        ", addr2=" + addr2 +
        ", addr3=" + addr3 +
        ", address=" + address +
        ", fatherName=" + fatherName +
        ", fatherPhone=" + fatherPhone +
        ", fatherWork=" + fatherWork +
        ", fatherJob=" + fatherJob +
        ", motherName=" + motherName +
        ", motherPhone=" + motherPhone +
        ", motherWork=" + motherWork +
        ", motherJob=" + motherJob +
        ", schoolId=" + schoolId +
        ", schoolName=" + schoolName +
        ", grade=" + grade +
        ", classes=" + classes +
        ", learnType=" + learnType +
        ", saleId=" + saleId +
        ", callSaleId=" + callSaleId +
        ", count=" + count +
        ", createTime=" + createTime +
        ", lastFollowTime=" + lastFollowTime +
        ", siteId=" + siteId +
        ", agentId=" + agentId +
        ", accountId=" + accountId +
        ", parentFocus=" + parentFocus +
        ", payAbility=" + payAbility +
        ", comment=" + comment +
        ", sourceType=" + sourceType +
        ", sourceId=" + sourceId +
        ", status=" + status +
        ", segment=" + segment +
        "}";
    }
}
