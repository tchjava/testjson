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
 * 产品明细表
 * </p>
 *
 * @author zuoshuai
 * @since 2018-11-30
 */
@TableName("prod_package_detail")
public class ProdPackageDetail extends Model<ProdPackageDetail> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 产品标识
     */
    @TableField("prod_id")
    private Integer prodId;
    /**
     * 单品标识
     */
    @TableField("sku_id")
    private Integer skuId;
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
     * 单品分类 1学费,2住宿费,3管理费
     */
    @TableField("sku_classify")
    private Integer skuClassify;
    /**
     * 单价
     */
    @TableField("unit_price")
    private Integer unitPrice;
    /**
     * 数量
     */
    private Integer num;
    /**
     * 价格
     */
    private Integer price;
    /**
     * 收费类型1购买2赠送
     */
    @TableField("bill_type")
    private Integer billType;
    /**
     * 学科二进制值
     */
    private Integer subjects;
    /**
     * 生效日期
     */
    @TableField("eff_date")
    private Date effDate;
    /**
     * 失效日期
     */
    @TableField("exp_date")
    private Date expDate;
    /**
     * 赠送分期数
     */
    @TableField("stage_num")
    private Integer stageNum;
    /**
     * 描述
     */
    private String comments;
    /**
     * 序号
     */
    @TableField("serial_num")
    private Integer serialNum;
    /**
     * 时间档或校历标识
     */
    @TableField("time_id")
    private Integer timeId;


    public Integer getId() {
        return id;
    }

    public ProdPackageDetail setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getProdId() {
        return prodId;
    }

    public ProdPackageDetail setProdId(Integer prodId) {
        this.prodId = prodId;
        return this;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public ProdPackageDetail setSkuId(Integer skuId) {
        this.skuId = skuId;
        return this;
    }

    public Integer getBssType() {
        return bssType;
    }

    public ProdPackageDetail setBssType(Integer bssType) {
        this.bssType = bssType;
        return this;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public ProdPackageDetail setSkuCode(String skuCode) {
        this.skuCode = skuCode;
        return this;
    }

    public Integer getSkuClassify() {
        return skuClassify;
    }

    public ProdPackageDetail setSkuClassify(Integer skuClassify) {
        this.skuClassify = skuClassify;
        return this;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public ProdPackageDetail setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public ProdPackageDetail setNum(Integer num) {
        this.num = num;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public ProdPackageDetail setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public Integer getBillType() {
        return billType;
    }

    public ProdPackageDetail setBillType(Integer billType) {
        this.billType = billType;
        return this;
    }

    public Integer getSubjects() {
        return subjects;
    }

    public ProdPackageDetail setSubjects(Integer subjects) {
        this.subjects = subjects;
        return this;
    }

    public Date getEffDate() {
        return effDate;
    }

    public ProdPackageDetail setEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    public Date getExpDate() {
        return expDate;
    }

    public ProdPackageDetail setExpDate(Date expDate) {
        this.expDate = expDate;
        return this;
    }

    public Integer getStageNum() {
        return stageNum;
    }

    public ProdPackageDetail setStageNum(Integer stageNum) {
        this.stageNum = stageNum;
        return this;
    }

    public String getComments() {
        return comments;
    }

    public ProdPackageDetail setComments(String comments) {
        this.comments = comments;
        return this;
    }

    public Integer getSerialNum() {
        return serialNum;
    }

    public ProdPackageDetail setSerialNum(Integer serialNum) {
        this.serialNum = serialNum;
        return this;
    }

    public Integer getTimeId() {
        return timeId;
    }

    public ProdPackageDetail setTimeId(Integer timeId) {
        this.timeId = timeId;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ProdPackageDetail{" +
        "id=" + id +
        ", prodId=" + prodId +
        ", skuId=" + skuId +
        ", bssType=" + bssType +
        ", skuCode=" + skuCode +
        ", skuClassify=" + skuClassify +
        ", unitPrice=" + unitPrice +
        ", num=" + num +
        ", price=" + price +
        ", billType=" + billType +
        ", subjects=" + subjects +
        ", effDate=" + effDate +
        ", expDate=" + expDate +
        ", stageNum=" + stageNum +
        ", comments=" + comments +
        ", serialNum=" + serialNum +
        ", timeId=" + timeId +
        "}";
    }
}
