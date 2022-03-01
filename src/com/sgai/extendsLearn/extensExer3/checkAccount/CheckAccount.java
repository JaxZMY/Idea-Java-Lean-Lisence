package com.sgai.extendsLearn.extensExer3.checkAccount;

import com.sgai.extendsLearn.extensExer3.account.Account;

/**
 * @author JaxZmy
 * @Description 创建 Account 类的一个子类 CheckAccount 代表可透支的账户，该账户中定义一个属性
 * overdraft 代表可透支限额。
 * @date 2022年02月24日 9:09 AM
 */
public class CheckAccount extends Account {
    private double overdraft;


    public CheckAccount(double overdraft) {
        this.overdraft = overdraft;
    }

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    /*
     * @Description:重写父类Account的取款方法
     * @author jaxZmy
     * @date  2022/2/24 9:11 AM
     * 方法说明
     * @param * @param ammount:
     * @return * @return: void
     */
    public void withdraw(double ammount) {
        if (ammount < 0) {
            System.err.println("金额不合法");
            return;
        }
        if (super.balance >= ammount) {
            //余额足够
            super.withdraw(ammount);
        } else if (this.overdraft >= ammount - getBalance()) {
            this.overdraft -= ammount - super.balance;
            super.withdraw(super.balance);
        } else {
            System.err.println("余额不足！");
        }
    }


}
