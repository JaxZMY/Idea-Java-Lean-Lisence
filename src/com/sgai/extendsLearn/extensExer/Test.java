package com.sgai.extendsLearn.extensExer;

/**
 * @author JaxZmy
 * @Description
 * @date 2022年02月22日 4:08 PM
 */
public class Test {
    public static void main(String[] args) {
        Kids k1 = new Kids(1, 1000);
        k1.yearsOld = 15;
        k1.printAge();
        k1.employeed();
        System.out.println(k1.getSalary());
        System.out.println(k1.employeed());

    }
}
