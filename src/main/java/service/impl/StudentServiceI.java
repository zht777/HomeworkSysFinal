package service.impl;


import dao.HomeworkMapper;
import dao.StudentHomeworkMapper;
import dao.StudentMapper;
import model.Homework;
import model.Student;
import model.StudentHomework;
import org.springframework.stereotype.Service;
import service.StudentService;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

@Service
public class StudentServiceI implements StudentService {

    @Resource
    private HomeworkMapper homeworkMapper;
    @Resource
    private StudentMapper studentMapper;
    @Resource
    private StudentHomeworkMapper studentHomeworkMapper;

    @Override
    public List<Homework> selectAllHomework() {
        return homeworkMapper.selectAllHomework();
    }

    @Override
    public void register(String username, int id) {
        Student student = new Student();
        student.setName(username);
        student.setStudentId(id);
        student.setCreateTime(new Timestamp(System.currentTimeMillis()));
        studentMapper.insertSelective(student);

    }

    @Override
    public void submitHomework(StudentHomework studentHomework) {
        studentHomeworkMapper.insertSH(studentHomework);
    }

    @Override
    public void updateHomework(StudentHomework studentHomework) {
        studentHomeworkMapper.update(studentHomework);
    }

}
