package com.hualala.aleenjava.grpc.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author aleenjava
 * @since 2021-04-10
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class TblUser extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 昵称
     */
    private String nick;

    /**
     * 邮件
     */
    private String email;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 余额
     */
    private BigDecimal balance;

    /**
     * 出生日期
     */
    private LocalDateTime date;

    /**
     * 标志
     */
    private Long flag;

    /**
     * 是否vip
     */
    private Integer vip;


}
