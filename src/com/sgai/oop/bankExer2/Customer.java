package com.sgai.oop.bankExer2;

/**
 * @author JaxZmy
 * @Description 用户类
 * @date 2022年02月18日 4:36 PM
 */
public class Customer {
    private String fistName;
    private String lastName;
    private Account account;

    public Customer(String f, String l) {
        this.fistName = f;
        this.lastName = l;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getFistName() {
        return fistName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }
}
