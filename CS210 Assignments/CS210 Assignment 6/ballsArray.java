// Matthew Clark
// CS210 Building Java Programs
// Assigment 6 - Balls Array

/* This program creates 10 balls, assigns each ball a random color and speed. 
   In addition half of the balls will go left and right while the other half 
   go up and down. */
   
import java.awt.*;
import java.util.*;
public class ballsArray 
{  
   public static int width=800;
   public static int height=600;
   public static int ballSizeMax=70;  
   //how many balls?
   public static int howMany=10;
   //ball x axis
   public static int[] x = new int[howMany];
   //ball y axis
   public static int[] y = new int[howMany];
   //ball speed
   public static int[] s = new int[howMany];
   //ball direction
   public static String[] d = new String[howMany];
   //ball size
   public static int[] ballSize = new int[howMany];
   //ball color
   public static Color[] ballColor = new Color[howMany];  
   //generates color
   public static Color color() 
   {
         Random rand = new Random();
         int red = rand.nextInt(256);
         int green = rand.nextInt(256);
         int blue = rand.nextInt(256);
         Color ballColor = new Color(red, green, blue);
         return ballColor;
   }
   //gives the balls directions and color
   public static void main(String[] args) 
   { 
         DrawingPanel panel = new DrawingPanel(width, height);
         panel.setBackground(Color.LIGHT_GRAY);
         Graphics g = panel.getGraphics();        
         getInitialStatus();
      while(true) 
      {
            for(int i = 0; i < howMany; i++) 
            {
                  g.setColor(ballColor[i]);
               if(d[i] == "up") 
               {
                  y[i]-= s[i];
                  if(y[i] <= 0) 
                  {
                     d[i] = "down";
                  }
               }
               else if(d[i] == "down") 
               {
                     y[i]+= s[i];
                  if(y[i] >= height - ballSize[i]) 
                  {
                     d[i] = "up";
                  }
               }
               else if(d[i] == "right") 
               {
                     x[i]-= s[i];
                  if(x[i] <= 0) 
                  {
                     d[i] = "left";
                  }
               }
               else if(d[i] == "left") 
               {
                     x[i]+= s[i];
                  if(x[i] >= width - ballSize[i]) 
                  {
                     d[i] = "right";
                  }
               }
                  g.fillOval(x[i], y[i], ballSize[i], ballSize[i]);  
            }
            panel.sleep(100);
            g.clearRect(0,0,width,height);  
      }
   }
   //gives the balls their initial status
   public static void getInitialStatus()
   {
      Random rand = new Random();
      for(int i = 0; i < howMany; i++) 
      {
         if(i <= howMany / 2) 
         {
            d[i] = "up";
         }
         else if(i >= howMany / 2) 
         {
            d[i] = "right";
         }
         x[i] = rand.nextInt(width-ballSize[i]);
         y[i] = rand.nextInt(height-ballSize[i]);
         s[i] = rand.nextInt(30) + 1;
         ballSize[i] = rand.nextInt(ballSizeMax) + 20;
         ballColor[i] = color();                   
      }
   }
}

