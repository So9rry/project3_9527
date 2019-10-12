package com.stylefeng.guns.rest.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @version 1.0
 * @ClassName CinemaConditionVo
 * @Description 返回前端
 * @Author wangdi
 * @Date 2019/10/12 22:43
 **/

public class CinemaConditionVo implements Serializable {
    private static final long serialVersionUID = 8230064232282247859L;
    List<AreaVo> areaList;
    List<BrandVo> brandList;
    List<HalltypeVo> halltypeList;
    String imgPre;
    String msg;
    int nowPage;
    int status;
    long totalPage;

    public CinemaConditionVo(List<AreaVo> areaList, List<BrandVo> brandList, List<HalltypeVo> halltypeList) {
        this.areaList = areaList;
        this.brandList = brandList;
        this.halltypeList = halltypeList;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<AreaVo> getAreaList() {
        return areaList;
    }

    public void setAreaList(List<AreaVo> areaList) {
        this.areaList = areaList;
    }

    public List<BrandVo> getBrandList() {
        return brandList;
    }

    public void setBrandList(List<BrandVo> brandList) {
        this.brandList = brandList;
    }

    public List<HalltypeVo> getHalltypeList() {
        return halltypeList;
    }

    public void setHalltypeList(List<HalltypeVo> halltypeList) {
        this.halltypeList = halltypeList;
    }

    public String getImgPre() {
        return imgPre;
    }

    public void setImgPre(String imgPre) {
        this.imgPre = imgPre;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getNowPage() {
        return nowPage;
    }

    public void setNowPage(int nowPage) {
        this.nowPage = nowPage;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }
}
