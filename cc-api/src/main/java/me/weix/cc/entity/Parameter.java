/*
*
* Parameter.java
* @date 2018-09-15
*/
package me.weix.cc.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * t_parameter 2018-09-15
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class Parameter extends BaseEntity {
    private Integer id;

    /**
     * 系统编码
     */
    private String projectCode;

    /**
     * 参数分组（方便查看）
     */
    private String groups;

    /**
     * 参数名
     */
    private String key;

    /**
     * 参数值
     */
    private String value;

    /**
     * 加载机制(暂时无用)
     */
    private Integer loadType;

    /**
     * 说明
     */
    private String desc;
}