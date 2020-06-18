package service.impl;


import dao.HomeworkMapper;
import dao.StudentHomeworkMapper;
import dao.StudentMapper;
import dao.TeacherMapper;
import model.Homework;
import model.Student;
import model.StudentHomework;
import model.Teacher;
import org.springframework.stereotype.Service;
import service.TeacherService;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

@Service
public class TeacherServiceI implements TeacherService {

    @Resource
    private TeacherMapper teacherMapper;
    @Resource
    private HomeworkMapper homeworkMapper;
    @Resource
    private StudentHomeworkMapper studentHomeworkMapper;


    @Override
    public List<StudentHomework> selectAllStudentHomewor() {
        return studentHomeworkMapper.selectAll();
    }

    @Override
    public void register(String username, int id) {
        Teacher teacher = new Teacher();
        teacher.setName(username);
        teacher.setId(id);
        teacher.setCreateTime(new Timestamp(System.currentTimeMillis()));
        teacherMapper.insertSelective(teacher);

    }

    @Override
    public void sethomwork(Homework homework) {
        homeworkMapper.insertHomework(homework);
    }
}
