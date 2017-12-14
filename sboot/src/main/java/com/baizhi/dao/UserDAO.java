package com.baizhi.dao;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @AUTHOR licy
 * @create 2017-12-11-16:27
 */
//@Mapper
public interface UserDAO {

    List<User> findAll();

    void add(User user);
}
