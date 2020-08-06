package com.yang.designpatterns.adapter.objectadapter;

/**
 * Create by yanggm on 2020/7/23
 */
public class Test {
    public static void main(String[] args) {
        Ps2 p = new Adapter(new Usber());
        p.isPs2();
    }
}
