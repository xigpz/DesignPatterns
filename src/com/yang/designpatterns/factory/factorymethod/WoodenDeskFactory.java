package com.yang.designpatterns.factory.factorymethod;

/**
 * Create by yanggm on 2020/7/23
 */
public class WoodenDeskFactory implements DeskFactory{
    @Override
    public Desk createDesk() {
        return new WoodenDesk();
    }
}
