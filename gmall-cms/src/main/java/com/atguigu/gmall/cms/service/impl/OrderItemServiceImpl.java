package com.atguigu.gmall.cms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;

import com.atguigu.gmall.cms.mapper.OrderItemMapper;
import com.atguigu.gmall.cms.entity.OrderItemEntity;
import com.atguigu.gmall.cms.service.OrderItemService;


@Service("orderItemService")
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItemEntity> implements OrderItemService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<OrderItemEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<OrderItemEntity>()
        );

        return new PageResultVo(page);
    }

}