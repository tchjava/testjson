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
 * 产品信息表
 * </p>
 *
 * @author zuoshuai
 * @since 2018-11-30
 */
@TableName("prod_package_info")
public class ProdPackageInfo extends Model<ProdPackageInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 产品编号
     */
    @TableField("prod_code")
    private String prodCode;
    /**
     * 是否可拆分 0不可 1可
     */
    @TableField("enable_split")
    private Integer enableSplit;
    /**
     * 版本号
     */
    private Integer version;
    /**
     * 产品名称
     */
    private String name;
    /**
     * 年级
     */
    private Integer grade;
    /**
     * 价格
     */
    private Integer price;
    /**
     * 生效时间
     */
    @TableField("eff_time")
    private Date effTime;
    /**
     * 失效时间
     */
    @TableField("exp_time")
    private Date expTime;
    /**
     * 状态 1生效 2归档 4过期 0失效
     */
    private Integer status;
    /**
     * 创建人
     */
    @TableField("create_user_staff_id")
    private String createUserStaffId;
    /**
     * 描述
     */
    private String comments;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 修改时间
     */
    @TableField("modify_time")
    private Date modifyTime;


    public Integer getId() {
        return id;
    }

    public ProdPackageInfo setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getProdCode() {
        return prodCode;
    }

    public ProdPackageInfo setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }

    public Integer getEnableSplit() {
        return enableSplit;
    }

    public ProdPackageInfo setEnableSplit(Integer enableSplit) {
        this.enableSplit = enableSplit;
        return this;
    }

    public Integer getVersion() {
        return version;
    }

    public ProdPackageInfo setVersion(Integer version) {
        this.version = version;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProdPackageInfo setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getGrade() {
        return grade;
    }

    public ProdPackageInfo setGrade(Integer grade) {
        this.grade = grade;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public ProdPackageInfo setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public Date getEffTime() {
        return effTime;
    }

    public ProdPackageInfo setEffTime(Date effTime) {
        this.effTime = effTime;
        return this;
    }

    public Date getExpTime() {
        return expTime;
    }

    public ProdPackageInfo setExpTime(Date expTime) {
        this.expTime = expTime;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public ProdPackageInfo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getCreateUserStaffId() {
        return createUserStaffId;
    }

    public ProdPackageInfo setCreateUserStaffId(String createUserStaffId) {
        this.createUserStaffId = createUserStaffId;
        return this;
    }

    public String getComments() {
        return comments;
    }

    public ProdPackageInfo setComments(String comments) {
        this.comments = comments;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ProdPackageInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public ProdPackageInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ProdPackageInfo{" +
        "id=" + id +
        ", prodCode=" + prodCode +
        ", enableSplit=" + enableSplit +
        ", version=" + version +
        ", name=" + name +
        ", grade=" + grade +
        ", price=" + price +
        ", effTime=" + effTime +
        ", expTime=" + expTime +
        ", status=" + status +
        ", createUserStaffId=" + createUserStaffId +
        ", comments=" + comments +
        ", createTime=" + createTime +
        ", modifyTime=" + modifyTime +
        "}";
    }
}
