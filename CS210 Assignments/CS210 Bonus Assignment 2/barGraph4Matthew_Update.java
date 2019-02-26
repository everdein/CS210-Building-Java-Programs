// Matthew Clark
// CS210 Building Java Programs
// Bonus Assigment 1 - Bar Graph

import java.awt.*;
import java.util.*;
      
public class barGraph4Matthew_Update{    
    
  public static int[] count = new int[11];
  public static int number; 
    
  public static void main(String[] args) {

   Random rand = new Random();
   int width=1000;
   int height=300;
   int howMany = 1000;
   
      DrawingPanel panel = new DrawingPanel(1000, 400);
      Graphics g = panel.getGraphics();
      panel.setBackground(Color.RED);
      g.setFont(new Font("Monospaced",Font.BOLD + Font.ITALIC, 36)); 

      for(int i=1; i<=howMany; i++){
        number = rand.nextInt(10);
        count[number]++;
          
        for (int j=0; j<10; j++){ 
          g.setColor(Color.GREEN);
          g.fillRect(100*j,300-2*count[j],80,2*count[j]);
          int x=100*j;
          int y= 300-2*count[j];
          int h=count[j];
          g.drawString(" "+h, x,y);
          g.setColor(Color.WHITE);
          g.drawString(" "+j, x,340);
        }
       
         panel.sleep(5);
         g.clearRect(0,0,width,400); 
      }
   
       for(int i=1; i<=howMany; i++){
        number = rand.nextInt(10); 
        count[number]--;
        
        for (int j=0; j<10; j++){ 
          g.setColor(Color.GREEN);
          g.fillRect(100*j,300-2*count[j],80,2*count[j]);
          int x=100*j;
          int y= 300-2*count[j];
          int h=count[j];
          g.drawString(" "+h, x,y);
          g.setColor(Color.WHITE);
          g.drawString(" "+j, x,340);
        }
       
         panel.sleep(5);
         g.clearRect(0,0,width,400); 
      }
   }
}
