package com.stylefeng.guns.rest.vo;

import com.stylefeng.guns.rest.persistence.model.MtimeHallDictT;

import java.io.Serializable;

/**
 * @version 1.0
 * @ClassName HalltypeVo
 * @Description todo
 * @Author wangdi
 * @Date 2019/10/12 22:47
 **/

public class HalltypeVo implements Serializable {
    private static final long serialVersionUID = -1607463751000426411L;
    boolean active;
    int halltypeId;
    String halltypeName;

    public HalltypeVo(MtimeHallDictT mtimeHallDictT) {
        halltypeId = mtimeHallDictT.getUuid();
        halltypeName = mtimeHallDictT.getShowName();
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getHalltypeId() {
        return halltypeId;
    }

    public void setHalltypeId(int halltypeId) {
        this.halltypeId = halltypeId;
    }

    public String getHalltypeName() {
        return halltypeName;
    }

    public void setHalltypeName(String halltypeName) {
        this.halltypeName = halltypeName;
    }
}
