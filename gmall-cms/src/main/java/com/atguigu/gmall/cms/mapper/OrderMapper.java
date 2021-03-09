package com.atguigu.gmall.cms.mapper;

import com.atguigu.gmall.cms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author fengge
 * @email fengge@atguigu.com
 * @date 2021-03-08 21:14:40
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {
	
}
