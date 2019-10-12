package com.stylefeng.guns.rest.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @version 1.0
 * @ClassName CinemaShowVo
 * @Description 返回前端显示电影院
 * @Author wangdi
 * @Date 2019/10/12 21:26
 **/

public class CinemaShowVo implements Serializable {
    private static final long serialVersionUID = 3446503495866543702L;

    List<CinemaVo> data;
    String imgPre;
    String msg;
    int nowPage;
    int status;
    long totalPage;

    public CinemaShowVo(List<CinemaVo> data, String imgPre, String msg, int nowPage, int status, long totalPage) {
        this.data = data;
        this.imgPre = imgPre;
        this.msg = msg;
        this.nowPage = nowPage;
        this.status = status;
        this.totalPage = totalPage;
    }

    public CinemaShowVo() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<CinemaVo> getData() {
        return data;
    }

    public void setData(List<CinemaVo> data) {
        this.data = data;
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
