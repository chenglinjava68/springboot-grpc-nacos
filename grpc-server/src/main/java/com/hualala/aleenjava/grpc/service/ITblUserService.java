package com.hualala.aleenjava.grpc.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.hualala.aleenjava.grpc.model.TblUser;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author aleenjava
 * @since 2021-04-10
 */
public interface ITblUserService extends IService<TblUser> {
    public List<TblUser> findAllUser();
}
