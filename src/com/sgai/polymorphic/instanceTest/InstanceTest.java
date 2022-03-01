package com.sgai.polymorphic.instanceTest;

import com.sgai.polymorphic.graduate.Graduate;
import com.sgai.polymorphic.person.Person;
import com.sgai.polymorphic.student.Student;

/**
 * @author JaxZmy
 * @Description
 * @date 2022年02月25日 8:57 AM
 */
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest i1 = new InstanceTest();
        Person p1 = new Person();

        Person p2 = new Student();

        Person p3 = new Graduate();

        i1.print(p1);
        System.out.println("*******************");
        i1.print(p2);
        System.out.println("*******************");
        i1.print(p3);
    }

    public void print(Person person) {
        //这种调用方式即为虚拟方法调用
        System.out.println(person.getInfo());

        if (person instanceof Graduate) {
            System.out.println("a Graduate student");
            System.out.println("a student");
            System.out.println("a person");
            return;
        }
        if (person instanceof Student) {
            System.out.println("a student");
            System.out.println("a person");

            return;

        }
        if (person instanceof Person) {
            System.out.println("a person");

            return;
        }
    }
}
