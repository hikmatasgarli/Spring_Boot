package az.orient.course.service;

import az.orient.course.dao.StudentDao;
import az.orient.course.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;


    public List<Student> getStudentList() {
        return studentDao.getStudentList();
    }

    public void addStudent(Student student) throws Exception {
        studentDao.addStudent(student);
    }
}
