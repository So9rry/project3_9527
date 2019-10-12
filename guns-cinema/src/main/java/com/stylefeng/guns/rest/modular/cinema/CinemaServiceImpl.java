package com.stylefeng.guns.rest.modular.cinema;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.stylefeng.guns.core.page.PageInfoBT;
import com.stylefeng.guns.rest.cinema.CinemaService;
import com.stylefeng.guns.rest.persistence.dao.MtimeAreaDictTMapper;
import com.stylefeng.guns.rest.persistence.dao.MtimeBrandDictTMapper;
import com.stylefeng.guns.rest.persistence.dao.MtimeCinemaTMapper;
import com.stylefeng.guns.rest.persistence.dao.MtimeHallDictTMapper;
import com.stylefeng.guns.rest.persistence.model.MtimeAreaDictT;
import com.stylefeng.guns.rest.persistence.model.MtimeBrandDictT;
import com.stylefeng.guns.rest.persistence.model.MtimeCinemaT;
import com.stylefeng.guns.rest.persistence.model.MtimeHallDictT;
import com.stylefeng.guns.rest.vo.*;
import com.stylefeng.guns.rest.vo.cinema.CinemaSearchVo;
import com.stylefeng.guns.rest.vo.cinema.ConditionSearchVo;
import com.stylefeng.guns.rest.vo.cinema.FieldInfoSearchVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @ClassName CinemaServiceImpl
 * @Description todo
 * @Author wangdi
 * @Date 2019/10/12 20:37
 **/

@Component
@Service(interfaceClass = CinemaService.class)
public class CinemaServiceImpl implements CinemaService {

    @Autowired
    MtimeCinemaTMapper mtimeCinemaTMapper;

    @Autowired
    MtimeAreaDictTMapper mtimeAreaDictTMapper;

    @Autowired
    MtimeBrandDictTMapper mtimeBrandDictTMapper;

    @Autowired
    MtimeHallDictTMapper mtimeHallDictTMapper;
    /* *
     * 功能描述 显示影院信息
     * @author wangdi
     * @date   2019/10/12 20:57
     * @param searchVo
     * @return com.stylefeng.guns.rest.vo.BaseResVo
     */
    @Override
    public CinemaShowVo getCinema(CinemaSearchVo searchVo) {
        PageHelper.startPage(searchVo.getNowPage(),searchVo.getPageSize());
        List<MtimeCinemaT>cinemas =  mtimeCinemaTMapper.selectCinema(searchVo);
        PageInfo<MtimeCinemaT> mtimeCinemaTPageInfo = new PageInfo<>(cinemas);
        long total = mtimeCinemaTPageInfo.getTotal();

        List<CinemaVo> data = new ArrayList<>();
        for (MtimeCinemaT cinema : cinemas) {
            CinemaVo cinemaVo = new CinemaVo(cinema);
            data.add(cinemaVo);
        }

        CinemaShowVo cinemaShowVo = new CinemaShowVo(data,"http://img.meetingshop.cn/","",searchVo.getNowPage(),0,total);
        return cinemaShowVo;
    }

    /* *
     * 功能描述 获取查找的所有条件
     * @author wangdi
     * @date   2019/10/12 21:06
     * @param conditionSearchVo
     * @return com.stylefeng.guns.rest.vo.BaseResVo
     */
    @Override
    public  CinemaConditionVo getCondition(ConditionSearchVo conditionSearchVo) {

        List<MtimeAreaDictT> mtimeAreaDictTS = mtimeAreaDictTMapper.selectAllArea();
        List<AreaVo> areaList = new ArrayList<>();
        for (MtimeAreaDictT mtimeAreaDictT : mtimeAreaDictTS) {
            AreaVo areaVo = new AreaVo(mtimeAreaDictT);
            if(mtimeAreaDictT.getUuid().equals(conditionSearchVo.getAreaId())){
                areaVo.setActive(true);
            }
            areaList.add(areaVo);
        }

        List<MtimeBrandDictT> mtimeBrandDictTS = mtimeBrandDictTMapper.selectAllBrand();
        List<BrandVo> brandList = new ArrayList<>();
        for (MtimeBrandDictT mtimeBrandDictT : mtimeBrandDictTS) {
            BrandVo brandVo = new BrandVo(mtimeBrandDictT);
            if(mtimeBrandDictT.getUuid().equals(conditionSearchVo.getBrandId())){
                brandVo.setActive(true);
            }
            brandList.add(brandVo);
        }

        List<MtimeHallDictT> mtimeHallDictTS = mtimeHallDictTMapper.selectAllHall();
        List<HalltypeVo> halltypeList = new ArrayList<>();
        for (MtimeHallDictT mtimeHallDictT : mtimeHallDictTS) {
            HalltypeVo halltypeVo = new HalltypeVo(mtimeHallDictT);
            if(mtimeHallDictT.getUuid().equals(conditionSearchVo.getHallType())){
                halltypeVo.setActive(true);

            }
            halltypeList.add(halltypeVo);
        }
        CinemaConditionVo cinemaConditionVo = new CinemaConditionVo(areaList,brandList,halltypeList);


        return cinemaConditionVo;
    }

    @Override
    public BaseResVo getFields(int cinemaId) {
        return null;
    }

    @Override
    public BaseResVo getFieldInfo(FieldInfoSearchVo fieldInfoSearchVo) {
        return null;
    }
}
