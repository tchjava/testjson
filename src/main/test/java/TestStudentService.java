import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.tb121.ssm.entity.Student;
import com.tb121.ssm.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext-*.xml","classpath:spring/spring-*.xml"})
public class TestStudentService extends AbstractJUnit4SpringContextTests {
    @Resource
    private StudentService studentService;
    @Test
    public void testStudentService() {
       Student student= studentService.selectOne(new EntityWrapper<Student>().eq("s_sex","男"));
        System.out.println(student);
    }
}
