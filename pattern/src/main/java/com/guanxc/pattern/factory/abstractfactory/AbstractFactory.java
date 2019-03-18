package com.guanxc.pattern.factory.abstractfactory;

import com.guanxc.pattern.bean.AirConditioner;
import com.guanxc.pattern.bean.IceBox;

/**
 * @ClassName abstractFactory
 * @Description 抽象工厂是定义一个品牌生产一系列的产品
 * @Author guan.xianchun
 * @Date 2019-03-18 13:09
 **/
public abstract class AbstractFactory {
    /**
     * @Author guan.xianchun
     * @Description 生产冰箱
     * @Date 19-03-18 13:11
     * @Param *@param: 
     * @Return com.guanxc.pattern.bean.IceBox
     **/
    public abstract IceBox createIceBox();
    /**
     * @Author guan.xianchun
     * @Description 生产空调
     * @Date 19-03-18 13:14
     * @Param *@param: 
     * @Return com.guanxc.pattern.bean.AirConditioner
     **/
    public abstract AirConditioner createAirConditioner();
}
