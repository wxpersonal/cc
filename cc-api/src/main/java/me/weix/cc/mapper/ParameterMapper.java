/*
*
* ParameterMapper.java
* @date 2018-09-15
*/
package me.weix.cc.mapper;

import me.weix.cc.entity.Parameter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* Created by Mybatis Generator 2018/09/15
*/
public interface ParameterMapper {
    List<Parameter> selectByIds(@Param("ids") List<Integer> ids);

    int deleteByPrimaryKey(Integer id);

    int insert(Parameter record);

    int insertSelective(Parameter record);

    Parameter selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Parameter record);

    int updateByPrimaryKey(Parameter record);

    List<Parameter> selectByProjectCode(String projectCode);
}