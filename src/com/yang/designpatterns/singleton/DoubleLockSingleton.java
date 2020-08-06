package com.yang.designpatterns.singleton;

/**
 * Create by yanggm on 2020/7/23
 */
public class DoubleLockSingleton {
    private static volatile DoubleLockSingleton singleton = null;

    private DoubleLockSingleton(){}

    public static DoubleLockSingleton getInstance(){
        if(singleton == null){
            synchronized (DoubleLockSingleton.class){
                if(singleton == null){
                    singleton = new DoubleLockSingleton();
                }
            }
        }
        return singleton;
    }
}
