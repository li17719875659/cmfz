package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

/**
 * Created by licy on 2017/12/11.
 */
public interface UserService {

    List<User> findAll();

    void add(User user);

}
