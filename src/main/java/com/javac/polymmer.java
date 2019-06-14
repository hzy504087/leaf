package com.javac;

public class polymmer {
    public static void main(String[] args) {
        donwu ff=new donwu();

        ff.a();
        cat fff=new cat();
        gg(fff);

    }
    static void gg(donwu ff){
        ff.a();
    }

}
class donwu{
    public void a(){
        System.out.println("111");
    }

}
class cat extends donwu{
    public void a(){
        System.out.println("222");
    }

}
class dog extends donwu{
    public  void a(){
        System.out.println("333");
    }
}
