package com.sgai.Packaging.PackagingExer;

import com.sgai.Packaging.test1.Packaging;

import java.util.Scanner;
import java.util.Vector;

/**
 * @author JaxZmy
 * @Description
 * @date 2022年02月28日 1:31 PM
 */
public class PackagingExer {
    Scanner scanner = new Scanner(System.in);
    Vector studentArr = new Vector<>();

    public void addStudent() {

        for (; ; ) {
            System.out.println("请输入学生成绩，输入负数结束");
            Integer i = scanner.nextInt();
            if (i >= 0) {
                this.studentArr.addElement(i);
            } else {
                System.out.println("输入结束，当前数组为" + studentArr.toString() + ",长度为" + studentArr.size());
                System.out.println("************************************************************************");
                this.printLevel();
                return;
            }
        }

    }

    public void printLevel() {
        Integer option = 0;
        for (int i = 0; i < this.studentArr.size(); i++) {
            int student = (int) this.studentArr.elementAt(i);
            if (option < student) {
                option = student;
            }
        }
        System.out.println("最高分为" + option);
        for (int i = 0; i < this.studentArr.size(); i++) {
            int student = (int) this.studentArr.elementAt(i);
            if (option - student < 10) {
                System.out.println("第" + (i + 1) + "个学生,成绩为A等");
            } else if (option - student >= 10 && option - student < 20) {
                System.out.println("第" + (i + 1) + "个学生,成绩为B等");
            } else if (option - student >= 20 && option - student < 30) {
                System.out.println("第" + (i + 1) + "个学生,成绩为C等");
            } else {
                System.out.println("第" + (i + 1) + "个学生,成绩为D等");

            }
        }
    }

    public static void main(String[] args) {
        PackagingExer p1 = new PackagingExer();
        p1.addStudent();

    }
}
