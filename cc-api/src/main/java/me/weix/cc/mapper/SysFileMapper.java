package me.weix.cc.mapper;

import me.weix.cc.pojo.SysFile;

public interface SysFileMapper {
    int deleteByPrimaryKey(String code);

    int insert(SysFile record);

    int insertSelective(SysFile record);

    SysFile selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(SysFile record);

    int updateByPrimaryKey(SysFile record);
}