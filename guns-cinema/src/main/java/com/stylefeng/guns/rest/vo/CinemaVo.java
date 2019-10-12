package com.stylefeng.guns.rest.vo;

import com.stylefeng.guns.rest.persistence.model.MtimeCinemaT;

import java.io.Serializable;

/**
 * @version 1.0
 * @ClassName CinemaVo
 * @Description 前端显示电影院信息
 * @Author wangdi
 * @Date 2019/10/12 21:27
 **/

public class CinemaVo implements Serializable {
    //服务之间请求都要序列化，然后给实现接口的一个UID
    private static final long serialVersionUID = 6285406345232092047L;
    String cinemaAddress;
    String cinemaName;
    int minimumPrice;
    int uuid;

    public CinemaVo() {
    }

    public CinemaVo(MtimeCinemaT cinema) {
        cinemaAddress = cinema.getCinemaAddress();
        cinemaName = cinema.getCinemaName();
        minimumPrice = cinema.getMinimumPrice();
        uuid = cinema.getUuid();
    }

    public String getCinemaAddress() {
        return cinemaAddress;
    }

    public void setCinemaAddress(String cinemaAddress) {
        this.cinemaAddress = cinemaAddress;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public int getMinimumPrice() {
        return minimumPrice;
    }

    public void setMinimumPrice(int minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }
}
