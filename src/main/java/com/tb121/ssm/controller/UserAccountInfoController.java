package com.tb121.ssm.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.tb121.ssm.entity.UserAccountInfo;
import com.tb121.ssm.form.AccountContactVo;
import com.tb121.ssm.form.CustomUserAccount;
import com.tb121.ssm.form.UserInfoVo;
import com.tb121.ssm.service.UserAccountInfoService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户账号表 前端控制器
 * </p>
 *
 * @author zuoshuai
 * @since 2018-11-02
 */
@Transactional(rollbackFor=Exception.class)
@Controller
@RequestMapping("/userAccountInfo")
public class UserAccountInfoController {
    @Resource
    private UserAccountInfoService userAccountInfoService;

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    @RequestMapping("/selectUserById")
    @ResponseBody
    public Map selectUserById(@PathVariable(value="id") String id){
        System.out.println("输出id:------"+id);
        Map map=new HashMap<>();


        UserAccountInfo userInfo=new UserAccountInfo();
        userInfo.setId(id);
        UserAccountInfo exampleUserInfo=userInfo.selectById();
        map.put("userInfo",exampleUserInfo);
        return map;
    }

    /**
     * 添加
     * @return
     */
    @RequestMapping("/addUserAccoutInfo")
    @ResponseBody
    public Map add(){
        Map map=new HashMap<>();
        UserAccountInfo userInfo=new UserAccountInfo();
        userInfo.setId("233");
        userInfo.setAccount("wzj123");
        userInfo.setPasswd("123456");
        userInfo.setBrithday("1995-12-18");
        boolean flag=userAccountInfoService.insert(userInfo);
        if(flag){
            map.put("cod","0");
            map.put("message","成功");
        }else{
            map.put("cod","-1");
            map.put("message","失败");
        }
        return map;
    }

    /**
     * 修改
     */
    @ResponseBody
    @RequestMapping("/editUserAccount")
    public Map editUserAccount(){
        //模拟数据
        UserAccountInfo userInfo=new UserAccountInfo();
        userInfo.setId("233");
        userInfo.setPasswd("777");
       boolean flag= userAccountInfoService.updateById(userInfo);


        Map map=new HashMap();
        if(flag){
            map.put("cod","0");
            map.put("message","更新成功");
        }else{
            map.put("cod","-1");
            map.put("message","更新失败");
        }
        return map;
    }
    @ResponseBody
    @RequestMapping("/del/{id}")
    public Map delUserAccount(@PathVariable String id){
        Map map=new HashMap();
        boolean flag= userAccountInfoService.deleteById(id);
        if(flag){
            map.put("cod","0");
            map.put("message","删除成功");
        }else{
            map.put("cod","-1");
            map.put("message","删除失败");
        }
        return map;
    }

    @ResponseBody
    @RequestMapping("/list")
    public List<UserInfoVo> list(){
        List<UserInfoVo> userInfoVoList=userAccountInfoService.findUserInfoVoList();
        return userInfoVoList;
    }
    @ResponseBody
    @RequestMapping("/list1")
    public List<CustomUserAccount> list1(){
        List<CustomUserAccount> userInfoVoList=userAccountInfoService.findCustomUserAccountList();
        return userInfoVoList;
    }
    @ResponseBody
    @RequestMapping("/query")
    public List<UserInfoVo> queryByPage() {
        Wrapper<UserAccountInfo> userInfo = new EntityWrapper<>();
        userInfo.like("account","%1%");
        List<UserAccountInfo> userAccountInfoList = (List<UserAccountInfo>) userAccountInfoService.selectPage(new Page<UserAccountInfo>(1, 10), userInfo);
        for(UserAccountInfo accountInfo:userAccountInfoList){
            System.out.println(accountInfo.getAccount());
        }

        return null;
    }
    @ResponseBody
    @RequestMapping("/wrapper")
    public Object wrapper(){
        UserAccountInfo userAccountInfo=new UserAccountInfo();
        Page<UserAccountInfo> page=new Page(2,10);
        EntityWrapper wrapper=new EntityWrapper();
        wrapper.setEntity(userAccountInfo);
        //wrapper.
        Page page1 = userAccountInfo.selectPage(page, wrapper);
        System.out.println("total--->:"+ page1.getTotal());
        System.out.println("size---->:"+page1.getSize());
        return page1;
    }
    @ResponseBody
    @RequestMapping("/join")
    public Object join(){
        Page<UserInfoVo> page=userAccountInfoService.selectUserAccountListPage();
       return page;
    }

    @ResponseBody
    @RequestMapping("/selectac-con-info")
    public Page selectac_con_info(){
        Page<AccountContactVo> page=new Page<>(1,10);
        Page page1=userAccountInfoService.selectAccountContactInfo(page);
        System.out.println("total:"+page1.getTotal());
        System.out.println("pages:"+page1.getPages());
        return page1;
    }
    @ResponseBody
    @RequestMapping("/simple-query")
    public Page<UserAccountInfo> simple_query(){
        UserAccountInfo userAccountInfo=new UserAccountInfo();
        userAccountInfo.setId("233");
        EntityWrapper wrapper=new EntityWrapper(userAccountInfo);
        wrapper.where("account={0}","wzj123");
        Page page=new Page(1,10);
        page= userAccountInfo.selectPage(page,wrapper);
        System.out.println("sql:---->"+wrapper.getSqlSegment());

        EntityWrapper wrapper1=new EntityWrapper(new UserAccountInfo());
        String sql= wrapper1.setSqlSelect("username,password").where("username={0}","123455").or("password={0}","12345").getSqlSegment();
        System.out.println(sql);
        return page;
    }
    @ResponseBody
    @RequestMapping("/queryUserAccountInfo/{id}")
    public Page<UserAccountInfo> findUserAccountInfoById(@PathVariable String id){
       // 13055298275
        Page page=new Page(1,1);

        return userAccountInfoService.findUserAccountInfoById(page);
    }
    @ResponseBody
    @RequestMapping("/findList")
    public List<UserAccountInfo> findList(){
        return userAccountInfoService.findList();
    }
}

