/*
*
* Project.java
* @date 2018-09-15
*/
package me.weix.cc.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * t_project 2018-09-15
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class Project extends BaseEntity {
    private Integer id;

    /**
     * 应用编码
     */
    private String projectCode;

    /**
     * 管理员用户ID
     */
    private Integer userId;

    /**
     * 管理员用户姓名
     */
    private String userName;

    /**
     * 说明
     */
    private String desc;
}