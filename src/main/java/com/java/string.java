package com.java;

public class string {
    public static void main(String[] args) {
        String s1="hzy";
        String s2="hzy";
        String s3="  hzy  ";
        System.out.println(s1.charAt(2));
        //提取下标
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));//不含大小写
        System.out.println(s1.indexOf("h")); //字符串有返回0，没有返回负一
        System.out.println(s1.replace("h","2"));//tihuan
        System.out.println(s1.startsWith("h"));//检测是否s开头
        System.out.println(s1.endsWith("y"));//jiewei
        System.out.println(s1.substring(1));//从1开始提取 =zy
        System.out.println(s3.trim());//去除空格
        System.out.println(s1.toLowerCase());//小写
        System.out.println(s1.toUpperCase());//da
    }
}
