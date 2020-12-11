package cn.fleatransaction.controller;



import cn.fleatransaction.entity.Student;
import cn.fleatransaction.service.IStudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "测试接口")
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    IStudentService studentService;

    @ApiOperation(value = "查询学生")
    @GetMapping("/query")
    public Student queryStudent(Integer id){
        Student oneStudent = studentService.findOneStudent(id);
        return oneStudent;
    }

    @ApiOperation(value = "查询学生")
    @GetMapping("/query/name")
    public String queryStudentName(Integer sid){
        Student oneStudent = studentService.findOneStudent(sid);
        if (oneStudent != null)
            return oneStudent.getName();
        else
            return "未找到该学生！";
    }

    @ApiOperation(value = "查询学生年龄")
    @GetMapping("/queryAge")
    public Integer queryStudentAge(String name){
        Integer age = studentService.queryStudentAge(name);
        return age;
    }


    @ApiOperation(value = "获取学生列表")
    @GetMapping("/list")
    public List<Student> queryStudentAge(){
        return studentService.list();
    }


    @ApiOperation(value = "获取学生数量")
    @GetMapping("/count")
    public Integer count(){
        return studentService.count();
    }

    @ApiOperation(value = "保存学生信息")
    @PostMapping("/save")
    public boolean save(Student student){
        return studentService.saveOrUpdate(student);
    }

}
