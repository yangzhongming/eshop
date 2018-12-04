package com.eshop.manager.controller;

import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.eshop.common.PageResult;
import com.eshop.goods.service.BrandService;
import com.eshop.pojo.TbBrand;

@RestController
@RequestMapping("/brand")
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
