package com.example.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sp_student")
public class SpStudent {
    @TableId(value = "`uid`")
    private Long uid;

    @TableField(value = "`name`")
    private String name;

    @TableField(value = "sex")
    private Integer sex;

    @TableField(value = "age")
    private Integer age;

    @TableField(value = "birthday")
    private Date birthday;

    @TableField(value = "email")
    private String email;

    @TableField(value = "is_deleted")
    private Integer isDeleted;
}