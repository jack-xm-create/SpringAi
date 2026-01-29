package org.example.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.system.domain.SysUser;

/**
 * 用户服务接口
 * 继承 IService<T> 后，自动拥有 save, remove, getById, list 等通用方法
 */
public interface ISysUserService extends IService<SysUser> {
    // 以后可以在这里定义复杂的业务接口，比如 "login", "resetPassword"
}