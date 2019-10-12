package com.stylefeng.guns.rest.persistence.dao;

import com.stylefeng.guns.rest.persistence.model.MtimeBrandDictT;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 品牌信息表 Mapper 接口
 * </p>
 *
 * @author wangdi
 * @since 2019-10-12
 */
public interface MtimeBrandDictTMapper extends BaseMapper<MtimeBrandDictT> {

    //查找所有的影院类型
    List<MtimeBrandDictT> selectAllBrand();

}
