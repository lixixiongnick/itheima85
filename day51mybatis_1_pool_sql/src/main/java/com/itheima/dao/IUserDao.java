package com.itheima.dao;


import com.itheima.domain.Account;
import com.itheima.domain.QueryVo;
import com.itheima.domain.Role;
import com.itheima.domain.User;

import java.util.List;

public interface IUserDao {

   List<User> findByCondition(QueryVo queryVo);

   List<User> findByAccount();
   List<User> findByRole();

}
