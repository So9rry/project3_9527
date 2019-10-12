package com.stylefeng.guns.rest.vo.cinema;

import java.io.Serializable;

/**
 * @version 1.0
 * @ClassName ConditionSearchVo
 * @Description 影院查找条件V
 * @Author wangdi
 * @Date 2019/10/12 21:00
 **/

public class ConditionSearchVo implements Serializable {
    private static final long serialVersionUID = -3935722708158843970L;

    Integer brandId;
    Integer hallType;
    Integer areaId;

    public ConditionSearchVo() {
    }

    public ConditionSearchVo(Integer brandId, Integer hallType, Integer areaId) {
        this.brandId = brandId;
        this.hallType = hallType;
        this.areaId = areaId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getHallType() {
        return hallType;
    }

    public void setHallType(Integer hallType) {
        this.hallType = hallType;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    @Override
    public String toString() {
        return "ConditionSearchVo{" +
                "brandId=" + brandId +
                ", hallType=" + hallType +
                ", areaId=" + areaId +
                '}';
    }
}
