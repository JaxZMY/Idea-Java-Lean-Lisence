package com.sgai.oop.bankExer2;

/**
 * @author JaxZmy
 * @Description
 * @date 2022年02月18日 4:46 PM
 */
public class BankTest {
    public static void main(String[] args) {
        Bank c1 = new Bank();
        c1.addCustomer("三", "张");
        c1.getCustomer(0).setAccount(new Account(1000.0));
        c1.getCustomer(0).getAccount().widraw(500.0);
    }
}
