package az.orient.course.dao;

import az.orient.course.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private DataSource dataSource;

    public StudentDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Student> getStudentList()  {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String sql = "SELECT * FROM STUDENT";
        List<Student> studentList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Student.class));
        return studentList;
    }
    @Override
    public void addStudent(Student student) throws Exception {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String sql = "INSERT INTO STUDENT (NAME,SURNAME) VALUES (?,?)";
        jdbcTemplate.update(sql,new Object[] {student.getName(),student.getSurname()});

    }
}
