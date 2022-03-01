package com.sgai.toStringExer.Circle;

import com.sgai.toStringExer.GeometricObject.GeometricObject;

import java.util.Objects;

/**
 * @author JaxZmy
 * @Description
 * @date 2022年02月25日 2:22 PM
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        this.setRadius(1.0);
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //计算面积方法
    public double findArea() {
        return Math.PI * this.getRadius() * this.getRadius();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getRadius(), getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
