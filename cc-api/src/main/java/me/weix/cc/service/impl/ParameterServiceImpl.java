package me.weix.cc.service.impl;

import me.weix.cc.entity.Parameter;
import me.weix.cc.mapper.ParameterMapper;
import me.weix.cc.service.IParameterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class ParameterServiceImpl extends BaseServiceImpl<ParameterMapper, Parameter> implements IParameterService {

    @Resource
    ParameterMapper parameterMapper;

    @Override
    public List<Parameter> loadAllParameters(String projectCode) {
        return parameterMapper.selectByProjectCode(projectCode);
    }
}
