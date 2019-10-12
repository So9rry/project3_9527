package com.stylefeng.guns.rest.vo;

/**
 * @version 1.0
 * @ClassName BaseResVo
 * @Description 返回正常的数据
 * @Author wangdi
 * @Date 2019/10/12 20:46
 **/

public class BaseResVo <T>{

    int status;
    String imgPre;
    T data;

    @Override
    public String toString() {
        return "BaseResVo{" +
                "status=" + status +
                ", imgPre='" + imgPre + '\'' +
                ", data=" + data +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getImgPre() {
        return imgPre;
    }

    public void setImgPre(String imgPre) {
        this.imgPre = imgPre;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
