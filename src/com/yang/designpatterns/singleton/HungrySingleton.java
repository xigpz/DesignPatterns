package com.yang.designpatterns.singleton;

/**
 * Create by yanggm on 2020/7/23
 */
public class HungrySingleton {
    //此处定义类变量实例并直接实例化，在类加载的时候就完成了实例化并保存在类中
    private static HungrySingleton singleton = new HungrySingleton();
    //定义无参构造器，用于单例实例
    private HungrySingleton(){}
    //定义公开方法，返回已创建的单例
    public static HungrySingleton getInstance(){
        return singleton;
    }
}
