package com.stylefeng.guns.rest.modular.cinema.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.cinema.CinemaService;
import com.stylefeng.guns.rest.vo.BaseResVo;
import com.stylefeng.guns.rest.vo.cinema.CinemaSearchVo;
import com.stylefeng.guns.rest.vo.cinema.ConditionSearchVo;
import com.stylefeng.guns.rest.vo.cinema.FieldInfoSearchVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @ClassName CinemaController
 * @Description todo
 * @Author wangdi
 * @Date 2019/10/12 20:07
 **/

@RestController
@RequestMapping("cinema")
public class CinemaController {

    @Reference(interfaceClass = CinemaService.class)
    private CinemaService cinemaService;

    //为什么不是get/cinema?

    /* *
     * 功能描述 获取查找的电影院
     * @author wangdi
     * @date   2019/10/12 21:09
     * @param brandId
     * @param hallType
     * @param districtId
     * @param pageSize
     * @param nowPage
     * @return com.stylefeng.guns.rest.vo.BaseResVo
     */
    @RequestMapping(value = "/getCinemas",method = RequestMethod.GET)
    public Object getCinema(int brandId,int hallType,int areaId,int pageSize,int nowPage){
        CinemaSearchVo searchVo = new CinemaSearchVo(brandId, hallType, areaId, pageSize, nowPage);
        return cinemaService.getCinema(searchVo);
    }

    /* *
     * 功能描述  获取查询条件
     * @author wangdi
     * @date   2019/10/12 21:08
     * @param brandId
     * @param hallType
     * @param areaId
     * @return com.stylefeng.guns.rest.vo.BaseResVo
     */
    @RequestMapping(value = "/getCondition",method = RequestMethod.GET)
    public Object getCondition(int brandId,int hallType,int areaId){
        ConditionSearchVo conditionSearchVo = new ConditionSearchVo(brandId,hallType,areaId);
        return cinemaService.getCondition(conditionSearchVo);
    }

    /* *
     * 功能描述 获取电影院的播放场次
     * @author wangdi
     * @date   2019/10/12 21:08
     * @param cinemaId
     * @return com.stylefeng.guns.rest.vo.BaseResVo
     */
    @RequestMapping(value = "/getFields",method = RequestMethod.GET)
    public BaseResVo getFields(int cinemaId){
        return cinemaService.getFields(cinemaId);
    }

    @RequestMapping(value = "getFieldInfo",method = RequestMethod.POST)
    public BaseResVo getFieldInfo(int cinemaId,int fieldId ){
        FieldInfoSearchVo fieldInfoSearchVo = new FieldInfoSearchVo(cinemaId, fieldId);
        return cinemaService.getFieldInfo(fieldInfoSearchVo);
    }

}
