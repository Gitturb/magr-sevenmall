package com.magr.userservice.rpc.user.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * @author magr
 */
@Data
public class UserRespDTO implements Serializable {
    /**
     * 用户编号
     */
    private Integer id;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 用户状态
     *
     * 枚举 {}
     */
    private Integer status;
    /**
     * 注册时间
     */
    private Date createTime;
}
