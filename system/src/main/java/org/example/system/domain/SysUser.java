package org.example.system.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 系统用户实体类
 * 对应数据库表: sys_user
 */
@Data // Lombok注解: 自动生成Getter, Setter, toString等方法, 省去手写几十行代码
@TableName("sys_user") // MyBatis-Plus注解: 告诉框架这个类对应数据库里的 sys_user 表
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键 ID
     * @TableId: 告诉 MP 这是主键
     * type = IdType.AUTO: 告诉 MP 这是一个自增主键 (MySQL auto_increment)
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户名 (学号/工号)
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称/姓名
     */
    private String nickname;

    /**
     * 头像地址
     */
    private String avatar;

    /**
     * 角色 (STUDENT/ADMIN)
     */
    private String role;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 状态: 1-正常, 0-禁用
     */
    private Integer status;

    /**
     * 逻辑删除: 0-未删除, 1-已删除
     * @TableLogic: MP 的黑科技。加上这个后，调用 deleteById 其实是执行 update set deleted=1
     */
    @TableLogic
    private Integer deleted;

    /**
     * 创建时间
     * @TableField(fill = ...): 自动填充。插入数据时自动填入当前时间 (需要配合配置类，暂时先加上)
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新时间
     * 插入和更新时都会自动刷新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}