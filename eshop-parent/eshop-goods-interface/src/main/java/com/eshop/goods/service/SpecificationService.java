package com.eshop.goods.service;

import java.util.List;

import com.eshop.common.PageResult;
import com.eshop.pojo.TbSpecification;
import com.eshop.specification.pojo.Specification;

/**
 * 规格接口
 * @author yzm
 *
 */
public interface SpecificationService {
	
	public List<TbSpecification> findAll();   
	
	/**
	 * 品牌分页
	 * @param pageNum 当前页面
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	/**
	 * 根据Id查询实体
	 * @param id
	 * @return
	 */
	public TbSpecification findOne(Long id);
	
	/**
	 * 根据查询的实体进行修改
	 * @param specification
	 * @return
	 */
	public void update(TbSpecification specification);
	
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
	public PageResult findPage(TbSpecification specification,int pageNum,int pageSize);
	
	/**
	 * 新增规格
	 * @param specification 规格pojo
	 */
	public void add(Specification specification);
}
