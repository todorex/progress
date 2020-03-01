package top.program.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import top.program.entity.Student;
@Service
@Component
public interface StudentService {
    int creatStudent(Student student);
    //insert select delete--针对数据库

}
