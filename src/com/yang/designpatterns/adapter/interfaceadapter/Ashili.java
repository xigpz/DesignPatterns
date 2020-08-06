package com.yang.designpatterns.adapter.interfaceadapter;

/**
 * Create by yanggm on 2020/7/23
 */
public class Ashili extends Adapter{
    @Override
    public void a(){
        System.out.println("方法a被调用");
    }

    @Override
    public void d(){
        System.out.println("方法d被调用");
    }
}
