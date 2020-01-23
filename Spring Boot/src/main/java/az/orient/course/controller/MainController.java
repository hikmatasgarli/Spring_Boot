package az.orient.course.controller;

import az.orient.course.model.Student;
import az.orient.course.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = {"/","/index"})
    public ModelAndView index() throws Exception {
        ModelAndView model = new ModelAndView();
        List<Student> studentList = studentService.getStudentList();
        model.addObject("studentList",studentList);
        model.setViewName("index");
        model.addObject("test","Hikmat Asgarli");
        return model;
    }

}
