import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.tb121.ssm.entity.User;
import com.tb121.ssm.entity.UserAccountInfo;
import com.tb121.ssm.mapper.UserMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class TestEntityWrapper {
    private UserMapper userMapper;
    public static void main(String[] args) {
        EntityWrapper<UserAccountInfo> wrapper=new EntityWrapper<>();
        wrapper.setEntity(new UserAccountInfo());
        String username="zhangsan";
        wrapper.where("username={0}",username)
                .orderBy("username");
        String sql =wrapper.getSqlSegment();
        System.out.println(sql);
    }

    @Before
    public void init() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        userMapper= (UserMapper) ac.getBean("userMapper");

    }
    /**
     * selectList
     */
    @Test
    public void fun1(){
        User user=new User();
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(user);
        List<User> list=this.userMapper.selectList(entityWrapper);
        for (User u : list) {
            System.out.println(u);
        }
    }

    /**
     * selectPage
     */
    @Test
    public void fun2() {
        User user=new User();
        EntityWrapper entityWrapper=new EntityWrapper();
        entityWrapper.setEntity(user);
        Page page = new Page(1,2);

        List<User> userList=this.userMapper.selectPage(page, entityWrapper);
        for (User key : userList) {
            System.out.println(key);
        }
    }

    /**
     * selectMapPage
     */
    @Test
    public void fun3(){
        Page page = new Page(1, 3);
        List<Map<String,Object>> list=this.userMapper.selectMapsPage(page, null);
        for (Map<String, Object> map : list) {
            System.out.println("id:"+map.get("id"));
            System.out.println("name:"+map.get("name"));
        }


    }

    @Test
    public void fun4() {
        Page page = new Page(1,2);

    }
    @Test
    public void fun5(){
        System.out.println("xxx");
        System.out.println("xxx");
        System.out.println("xxx");
        //xxxxx
        //xxxxxx
    }
    
}
