package com.eshop.manager.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.eshop.common.PageResult;
import com.eshop.common.Result;
import com.eshop.goods.service.SpecificationService;
import com.eshop.pojo.TbSpecification;

@RestController
@RequestMapping("/specification")
public class SpecificationController {

	@Reference
	private SpecificationService specificationService;

	@RequestMapping("/findAll")
	public List<TbSpecification> findAll() {
		return specificationService.findAll();
	}

	@RequestMapping("/findPage")
	public PageResult findPage(int pageNum, int pageSize) {
		return specificationService.findPage(pageNum, pageSize);
	}

	@RequestMapping("/add")
	public Result add(@RequestBody TbSpecification brand) {
		try {
			specificationService.add(brand);
			return new Result(true, "新增成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "新增失败");
		}

	}

	@RequestMapping("/findOne")
	public TbSpecification findOne(Long id) {
		return specificationService.findOne(id);
	}

	@RequestMapping("/update")
	public Result update(@RequestBody TbSpecification specification) {
		try {
			specificationService.update(specification);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}

	@RequestMapping("/delete")
	public Result delete(Long[] ids) {
		try {
			specificationService.delete(ids);
			return new Result(true, "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbSpecification brand,int page,int size) {
	   return specificationService.findPage(brand, page, size);
	}

}
