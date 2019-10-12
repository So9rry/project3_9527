package com.stylefeng.guns.rest.vo;

/**
 * @version 1.0
 * @ClassName ErrVo
 * @Description 返回错误的数据
 * @Author wangdi
 * @Date 2019/10/12 20:45
 **/

public class ErrVo {
    int status;
    String msg;

    @Override
    public String toString() {
        return "ErrVo{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
