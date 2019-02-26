// Matthew Clark
// CS210 Building Java Programs
// Assignment 2 - ASCII Art

//This program creates a box with a downward triangle inside of it.
public class ASCII {
    public static final int SUB_HEIGHT = 5; 
    public static void main(String[] args) 
    {
        drawLine();
        drawTopBox();
        drawLine();
    }
    //Creates a line for the top and bottom portion of the box.
    public static void drawLine() 
    {
        System.out.print("+");    
        for (int dash1 = 1; dash1 <= 2 * SUB_HEIGHT; dash1++) 
        {
            System.out.print("-");
        }    
            System.out.println("+");
    }
    //Creates a downward triangle inside of the box made up of slashes and periods.
    public static void drawTopBox() {
        for(int line = 1; line <= SUB_HEIGHT; line++) 
        {
            System.out.print("|");
            for(int space1 = 1; space1 <= line - 1; space1++) 
            {
                System.out.print(" ");
            }
            for(int bslash = 1; bslash <= 1; bslash++) 
            {
                System.out.print("\\");
            }   
            for(int period = 1; period <= 2 * SUB_HEIGHT - 2 * line; period++) 
            {
                System.out.print(".");
            }
            for(int fslash = 1; fslash <= 1; fslash++) 
            {
                System.out.print("/");
            }
            for(int space2 = 1; space2 <= line -1; space2++) 
            {
                System.out.print(" ");
            }
            System.out.println("|");
        } 
    }    
}