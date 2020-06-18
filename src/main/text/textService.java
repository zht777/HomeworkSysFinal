import model.Homework;
import model.StudentHomework;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import service.StudentService;
import service.TeacherService;

import java.sql.Timestamp;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:spring-mybatis.xml"})
public class textService {
    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;

    @Test
    public void register() {
        teacherService.register("sss",1);

    }
//
//    @Test
//    public void addHomework() {
//        Homework homework = new Homework();
//        homework.setCreateTime(new Timestamp(System.currentTimeMillis()));
//        homework.setHomeworkContent("测试");
//        homework.setHomeworkTitle("JAVE");
//        teacherService.sethomwork(homework);
//    }
//
//    @Test
//    public void submitHomework() {
//        StudentHomework studentHomework =new StudentHomework();
//        studentHomework.setCreateTime(new Timestamp(System.currentTimeMillis()));
//        studentHomework.setHomeworkContent("测试");
//        studentHomework.setHomeworkId(1);
//        studentHomework.setStudentId(1);
//        studentHomework.setHomeworkTitle("标题");
//        studentService.submitHomework(studentHomework);
//    }
//
//    @Test
//    public void uphw() {
//        StudentHomework studentHomework =new StudentHomework();
//        studentHomework.setCreateTime(new Timestamp(System.currentTimeMillis()));
//        studentHomework.setHomeworkContent("哈哈哈");
//        studentHomework.setHomeworkId(1);
//        studentHomework.setStudentId(1);
//        studentHomework.setHomeworkTitle("标题");
//        studentService.updateHomework(studentHomework);
//    }
//
//
//    @Test
//    public void Homework() {
//        //    List<Homework> selectAllHomework();
//        List<Homework> list = studentService.selectAllHomework();
//        for (Homework homework :
//                list) {
//            System.out.println(homework.getId());
//        }
//    }
//    @Test
//    public void StudentHomework() {
//        //    List<StudentHomework> selectAllStudentHomewor();
//        List<StudentHomework> list = teacherService.selectAllStudentHomewor();
//        for (StudentHomework sh :
//                list) {
//            System.out.println(sh.getId());
//        }
//    }


}
