package com.javac;

public abstract class ab {
    abstract public void shout();

    public void run(){
        System.out.println("aaa1");
    }

    public static void main(String[] args) {
        ab aa=new h();
        aa.run();
    }
}

class h extends ab{

    @Override
    public void shout() {
        System.out.println("aaa");
    }
}
