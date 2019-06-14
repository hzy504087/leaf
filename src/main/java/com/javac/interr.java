package com.javac;
//类没有多继承。接口有
public class interr {
    public static void main(String[] args) {
        Iner a=new in();
        a.night();
    }
}
interface Inte{
    int Abc=12;
    void leaf();
}
interface Iner{
    int yhg=13;
    void  night();
}
class in implements  Inte,Iner{


    @Override
    public void leaf() {
        System.out.println("yhg飞起来");
    }

    @Override
    public void night() {
        System.out.println("yhg跳起来");
    }
}
interface A{

    int yhg=11;
    String name="yhg";
    void t();
}
interface B{
    int hzy=14;
    String name="hzy";
    void aa();
}
interface gg extends A,B{
    void leaf();

}
class tes implements gg{


    @Override
    public void t() {

    }

    @Override
    public void aa() {

    }

    @Override
    public void leaf() {

    }
}