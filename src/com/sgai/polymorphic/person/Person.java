package com.sgai.polymorphic.person;

/**
 * @author JaxZmy
 * @Description
 * @date 2022年02月25日 8:51 AM
 */
public class Person {
    protected String name = "person";
    protected int age = 50;

    public String getInfo() {
        return "name" + name + "\n" + "age" + age;
    }
}
