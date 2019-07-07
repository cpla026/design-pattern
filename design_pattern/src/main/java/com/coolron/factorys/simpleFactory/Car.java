package com.coolron.factorys.simpleFactory;/**
 * Created by Administrator on 2019/6/2.
 */

/**
 * @Auther: xf
 * @Date: 2019/6/2 18:40
 * @Description:
 */
public abstract class Car {
    public abstract void info();
}

class Audi extends Car{
    @Override
    public void info() {
        System.out.println("Audi");
    }
}
class BWM extends Car{
    @Override
    public void info() {
        System.out.println("bmw");
    }
}