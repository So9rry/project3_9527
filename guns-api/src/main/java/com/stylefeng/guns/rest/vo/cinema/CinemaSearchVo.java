package com.stylefeng.guns.rest.vo.cinema;

import java.io.Serializable;

/**
 * @version 1.0
 * @ClassName CinemaSearchVo
 * @Description 查询影院列表
 * @Author wangdi
 * @Date 2019/10/12 20:52
 **/

public class CinemaSearchVo implements Serializable {
    private static final long serialVersionUID = 699522253534093194L;
    Integer brandId;
    Integer hallType;
    Integer areaId;
    Integer pageSize;
    Integer nowPage;

    public CinemaSearchVo() {
    }

    public CinemaSearchVo(Integer brandId, Integer hallType, Integer areaId, Integer pageSize, Integer nowPage) {
        this.brandId = brandId;
        this.hallType = hallType;
        this.areaId = areaId;
        this.pageSize = pageSize;
        this.nowPage = nowPage;
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

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getNowPage() {
        return nowPage;
    }

    public void setNowPage(Integer nowPage) {
        this.nowPage = nowPage;
    }

    @Override
    public String toString() {
        return "CinemaSearchVo{" +
                "brandId=" + brandId +
                ", hallType=" + hallType +
                ", areaId=" + areaId +
                ", pageSize=" + pageSize +
                ", nowPage=" + nowPage +
                '}';
    }
}
