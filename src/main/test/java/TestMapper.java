import com.tb121.ssm.mapper.CourseMapper;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMapper {
    private CourseMapper courseMapper;
    @Before
    public void init() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        courseMapper= (CourseMapper) ac.getBean("courseMapper");

    }
    private void sing(){

    }
    //加了代码
    //ppppppppppppp
}
