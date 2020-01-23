package az.orient.course.controller;

import az.orient.course.model.Student;
import com.fasterxml.jackson.databind.util.JSONPObject;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONArray;
import org.springframework.boot.json.JsonParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebController {

    @GetMapping(value = "studentList")
    public ModelAndView studentList() throws Exception {
        ModelAndView model = new ModelAndView();
        String url = "http://localhost:8080/boot/webservice/getStudentList";

        RestTemplate restTemplate = new RestTemplate();
       String result =  restTemplate.getForObject(url,String.class);

        List<Student> studentList = restTemplate.getForObject(url,ArrayList.class);





        model.addObject("studentList",studentList);
        model.setViewName("studentList");
        return model;
    }
}
