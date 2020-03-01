package top.program.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import top.program.dao.StudentMapper;
import top.program.entity.Student;

@Service("studentServiceImpl")
@Component
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public int creatStudent(Student student) {
        studentMapper.insertSelective(student);
        return 0;
    }
}
