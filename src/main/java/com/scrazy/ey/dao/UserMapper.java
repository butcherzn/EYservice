package com.scrazy.ey.dao;

import java.util.List;

import com.scrazy.ey.entity.User;

public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

 
    int insert(User record);

 
    int insertSelective(User record);

 
    User selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(User record);


    int updateByPrimaryKey(User record);
    
    List<User> SelectAllUser();
}