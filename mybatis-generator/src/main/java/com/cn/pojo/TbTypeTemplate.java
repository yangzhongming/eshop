package com.cn.pojo;

public class TbTypeTemplate {
    private Long id;

    private String name;

    private String specIds;

    private String brandIds;

    public TbTypeTemplate(Long id, String name, String specIds, String brandIds) {
        this.id = id;
        this.name = name;
        this.specIds = specIds;
        this.brandIds = brandIds;
    }

    public TbTypeTemplate() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSpecIds() {
        return specIds;
    }

    public void setSpecIds(String specIds) {
        this.specIds = specIds == null ? null : specIds.trim();
    }

    public String getBrandIds() {
        return brandIds;
    }

    public void setBrandIds(String brandIds) {
        this.brandIds = brandIds == null ? null : brandIds.trim();
    }
}