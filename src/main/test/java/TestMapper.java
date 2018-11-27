import com.tb121.ssm.entity.form.CourseRequest;
import com.tb121.ssm.mapper.CourseMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMapper {
    private CourseMapper courseMapper;
    @Before
    public void init() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        courseMapper= (CourseMapper) ac.getBean("courseMapper");

    }
    @Test
    public void fun() {
        CourseRequest courseRequest=courseMapper.findById();
        System.out.println(courseRequest);
        System.out.println("随便加了的一句话");
        System.out.println("xxx");
        System.out.println("不要了吗?");
    }

    @Test
    public void fun1() {
        System.out.println("xxxx");
    }
}
