package com.eshop.specification.pojo;

import java.io.Serializable;
import java.util.List;

import com.eshop.pojo.TbSpecification;
import com.eshop.pojo.TbSpecificationOption;

public class Specification implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private TbSpecification specification;
	
	private List<TbSpecificationOption> specificationOptList;

	public TbSpecification getSpecification() {
		return specification;
	}

	public void setSpecification(TbSpecification specification) {
		this.specification = specification;
	}

	public List<TbSpecificationOption> getSpecificationOptList() {
		return specificationOptList;
	}

	public void setSpecificationOptList(List<TbSpecificationOption> specificationOptList) {
		this.specificationOptList = specificationOptList;
	}

	

}
