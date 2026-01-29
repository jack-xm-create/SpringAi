package org.example.system.controller;

import org.example.system.common.Result;
import org.example.system.domain.SysUser;
import org.example.system.domain.dto.LoginDTO;
import org.example.system.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Result<List<SysUser>> list() {
        List<SysUser> list = userService.list();
        // 用 Result.success() 包裹一下数据
        return Result.success(list);
    }

    /**
     * 测试接口：根据ID查用户
     * 地址：GET http://localhost:9501/user/{id}
     */
    @GetMapping("/{id}")
    public Result<SysUser> getInfo(@PathVariable Long id) {
        return Result.success(userService.getById(id));
    }

    @PostMapping("/login")
    public Result<String> login(@RequestBody LoginDTO loginDTO) {
        // 调用 Service 的登录方法
        String token = userService.login(loginDTO);
        // 返回结果
        return Result.success(token);
    }
}