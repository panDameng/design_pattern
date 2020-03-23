package com.design.creational.builder;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseArticleBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("Java视频", "Java课程", "JavaPPT","Java笔记", "Java问答");
        System.out.println(course.toString());
    }
}
