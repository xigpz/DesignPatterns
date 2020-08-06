package com.yang.designpatterns.singleton;

/**
 * Create by yanggm on 2020/7/23
 */
public class ClassLevelInnerClassSingleton {

    public static class singletonHolder{
        private static ClassLevelInnerClassSingleton singleton = new ClassLevelInnerClassSingleton();
    }

    private ClassLevelInnerClassSingleton(){}

    public ClassLevelInnerClassSingleton getInstance(){
        return singletonHolder.singleton;
    }
}
