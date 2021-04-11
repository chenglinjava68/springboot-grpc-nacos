package com.hualala.aleenjava.grpc.beanmapper;
import com.hualala.aleenjava.grpc.dto.User;
import com.hualala.aleenjava.grpc.dto.UserDTO;
import com.hualala.aleenjava.grpc.model.TblUser;
import com.hualala.aleenjava.grpc.user.UserPb;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "bornAt", expression = "java(s.getBornAt()==0?null:new java.util.Date(s.getBornAt()))")
    User convertToJava(UserPb s);

    @Mapping(target = "bornAt", expression = "java(s.getBornAt()==null?0:s.getBornAt().getTime())")
    UserPb convertToProtobuf(User s);

    UserPb convertToProtobuf(TblUser s);

    @Mapping(target = "bornAt", expression = "java(s.getBornAt()==0?null:new java.util.Date(s.getBornAt()))")
    UserDTO convertToDTO(UserPb s);

    UserDTO convertToDTO(User s);

    User convertToJava(UserDTO s);
}
