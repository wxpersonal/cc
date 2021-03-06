package me.weix.cc.mapper;

import me.weix.cc.pojo.SysCode;

public interface SysCodeMapper {
    int deleteByPrimaryKey(String code);

    int insert(SysCode record);

    int insertSelective(SysCode record);

    SysCode selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(SysCode record);

    int updateByPrimaryKey(SysCode record);
}