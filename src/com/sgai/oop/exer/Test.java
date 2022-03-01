package com.sgai.oop.exer;

public class Test {
    public static void main(String[] args) {
        Boy b1 = new Boy("罗密欧", 23);
        Girl g1 = new Girl("朱丽叶", 25);
        g1.marry(b1);
        Girl g2 = new Girl("祝英台", 22);
        b1.toString();
    }
}
