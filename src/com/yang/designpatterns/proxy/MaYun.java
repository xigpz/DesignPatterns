package com.yang.designpatterns.proxy;

/**
 * Create by yanggm on 2020/7/23
 */
public class MaYun implements ZiRanRen{
    public void eat(){
        System.out.println("今天我吃大餐");
    }

    public void drink(){
        System.out.println("今天我喝酒");
    }

    @Override
    public void Quanli() {
        System.out.println("我赋予我的代理律师来行使这些权利,此时代理律师全权代理我处理某些事务");
    }
}
