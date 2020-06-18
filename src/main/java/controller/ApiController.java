package controller;

import model.Homework;
import model.StudentHomework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import service.StudentService;
import service.TeacherService;

import java.sql.Timestamp;

@Controller
public class ApiController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String reg() {
        return "register";
    }

    @RequestMapping(value = "/Tlogin",method = RequestMethod.GET)
    public String Teacherlogin() {
        return "Tlogin";
    }

    @RequestMapping(value = "/Slogin",method = RequestMethod.GET)
    public String Studentlogin() {
        return "Slogin";
    }

    @RequestMapping(value = "/SloginSuccess",method = RequestMethod.POST)
    public String StudentloginSucc() {
        return "student";
    }

    @RequestMapping(value = "/TloginSuccess",method = RequestMethod.POST)
    public String TecherloginSucc() {
        return "teacher";
    }

    @RequestMapping(value = "/registerPro", method = RequestMethod.POST)
    public String register(@RequestParam String username, @RequestParam String ID, @RequestParam String Occupation) {
        int o = Integer.parseInt(Occupation);
        int id =  Integer.parseInt(ID);
        if(o != 1){
            studentService.register(username,id);
            return "Slogin";
        }else {
            teacherService.register(username,id);
            return "Tlogin";
        }
    }

    @RequestMapping(value = "/sethomerwork",method = RequestMethod.GET)
    public String setHomerwork() {
        return "sethomerwork";
    }

    @RequestMapping(value = " /sethomerworkSucc", method = RequestMethod.POST)
    public String SetHwSucc(@RequestParam String title, @RequestParam String content) {
        Homework homework =new Homework();
        homework.setCreateTime(new Timestamp(System.currentTimeMillis()));
        homework.setHomeworkTitle(title);
        homework.setHomeworkContent(content);
        teacherService.sethomwork(homework);
        return "teacher";
    }

    @RequestMapping(value = "/homework",method = RequestMethod.GET)
    public String Homerwork(Model model) {
        model.addAttribute(studentService.selectAllHomework());
        return "homework";
    }

    @RequestMapping(value = "/reviewhomework",method = RequestMethod.GET)
    public String Reviewhomework(Model model) {
        model.addAttribute(teacherService.selectAllStudentHomewor());
        return "reviewhomework";
    }

    @RequestMapping(value = "/submithomerwork",method = RequestMethod.GET)
    public String Submithomerwork() {
        return "submithomerwork";
    }

    @RequestMapping(value = " /submitkSucc", method = RequestMethod.POST)
    public String SubmitSucc(@RequestParam String title, @RequestParam String content ,@RequestParam String h_id,@RequestParam String s_id) {
        int stu_id =  Integer.parseInt(s_id);
        int hw_id =  Integer.parseInt(h_id);
        StudentHomework studentHomework =new StudentHomework();
        studentHomework.setCreateTime(new Timestamp(System.currentTimeMillis()));
        studentHomework.setHomeworkContent(content);
        studentHomework.setHomeworkId(hw_id);
        studentHomework.setStudentId(stu_id);
        studentHomework.setHomeworkTitle(title);
        studentService.submitHomework(studentHomework);
        return "student";
    }

    @RequestMapping(value = "/updatehomework",method = RequestMethod.GET)
    public String Updatehomework() {
        return "updatehomework";
    }

    @RequestMapping(value = " /updateSucc", method = RequestMethod.POST)
    public String UpdateSucc(@RequestParam String title, @RequestParam String content ,@RequestParam String h_id,@RequestParam String s_id) {
        int stu_id =  Integer.parseInt(s_id);
        int hw_id =  Integer.parseInt(h_id);
        StudentHomework studentHomework =new StudentHomework();
        studentHomework.setCreateTime(new Timestamp(System.currentTimeMillis()));
        studentHomework.setHomeworkContent(content);
        studentHomework.setHomeworkId(hw_id);
        studentHomework.setStudentId(stu_id);
        studentHomework.setHomeworkTitle(title);
        studentService.updateHomework(studentHomework);
        return "student";
    }

}
