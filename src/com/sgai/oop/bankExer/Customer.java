package com.sgai.oop.bankExer;

/**
 * @author JaxZmy
 * @Description 用户类
 * @date 2022年02月18日 3:35 PM
 */
public class Customer {


    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setAccount(int id, double balance, double ann) {
        /*
         * @Description: 设置账号信息
         * @author jaxZmy
         * @date  2022/2/18 3:42 PM
         * 方法说明
         * @param * @param com.sgai.extendsLearn.extensExer3.account:
         * @return * @return: void
         */
        Account account = new Account(id, balance, ann);
        this.account = account;

    }

    public Account getAccount() {
        /*
         * @Description: 输出账号信息
         * @author jaxZmy
         * @date  2022/2/18 3:42 PM
         * 方法说明
         * @param * @param com.sgai.extendsLearn.extensExer3.account:
         * @return * @return: void
         */

        return this.account;
    }

    public void printAccount() {
        /*
         * @Description:  输出账号信息
         * @author jaxZmy
         * @date  2022/2/18 4:11 PM
         * 方法说明
         * @param
         * @return * @return: void
         */
//        System.out.println("用户" + this.getFirstName() + "\t" + this.getLastName());
//        System.out.println("他有一个账户为" + this.getAccount().getId());
//        System.out.println("余额为" + this.getAccount().getBalance());
//        System.out.println("年利率为" + this.getAccount().getAnnualInteresRate());

        System.out.println("Customer [" + this.firstName + " " + this.lastName + "]" + " " + "has a com.sgai.extendsLearn.extensExer3.account: id is "
                + this.account.getId() + ",annualInteresRate is " + this.account.getAnnualInteresRate() + "%,"
                + "balance is " + this.account.getBalance());
    }
}
