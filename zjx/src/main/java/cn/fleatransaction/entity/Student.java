package cn.fleatransaction.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("student")
public class Student {
    private Integer id;
    private Integer age;
    private String name;
    private String number;
}
