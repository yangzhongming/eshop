package com.eshop.pojo;

import java.io.Serializable;

public class TbSpecification implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
    private Long id;

    private String specName;

    public TbSpecification(Long id, String specName) {
        this.id = id;
        this.specName = specName;
    }

    public TbSpecification() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName == null ? null : specName.trim();
    }
}