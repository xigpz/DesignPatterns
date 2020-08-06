package com.yang.designpatterns.factory.easyfactory;

/**
 * Create by yanggm on 2020/7/23
 */
public class PlasticDesk implements Desk{
    private String type = "塑料桌子";
    @Override
    public String getType() {
        return type;
    }
}
