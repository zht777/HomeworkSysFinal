package dao;

import model.StudentHomework;

import java.util.List;

public interface StudentHomeworkMapper {
    List<StudentHomework> selectAll();

    void insertSH(StudentHomework studentHomework);

    void update(StudentHomework studentHomework);
}
