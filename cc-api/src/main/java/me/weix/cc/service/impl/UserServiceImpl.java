package me.weix.cc.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import me.weix.cc.mapper.PermissionMapper;
import me.weix.cc.mapper.RoleMapper;
import me.weix.cc.mapper.UserMapper;
import me.weix.cc.pojo.Permission;
import me.weix.cc.pojo.Role;
import me.weix.cc.pojo.User;
import me.weix.cc.service.IUserService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    private RoleMapper roleMapper;

    @Resource
    private PermissionMapper permissionMapper;

    @Resource
    private UserMapper userMapper;

    @Override
    public List<Role> getRolesByUserId(Integer userId) {
        return roleMapper.getRolesByUserId(userId);
    }

    @Override
    public List<Permission> getPermissionsByUserId(Integer userId) {

        List<Permission> permissionList = new ArrayList<Permission>();
        List<Role> roleList = getRolesByUserId(userId);
        for (Role role : roleList) {
            List<Permission> permissions = permissionMapper.getPermissionsByRoleId(role.getId());
            permissionList.addAll(permissions);
        }
        return permissionList;
    }

    @Override
    public User getUserByEmail(String email) {
        return userMapper.getUserByEmail(email);
    }

    @Override
    public User getUserByMobile(String mobile) {
        return userMapper.getUserByMobile(mobile);
    }

    @Override
    public User getUserByUsername(String username) {
        return userMapper.getUserByUsername(username);
    }
}
