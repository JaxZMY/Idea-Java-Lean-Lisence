package com.sgai.oop.bankExer;

import javax.management.RuntimeErrorException;

/**
 * @author JaxZmy
 * @Description 创建测试账号类
 * @date 2022年02月18日 3:15 PM
 */
public class Account {
    private int id;
    private double balance;//余额
    private double annualInteresRate;//年利率

    public Account(int id) {
        this.setId(id);
    }

    public Account(int id, double balance) {
        this(id);
        this.setBalance(balance);
    }

    public Account(int id, double balance, double annualInteresRate) {
        this(id, balance);
        this.setAnnualInteresRate(annualInteresRate);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualInteresRate(double annualInteresRate) {
        this.annualInteresRate = annualInteresRate;
    }

    public double getAnnualInteresRate() {
        return annualInteresRate;
    }

    public double withdraw(double ammount) {
        /*
         * @Description: 取钱方法
         * @author jaxZmy
         * @date  2022/2/18 3:22 PM
         * 方法说明
         * @param * @param ammount: 取钱金额
         * @return * @return: void
         */
        if (ammount < 0 || this.balance - ammount < 0) {
            System.err.println("余额不足，请充值！");
        } else {
            this.balance -= ammount;

        }
        return this.getBalance();
    }

    public double desposit(double ammount) {
        /*
         * @Description:  存钱方法
         * @author jaxZmy
         * @date  2022/2/18 3:22 PM
         * 方法说明
         * @param * @param ammount: 存入金额
         * @return * @return: void
         */
        if (ammount > 0) {
            this.balance += ammount;
        } else {
            System.err.println("存入金额不能为负数！");
        }

        return this.getBalance();
    }

}
