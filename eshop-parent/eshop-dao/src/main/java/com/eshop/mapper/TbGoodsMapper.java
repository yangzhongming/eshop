package com.eshop.mapper;

import com.eshop.pojo.TbGoods;

public interface TbGoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbGoods record);

    int insertSelective(TbGoods record);

    TbGoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbGoods record);

    int updateByPrimaryKey(TbGoods record);
}