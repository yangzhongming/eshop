package com.eshop.goods.service;

import java.util.List;

import com.eshop.common.PageResult;
import com.eshop.pojo.TbBrand;

/**
 * 品牌接口
 * @author yzm
 *
 */
public interface BrandService {
	
	public List<TbBrand> findAll();   
	
	/**
	 * 品牌分页
	 * @param pageNum 当前页面
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
}
