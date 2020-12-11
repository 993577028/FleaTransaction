package cn.fleatransaction.controller;




import cn.fleatransaction.entity.User;
import cn.fleatransaction.service.IUserService;
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
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    @ApiOperation(value = "查询用户")
    @GetMapping("/query")
    public User queryStudent(Integer id){
        User oneuser = userService.findUser(id);
        return oneuser;
    }

    @ApiOperation(value = "查询用户")
    @GetMapping("/query/name")
    public String queryStudentName(Integer sid){
        User oneUser = userService.findUser(sid);
        if (oneUser != null)
            return oneUser.getUserName();
        else
            return "未找到该用户！";
    }


    @ApiOperation(value = "获取用户列表")
    @GetMapping("/list")
    public List<User> queryAllUser(){
        return userService.list();
    }


    @ApiOperation(value = "获取用户数量")
    @GetMapping("/count")
    public Integer count(){
        System.out.println(userService.count());
        return userService.count();
    }

    @ApiOperation(value = "保存学生信息")
    @PostMapping("/save")
    public boolean save(User user){
        return userService.saveOrUpdate(user);
    }

}
