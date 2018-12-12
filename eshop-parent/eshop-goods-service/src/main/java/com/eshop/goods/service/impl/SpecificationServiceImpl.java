package com.eshop.goods.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.eshop.common.PageResult;
import com.eshop.goods.service.SpecificationService;
import com.eshop.mapper.TbSpecificationMapper;
import com.eshop.pojo.TbSpecification;
import com.eshop.pojo.TbSpecificationExample;
import com.eshop.pojo.TbSpecificationExample.Criteria;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
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
		PageHelper.startPage(pageNum,pageSize);
		
		Page<TbSpecification> page =(Page<TbSpecification>) specificationMapper.selectByExample(null);
		
		return  new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public void add(TbSpecification specification) {
		
		specificationMapper.insert(specification);

	}

	@Override
	public TbSpecification findOne(Long id) {
		return specificationMapper.selectByPrimaryKey(id);
	}

	@Override
	public void update(TbSpecification specification) {
		 specificationMapper.updateByPrimaryKey(specification);
	}

	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			specificationMapper.deleteByPrimaryKey(id);
		}
	}

	@Override
	public PageResult findPage(TbSpecification specification, int pageNum, int pageSize) {

		
		PageHelper.startPage(pageNum,pageSize);
		
		TbSpecificationExample tbSpecificationExample = new TbSpecificationExample();
		
		Criteria criteria = tbSpecificationExample.createCriteria();
		
		if(specification!=null){
			if(specification.getSpecName()!=null&&specification.getSpecName().length()>0){
				criteria.andSpecNameLike("%"+specification.getSpecName()+"%");
			}
		}
		
		Page<TbSpecification> page =(Page<TbSpecification>) specificationMapper.selectByExample(tbSpecificationExample);
		
		return  new PageResult(page.getTotal(), page.getResult());
	
	}

}
