import dao.*;
import model.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import service.StudentService;
import service.TeacherService;

import java.util.List;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:spring-mybatis.xml"})
public class textDao {
    @Autowired
    private HomeworkMapper homeworkMapper;

    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;
    @Test
    public void register() {
        studentService.register("sss",5);
    }


}
