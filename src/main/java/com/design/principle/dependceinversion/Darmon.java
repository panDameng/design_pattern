package com.design.principle.dependceinversion;

public class Darmon {
    //v1
//    public void studyJava(){
//        System.out.println("学习Java");
//    }
//    public void studyFE(){
//        System.out.println("学习FE");
//    }
    //v2
//    public void studyCourse(Course course){
//        course.studyCourse();
//    }
//    public Darmon() {
//    }
    //v3
//    private Course course;
//
//    public Darmon(Course course) {
//        this.course = course;
//    }
//
//    public void studyCourse(){
//        this.course.studyCourse();
//    }
    private Course course;
    public Darmon() {
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void studyCourse(Course course){
        course.studyCourse();
    }
}
