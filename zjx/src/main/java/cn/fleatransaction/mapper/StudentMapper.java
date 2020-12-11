package cn.fleatransaction.mapper;



import cn.fleatransaction.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface StudentMapper extends BaseMapper<Student> {

    /**
     * @param id
     * @return
     */
    @Select("select * from student where id =#{id}")
    Student findOneStudent(@Param("id") Integer id);

    @Select("select age from student where name =#{name}")
    Integer queryStudentAge(@Param("name") String name);



}
