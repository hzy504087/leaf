import java.util.Scanner;

public class yhg {
    public static void main(String[] args) {
//        Scanner yhg=new Scanner(System.in);
//        String name=yhg.nextLine();
//        int sex=yhg.nextInt();
//        System.out.println(name);
        Integer a=10;
        int b=a+10;
        double bb=90;
        int c=a;
        System.out.println(b);
//        角度转化为弧度
        double i=Math.toRadians(bb);
//        弧度转角度
        double aa=Math.toDegrees(i);
        System.out.println(i);
        System.out.println(aa);
        System.out.println(Math.atan2(i,aa));
        if(Character.isLetter('c')){
            System.out.println(a);

        }
    }
}
