// Matthew Clark
// CS210 Building Java Programs
// Assignment 3 - Balls

import java.awt. *; import java.util. *; import java.util.ArrayList;
public class balls 
{   
   public static int width = 800;  public static int height = 600;
   public static int howMany = 20; public static int ballSizeMax = 70;
	public static ArrayList<movingObject> balls = new ArrayList<movingObject>();
   //This method sends the balls up and down.
   public static void main(String[] args) 
   {
         DrawingPanel panel = new DrawingPanel(width, height);
      	panel.setBackground(Color.LIGHT_GRAY);
      	Graphics g = panel.getGraphics();
      	getInitialStatus();
      while (true) 
      {    
         for (movingObject ball : balls) 
         {
            g.setColor(ball.color);
               if (ball.direction.equals("down")) 
               {
                  ball.y+= ball.speed;
                  if (ball.y > height-ball.size) 
                  {
                     ball.direction = "up";
                  }
               } 
               else 
               {
                  ball.y-= ball.speed;
                  if (ball.y < 0) 
                  {
                     ball.direction = "down";
                  }
               }
               g.fillOval(ball.x, ball.y, ball.size, ball.size);
         }
         panel.sleep(50);
         g.clearRect(0, 0, width, height);
      }
   }
   //This method generates random attributes of each ball.
   public static void getInitialStatus() 
   {
      Random rand = new Random();    
      for (int i = 0; i < howMany; i++) 
      {  
         movingObject ball = new movingObject();
         ball.x = rand.nextInt(width);
         ball.y = rand.nextInt(height);
         ball.size = rand.nextInt(ballSizeMax);
         ball.speed = rand.nextInt(20) + 10;
         ball.direction = rand.nextBoolean() ? "up" : "down";
         ball.color = getColor(rand);
         balls.add(ball);
      }
   }
   //This method generates random colors.
   public static Color getColor(Random rand) 
   {
      Color myColor = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
	   return myColor;
   } 
}
//This class holds all of the variables for the program.
class movingObject 
{ 
   int x; 
   int y; 
   int size; 
   int speed;
   String direction; 
   Color color; 
}
