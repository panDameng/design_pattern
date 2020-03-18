package com.design.creational.simplefactory;

import java.util.Calendar;

public class Test {
    //JDK案例， Calendar类的getInstance方法
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null){
            return;
        }
        video.produce();

    }
}
