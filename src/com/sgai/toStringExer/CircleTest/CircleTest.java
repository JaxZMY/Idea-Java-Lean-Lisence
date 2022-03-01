package com.sgai.toStringExer.CircleTest;

import com.sgai.toStringExer.Circle.Circle;
import com.sgai.toStringExer.GeometricObject.GeometricObject;

/**
 * @author JaxZmy
 * @Description
 * @date 2022年02月25日 2:30 PM
 */
public class CircleTest {
    public static void main(String[] args) {
        GeometricObject g1 = new Circle();
        GeometricObject g2 = new Circle();
        System.out.println(g1.equals(g2));
        System.out.println("***");
        System.out.println(g2.equals(g1));
        System.out.println("****");
        System.out.println(g1.toString());
        System.out.println("******");
        System.out.println(g2.toString());

    }
}
