/*
*
* MenuMapper.java
* @date 2018-09-15
*/
package me.weix.cc.mapper;

import me.weix.cc.entity.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* Created by Mybatis Generator 2018/09/15
*/
public interface MenuMapper {
    List<Menu> selectByIds(@Param("ids") List<Integer> ids);

    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}