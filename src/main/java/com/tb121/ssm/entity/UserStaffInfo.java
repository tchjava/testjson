package com.tb121.ssm.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 用户身份表
 * </p>
 *
 * @author zuoshuai
 * @since 2018-11-02
 */
@Data
@TableName("user_staff_info")
public class UserStaffInfo extends Model<UserStaffInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 身份标识
     */
    private String id;
    /**
     * 账户标识
     */
    @TableField("user_id")
    private String userId;
    /**
     * 类型 1-学生 2-老师 4-销售 8-全职 16-兼职  32-父亲 64-母亲 128-学管 256-教务 512-商户管理员 1024-销售网点主管 2048-教研 4096-学科组长
     */
    private String type;
    /**
     * 名称
     */
    private String name;
    private String val;
    /**
     * 备注
     */
    private String comment;
    /**
     * 状态
     */
    private String status;
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
    @TableField("midify_time")
    private Date midifyTime;




    @Override
    protected Serializable pkVal() {
        return this.id;
    }


}
