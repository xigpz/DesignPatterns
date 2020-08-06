package com.yang.designpatterns.adapter.objectadapter;

/**
 * Create by yanggm on 2020/7/23
 */
public class Adapter implements Ps2{
    private Usber usb;

    public Adapter(Usber usb){
        this.usb = usb;
    }
    @Override
    public void isPs2() {
        usb.isUsb();
    }
}
