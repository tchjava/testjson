package com.tb121.ssm.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 学校信息表
 * </p>
 *
 * @author zuoshuai
 * @since 2018-11-30
 */
@TableName("cfg_school_info")
public class CfgSchoolInfo extends Model<CfgSchoolInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String name;
    private Integer area1;
    private Integer area2;
    private Integer area3;
    /**
     * 初/高中
     */
    private Integer type;
    /**
     * 学校等级 几类校
     */
    private Integer level;
    private String status;
    /**
     * 搜索内容
     */
    @TableField("search_text")
    private String searchText;


    public Integer getId() {
        return id;
    }

    public CfgSchoolInfo setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CfgSchoolInfo setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getArea1() {
        return area1;
    }

    public CfgSchoolInfo setArea1(Integer area1) {
        this.area1 = area1;
        return this;
    }

    public Integer getArea2() {
        return area2;
    }

    public CfgSchoolInfo setArea2(Integer area2) {
        this.area2 = area2;
        return this;
    }

    public Integer getArea3() {
        return area3;
    }

    public CfgSchoolInfo setArea3(Integer area3) {
        this.area3 = area3;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public CfgSchoolInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getLevel() {
        return level;
    }

    public CfgSchoolInfo setLevel(Integer level) {
        this.level = level;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CfgSchoolInfo setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getSearchText() {
        return searchText;
    }

    public CfgSchoolInfo setSearchText(String searchText) {
        this.searchText = searchText;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "CfgSchoolInfo{" +
        "id=" + id +
        ", name=" + name +
        ", area1=" + area1 +
        ", area2=" + area2 +
        ", area3=" + area3 +
        ", type=" + type +
        ", level=" + level +
        ", status=" + status +
        ", searchText=" + searchText +
        "}";
    }
}
