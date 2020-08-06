package com.yang.designpatterns.factory.factorymethod;

/**
 * Create by yanggm on 2020/7/23
 */
public class WoodenDesk implements Desk{
    private String type = "木质桌子";
    @Override
    public String getType() {
        return type;
    }
}
