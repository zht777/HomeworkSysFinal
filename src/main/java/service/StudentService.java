package service;



import model.Homework;
import model.StudentHomework;

import java.util.List;

public interface StudentService {
    List<Homework> selectAllHomework();
    void register(String username, int id);
    void submitHomework(StudentHomework studentHomework);
    void updateHomework(StudentHomework studentHomework);

}
