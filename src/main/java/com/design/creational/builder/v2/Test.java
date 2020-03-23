package com.design.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        //内部类和链式调用方法
        //实例是StringBuilder
        Course course = new Course.CourseBuilder().buildCourseArticle("Java手记").buildCourseName("Java课程").buildCoursePPT("JavaPPT").buildCourseVideo("Java视频").makeCourse();
        System.out.println(course);
    }
}
