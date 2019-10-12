package com.stylefeng.guns.rest.vo.cinema;

/**
 * @version 1.0
 * @ClassName FieldInfoSearchVo
 * @Description 获取电影详情
 * @Author wangdi
 * @Date 2019/10/12 21:11
 **/

public class FieldInfoSearchVo {
    int cinemaId;
    int fieldId;

    public FieldInfoSearchVo(int cinemaId, int fieldId) {
        this.cinemaId = cinemaId;
        this.fieldId = fieldId;
    }

    public int getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(int cinemaId) {
        this.cinemaId = cinemaId;
    }

    public int getFieldId() {
        return fieldId;
    }

    public void setFieldId(int fieldId) {
        this.fieldId = fieldId;
    }
}
