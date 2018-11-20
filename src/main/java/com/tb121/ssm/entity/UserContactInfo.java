package com.tb121.ssm.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 用户联系信息表
 * </p>
 *
 * @author zuoshuai
 * @since 2018-11-02
 */
@Data
@TableName("user_contact_info")
public class UserContactInfo extends Model<UserContactInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("user_id")
    private String userId;
    private String phone;
    private Integer area1;
    private Integer area2;
    private Integer area3;
    private String qq;
    private String email;
    /**
     * 现住址
     */
    @TableField("now_addr")
    private String nowAddr;
    /**
     * 紧急联系人
     */
    private String emergency;
    /**
     * 紧急联系人_电话
     */
    @TableField("emergency_phone")
    private String emergencyPhone;
    /**
     * 与紧急联系人关系
     */
    @TableField("emergency_rela")
    private String emergencyRela;




    @Override
    protected Serializable pkVal() {
        return this.id;
    }


}
