package com.yang.designpatterns.factory.easyfactory;

/**
 * Create by yanggm on 2020/7/23
 */
public class Test {
    public static void main(String[] args) {
        Desk desk = DeskFactory.createDesk(Type.Plastic);
        System.out.println(desk.getType());
    }
}
