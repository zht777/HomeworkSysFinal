package service;



import model.Homework;
import model.Student;
import model.StudentHomework;

import java.util.HashMap;
import java.util.List;

public interface TeacherService {
    List<StudentHomework> selectAllStudentHomewor();
    void register(String username, int id);
    void sethomwork(Homework homework);

}
