package com.hualala.aleenjava.grpc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hualala.aleenjava.grpc.dto.User;
import com.hualala.aleenjava.grpc.model.TblUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author aleenjava
 * @since 2021-04-10
 */
@Mapper
public interface TblUserMapper extends BaseMapper<TblUser> {

    public List<TblUser> findAllUser();
}
