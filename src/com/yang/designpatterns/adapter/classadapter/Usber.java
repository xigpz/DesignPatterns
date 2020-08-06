package com.yang.designpatterns.adapter.classadapter;

/**
 * Create by yanggm on 2020/7/23
 */
public class Usber implements Usb{
    @Override
    public void isUsb() {
        System.out.println("Usb口");
    }
}
