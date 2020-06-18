package dao;


import model.Student;

public interface StudentMapper {
    void insertSelective(Student student);
}
