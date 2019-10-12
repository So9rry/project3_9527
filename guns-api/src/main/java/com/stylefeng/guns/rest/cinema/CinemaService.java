package com.stylefeng.guns.rest.cinema;

import com.stylefeng.guns.rest.vo.BaseResVo;
import com.stylefeng.guns.rest.vo.cinema.CinemaSearchVo;
import com.stylefeng.guns.rest.vo.cinema.ConditionSearchVo;
import com.stylefeng.guns.rest.vo.cinema.FieldInfoSearchVo;

public interface CinemaService {

    //显示影院信息
    Object getCinema(CinemaSearchVo searchVo);

    //获取查找的所有条件
    Object getCondition(ConditionSearchVo conditionSearchVo);

    //获取查找的电影院 播放场次
    BaseResVo getFields(int cinemaId);

    //获取电影院详情
    BaseResVo getFieldInfo(FieldInfoSearchVo fieldInfoSearchVo);
}
