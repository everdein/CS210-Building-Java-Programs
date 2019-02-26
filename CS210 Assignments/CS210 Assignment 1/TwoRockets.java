// Matthew Clark
// CS210 Building Java Programs
// Assignment 1 - Rockets

public class TwoRockets 
{
    public static void main(String[] args) 
    {
        drawDoubleCones();
        drawDoubleBoxes();
        writeDoubleUS();
        drawDoubleBoxes();
        drawDoubleCones();
    
    }
    public static void drawDoubleCones() 
    {
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");

    }
    public static void drawDoubleBoxes() 
    {
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
        
    }
    public static void writeDoubleUS() 
    {
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
    }
}
