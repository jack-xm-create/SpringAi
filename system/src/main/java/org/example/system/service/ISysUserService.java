package org.example.system.service;
import org.example.system.domain.dto.LoginDTO;
import com.baomidou.mybatisplus.extension.service.IService;
import org.example.system.domain.SysUser;

/**
 * 用户服务接口
 * 继承 IService<T> 后，自动拥有 save, remove, getById, list 等通用方法
 */
public interface ISysUserService extends IService<SysUser> {
    // 以后可以在这里定义复杂的业务接口，比如 "login", "resetPassword"

    /**
     * 登录功能
     * @param loginDTO 登录参数
     * @return 登录成功后的令牌 (暂时先返回个字符串模拟一下)
     */
    String login(LoginDTO loginDTO);
}