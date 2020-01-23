package az.orient.course.service;

import az.orient.course.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudentList() throws Exception;
    void addStudent(Student student) throws Exception;
}
