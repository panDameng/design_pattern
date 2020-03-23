package com.design.creational.builder;

public class Course {
    private String CourseVideo;
    private String CourseName;
    private String CoursePPT;
    private String CourseArticle;
    private String CourseQA;

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public void setCourseVideo(String courseVideo) {
        CourseVideo = courseVideo;
    }

    public void setCoursePPT(String coursePPT) {
        CoursePPT = coursePPT;
    }

    public void setCourseArticle(String courseArticle) {
        CourseArticle = courseArticle;
    }

    public void setCourseQA(String courseQA) {
        CourseQA = courseQA;
    }

    public String getCourseVideo() {
        return CourseVideo;
    }

    public String getCoursePPT() {
        return CoursePPT;
    }

    public String getCourseArticle() {
        return CourseArticle;
    }

    public String getCourseQA() {
        return CourseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "CourseVideo='" + CourseVideo + '\'' +
                ", CourseName='" + CourseName + '\'' +
                ", CoursePPT='" + CoursePPT + '\'' +
                ", CourseArticle='" + CourseArticle + '\'' +
                ", CourseQA='" + CourseQA + '\'' +
                '}';
    }

    public Course() {
    }
}
