package com.itheima.dao;

import com.itheima.domain.Account;
import com.itheima.domain.User;

import java.util.List;

public interface IAccountDao {
    //查询账号
    List<Account> findAccount();
}
