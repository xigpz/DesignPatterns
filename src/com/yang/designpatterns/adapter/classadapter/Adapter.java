package com.yang.designpatterns.adapter.classadapter;

/**
 * Create by yanggm on 2020/7/23
 */
public class Adapter extends Usber implements Ps2{
    @Override
    public void isPs2() {
        isUsb();
    }
}
