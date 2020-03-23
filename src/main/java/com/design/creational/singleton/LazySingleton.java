package com.design.creational.singleton;

public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton(){

    }
    //静态方法保证调用属于类，同步表示其他调用时无法进行该方法，等到之前对象创建后，进入判断不为null,直接返回之前的对象
    public synchronized static LazySingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
