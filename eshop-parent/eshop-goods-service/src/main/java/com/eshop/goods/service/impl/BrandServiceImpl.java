package com.eshop.goods.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.eshop.common.PageResult;
import com.eshop.pojo.TbBrand;
import com.eshop.pojo.TbBrandExample;
import com.eshop.pojo.TbBrandExample.Criteria;
import com.eshop.goods.service.BrandService;
import com.eshop.mapper.TbBrandMapper;
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
		
		Page<TbBrand> page =(Page<TbBrand>) brandMapper.selectByExample(null);
		
		return  new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public void add(TbBrand brand) {
		brandMapper.insert(brand);
		
	}

	@Override
	public TbBrand findOne(Long id) {
		
		return brandMapper.selectByPrimaryKey(id);
	}

	@Override
	public void update(TbBrand brand) {
		
		 brandMapper.updateByPrimaryKey(brand);
	}

	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			brandMapper.deleteByPrimaryKey(id);
		}
		
	}

	@Override
	public PageResult findPage(TbBrand brand, int pageNum, int pageSize) {
		
		PageHelper.startPage(pageNum,pageSize);
		
		TbBrandExample tbBrandExample = new TbBrandExample();
		
		Criteria criteria = tbBrandExample.createCriteria();
		
		if(brand!=null){
			if(brand.getName()!=null&&brand.getName().length()>0){
				criteria.andNameLike("%"+brand.getName()+"%");
			}
			if(brand.getFirstChar()!=null&&brand.getFirstChar().length()>0){
				criteria.andFirstCharLike("%"+brand.getFirstChar()+"%");
			}
		}
		
		Page<TbBrand> page =(Page<TbBrand>) brandMapper.selectByExample(tbBrandExample);
		
		return  new PageResult(page.getTotal(), page.getResult());
	}
 
}
