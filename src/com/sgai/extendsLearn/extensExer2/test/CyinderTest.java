package com.sgai.extendsLearn.extensExer2.test;

import com.sgai.extendsLearn.extensExer2.cyinder.Cyinder;

/**
 * @author JaxZmy
 * @Description
 * @date 2022年02月22日 4:28 PM
 */
public class CyinderTest {
    public static void main(String[] args) {
        Cyinder c1 = new Cyinder();
        c1.setLenth(10);
        c1.setRadius(20);
        System.out.println(c1.findVoolume());
    }
}
