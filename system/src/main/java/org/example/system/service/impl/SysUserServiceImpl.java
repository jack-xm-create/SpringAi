package org.example.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.system.domain.SysUser;
import org.example.system.mapper.SysUserMapper;
import org.example.system.service.ISysUserService;
import org.springframework.stereotype.Service;

/**
 * 用户服务实现类
 * 继承 ServiceImpl<Mapper, Entity>，MP 就会自动帮你调用 Mapper
 */
@Service // ⚠️ 别忘了加这个注解，把类交给 Spring 管理
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}