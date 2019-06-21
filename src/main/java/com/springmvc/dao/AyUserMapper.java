package com.springmvc.dao;

import com.springmvc.entity.AyUser;
import org.springframework.stereotype.Repository;

@Repository
public interface AyUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(AyUser record);

    int insertSelective(AyUser record);

    AyUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AyUser record);

    int updateByPrimaryKey(AyUser record);
}