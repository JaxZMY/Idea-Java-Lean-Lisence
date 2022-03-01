package com.sgai.extendsLearn.extensExer3.test;

import com.sgai.extendsLearn.extensExer3.account.Account;
import com.sgai.extendsLearn.extensExer3.checkAccount.CheckAccount;

/**
 * @author JaxZmy
 * @Description
 * @date 2022年02月24日 9:04 AM
 */
public class Test {
    public static void main(String[] args) {
//        Account a1 = new Account(1122, 20000, 4.5);
//        a1.withdraw(2500);
//        System.out.println(a1.getBalance());
//        System.out.println("月利率为" + a1.getAnnualInterestRate());
//        a1.deposit(3000);

        CheckAccount c1 = new CheckAccount(1122, 20000, 0.045, 5000);
        c1.withdraw(5000);
        System.out.println("余额为" + c1.getBalance());
        System.out.println("可透支额度为" + c1.getOverdraft());
        c1.withdraw(18000);
        System.out.println("余额为" + c1.getBalance());
        System.out.println("可透支额度为" + c1.getOverdraft());
        c1.withdraw(3000);
        System.out.println("余额为" + c1.getBalance());
        System.out.println("可透支额度为" + c1.getOverdraft());
        System.out.println("月利率为"+c1.getAnnualInterestRate());

    }
}
