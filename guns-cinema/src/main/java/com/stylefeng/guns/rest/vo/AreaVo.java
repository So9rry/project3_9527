package com.stylefeng.guns.rest.vo;

import com.stylefeng.guns.rest.persistence.model.MtimeAreaDictT;

import java.io.Serializable;

/**
 * @version 1.0
 * @ClassName AreaVo
 * @Description todo
 * @Author wangdi
 * @Date 2019/10/12 22:46
 **/

public class AreaVo implements Serializable {
    private static final long serialVersionUID = -8965577835456570224L;
    boolean active;
    int areaId;
    String areaName;

    public AreaVo(MtimeAreaDictT mtimeAreaDictT) {
        areaId = mtimeAreaDictT.getUuid();
        areaName = mtimeAreaDictT.getShowName();
    }

    @Override
    public String toString() {
        return "AreaVo{" +
                "active=" + active +
                ", areaId=" + areaId +
                ", areaName='" + areaName + '\'' +
                '}';
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
}
