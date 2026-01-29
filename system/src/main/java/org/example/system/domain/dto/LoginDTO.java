package org.example.system.domain.dto;

import lombok.Data;

/**
 * 登录参数接收类
 */
@Data
public class LoginDTO {
    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;
}