package com.sgai.polymorphic.graduate;

import com.sgai.polymorphic.student.Student;

/**
 * @author JaxZmy
 * @Description
 * @date 2022年02月25日 8:52 AM
 */
public class Graduate extends Student {
    public String major = "it";

    public String getInfo() {
        return "name" + name + "\nage" + age + "\nschool" + school + "\nmajor" + major;
    }
}
