/*
*
* ProjectMapper.java
* @date 2018-09-15
*/
package me.weix.cc.mapper;

import me.weix.cc.entity.Project;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* Created by Mybatis Generator 2018/09/15
*/
public interface ProjectMapper {
    List<Project> selectByIds(@Param("ids") List<Integer> ids);

    int deleteByPrimaryKey(Integer id);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);
}