package com.sgai.extendsLearn.extensExer2.circle;

/**
 * @author JaxZmy
 * @Description 圆类
 * @date 2022年02月22日 4:21 PM
 */
public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1;

    }

    public double findArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
