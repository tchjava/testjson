package com.tb121.ssm.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.tb121.ssm.entity.UserAccountInfo;
import com.tb121.ssm.form.AccountContactVo;
import com.tb121.ssm.form.CustomUserAccount;
import com.tb121.ssm.form.UserInfoVo;

import java.util.List;

/**
 * <p>
 * 用户账号表 Mapper 接口
 * </p>
 *
 * @author zuoshuai
 * @since 2018-11-02
 */

public interface UserAccountInfoMapper extends BaseMapper<UserAccountInfo> {
        List<UserInfoVo> findUserInfoVoList();
        List<CustomUserAccount> findCustomUserAccountList();
        List<UserInfoVo> selectUserAccountList(Page page);


        long selectCountByUserAccount();



        List<AccountContactVo> selectAccountContactInfo(Page<AccountContactVo> page);
        Page<UserAccountInfo> findUserAccountStaffList(Page page);
        List<UserAccountInfo> findList();
}
