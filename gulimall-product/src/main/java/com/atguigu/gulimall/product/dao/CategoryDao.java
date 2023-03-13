package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author vivid
 * @email vivid@gmail.com
 * @date 2023-03-12 23:57:01
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
