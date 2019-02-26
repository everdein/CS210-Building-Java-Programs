// Matthew Clark
// CS210 Building Java Programs
// Assignment 2 - Rocket Ship

// This program creates a detailed rocketship that can be resized.
public class RocketShip 
{
    public static final int HEIGHT = 3;    
    public static void main (String[] args) 
    {
        drawCone();
        drawLine();
        drawTriangleUpBox();
        drawTriangleDownBox();
        drawLine();
        drawTriangleDownBox();
        drawTriangleUpBox();
        drawLine();
        drawCone();
    }
    //produces a cone that is used for the tip of the rocketship and the fire at the bottom.   
    public static void drawCone() 
    {   
        for(int line = 1; line <= 2 * HEIGHT - 1; line++)
        { 
            
            for(int space = 1; space <= 2 * HEIGHT - line; space++) 
            {
                System.out.print(" ");
            }
            for(int fslash = 1; fslash <= line; fslash++) 
            {
                System.out.print("/");
            }
            for(int star = 1; star <= 0 * line + 2; star++) 
            {
                System.out.print("*");     
            }
            for(int bslash = 1; bslash <= line; bslash++) 
            {
                System.out.print("\\");
            }
            for(int spaces = 1; spaces <= (2 * HEIGHT) - (2 * line); spaces++) 
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }    
    //produces a the top and bottom line of the boxes that create the body of the rocket ship   
    public static void drawLine() 
    {   
        System.out.print("+");
        for(int equalstar = 1; equalstar <= HEIGHT * 2; equalstar++) 
        {
            System.out.print("=*");
        }    
        System.out.println("+");        
    }
    //produces a part of the box with the /\'s pattern
    public static void drawTriangleUpBox() 
    {
        for(int line = 1; line <= HEIGHT; line++) 
        {
            System.out.print("|");
            for(int period1 = 1; period1 <= HEIGHT - line; period1++) 
            {
                System.out.print(".");
            }
            for(int triangle1 = 1; triangle1 <= line; triangle1++) 
            {
                System.out.print("/\\");   
            }
            for(int period2 = 1; period2 <= 2 * HEIGHT - 2 * line; period2++) 
            {
                System.out.print(".");
            }
            for(int triangle2 = 1; triangle2 <= line; triangle2++)
            {
                System.out.print("/\\");
            }
            for(int period3 = 1; period3 <= HEIGHT - line; period3++) 
            {
                System.out.print(".");
            }
            System.out.println("|");   
        }
    }
    //produces a part of the box with the \/'s pattern
    public static void drawTriangleDownBox() 
    {
        for(int line = 1; line <= HEIGHT; line++) 
        {
            System.out.print("|");
            for(int period1 = 1; period1 <= line - 1; period1++) 
            {
                System.out.print(".");
            }
            for(int triangle1 = 1; triangle1 <= HEIGHT - line + 1; triangle1++) 
            {
                System.out.print("\\/");
            }
            for(int period2 = 1; period2 <= 2 * line - 2; period2++) 
            {
                System.out.print(".");          
            }
            for(int triangle2 = 1; triangle2 <= HEIGHT - line + 1; triangle2++) 
            {
                System.out.print("\\/");
            }
            for(int period3 = 1; period3 <= line - 1; period3++) 
            {
                System.out.print(".");
            }
            System.out.println("|");
        }
    }        
}