package cn.fleatransaction.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    private Integer userId;
    private String userName;
    private String userEmail;
    private String userPhone;
    private String password;
    private float userCredit;
    private String userAvator;
    private String realName;
    private String idCard;
    private String stuNumber;
}
