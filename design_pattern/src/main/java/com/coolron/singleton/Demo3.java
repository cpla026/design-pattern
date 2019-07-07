package com.coolron.singleton;/**
 * Created by Administrator on 2019/6/2.
 */

/**
 * @Auther: xf
 * @Date: 2019/6/2 17:47
 * @Description: 懒汉式在多线程中的问题   饿汉式不会出现此问题
 * 多线程下会出现多个实例被创建
 */
public class Demo3 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++){
            Thread t = new Thread(() -> {
                try {
                    Thread.sleep(50);
                    Chairman.getInstance();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            t.start();
        }
    }
}

class Chairman{
    private Chairman(){
        System.out.println("一个新的对象被实例化");
    }
    private static Chairman instance;
   /*
    public static Chairman getInstance(){
        *//**
         * 多线程下进入到if判断的可能不止一个
         * 同步函数、同步代码块都可以
         *//*
        if(null == instance){
            instance =  new Chairman();
        }
        return instance;
    }*/
    public static synchronized Chairman getInstance(){
        /**
         * 多线程下进入到if判断的可能不止一个
         * 同步函数、同步代码块都可以
         */
        if(null == instance){
            instance =  new Chairman();
        }
        return instance;
    }
}