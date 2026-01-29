package org.example.system.controller;

import org.example.system.domain.SysUser;
import org.example.system.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user") // 所有接口都以 /user 开头
public class SysUserController {

    @Autowired
    private ISysUserService userService;

    /**
     * 测试接口：查询所有用户
     * 地址：GET http://localhost:9501/user/list
     */
    @GetMapping("/list")
    public List<SysUser> list() {
        return userService.list(); // MP 提供的查询所有
    }

    /**
     * 测试接口：根据ID查用户
     * 地址：GET http://localhost:9501/user/{id}
     */
    @GetMapping("/{id}")
    public SysUser getInfo(@PathVariable Long id) {
        return userService.getById(id); // MP 提供的根据ID查询
    }
}