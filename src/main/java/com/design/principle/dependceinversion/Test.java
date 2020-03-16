package com.design.principle.dependceinversion;

public class Test {
    //v1 写在bean类里的，扩展必须改bean
//    public static void main(String[] args) {
//        Darmon darmon = new Darmon();
//        darmon.studyFE();
//        darmon.studyJava();
//    }
    //v2 抽象出了course扩展方便，只需要调用新实现即可
//    public static void main(String[] args) {
//        Darmon darmon = new Darmon();
//        darmon.studyCourse(new JavaStudyCourse());
//        darmon.studyCourse(new FEStudyCourse());
//        darmon.studyCourse(new PythonCourse());
//    }

    //v3 逻辑上来讲， 不如v2的效果好。并且每次调用都需要重新生成对象
//    public static void main(String[] args) {
//        Darmon darmon = new Darmon(new FEStudyCourse());
//        darmon.studyCourse();
//    }

    //v4 最佳 对象只生成一个，同时方法不属于构造器即生来必须。
    public static void main(String[] args) {
        Darmon darmon = new Darmon();
        darmon.studyCourse(new JavaStudyCourse());
        darmon.studyCourse(new FEStudyCourse());
        darmon.studyCourse(new PythonCourse());

    }
}
