package com.sgai.polymorphic.student;

import com.sgai.polymorphic.person.Person;

/**
 * @author JaxZmy
 * @Description
 * @date 2022年02月25日 8:51 AM
 */
public class Student extends Person {
    protected String school = "pku";

    public String getInfo() {
        return "name" + name + "\nage" + age + "\nschool" + school;
    }
}
