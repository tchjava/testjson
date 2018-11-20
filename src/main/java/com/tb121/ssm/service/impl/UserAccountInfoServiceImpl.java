package com.tb121.ssm.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tb121.ssm.entity.UserAccountInfo;
import com.tb121.ssm.form.AccountContactVo;
import com.tb121.ssm.form.CustomUserAccount;
import com.tb121.ssm.form.UserInfoVo;
import com.tb121.ssm.mapper.UserAccountInfoMapper;
import com.tb121.ssm.service.UserAccountInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户账号表 服务实现类
 * </p>
 *
 * @author zuoshuai
 * @since 2018-11-02
 */
@Service
public class UserAccountInfoServiceImpl extends ServiceImpl<UserAccountInfoMapper, UserAccountInfo> implements UserAccountInfoService {


    @Override
    public List<UserInfoVo> findUserInfoVoList() {
        return this.baseMapper.findUserInfoVoList();
    }

    @Override
    public List<CustomUserAccount> findCustomUserAccountList() {
        return this.baseMapper.findCustomUserAccountList();
    }

    @Override
    public Page<UserInfoVo> selectUserAccountListPage() {
        Page page=new Page(2,5);
        List<UserInfoVo> beanList=this.baseMapper.selectUserAccountList(page);
        page.setRecords(beanList);
        page.setTotal(this.baseMapper.selectCountByUserAccount());
        return page;
    }

    @Override
    public Page<AccountContactVo> selectAccountContactInfo(Page<AccountContactVo> page) {
        page.setRecords(this.baseMapper.selectAccountContactInfo(page));
        System.out.println("page-->total:"+page.getTotal());
        //==========
        return page;
    }

    @Override
    public Page<UserAccountInfo> findUserAccountInfoById(Page page) {

        return  this.baseMapper.findUserAccountStaffList(page);
    }

    @Override
    public List<UserAccountInfo> findList() {
        return this.baseMapper.findList();
    }
}
