package cn.fleatransaction.service;


import cn.fleatransaction.entity.Student;
import cn.fleatransaction.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IUserService extends IService<User> {

    //找到该Id的学生信息
    User findUser (Integer id);
    User queryUserName(String name);

}
