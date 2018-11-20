package com.tb121.ssm.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 用户账号表
 * </p>
 *
 * @author zuoshuai
 * @since 2018-11-02
 */
@Data
@TableName("user_account_info")
public class UserAccountInfo extends Model<UserAccountInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户唯一标识
     */
    private String id;
    /**
     * 账号
     */
    private String account;
    /**
     * 真实姓名
     */
    private String username;
    /**
     * 登录密码
     */
    private String passwd;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 头像
     */
    private String headimg;
    /**
     * 电子签名
     */
    private String signature;
    /**
     * 性别
     */
    private String gender;
    /**
     * 生日
     */
    private String brithday;
    /**
     * 兴趣爱好
     */
    private String hobby;
    /**
     * 身份类型 目前老师有全兼职
     */
    private String type;
    /**
     * 当前状态
     */
    private String status;
    /**
     * 注册时间
     */
    @TableField("registerd_time")
    private Date registerdTime;
    /**
     * 状态时间
     */
    @TableField("status_time")
    private Date statusTime;
    /**
     * 数据更新时间
     */
    @TableField("modify_time")
    private Date modifyTime;
    @TableField(exist = false)
    private List<UserStaffInfo> userStaffInfos;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }


}
