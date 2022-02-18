package com.atguigu.gulimall.product.service;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.atguigu.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 商品属性
 *
 * @author dingdaowei
 * @email dingdaoweiby@gmail.com
 * @date 2021-12-01 21:49:19
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

