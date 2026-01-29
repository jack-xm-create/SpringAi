package org.example.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.system.domain.SysUser;
import org.example.system.domain.dto.LoginDTO;
import org.example.system.mapper.SysUserMapper;
import org.example.system.service.ISysUserService;
import org.springframework.stereotype.Service;

/**
 * 用户服务实现类
 * 继承 ServiceImpl<Mapper, Entity>，MP 就会自动帮你调用 Mapper
 */
@Service // ⚠️ 别忘了加这个注解，把类交给 Spring 管理
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Override
    public String login(LoginDTO loginDTO) {
        // 1. 拿着用户名去数据库查，看看有没有这个人
        SysUser user = this.getOne(new LambdaQueryWrapper<SysUser>()
                .eq(SysUser::getUsername, loginDTO.getUsername()));

        // 2. 如果查不到，或者状态被禁用了
        if (user == null) {
            throw new RuntimeException("登录失败：账号不存在"); // 后面我们会用全局异常处理，现在先抛个错
        }

        // 3. 比对密码
        // 注意：目前数据库里是明文 '123456'，所以我们直接比对
        // 以后我们会升级成 BCryptPasswordEncoder 加密比对
        if (!user.getPassword().equals(loginDTO.getPassword())) {
            throw new RuntimeException("登录失败：密码错误");
        }

        // 4. 登录成功！
        // 正常这里要生成一个 JWT Token，为了让你先看到效果，我们先返回一个假令牌
        return "fake-token-admin-123456";
    }

}