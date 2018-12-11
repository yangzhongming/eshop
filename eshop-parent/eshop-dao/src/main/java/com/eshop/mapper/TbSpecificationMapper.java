package com.eshop.mapper;

import java.util.List;

import com.eshop.pojo.TbSpecification;
import com.eshop.pojo.TbSpecificationExample;

public interface TbSpecificationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbSpecification record);

    int insertSelective(TbSpecification record);
    
    List<TbSpecification> selectByExample(TbSpecificationExample record);

    TbSpecification selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbSpecification record);

    int updateByPrimaryKey(TbSpecification record);
}