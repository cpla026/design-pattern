package com.coolron.singleton;

/**
 * @Auther: xf
 * @Date: 2019/6/2 17:39
 * @Description: 单利设计模式 - 懒汉式
 *
 * 要使用实例对象 才去创建
 */
public class Demo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Teacher.getTeacher();
        }
    }
}

class Teacher{
    // 1. 私有化构造
    private Teacher(){
        System.out.println("构造方法被执行");
    };
    // 2. 设计一个私有的静态的当前类对象
    private static Teacher instance;
    // 3. 提供一个方法，可以返回给调用方一个获取当前类的方法
    public static Teacher getTeacher(){
        if(instance == null){
            instance = new Teacher();
        }
        return instance;
    }
}
