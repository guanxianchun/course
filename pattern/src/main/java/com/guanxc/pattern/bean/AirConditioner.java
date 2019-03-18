package com.guanxc.pattern.bean;

/**
 * @ClassName AirConditioner
 * @Description TODO
 * @Author guan.xianchun
 * @Date 2019-03-18 13:13
 **/
public class AirConditioner {
    private String brandName;

    public AirConditioner(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return ""+this.brandName+"品牌空调";
    }
}
