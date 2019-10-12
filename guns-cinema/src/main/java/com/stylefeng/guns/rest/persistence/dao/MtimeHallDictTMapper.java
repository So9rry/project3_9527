package com.stylefeng.guns.rest.persistence.dao;

import com.stylefeng.guns.rest.persistence.model.MtimeHallDictT;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 地域信息表 Mapper 接口
 * </p>
 *
 * @author wangdi
 * @since 2019-10-12
 */
public interface MtimeHallDictTMapper extends BaseMapper<MtimeHallDictT> {

    //查找所有影厅
    List<MtimeHallDictT> selectAllHall();
}
