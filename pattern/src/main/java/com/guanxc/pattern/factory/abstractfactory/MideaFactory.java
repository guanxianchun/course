package com.guanxc.pattern.factory.abstractfactory;

import com.guanxc.pattern.bean.AirConditioner;
import com.guanxc.pattern.bean.IceBox;
import com.guanxc.pattern.bean.MedeaIceBox;
import com.guanxc.pattern.bean.MideaAirConditioner;

/**
 * @ClassName MideaFactory
 * @Description 美的工厂，生产美的冰箱和空调
 * @Author guan.xianchun
 * @Date 2019-03-18 13:29
 **/
public class MideaFactory extends AbstractFactory {

    @Override
    public IceBox createIceBox() {
        return new MedeaIceBox();
    }

    @Override
    public AirConditioner createAirConditioner() {
        return new MideaAirConditioner();
    }
}
