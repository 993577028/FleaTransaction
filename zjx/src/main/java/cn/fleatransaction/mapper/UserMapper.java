package cn.fleatransaction.mapper;



import cn.fleatransaction.entity.Student;
import cn.fleatransaction.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper extends BaseMapper<User> {

    /**
     * @param id
     * @return
     */
    @Select("select * from user where user_id =#{id}")
    User findUser(@Param("id") Integer id);

    @Select("select * from user where user_name =#{name}")
    User queryUserName(@Param("name") String name);



}
