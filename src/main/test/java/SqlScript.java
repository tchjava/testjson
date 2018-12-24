import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.tb121.ssm.entity.CfgSchoolInfo;
import com.tb121.ssm.entity.CrmCustInfo;
import com.tb121.ssm.mapper.CfgSchoolInfoMapper;
import com.tb121.ssm.mapper.CrmCustInfoMapper;
import com.tb121.ssm.service.CrmCustInfoService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class SqlScript {

    private CrmCustInfoMapper crmCustInfoMapper;
    private CfgSchoolInfoMapper cfgSchoolInfoMapper;
    private CrmCustInfoService crmCustInfoService;
    @Before
    public void init() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        crmCustInfoMapper= (CrmCustInfoMapper) ac.getBean("crmCustInfoMapper");
        cfgSchoolInfoMapper= (CfgSchoolInfoMapper)ac.getBean("cfgSchoolInfoMapper");
        crmCustInfoService=(CrmCustInfoService) ac.getBean("crmCustInfoServiceImpl");
    }
    @Test
    public void fun() {
       // Map<String,Object> map = new HashMap<>();
        //map.put("school_name", "福州一中");
        List<CrmCustInfo> list = crmCustInfoMapper.selectList(new EntityWrapper<CrmCustInfo>().eq("school_name","福州一中"));
        System.out.println(list.size());
    }

    @Test
    public void fun1() {
        CrmCustInfo crmCustInfo=new CrmCustInfo();
        crmCustInfo.setSchoolName("福州第一中学");
        crmCustInfo.setSchoolId(1);
        EntityWrapper entityWrapper=new EntityWrapper();
        entityWrapper.eq("school_name","福州一中");
        crmCustInfoMapper.update(crmCustInfo,entityWrapper);
    }

    /**
     * script:添加客户
     */
    @Test
    public void fun2() {
        //创建一个客户集合
        List<CrmCustInfo> crmCustInfos = new ArrayList<>();
        //起始的号码段2220,自己的
        //起始的号码段2221，父亲的
        //起始的号码段2222。母亲的
        long selfPhone = 13482220000L;
        long fPhone=13482221000L;
        long mPhone=13482222000L;

        //创建一个Map，存储对应的学校标识和学校名称
        Map<Integer, String> schoolMap = new HashMap<>();
       List<CfgSchoolInfo> schoolInfoList=cfgSchoolInfoMapper.selectList(null);
        for (CfgSchoolInfo cfgSchoolInfo : schoolInfoList) {
            schoolMap.put(cfgSchoolInfo.getId(),cfgSchoolInfo.getName());
        }


        //循环100次
        for (int i = 0; i <100 ; i++) {
            CrmCustInfo crmCustInfo=new CrmCustInfo();
            crmCustInfo.setName("测试数据"+i);
            crmCustInfo.setPhone((selfPhone+i)+"");
            crmCustInfo.setSex("F");
            crmCustInfo.setAddress("闽侯上街高新区");
            crmCustInfo.setFatherPhone((fPhone+i)+"");
            crmCustInfo.setMotherPhone((mPhone+i)+"");
            crmCustInfo.setCreateTime(new Date());
            //创建学校的随机数
            int school_random=new Random().nextInt(schoolMap.keySet().size());
            int index=0;
            for(Integer key: schoolMap.keySet()){
                //如果随机数等于index,就是随机选取map的key
                if(index==school_random){
                    crmCustInfo.setSchoolId(key);
                    crmCustInfo.setSchoolName(schoolMap.get(key));
                }
            }
            crmCustInfo.setGrade(12);
            crmCustInfo.setClasses("1班");

            //脚本设置客户的状态 只到1阶客户(0-5)
            //创建一个状态的随机数
            int status_random = new Random().nextInt(6);
            crmCustInfo.setStatus(status_random);

            //创建一个用来设置是否要设置跟进人员的随机数
//            int isFollowUser=new Random().nextInt(2);
//            //0=不创建
//            if(isFollowUser==0){
//                crmCustInfos.add(crmCustInfo);
//            }else{
//                //设置销售
//                //设置网点
//                crmCustInfos.add(crmCustInfo);
//            }
                crmCustInfos.add(crmCustInfo);



        }
        crmCustInfoService.insertBatch(crmCustInfos);
    }
    @Test
    public void fun3() {
        long startPhone = 13482220000L;
        System.out.println(startPhone+1);
    }



}
