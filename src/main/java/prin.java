import java.util.*;
import java.text.*;
import java.util.regex.*;
public class prin {

    private int sno;
    private String name;
    private int sex;

    public prin(int sno, String name, int sex) {
        this.sno = sno;
        this.name = name;
        this.sex = sex;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    @Override
    public String toString() {
        return "prin{" +
                "sno=" + sno +
                '}';
    }

    public prin() {
        super();
    }

    public static void main(String args[]){

      Date date= new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
        System.out.println(date);

    }
}
