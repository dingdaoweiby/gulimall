package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author dingdaowei
 * @email dingdaoweiby@gmail.com
 * @date 2021-12-01 21:49:19
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	
}
