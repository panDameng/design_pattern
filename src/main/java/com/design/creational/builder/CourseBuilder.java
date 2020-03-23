package com.design.creational.builder;

public abstract class CourseBuilder {
//    private String CourseVideo;
//    private String CoursePPT;
//    private String CourseArticle;
//    private String CourseQA;

    public abstract void buildCourseName(String courseNmame);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
