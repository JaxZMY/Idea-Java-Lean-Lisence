package com.sgai.extendsLearn.extensExer;

/**
 * @author JaxZmy
 * @Description 继承性联系父类ManKind
 * @date 2022年02月22日 3:55 PM
 */
public class ManKind {
    private int sex;
    private int salary;

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String manOrwoman() {
        return this.sex == 0 ? "woman" : "man";
    }

    public String employeed() {
        return this.salary == 0 ? "no job" : "job";
    }
}
