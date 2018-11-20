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
}
