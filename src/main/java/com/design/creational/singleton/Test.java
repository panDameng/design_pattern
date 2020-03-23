package com.design.creational.singleton;

public class Test {
    public static void main(String[] args) {
        //懒汉式注重延迟加载，使用时才会创建对象
        //LazySingleton lazySingleton = LazySingleton.getInstance();
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();;
        System.out.println("program end");
    }
}
