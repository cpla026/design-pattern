package com.coolron.adapter;/**
 * Created by Administrator on 2019/6/2.
 */

/**
 * @Auther: xf
 * @Date: 2019/6/2 18:04
 * @Description:
 */
public class Computer{

    private USB usb;

    public void connect(USB usbDevice){
        this.usb = usbDevice;
    }
    public void showInfo(){
        System.out.println(this.usb.getInfo());
    }
}
