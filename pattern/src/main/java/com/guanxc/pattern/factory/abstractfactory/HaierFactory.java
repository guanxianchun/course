package com.guanxc.pattern.factory.abstractfactory;

import com.guanxc.pattern.bean.AirConditioner;
import com.guanxc.pattern.bean.HaierAirConditioner;
import com.guanxc.pattern.bean.HaierIceBox;
import com.guanxc.pattern.bean.IceBox;

/**
 * @ClassName HaierFactory
 * @Description 海尔工厂，可以生产海尔的产品簇(如冰箱，空调等产品)
 * @Author guan.xianchun
 * @Date 2019-03-18 13:17
 **/
public class HaierFactory extends AbstractFactory {
    @Override
    public IceBox createIceBox() {
        return new HaierIceBox();
   }

    @Override
    public AirConditioner createAirConditioner() {
        return new HaierAirConditioner();
    }
}
