package com.sgai.oop.bankExer;

/**
 * @author JaxZmy
 * @Description 测试银行
 * @date 2022年02月18日 3:30 PM
 */
public class bankTest {
    public static void main(String[] args) {
        /*
         * @Description:  账户信息输出测试
         * @author jaxZmy
         * @date  2022/2/18 4:13 PM
         * 方法说明
         * @param * @param args:
         * @return * @return: void
         */
        //创建用户
        Customer james = new Customer("james", "Smith");
        //创建账户
        james.setAccount(1000, 2000.0, 1.23);
        //输出账号信息
        james.printAccount();
        //存入100
        james.getAccount().desposit(100);
        System.out.println("成功存入" + 100);
        //取出960
        james.getAccount().withdraw(960);
        System.out.println("成功取出" + 960);
        //取出非法数值
        james.getAccount().withdraw(2000);
        //输出账户信息
        james.printAccount();

    }
}
