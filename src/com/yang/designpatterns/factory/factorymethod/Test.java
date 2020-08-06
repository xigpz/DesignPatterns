package com.yang.designpatterns.factory.factorymethod;

/**
 * Create by yanggm on 2020/7/23
 */
public class Test {
    public static void main(String[] args) {
        DeskFactory deskFactory = new WoodenDeskFactory();
        Desk desk = deskFactory.createDesk();
        System.out.println(desk.getType());
    }
}
