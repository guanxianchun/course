package com.guanxc.pattern.factory;

import org.junit.Test;

/**
 * @ClassName SimpleFactoryTest
 * @Description 简单工厂测试类
 * @Author guan.xianchun
 * @Date 2019/3/18 0018 11:11
 **/
public class SimpleFactoryTest {
    @Test
    public void testMilk(){
        System.out.println("=======================简单工厂方法测试=======================");
        //得到美的冰箱
        System.out.println(SimpleFactory.createMideaIceBox().toString());
        //得到海尔冰箱
        System.out.println(SimpleFactory.createHeierIceBox().toString());
    }
}
