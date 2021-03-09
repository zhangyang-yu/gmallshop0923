package com.atguigu.gmall.cms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.cms.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author fengge
 * @email fengge@atguigu.com
 * @date 2021-03-08 21:14:40
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

