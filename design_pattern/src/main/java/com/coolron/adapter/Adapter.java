package com.coolron.adapter;/**
 * Created by Administrator on 2019/6/2.
 */

/**
 * @Auther: xf
 * @Date: 2019/6/2 18:12
 * @Description: 适配器模式的核心适配类
 * 1、连接电脑的USB 接口
 * 2、其他设备作为属性
 */
public class Adapter implements USB {

    private TypeC device;
    public Adapter(TypeC device){
        this.device = device;
    }

    @Override
    public String getInfo() {
        return this.device.getInfo();
    }
}
