package com.itheima.dao;

import com.itheima.domain.Role;

import java.util.List;

public interface IRoleDao {
    //查询角色
    List<Role> findRoles();
}
