package dao;



import model.Homework;

import java.util.List;

public interface     HomeworkMapper {

     List<Homework> selectAllHomework();

    void insertHomework(Homework homework);
}
