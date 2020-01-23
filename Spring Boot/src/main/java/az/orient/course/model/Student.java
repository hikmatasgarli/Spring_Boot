package az.orient.course.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data

public class Student {
    private Long studentId;
    private String name;
    private String surname;
    private String phone;
    private String address;
    private Date dob;


}
