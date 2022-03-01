package com.sgai.extendsLearn.extensExer3.account;

/**
 * @author JaxZmy
 * @Description 写一个名为 Account 的类模拟账户。该类的属性和方法如下图所示。该类包括的属性：
 * 账号 id，余额 balance，年利率 annualInterestRate；
 * @date 2022年02月24日 8:54 AM
 */
public class Account {
    private int id;
    protected double balance;
    private double annualInterestRate;

    public Account() {

    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /*
     * @Description:   返回月利率
     * @author jaxZmy
     * @date  2022/2/24 9:44 AM
     * 方法说明
     * @param
     * @return * @return: double
     */
    public double getAnnualInterestRate() {
        return annualInterestRate / 12;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /*
     * @Description:   返回月利率的方法
     * @author jaxZmy
     * @date  2022/2/24 8:59 AM
     * 方法说明
     * @param
     * @return * @return: void
     */
    public void getMonthlyInterest() {

    }

    /*
     * @Description:   取款方法
     * @author jaxZmy
     * @date  2022/2/24 8:58 AM
     * 方法说明
     * @param
     * @return * @return: void
     */
    public void withdraw(double ammount) {
        if (ammount < 0 || ammount > this.balance) {
            System.err.println("金额不合法！");
            return;
        }
        this.balance -= ammount;
    }

    /*
     * @Description:   存款方法
     * @author jaxZmy
     * @date  2022/2/24 8:58 AM
     * 方法说明
     * @param
     * @return * @return: void
     */
    public void deposit(double ammount) {
        if (ammount < 0) {
            System.err.println("金额不合法！");
            return;
        }
        System.out.println("存款成功" + (this.balance += ammount));

    }
}
