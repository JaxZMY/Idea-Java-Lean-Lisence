package com.sgai.singleton.hungryMode;

/**
 * @author JaxZmy
 * @Description 单例模式
 * 所谓类的单例设计模式，就是采取一定的方法使得在整个系统中，某个类只能存在一个对象实例；
 * 饿汉式
 * @date 2022年03月01日 1:56 PM
 */
public class HungryMode {
    public static void main(String[] args) {
        Hungry h1 = Hungry.getInstance();
        Hungry h2 = Hungry.getInstance();
        System.out.println(h1 == h2);
    }
}

class Hungry{
    /*
      * @Description:
      * 饿汉式一开始就声明好对象
      *
      * 私有化构造器
      * 建立静态变量出事化对象
      * 建立静态方法返回对象
      *
      * @author jaxZmy
      * @date  2022/3/1 1:59 PM
      * 方法说明
      * @param
      * @return * @return: null
     */
    private Hungry(){

    }

    private static Hungry instance = new Hungry();

    public static Hungry getInstance(){
        return instance;
    }
}
