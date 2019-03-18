package com.guanxc.pattern.factory;

import com.guanxc.pattern.factory.abstractfactory.AbstractFactory;
import com.guanxc.pattern.factory.abstractfactory.HaierFactory;
import com.guanxc.pattern.factory.abstractfactory.MideaFactory;
import org.junit.Test;

/**
 * @ClassName AbstractFactoryTest
 * @Description TODO
 * @Author guan.xianchun
 * @Date 2019-03-18 13:33
 **/
public class AbstractFactoryTest {
    @Test
    public void test(){
        System.out.println("=====================抽象工厂测试================================");
        System.out.println("-----------------------美的工厂----------------------------------");
        AbstractFactory factory = new MideaFactory();
        System.out.println(factory.createIceBox().toString());
        System.out.println(factory.createAirConditioner().toString());
        System.out.println("----------------------海尔工厂-----------------------------------");
        factory = new HaierFactory();
        System.out.println(factory.createIceBox().toString());
        System.out.println(factory.createAirConditioner().toString());
        
    }
}
