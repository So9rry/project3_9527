package com.stylefeng.guns.rest.vo;

import com.stylefeng.guns.rest.persistence.model.MtimeBrandDictT;

import java.io.Serializable;

/**
 * @version 1.0
 * @ClassName BrandVo
 * @Description todo
 * @Author wangdi
 * @Date 2019/10/12 22:47
 **/

public class BrandVo implements Serializable {
    private static final long serialVersionUID = -7315538820655167994L;
    boolean active;
    int brandId;
    String brandName;

    public BrandVo() {
    }

    public BrandVo(MtimeBrandDictT mtimeBrandDictT) {
        brandId = mtimeBrandDictT.getUuid();
        brandName = mtimeBrandDictT.getShowName();
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
