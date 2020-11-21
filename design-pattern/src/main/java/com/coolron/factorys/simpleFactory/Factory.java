package com.coolron.factorys.simpleFactory;/**
 * Created by Administrator on 2019/6/2.
 */

/**
 * @Auther: xf
 * @Date: 2019/6/2 18:41
 * @Description: 汽车工厂类
 */
public class Factory {

    /**
     * 利用反射实现
     */
    public static Car getCar(Class c) {
        Car car = null;
        try {
            car = (Car) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return car;
    }

    // 汽车工厂类，需要提供一个方法可以返回一个Car 对象
    //public static Car getCar(String name) {
    //    if ("audi".equalsIgnoreCase(name)) {
    //        return new Audi();
    //    } else if("bwm".equalsIgnoreCase(name)){
    //        return new BWM();
    //    }else {
    //        return null;
    //    }
    //}
}
