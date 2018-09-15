package me.weix.cc.service;

import me.weix.cc.entity.Parameter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IParameterService extends IBaseService<Parameter> {

    List<Parameter> loadAllParameters(String projectCode);

}
