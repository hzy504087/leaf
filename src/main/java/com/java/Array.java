package com.java;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        int[] a={11,12,213,43,564};
        System.out.println(Arrays.toString(a));
       Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a,11));
        //数组
        String[][] aa=new String[3][];
//        hzy[] hzy=new hzy[4];
        aa[0]=new String[]{"like","you","a bitch"};
        aa[1]=new String[]{"yhg","bitch","fool"};
        aa[2]=new String[]{"yhg","is","fool"};
//        aa[1]=new int[]{}
//        aa[2]=new int[]{};
        System.out.println(aa[1][0]+" "+aa[2][1]+"  "+aa[0][2]);
    }
}
class hzy{

}
