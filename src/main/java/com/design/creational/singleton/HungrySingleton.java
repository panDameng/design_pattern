package com.design.creational.singleton;

import java.io.Serializable;

//序列化反序列化破坏单例
//实现Serializable
public class HungrySingleton implements Serializable {
    private final static HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){
        if(hungrySingleton != null){
            throw new RuntimeException("单例构造器禁止调用");
        }
    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
    public Object readResolve(){
        return hungrySingleton;
    }
}
