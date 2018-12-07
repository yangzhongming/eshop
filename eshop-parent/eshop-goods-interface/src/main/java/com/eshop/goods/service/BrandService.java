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
	
	/**
	 * 增加品牌
	 * @param brand
	 */
	public void add(TbBrand brand);
	
	/**
	 * 根据Id查询实体
	 * @param id
	 * @return
	 */
	public TbBrand findOne(Long id);
	
	/**
	 * 根据查询的实体进行修改
	 * @param brand
	 * @return
	 */
	public void update(TbBrand brand);
	
	/**
	 * 删除
	 * @param id
	 */
	public void delete(Long[] ids);
	
	/**
	 * 根据查询条件查询
	 * @param pageNum 当前页面
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbBrand brand,int pageNum,int pageSize);
}
