package me.weix.cc.mapper;

import me.weix.cc.pojo.SystemFile;

public interface SystemFileMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SystemFile record);

    int insertSelective(SystemFile record);

    SystemFile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemFile record);

    int updateByPrimaryKey(SystemFile record);
}