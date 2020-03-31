package com.design.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        //懒汉式注重延迟加载，使用时才会创建对象
//        //LazySingleton lazySingleton = LazySingleton.getInstance();
//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();;
//        System.out.println("program end");
        //序列化和反序列化攻击
//        HungrySingleton instance = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        HungrySingleton newinstance = (HungrySingleton) ois.readObject();
//
//        System.out.println(instance);
//        System.out.println(newinstance);
//        System.out.println(instance==newinstance);
        //反射工击
//        Class objectClass = HungrySingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        //修改构造器权限，让外部能调用
//        constructor.setAccessible(true);
//        //单例建造对象
//        HungrySingleton instance = HungrySingleton.getInstance();
//        //反射构造对象
//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance==newInstance);
        ////序列化与反序列化攻击测试，结果完全防御
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.setData(new Object());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        EnumInstance newinstance = (EnumInstance) ois.readObject();
//
//        System.out.println(instance.getData());
//        System.out.println(newinstance.getData());
//        System.out.println(instance==newinstance);
        //f反射攻击枚举单例
        Class objectClass = EnumInstance.class;
        //枚举没有无参构造器，调用传参构造
        Constructor constructor = objectClass.getDeclaredConstructor(String.class, int.class);
        //修改构造器权限，让外部能调用
        constructor.setAccessible(true);
        //单例建造对象
        EnumInstance instance = EnumInstance.getInstance();
        //反射构造对象int
        EnumInstance newInstance = (EnumInstance) constructor.newInstance();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance==newInstance);
    }
}
