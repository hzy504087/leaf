package com.java;

import com.javac.yhg;
//enter alt
//import com.javac.yhg;
//获取定义的变量类
public class leaf {
    public static void main(String[] args) {
        yhg yhg=new yhg();
        yhg.name="leaf";
        yhg.aaa=true;
        System.out.println(yhg.aaa);
//        Abc abc=new Abc();
//        abc.name="huangzi";
//        System.out.println(abc instanceof Leaf);
//        abc.rest();
        Leaf a=new Leaf();
        a.rest();
    }


}
class Leaf{
    String name;
    int height;
    public void rest(){
        System.out.println("leaf");
    }
}
//class Abc extends Leaf{
//    String sex;
//    public void abcq(){
//        System.out.println("=====");
//    }
//}



