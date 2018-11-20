import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.tb121.ssm.entity.User;
import com.tb121.ssm.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestService {
    private UserService userService;
    @Before
    public void init() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext*.xml");
        userService = (UserService) ac.getBean("userServiceImpl");
    }

    private void sout(int line) {
        System.out.println("影响的行数:"+line);
    }
    /**
     * 添加用户
     */
    @Test
    public void fun1() {
        User user=new User();
        user.setId(10L);
        user.setName("lixiaosi");
        user.setEmail("lixiaosi@121.com");
        userService.insert(user);
        System.out.println("添加成功---");
    }

    /**
     * saveBatch
     */
    @Test
    public void fun2() {
        User user = new User();
        User user1 = new User();

        List<User> userList = new ArrayList<>();

        user.setId(8L);
        user.setName("wangwu");
        user.setEmail("wangwu@qq.com");
        user.setAge(12);

        user1.setId(9L);
        user1.setName("zhaoliu");
        user1.setAge(13);
        user1.setEmail("zhaoliu@qq.com");

        userList.add(user);
        userList.add(user1);

        userService.insertBatch(userList);
        System.out.println("批量插入成功....");
    }

    /**
     * insertOrUpdateBatch(List<T> entityList)  没有设置主键，插入
     */
    @Test
    public void fun3() {
        List<User> userList = new ArrayList<>();
        User user=new User();
        user.setName("测试1");
        user.setAge(12);
        user.setEmail("ceshi1@qq.com");

        User user1=new User();
        user1.setName("测试2");
        user1.setAge(13);
        user1.setEmail("ceshi2@qq.com");

        userList.add(user);
        userList.add(user1);

        userService.insertOrUpdateBatch(userList);
        System.out.println("不设置主键，插入成功...");
    }

    /**
     * insertOrUpdateBatch(List<T> entityList) 设置主键，修改
     */
    @Test
    public void fun4() {
        User user = new User();
        user.setId(7L);
        user.setAge(14);

        User user1=new User();
        user1.setId(9L);
        user1.setAge(12);
        user1.setEmail("zhaoliu@121.com");

        List<User> list = new ArrayList();
        list.add(user);
        list.add(user1);
        userService.insertOrUpdateBatch(list);
        System.out.println("批量插入成功...");
    }

    /**
     * removeById-----2.X版本是deleteById
     */
    @Test
    public void fun5() {
        userService.deleteById(1064344604843380737L);
        System.out.println("删除成功....");
    }

    /**
     *  removeByMap ----deleteByMap
     */
    @Test
    public void fun6() {
        Map<String, Object> map = new HashMap<>();
        map.put("id", 1064344604939849730L);
        userService.deleteByMap(map);
        System.out.println("删除成功....");
    }

    @Test
    public void fun7() {
        User user=new User();
        user.setId(1064346870941978625L);

        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(user);

        System.out.println(userService.delete(entityWrapper));
        System.out.println("删除成功......");

    }

    /**
     *  update
     */
    @Test
    public void fun8() {
        User entity=new User();
        entity.setEmail("ceshi2@121.com");
        entity.setAge(100);

        User user=new User();
        user.setId(1064346871021670402L);
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(user);

        userService.update(entity, entityWrapper);
        System.out.println("更新成功.....");

    }

    @Test
    public void fun9() {
        Page page = new Page();
        page.setCurrent(1);
        page.setSize(2);

         Page<User> page1=userService.selectPage(page);
        System.out.println(page1);
         List<User> userList=page1.getRecords();
         for(User user:userList){
             System.out.println(user);
         }

    }
    @Test
    public void fun10() {
        Page page = new Page(1,2);


        Page<User> page1=userService.selectPage(page);
        System.out.println(page1);
        List<User> userList=page1.getRecords();
        for(User user:userList){
            System.out.println(user);
        }
    }


}
