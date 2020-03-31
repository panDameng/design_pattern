package com.design.creational.singleton;

public class T implements Runnable {
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        System.out.println(Thread.currentThread().getName() + "  " + lazySingleton);
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "  " + lazyDoubleCheckSingleton);
    }
}
