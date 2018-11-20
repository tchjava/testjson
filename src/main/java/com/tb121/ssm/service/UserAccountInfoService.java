package com.tb121.ssm.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.tb121.ssm.entity.UserAccountInfo;
import com.tb121.ssm.form.AccountContactVo;
import com.tb121.ssm.form.CustomUserAccount;
import com.tb121.ssm.form.UserInfoVo;

import java.util.List;

/**
 * <p>
 * 用户账号表 服务类
 * </p>
 *
 * @author zuoshuai
 * @since 2018-11-02
 */
public interface UserAccountInfoService extends IService<UserAccountInfo> {
    List<UserInfoVo> findUserInfoVoList();
    List<CustomUserAccount> findCustomUserAccountList();
    Page<UserInfoVo> selectUserAccountListPage();
    Page<AccountContactVo> selectAccountContactInfo(Page<AccountContactVo> page);
    Page<UserAccountInfo> findUserAccountInfoById(Page page);
    List<UserAccountInfo> findList();
}
