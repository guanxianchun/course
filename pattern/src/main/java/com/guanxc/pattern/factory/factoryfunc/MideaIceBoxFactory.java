package com.guanxc.pattern.factory.factoryfunc;


import com.guanxc.pattern.bean.IceBox;
import com.guanxc.pattern.bean.MedeaIceBox;

/**
 * @ClassName MideaIceBoxFactory
 * @Description 美的冰箱工厂
 * @Author guan.xianchun
 * @Date 2019/3/18 12:07
 **/
public class MideaIceBoxFactory extends IceBoxFactory {
    
    @Override
    public IceBox createIceBox() {
        return new MedeaIceBox();
    }
}
