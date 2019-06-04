
import java.awt.*;
import javax.swing.*;

public class ball extends JFrame{
    Image li= Toolkit.getDefaultToolkit().getImage("image/image.png");
    Image liln= Toolkit.getDefaultToolkit().getImage("image/kife.jpg");
    //画窗口的方法
        double x=100;
        double y=100;
        boolean right=true;
    @Override
    public void paint(Graphics g) {
        System.out.println("one");
        g.drawImage(liln,0,0,null);
        g.drawImage(li,(int)x,(int)y,null);

        if(right){
            x=x+10;
        }else{
            x=x-10;
        }
        if(x>500-40-30){
            right=false;
        }
        if(x<40){
            right=true;
       }
    }

    void launchFame(){
        setSize(600,356);
        setLocation(50,50);
        setVisible(true);
        while(true){
            repaint();
            try{
               Thread.sleep(40);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("kasih");
        ball game=new ball();
        game.launchFame();
    }
}











