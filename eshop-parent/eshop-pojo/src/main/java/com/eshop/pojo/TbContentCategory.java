package com.eshop.pojo;

public class TbContentCategory {
    private Long id;

    private String name;

    public TbContentCategory(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public TbContentCategory() {
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
}