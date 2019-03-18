package com.guanxc.pattern.factory.factoryfunc;

import com.guanxc.pattern.bean.IceBox;

/**
 * @ClassName IceBoxFactory
 * @Description 专门生产冰箱的工厂,工厂方法就是专人做专事
 * @Author guan.xianchun
 * @Date 2019/3/18 11:46
 **/
public abstract class IceBoxFactory {
    
    public abstract IceBox createIceBox();
    
}
