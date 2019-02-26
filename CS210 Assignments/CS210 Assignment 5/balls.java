// Matthew Clark
// CS210 Building Java Programs
// Assigment 5 - Balls

// For this assignment you are limited to the language features in Chapters 1-5 
// shown in lecture or the textbook.
import java.awt.*;
import java.util.*;

public class balls {
  //up & down
  public static int width = 800;
  public static int height = 600;
  public static int b1x;           
  public static int b1y;
  public static int b1s;
  public static int b1z;
  public static int b2x;
  public static int b2y;
  public static int b2s;
  public static int b2z;
  public static int b3x;
  public static int b3y;
  public static int b3s;
  public static int b3z;
  public static int b4x;
  public static int b4y;
  public static int b4s;
  public static int b4z;
  public static int b5x;
  public static int b5y;
  public static int b5s;
  public static int b5z;
  
  //left & right
  public static int b6x;           
  public static int b6y;
  public static int b6s;
  public static int b6z;
  public static int b7x;           
  public static int b7y;
  public static int b7s;
  public static int b7z;  
  public static int b8x;           
  public static int b8y;
  public static int b8s;
  public static int b8z;
  public static int b9x;           
  public static int b9y;
  public static int b9s;
  public static int b9z;
  public static int b10x;           
  public static int b10y;
  public static int b10s;
  public static int b10z;

  //up & down
  public static String b1d="down";
  public static String b2d="down";
  public static String b3d="down";
  public static String b4d="down";
  public static String b5d="down";
  
  //left & right
  public static String b6r="right";
  public static String b7r="right";
  public static String b8r="right";
  public static String b9r="right";
  public static String b10r="right";  
  
  //ball color
  public static Color b1c;
  public static Color b2c;
  public static Color b3c;
  public static Color b4c;
  public static Color b5c;
  public static Color b6c;
  public static Color b7c;
  public static Color b8c;
  public static Color b9c;
  public static Color b10c;
  
  public static void main(String[] args) {
    
        DrawingPanel panel = new DrawingPanel(width, height);
        panel.setBackground(Color.LIGHT_GRAY);
        Graphics g = panel.getGraphics();        
        getInitialStatus();
        
      while (true){    
         for (int i=1; i<=10; i++) {
         
         switch(i) {
           case 1:
                   if (b1d=="up") {
                     b1y-=b1s;
                    if (b1y<=0) {
                     b1d="down";
                    }
                    } else {
                    b1y+=b1s;
                    if (b1y>=height-b1z) {
                     b1d="up";
                    }
                    }
                    g.fillOval(b1x,b1y, b1z, b1z);
                    g.setColor(b1c);
                   break;
          case 2:
                   if (b2d=="up") {
                     b2y-=b2s;
                    if (b2y<=0) {
                     b2d="down";
                    }
                    } else {
                    b2y+=b2s;
                    if (b2y>=height-b2z) {
                     b2d="up";
                    }
                    }
                    g.fillOval(b2x,b2y, b2z, b2z);
                    g.setColor(b2c);
                   break;
          case 3:
                   if (b3d=="up") {
                     b3y-=b3s;
                    if (b3y<=0) {
                     b3d="down";
                    }
                    } else {
                    b3y+=b3s;
                    if (b3y>=height-b3z) {
                     b3d="up";
                    }
                    }
                    g.fillOval(b3x,b3y, b3z, b3z);
                    g.setColor(b3c);
                   break;
          case 4:
                   if (b4d=="up") {
                     b4y-=b4s;
                    if (b4y<=0) {
                     b4d="down";
                    }
                    } else {
                    b4y+=b4s;
                    if (b4y>=height-b4z) {
                     b4d="up";
                    }
                    }
                   g.fillOval(b4x,b4y, b4z, b4z);
                   g.setColor(b4c);                    
                   break;
           case 5:
                   if (b5d=="up") {
                     b5y-=b5s;
                    if (b5y<=0) {
                     b5d="down";
                    }
                    } else {
                    b5y+=b5s;
                    if (b5y>=height-b5z) {
                     b5d="up";
                    }
                    }
                    g.fillOval(b5x,b5y, b5z, b5z);
                    g.setColor(b5c);
                   break;
           case 6:
                   if (b6r=="right") {
                     b6x-=b6s;
                    if (b6x<=0) {
                     b6r="left";
                    }
                    } else {
                    b6x+=b6s;
                    if (b6x>=width-b6z) {
                     b6r="right";
                    }
                    }
                    g.fillOval(b6x,b6y, b6z, b6z);
                    g.setColor(b6c);
                   break;
           case 7:
                   if (b7r=="right") {
                     b7x-=b7s;
                    if (b7x<=0) {
                     b7r="left";
                    }
                    } else {
                    b7x+=b7s;
                    if (b7x>=width-b7z) {
                     b7r="right";
                    }
                    }
                    g.fillOval(b7x,b7y, b7z, b7z);
                    g.setColor(b7c);
                   break;
           case 8:
                   if (b8r=="left") {
                     b8x-=b8s;
                    if (b8x<=0) {
                     b8r="right";
                    }
                    } else {
                    b8x+=b8s;
                    if (b8x>=width-b8z) {
                     b8r="left";
                    }
                    }
                    g.fillOval(b8x,b8y, b8z, b8z);
                    g.setColor(b8c);
                   break;
           case 9:
                   if (b9r=="left") {
                     b9x-=b9s;
                    if (b9x<=0) {
                     b9r="right";
                    }
                    } else {
                    b9x+=b9s;
                    if (b9x>=width-b9z) {
                     b9r="left";
                    }
                    }
                    g.fillOval(b9x,b9y, b9z, b9z);
                    g.setColor(b9c);
                   break;                                                                            
           case 10:
                   if (b10r=="left") {
                     b10x-=b10s;
                    if (b10x<=0) {
                     b10r="right";
                    }
                    } else {
                    b10x+=b10s;
                    if (b10x>=width-b10z) {
                     b10r="left";
                    }
                    }
                    g.fillOval(b10x,b10y, b10z, b10z);
                    g.setColor(b10c);
                   break;
          }
         }

       panel.sleep(100);
       g.clearRect(0,0,width,height);  
     }
    }
    
    public static void getInitialStatus(){
    
     Random rand = new Random();
     
     //up & down
     b1x=rand.nextInt(width-b1z);
     b2x=rand.nextInt(width-b2z);
     b3x=rand.nextInt(width-b3z);
     b4x=rand.nextInt(width-b4z);
     b5x=rand.nextInt(width-b5z);
     
     //left & right
     b6y=rand.nextInt(height-b6z);
     b7y=rand.nextInt(height-b7z);
     b8y=rand.nextInt(height-b8z);
     b9y=rand.nextInt(height-b9z);
     b10y=rand.nextInt(height-b10z);
     
     //up & down
     b1y=0;
     b2y=0;
     b3y=0;
     b4y=0;
     b5y=0;
     
     //left & right
     b6x=0;
     b7x=0;
     b8x=0;
     b9x=0;
     b10x=0;
     
     //random ball speed     
     b1s=rand.nextInt(30)+1;
     b2s=rand.nextInt(30)+1;
     b3s=rand.nextInt(30)+1;
     b4s=rand.nextInt(30)+1;
     b5s=rand.nextInt(30)+1;
     b6s=rand.nextInt(30)+1;
     b7s=rand.nextInt(30)+1;
     b8s=rand.nextInt(30)+1;
     b9s=rand.nextInt(30)+1;
     b10s=rand.nextInt(30)+1;
     
     //random ball size
     Random ballSize = new Random();
               
     b1z=ballSize.nextInt(50)+20;
     b2z=ballSize.nextInt(50)+20;
     b3z=ballSize.nextInt(50)+20;
     b4z=ballSize.nextInt(50)+20;
     b5z=ballSize.nextInt(50)+20;
     b6z=ballSize.nextInt(50)+20;
     b7z=ballSize.nextInt(50)+20;
     b8z=ballSize.nextInt(50)+20;
     b9z=ballSize.nextInt(50)+20;
     b10z=ballSize.nextInt(50)+20;
     
     //random ball color
     Random ballColor = new Random();
     
     b1c = new Color(ballColor.nextInt(255) + 1, ballColor.nextInt(255) + 1, ballColor.nextInt(255) + 1);
     b2c = new Color(ballColor.nextInt(255) + 1, ballColor.nextInt(255) + 1, ballColor.nextInt(255) + 1);
     b3c = new Color(ballColor.nextInt(255) + 1, ballColor.nextInt(255) + 1, ballColor.nextInt(255) + 1);
     b4c = new Color(ballColor.nextInt(255) + 1, ballColor.nextInt(255) + 1, ballColor.nextInt(255) + 1);
     b5c = new Color(ballColor.nextInt(255) + 1, ballColor.nextInt(255) + 1, ballColor.nextInt(255) + 1);
     b6c = new Color(ballColor.nextInt(255) + 1, ballColor.nextInt(255) + 1, ballColor.nextInt(255) + 1);
     b7c = new Color(ballColor.nextInt(255) + 1, ballColor.nextInt(255) + 1, ballColor.nextInt(255) + 1);
     b8c = new Color(ballColor.nextInt(255) + 1, ballColor.nextInt(255) + 1, ballColor.nextInt(255) + 1);
     b9c = new Color(ballColor.nextInt(255) + 1, ballColor.nextInt(255) + 1, ballColor.nextInt(255) + 1);
     b10c = new Color(ballColor.nextInt(255) + 1, ballColor.nextInt(255) + 1, ballColor.nextInt(255) + 1);
     
    }
}

