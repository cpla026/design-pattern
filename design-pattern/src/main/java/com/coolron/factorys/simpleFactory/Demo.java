package com.coolron.factorys.simpleFactory;/**
 * Created by Administrator on 2019/6/2.
 */

/**
 * @Auther: xf
 * @Date: 2019/6/2 18:48
 * @Description: 简单工厂设计模式
 * 思想：需要什么直接跟工厂说
 */
public class Demo {

    public static void main(String[] args) {
        //Car bww = Factory.getCar("bww");
        //Factory.getCar("audi")

        Car audi = Factory.getCar(Audi.class);
        Car bwm = Factory.getCar(BWM.class);
        audi.info();
    }
}
