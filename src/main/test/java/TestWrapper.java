import com.baomidou.mybatisplus.enums.SqlLike;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.tb121.ssm.entity.User;
import com.tb121.ssm.mapper.UserMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestWrapper {
    private UserMapper userMapper;
    @Before
    public void init() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
         userMapper= (UserMapper) ac.getBean("userMapper");
    }
    /**
     * 用于生成 sql 的 where 条件, entity 属性也用于生成 sql 的 where 条件
     */

    /**
     * allEq
     */
    @Test
    public void fun1() {
        EntityWrapper entityWrapper = new EntityWrapper();
        Map<String, Object> map = new HashMap<>();
        map.put("age", 12);
        entityWrapper.allEq(map);
        System.out.println(entityWrapper.getSqlSegment());

        List<User> userList= this.userMapper.selectList(entityWrapper);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    /**
     * eq
     */
    @Test
    public void fun2() {
        EntityWrapper entityWrapper = new EntityWrapper();
        //第一种用法，不带条件的。
        //entityWrapper.eq("age", 12);
        //第二种用法,带条件的
        entityWrapper.eq(false, "age", 12);


        List<User> userList= this.userMapper.selectList(entityWrapper);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    /**
     * ne 不等于
     */
    @Test
    public void fun3() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.ne(true, "age", 12);
        selectList(entityWrapper);
    }

    /**
     * gt  大于
     */
    @Test
    public void fun4() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.gt("age", "12");
        selectList(entityWrapper);
    }

    /**
     * ge  >=
     */
    @Test
    public void fun5() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.ge("age", 12);
        selectList(entityWrapper);
    }

    /**
     * lt <
     */
    @Test
    public void fun6() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.lt("age", 24);
        selectList(entityWrapper);
    }

    /**
     * le
     */
    @Test
    public void fun7() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.le("age", 24);
        selectList(entityWrapper);
    }

    /**
     * like
     */
    @Test
    public void fun8() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.like("name", "测试");
        selectList(entityWrapper);
    }


    @Test
    public void fun9() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.like("name","j",SqlLike.RIGHT);
        selectList(entityWrapper);
    }

    /**
     * isNull() ,isNotNull
     */
    @Test
    public void fun10() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.isNull("age");
        selectList(entityWrapper);

        EntityWrapper entityWrapper1 = new EntityWrapper();
        entityWrapper1.isNotNull("age");
        selectList(entityWrapper1);

    }

    /**
     * in
     */
    @Test
    public void fun11() {
        EntityWrapper entityWrapper = new EntityWrapper();
        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(3L);
        entityWrapper.in("id", list);
        selectList(entityWrapper);

        EntityWrapper entityWrapper1 = new EntityWrapper();
        entityWrapper1.notIn("id", list);
        selectList(entityWrapper1);
    }

    /**
     * inSQL  ---最新版本存在
     */
    @Test
    public void fun12() {
        EntityWrapper entityWrapper = new EntityWrapper();
    }

    /**
     * group by
     */
    @Test
    public void fun13() {
        EntityWrapper entityWrapper = new EntityWrapper();
        //分组
        entityWrapper.groupBy("id");
        selectList(entityWrapper);

    }

    /**
     *order by
     */
    @Test
    public void fun14() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.orderBy("id desc");
        selectList(entityWrapper);

        //两个参数的
        EntityWrapper entityWrapper1 = new EntityWrapper();
        entityWrapper1.orderBy("id",false);
        selectList(entityWrapper);

    }

    /**
     *last
     */
    @Test
    public void fun15() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.last("where id=1");

        selectList(entityWrapper);
    }

    /**
     * sqlSelect
     */
    @Test
    public void fun16() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setSqlSelect("id", "name", "age");
        selectList(entityWrapper);


    }


    /**
     *
     * @param entityWrapper
     */
    private void selectList(EntityWrapper entityWrapper){
        System.out.println(entityWrapper.getSqlSegment());
        System.out.println("ogrin--"+entityWrapper.originalSql());
        List<User> userList= this.userMapper.selectList(entityWrapper);
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
