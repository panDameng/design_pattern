package com.design.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new PythonCourseFactory();
        Article article = courseFactory.getArticle();
        Video video = courseFactory.getVideo();
        video.produce();
        article.produce();
    }
}
