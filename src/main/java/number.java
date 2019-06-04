

public class number {
    public static void main(String[] args) {
        number bm=new number();
        bm.print();
       int c= bm.add(30,40,50)+100;
        System.out.println(c);
        b();

    }
    void  print(){
        System.out.println("one");
    }
    int add(int a, int b ,int c){
        int sum= a+b+c;
        System.out.println(sum);
        return sum;
    }
    static int count=0;
    static void b(){
        System.out.println("a");
        count++;
        if(count<10){
            b();
        }else{
            return;
        }

    }
    static void a(){
        System.out.println("b");
    }
}
