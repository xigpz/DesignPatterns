package com.yang.designpatterns.proxy;

/**
 * Create by yanggm on 2020/7/23
 */
public class LvShi implements ZiRanRen{
    @Override
    public void Quanli() {
        new MaYun().Quanli();
    }
}
