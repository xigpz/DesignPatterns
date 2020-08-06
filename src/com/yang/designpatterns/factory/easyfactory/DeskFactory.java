package com.yang.designpatterns.factory.easyfactory;

/**
 * Create by yanggm on 2020/7/23
 */
public class DeskFactory {
    public static Desk createDesk(Type type) {
        switch (type) {
            case Wooden:
                return new WoodenDesk();
            case Plastic:
                return new PlasticDesk();
            default:
                return null;
        }
    }
}
