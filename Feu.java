package feu;
import java.awt.*;

public class Feu extends Thread {

       private int num;
       private Color clr;
       int x,y,duree;
       
       public Feu(int num, Color clr, int duree, int x, int y) {
             this.num = num;
             this.clr = clr;
             this.x = x;
             this.y = y;
       }
       
       public Feu(int i, Color green, int j, int k) {
		// TODO Auto-generated constructor stub
	}

	public int getNum() {
             return num;
       }
       
       public void setId(int num) {
             this.num = num;
       }
       
       public Color getClr() {
             return clr;
       }
       
       public void setClr(Color clr) {
             this.clr = clr;
       }
       
       public int getX() {
             return x;
       }
       
       public void setX(int x) {
             this.x = x;
       }
       
       public int getY() {
             return y;
       }
       
       public void setY(int y) {
             this.y = y;
       }
       
       
       public void run()
       {
             while(true)
             {


             
             try {
                    sleep(duree);
             } catch (InterruptedException e) {
                    e.printStackTrace();
             }
             if(clr==Color.red)
                    clr=Color.green;
             else
                    clr=Color.red;
             try {
                    sleep(duree);
             } catch (InterruptedException e) {
                    e.printStackTrace();
             }
             if(clr==Color.red)
                    clr=Color.green;
             else
                    clr=Color.red;
             
             }
       }
}

