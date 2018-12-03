package com.eshop.manager.controller;

import java.util.List;

import org.eshop.entity.PageResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cn.pojo.TbBrand;
import com.eshop.goods.service.BrandService;

@RequestMapping("brand")
public class BrandController {
	
	@Reference
	private BrandService brandservice;
	
	@RequestMapping("/findAll")
	public List<TbBrand> findAll(){
		return brandservice.findAll();
	}

	@RequestMapping("/findPage")
	public PageResult findPage(int pageNum,int pageSize){
		return brandservice.findPage(pageNum, pageSize);
	}
}
