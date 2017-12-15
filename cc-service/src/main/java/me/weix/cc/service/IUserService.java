package me.weix.cc.service;

import me.weix.cc.pojo.Permission;
import me.weix.cc.pojo.Role;
import me.weix.cc.pojo.User;

import java.util.List;

public interface IUserService extends IBaseService<User> {

    List<Role> getRolesByUserId(Integer userId);

    List<Permission> getPermissionsByUserId(Integer userId);

    User getUserByEmail(String email);

    User getUserByMobile(String mobile);

    User getUserByUsername(String username);

}
