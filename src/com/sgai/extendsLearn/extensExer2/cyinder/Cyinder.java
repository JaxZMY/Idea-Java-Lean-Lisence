package com.sgai.extendsLearn.extensExer2.cyinder;

import com.sgai.extendsLearn.extensExer2.circle.Circle;

/**
 * @author JaxZmy
 * @Description 圆柱类继承自圆类
 * @date 2022年02月22日 4:22 PM
 */
public class Cyinder extends Circle {
    private double lenth;

    public Cyinder() {
        this.lenth = 1;
    }

    public double findVoolume() {
        return this.findArea() * this.lenth;
    }

    public double getLenth() {
        return lenth;
    }

    public void setLenth(double lenth) {
        this.lenth = lenth;
    }
}
