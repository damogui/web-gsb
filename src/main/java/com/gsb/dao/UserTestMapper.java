package com.gsb.dao;

import com.gsb.model.UserTest;

public interface UserTestMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserTest record);

    int insertSelective(UserTest record);

    UserTest selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserTest record);

    int updateByPrimaryKey(UserTest record);
}