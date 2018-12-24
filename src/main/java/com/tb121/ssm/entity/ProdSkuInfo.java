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
 * 单品SKU信息表
 * </p>
 *
 * @author zuoshuai
 * @since 2018-11-30
 */
@TableName("prod_sku_info")
public class ProdSkuInfo extends Model<ProdSkuInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 分类
     */
    private Integer classify;
    /**
     * 业务类型
     */
    @TableField("bss_type")
    private Integer bssType;
    /**
     * SKU编号
     */
    @TableField("sku_code")
    private String skuCode;
    /**
     * 版本号
     */
    private Integer version;
    /**
     * 名称
     */
    private String name;
    /**
     * 计量单位
     */
    private Integer unit;
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
     * 状态
     */
    private String status;
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

    public ProdSkuInfo setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getClassify() {
        return classify;
    }

    public ProdSkuInfo setClassify(Integer classify) {
        this.classify = classify;
        return this;
    }

    public Integer getBssType() {
        return bssType;
    }

    public ProdSkuInfo setBssType(Integer bssType) {
        this.bssType = bssType;
        return this;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public ProdSkuInfo setSkuCode(String skuCode) {
        this.skuCode = skuCode;
        return this;
    }

    public Integer getVersion() {
        return version;
    }

    public ProdSkuInfo setVersion(Integer version) {
        this.version = version;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProdSkuInfo setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getUnit() {
        return unit;
    }

    public ProdSkuInfo setUnit(Integer unit) {
        this.unit = unit;
        return this;
    }

    public Date getEffTime() {
        return effTime;
    }

    public ProdSkuInfo setEffTime(Date effTime) {
        this.effTime = effTime;
        return this;
    }

    public Date getExpTime() {
        return expTime;
    }

    public ProdSkuInfo setExpTime(Date expTime) {
        this.expTime = expTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ProdSkuInfo setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getCreateUserStaffId() {
        return createUserStaffId;
    }

    public ProdSkuInfo setCreateUserStaffId(String createUserStaffId) {
        this.createUserStaffId = createUserStaffId;
        return this;
    }

    public String getComments() {
        return comments;
    }

    public ProdSkuInfo setComments(String comments) {
        this.comments = comments;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ProdSkuInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public ProdSkuInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ProdSkuInfo{" +
        "id=" + id +
        ", classify=" + classify +
        ", bssType=" + bssType +
        ", skuCode=" + skuCode +
        ", version=" + version +
        ", name=" + name +
        ", unit=" + unit +
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
