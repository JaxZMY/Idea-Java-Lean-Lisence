package com.sgai.oop.bankExer2;

/**
 * @author JaxZmy
 * @Description 账号类
 * @date 2022年02月18日 4:28 PM
 */
public class Account {
    private double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void widraw(double ammount) {
        if (this.balance - ammount > 0) {
            this.balance -= ammount;
            System.out.println("取款" + ammount + "成功,余额" + this.balance);
        } else {
            System.err.println("余额不足，取款失败");
        }
    }

    public void deposit(double ammount) {
        this.balance += ammount;
    }

}
