package com.design.creational.factorymethod;

public class Test extends PythonVideo {
    //案例 Collection的iterator
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        VideoFactory videoFactory1 = new PythonVideoFactory();
        Video video = videoFactory.getVideo();
        Video video1 = videoFactory1.getVideo();
        video.produce();
        video1.produce();
    }
}
