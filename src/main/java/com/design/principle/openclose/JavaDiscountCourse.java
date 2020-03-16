package com.design.principle.openclose;

public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public JavaDiscountCourse() {
        super();
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }

    public Double getOriginalPrice(){
        return super.getPrice();
    }
}
