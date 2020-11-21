package com.coolron.adapter;/**
 * Created by Administrator on 2019/6/2.
 */

/**
 * @Auther: xf
 * @Date: 2019/6/2 18:01
 * @Description: 适配器模式
 *
 * 核心思想：通过中间类 将两个不能直接交互的类连通
 *
 * 需求：手机连接电脑
 * 手机：TypeC接口
 * 电脑：USB接口
 */
public class Demo1 {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Phone phone = new Phone();

        // 电脑通过转接器（适配器）连接到一个TypeC 手机
        computer.connect(new Adapter(phone));
        computer.showInfo();
    }
}
