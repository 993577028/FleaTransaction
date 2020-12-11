package cn.fleatransaction.service.impl;



import cn.fleatransaction.entity.Student;
import cn.fleatransaction.mapper.StudentMapper;
import cn.fleatransaction.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.locks.Condition;


@Service
public class StudentService extends ServiceImpl<StudentMapper,Student> implements IStudentService {

    @Autowired
    StudentMapper studentMapper;

    public Student findOneStudent(Integer id){
        return studentMapper.findOneStudent(id);
    }

    public Integer queryStudentAge(String name) {
        return studentMapper.queryStudentAge(name);
    }


}
