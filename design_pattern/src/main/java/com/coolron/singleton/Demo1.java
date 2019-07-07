package com.coolron.singleton;/**
 * Created by Administrator on 2019/6/2.
 */

/**
 * @Auther: xf
 * @Date: 2019/6/2 17:20
 * @Description: 单利设计模式 - 饿汉式
 * 类加载到内存中的时候，直接将下文中的instance 实例化好了
 * 问题：User 对象可能没有使用
 */
public class Demo1 {

    public static void main(String[] args) {
        User user = User.getUser();
        for (int i = 0; i < 1000; i++) {
            User u = User.getUser();
            if(user != u){ // 比较的是地址值
                System.out.println("新的对象被实例化...");
            }
        }
    }
}

/**
 * 作为一个单例类，使其在程序中有且仅有一个实例
 */
class User {
    // 1.私有化构造函数
    private User(){};

    // 3. 设计一个私有的静态的当前类对象
    private static User instance = new User();

    /*
    static {
        instance = new User();
    }
    */

    // 2. 提供一个方法，可以返回给调用方一个获取当前类的方法
    public static User getUser(){
        /**
         * 这种写法不对
         * 每次调用方法都会获取到一个新的User 对象
         * 而单例的目的：每次调用 getUser 方法都只能获取唯一的实例对象。
         */
        //return new User();
        return instance;
    }

}
