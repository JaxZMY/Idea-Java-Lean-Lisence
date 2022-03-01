package com.sgai.toStringExer.GeometricObject;

/**
 * @author JaxZmy
 * @Description
 * @date 2022年02月25日 2:22 PM
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject() {
        this.setColor("white");
        this.setWeight(1.0);
    }

    protected GeometricObject(String color, double weight) {
        this.setColor(color);
        this.setWeight(weight);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
