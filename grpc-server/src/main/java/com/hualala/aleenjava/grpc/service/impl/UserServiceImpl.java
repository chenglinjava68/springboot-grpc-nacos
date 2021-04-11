package com.hualala.aleenjava.grpc.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hualala.aleenjava.grpc.mapper.TblUserMapper;
import com.hualala.aleenjava.grpc.model.TblUser;
import com.hualala.aleenjava.grpc.service.ITblUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author aleenjava
 * @since 2021-04-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<TblUserMapper, TblUser> implements ITblUserService {

    @Resource
    private TblUserMapper tblUserMapper;

    @Override
    public List<TblUser> findAllUser() {
        return tblUserMapper.findAllUser();
    }
}
