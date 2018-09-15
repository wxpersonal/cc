/*
*
* Menu.java
* @date 2018-09-15
*/
package me.weix.cc.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * t_menu 2018-09-15
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class Menu extends BaseEntity {
    private Integer id;

    private String projectCode;

    private Integer pid;

    private String idPath;

    private Integer orderNum;

    /**
     * 0菜单实例(默认),1菜单分组
     */
    private Integer kind;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 相对于系统根目录的相对路径
     */
    private String url;

    /**
     * 菜单描述
     */
    private String description;

    /**
     * icon样式表
     */
    private String icon;
}