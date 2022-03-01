package com.sgai.oop.bankExer2;

/**
 * @author JaxZmy
 * @Description 银行类
 * @date 2022年02月18日 4:39 PM
 */
public class Bank {
    private Customer[] Customers;
    private int numberOfCustomer;

    public Bank() {
        this.Customers = new Customer[10];
    }

    public void addCustomer(String firtName, String lastName) {
        Customer cust = new Customer(firtName, lastName);
        this.Customers[numberOfCustomer] = cust;
        this.numberOfCustomer++;

    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public Customer getCustomer(int index) {
        if (index >= 0 && index < this.numberOfCustomer) {
            return this.Customers[index];
        }
        return null;
    }
}
