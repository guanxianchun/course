package com.guanxc.pattern.bean;

/**
 * @ClassName Car
 * @Description 冰箱产品
 * @Author guan.xianchun
 * @Date 2019/3/18 0018 11:32
 **/
public class IceBox {
    
    private String brandName;

    public IceBox(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return ""+this.brandName+"品牌冰箱";
    }
}
