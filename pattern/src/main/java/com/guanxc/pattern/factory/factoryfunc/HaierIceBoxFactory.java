package com.guanxc.pattern.factory.factoryfunc;

import com.guanxc.pattern.bean.HaierIceBox;
import com.guanxc.pattern.bean.IceBox;

/**
 * @ClassName HaierIceBoxFactory
 * @Description TODO
 * @Author guan.xianchun
 * @Date 2019-03-18 12:10
 **/
public class HaierIceBoxFactory extends IceBoxFactory {

    @Override
    public IceBox createIceBox() {
        return new HaierIceBox();
    }
}
