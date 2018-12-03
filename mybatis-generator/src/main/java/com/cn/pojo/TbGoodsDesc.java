package com.cn.pojo;

public class TbGoodsDesc {
    private Long goodsId;

    private String introduction;

    private String specificationItems;

    private String itemImages;

    private String packageList;

    private String saleService;

    public TbGoodsDesc(Long goodsId, String introduction, String specificationItems, String itemImages, String packageList, String saleService) {
        this.goodsId = goodsId;
        this.introduction = introduction;
        this.specificationItems = specificationItems;
        this.itemImages = itemImages;
        this.packageList = packageList;
        this.saleService = saleService;
    }

    public TbGoodsDesc() {
        super();
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getSpecificationItems() {
        return specificationItems;
    }

    public void setSpecificationItems(String specificationItems) {
        this.specificationItems = specificationItems == null ? null : specificationItems.trim();
    }

    public String getItemImages() {
        return itemImages;
    }

    public void setItemImages(String itemImages) {
        this.itemImages = itemImages == null ? null : itemImages.trim();
    }

    public String getPackageList() {
        return packageList;
    }

    public void setPackageList(String packageList) {
        this.packageList = packageList == null ? null : packageList.trim();
    }

    public String getSaleService() {
        return saleService;
    }

    public void setSaleService(String saleService) {
        this.saleService = saleService == null ? null : saleService.trim();
    }
}