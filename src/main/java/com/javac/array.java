package com.javac;

public class array {
    public static void main(String[] args) {
        user[] aaa=new user[4];
        aaa[0]=new user(11,"hzy");
        aaa[1]=new user(11,"hzy");
        aaa[2]=new user(11,"hzy");
        aaa[3]=new user(11,"hzy");
        for(int i=0;i<aaa.length;i++){
            System.out.println(aaa[i].getSex()+"   " +aaa[i].getName());
        }
    }



}
class user{
    private int sex;
    private String name;

    public user(int sex, String name) {
        this.sex = sex;
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
