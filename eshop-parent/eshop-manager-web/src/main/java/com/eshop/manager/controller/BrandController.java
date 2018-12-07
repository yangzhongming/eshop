package com.eshop.manager.controller;

import java.util.List;
import java.util.function.LongToIntFunction;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.eshop.common.PageResult;
import com.eshop.common.Result;
import com.eshop.goods.service.BrandService;
import com.eshop.pojo.TbBrand;

@RestController
@RequestMapping("/brand")
public class BrandController {

	@Reference
	private BrandService brandservice;

	@RequestMapping("/findAll")
	public List<TbBrand> findAll() {
		return brandservice.findAll();
	}

	@RequestMapping("/findPage")
	public PageResult findPage(int pageNum, int pageSize) {
		return brandservice.findPage(pageNum, pageSize);
	}

	@RequestMapping("/add")
	public Result add(@RequestBody TbBrand brand) {
		try {
			brandservice.add(brand);
			return new Result(true, "新增成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "新增失败");
		}

	}

	@RequestMapping("/findOne")
	public TbBrand findOne(Long id) {
		return brandservice.findOne(id);
	}

	@RequestMapping("/update")
	public Result update(@RequestBody TbBrand brand) {
		try {
			brandservice.update(brand);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}

	@RequestMapping("/delete")
	public Result delete(Long[] ids) {
		try {
			brandservice.delete(ids);
			return new Result(true, "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbBrand brand,int page,int size) {
	   return brandservice.findPage(brand, page, size);
	}

}
