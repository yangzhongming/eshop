package com.eshop.goods.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.eshop.common.PageResult;
import com.eshop.goods.service.SpecificationService;
import com.eshop.mapper.TbSpecificationMapper;
import com.eshop.pojo.TbSpecification;
@Service
public class SpecificationServiceImpl implements SpecificationService {
    
	@Autowired
	private TbSpecificationMapper specificationMapper;

	@Override
	public List<TbSpecification> findAll() {
		return specificationMapper.selectByExample(null);
	}

	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(TbSpecification specification) {
		// TODO Auto-generated method stub

	}

	@Override
	public TbSpecification findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(TbSpecification specification) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Long[] ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public PageResult findPage(TbSpecification specification, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
