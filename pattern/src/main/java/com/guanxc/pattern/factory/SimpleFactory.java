package com.guanxc.pattern.factory;

import com.guanxc.pattern.bean.HaierIceBox;
import com.guanxc.pattern.bean.IceBox;
import com.guanxc.pattern.bean.MedeaIceBox;

/**
 * @ClassName SimpleFactory
 * @Description 简单工厂方法：小作坊式，可以生产任何你想要的产品
 * @Author guan.xianchun
 * @Date 2019/3/18 0018 10:50
 **/
public class SimpleFactory {
    /**
     * @Author guan.xianchun
     * @Description 生产美的冰箱
     * @Date 19-03-18 11:10
     * @Param 
     * @Return com.guanxc.pattern.bean.IceBox
     **/
    public static IceBox createMideaIceBox(){
        return new MedeaIceBox();
    }

    /**
     * @Author guan.xianchun
     * @Description 生产海尔冰箱
     * @Date 19-03-18 11:10
     * @Param 
     * @Return com.guanxc.pattern.bean.IceBox
     **/
    public static IceBox createHeierIceBox(){
        return new HaierIceBox();
    }
    
}
