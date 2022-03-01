package com.sgai.singleton.SlackerMode;

/**
 * @author JaxZmy
 * @Description 单例模式懒汉式
 * @date 2022年03月01日 1:59 PM
 */
public class SlackerMode {
    public static void main(String[] args) {
        Slacker s1 = Slacker.getInstance();
        Slacker s2 = Slacker.getInstance();
        System.out.println(s1 == s2);
    }
}
class Slacker{
    /*
      * @Description:   懒汉式创建对象
      *
      * 1、私有化构造器
      * 2、声明静态变量赋值为Null
      * 3、声明静态方法初始化对象，如果对象已经存在则直接返回
      * @author jaxZmy
      * @date  2022/3/1 2:04 PM
      * 方法说明
      * @param * @param null:
      * @return * @return: null
     */
    private Slacker(){}

    public static Slacker instance = null;
    public static Slacker getInstance(){
        if (instance == null){
            instance = new Slacker();
            return instance;
        }
        return instance;
    }
}