package me.weix.cc.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.weix.cc.config.dataSource.DataSourceContextHolder;
import me.weix.cc.config.dataSource.DataSourceType;
import me.weix.cc.pojo.User;
import me.weix.cc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Api(value="user")
@Path("user")
public class UserRest {

    @Autowired
    private IUserService userService;


    @ApiOperation(value = "根据id获取user")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path(value = "id/{id}")
    public User getUserById(@PathParam("id") Integer id) {
        DataSourceContextHolder.setDataSource(DataSourceType.master.getName());
        return userService.getById(id);
    }

    @ApiOperation(value = "添加user")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path(value = "addUser")
    public Integer addUser(User u) {

        System.out.printf(u.getEmail());
        return 111;//userService.insert(u);
    }

}
