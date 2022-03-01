package com.sgai.extendsLearn.extensExer;

/**
 * @author JaxZmy
 * @Description
 * @date 2022年02月22日 3:56 PM
 */
public class Kids extends ManKind {
    public int yearsOld;

    public Kids(int sex, int salary) {
        super(sex, salary);
    }

    public void printAge() {
        System.out.println(this.yearsOld);
    }

    @Override
    public String employeed() {
        return "kids should study and no job";
    }


}
