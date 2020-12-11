package cn.fleatransaction.service;


import cn.fleatransaction.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IStudentService extends IService<Student> {

    //找到该Id的学生信息
    Student findOneStudent(Integer id);
    Integer queryStudentAge(String name);

}
