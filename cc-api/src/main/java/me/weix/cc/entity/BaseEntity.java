package me.weix.cc.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/6/15.
 */
@Data
public class BaseEntity implements Serializable {

    /**
     * 创建人
     */
    private Integer createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private Integer updateBy;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 有效状态
     */
    private Integer status;

    /**
     * 删除标记
     */
    private Integer deleted;
}
