package com.sgai.oop.exer;

/**
 *
 */
public class Boy {
    private String name;
    private int age;

    public Boy() {

    }

    public Boy(String name) {
        this.setName(name);
    }

    public Boy(int age) {
        this.setAge(age);
    }

    public Boy(String name, int age) {
        this(name);
        this.setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Girl girl) {
        System.out.println("男方" + this.name + "想要娶女方" + girl.getName());
    }
}
