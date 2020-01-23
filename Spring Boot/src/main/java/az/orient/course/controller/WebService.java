package az.orient.course.controller;

import az.orient.course.model.Student;
import az.orient.course.request.ReqStudent;
import az.orient.course.request.RespStatus;
import az.orient.course.response.RespStudent;
import az.orient.course.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/webservice")
public class WebService {
    @Autowired
    private StudentService studentService;


    @GetMapping(value = "/getStudentList",
            produces = {MediaType.APPLICATION_JSON_VALUE})


    public List<RespStudent> getStudentList() throws Exception {
        List<RespStudent> response = new ArrayList<>();
        List<Student> studentList = studentService.getStudentList();
        for (Student student : studentList) {
            RespStudent resp = new RespStudent();
            resp.setName(student.getName());
            resp.setSurname(student.getSurname());
            resp.setAddress(student.getAddress());
            response.add(resp);
        }

        return response;
    }

    @PostMapping(value = "/addStudent", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
                                        produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public RespStatus addStudent(@RequestBody ReqStudent reqStudent) {
        RespStatus response = null;
        try {

            Student student = new Student();
            student.setName(reqStudent.getName());
            student.setSurname(reqStudent.getSurname());
            studentService.addStudent(student);
            response = RespStatus.getSuccessMessage();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return response;
    }
}

