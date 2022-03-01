package com.sgai.oop.exer;

public class Girl {
    private String name;
    private int age;

    public Girl() {

    }

    public Girl(String name) {
        //构造器输出name
        this.setName(name);
    }

    public Girl(int age) {
        this.setAge(age);
    }

    public Girl(String name, int age) {
        this(name);
        this.setAge(age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void marry(Boy boy) {
        System.out.println("女方" + this.name + "想要嫁给" + "男方" + boy.getName());
        boy.marry(this);
    }

    public int compare(Girl girl) {
        return this.age - girl.getAge();
    }

}
