package com.sgai.staticExer.Bank;

import org.junit.Test;

/**
 * @author JaxZmy
 * @Description static的使用 银行类
 * @date 2022年03月01日 10:31 AM
 */
public class Bank {
    private int account;
    private String password;
    private double balance;
    private double minBalance;
    public static double rate;


    public Bank() {
        //生成随机账号;
        this.setAccount();
        this.setBalance(0.0);
        this.setMinBalance(0.0);
        this.setPassword("000000");
        setRate(4.3);
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Bank.rate = rate;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount() {
        this.account = (int) (Math.random() * 9 + 1) * 100000;
        ;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    @Test
    public void testAccount() {
        Bank b1 = new Bank();
        System.out.println(b1.account);
        System.out.println(b1.balance);
        System.out.println(b1.minBalance);
        Bank.setRate(5.3);
        System.out.println(Bank.getRate());
    }
}
