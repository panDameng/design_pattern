package com.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
       Course course = new JavaDiscountCourse(100, "设计模式", 200.00);
       JavaDiscountCourse javaDisCountCourse = (JavaDiscountCourse) course;
       System.out.println("id:"+ course.getId() + " 课程名：" + course.getName() + " 价格：" + course.getPrice() + " 原价格：" +javaDisCountCourse.getOriginalPrice());
      //  System.out.println("id:"+ javaDisCountCourse.getId() + " 课程名：" + javaDisCountCourse.getName() + " 折后价：" + javaDisCountCourse.getPrice() + " 原价格：" +javaDisCountCourse.getOriginalPrice());
    }
}
