package com.eshop.goods.service.impl;

import java.util.List;

import org.eshop.entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.dao.TbBrandMapper;
import com.cn.pojo.TbBrand;
import com.eshop.goods.service.BrandService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class BrandServiceImpl implements BrandService {
	
	@Autowired
	private TbBrandMapper brandMapper;
	
	@Override
	public List<TbBrand> findAll() {
	
		return brandMapper.selectByExample(null);
	}
	
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		
		PageHelper.startPage(pageNum,pageSize);
		
		Page<TbBrand> page = (Page<TbBrand>)brandMapper.selectByExample(null);
		
		return  new PageResult(page.getTotal(), page.getResult());
	}


 
}
