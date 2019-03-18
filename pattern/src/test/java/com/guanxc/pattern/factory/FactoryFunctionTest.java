package com.guanxc.pattern.factory;

import com.guanxc.pattern.factory.factoryfunc.HaierIceBoxFactory;
import com.guanxc.pattern.factory.factoryfunc.IceBoxFactory;
import com.guanxc.pattern.factory.factoryfunc.MideaIceBoxFactory;
import org.junit.Test;

/**
 * @ClassName FactoryFunctionTest
 * @Description TODO
 * @Author guan.xianchun
 * @Date 2019-03-18 12:11
 **/
public class FactoryFunctionTest {

    @Test
    public void test(){
        System.out.println("=======================工厂方法测试=======================");
        //要产品要找专门的工厂生产产品
        //要美的冰箱，则要找美的冰箱工厂
        IceBoxFactory factory = new MideaIceBoxFactory();
        System.out.println(factory.createIceBox().toString());

        //要海尔冰箱，则要找海尔冰箱工厂
        factory = new HaierIceBoxFactory();
        System.out.println(factory.createIceBox().toString());
    }
}
