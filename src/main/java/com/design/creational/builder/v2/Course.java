package com.design.creational.builder.v2;

public class Course {
    private String courseVideo;
    private String courseName;
    private String coursePPT;
    private String courseArticle;
    private String courseQA;

    public Course(CourseBuilder courseBuilder) {
        this.courseArticle = courseBuilder.courseArticle;
        this.courseName = courseBuilder.courseName;
        this.coursePPT = courseBuilder.coursePPT;
        this.courseQA = courseBuilder.courseQA;
        this.courseVideo = courseBuilder.courseVideo;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseVideo='" + courseVideo + '\'' +
                ", courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }

    public static class CourseBuilder{
        private String courseVideo;
        private String courseName;
        private String coursePPT;
        private String courseArticle;
        private String courseQA;


        public CourseBuilder buildCourseName(String courseName){
            this.courseName = courseName;
            return this;
        };
        public CourseBuilder buildCourseVideo(String courseVideo){
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder buildCoursePPT(String coursePPT){
            this.coursePPT = coursePPT;
            return this;
        }
        public CourseBuilder buildCourseArticle(String courseArticle){
            this.courseArticle = courseArticle;
            return this;
        }
        public CourseBuilder buildCourseQA(String courseQA){
            this.courseQA = courseQA;
            return this;
        }

        public Course makeCourse(){
            return new Course(this);
        }
    }
}
