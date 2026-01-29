package org.example.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.system.domain.SysUser;

/**
 * 用户表 数据访问层
 * 继承 BaseMapper<T> 后，自动拥有 CRUD 能力 (增删改查)
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
    // 即使这里什么都不写，你已经拥有了 insert, deleteById, selectById, selectList 等几十个方法！
}