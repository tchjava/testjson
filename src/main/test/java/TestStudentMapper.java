import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.tb121.ssm.entity.Score;
import com.tb121.ssm.entity.form.CustomStudent;
import com.tb121.ssm.mapper.StudentMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestStudentMapper {
    private StudentMapper studentMapper;

    @Before
    public void init() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");

        studentMapper = (StudentMapper) ac.getBean("studentMapper");

    }

    /**
     * 测试映射
     */
    @Test
    public void fun1() {
        CustomStudent customStudent = this.studentMapper.findStudentById("01");
        System.out.println(customStudent);
        List<Score> scores=customStudent.getScores();
        for (Score score : scores) {
            System.out.println(score);
        }
    }

    /**
     * resultType
     */
    @Test
    public void fun2() {
        CustomStudent customStudent = this.studentMapper.findStudentById("01");
        System.out.println(customStudent.toString());
        System.out.println(customStudent.getUsername());
        Score score=new Score();
        score.setsId("01");
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(score);
        List<Score> scores = score.selectList(entityWrapper);
        customStudent.setScores(scores);
        for(Score key:scores){
            System.out.println(key);
        }
    }

    @Test
    public void fun3() {
        System.out.println("修改了fun3中的文件");
    }
    //这里要加一个方法

    @Test
    public void fun4() {
        System.out.println("输出了fun4方法...");
    }
    //加一个fun5()方法
    @Test
    public void fun5() {
        System.out.println("fun5方法...");
        System.out.println("fun5-1..");
    }
    //加一个fun6()方法
    @Test
    public void fun6() {
        System.out.println("fun6方法...");

    }
    //加一个fun7()方法
    @Test
    public void fun7() {
        System.out.println("fun7....");
    }

    //加一个验证码的方法
    //添加一个fun9方法,然后添加逻辑
    @Test
    public void fun9() {
        System.out.println("补充了fun9...");
    }

    //添加登录功能
    @Test
    public void login() {
        System.out.println("login.....");
    }

    //添加注册功能()
    @Test
    public void regist() {
        System.out.println("补充了");
    }

    //在分支上添加的功能
    @Test
    public void devTest1() {

    }

    //在主分支上添加功能
    @Test
    public void masterTest1() {

    }
}
