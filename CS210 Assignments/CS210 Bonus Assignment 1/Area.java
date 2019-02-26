// Matthew Clark
// CS210 Building Java Programs
// Bonus Assigment 1 - Area
//This program provides the result of two shapes and denotes which is bigger.

import java.util.*;
public class Area 
{
    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        String type1 = getType(console, 1);
        double result1 = getArea(console, type1);
        String type2 = getType(console, 2);
        double result2 = getArea(console, type2);
        reportResults(type1, type2, result1, result2);
    }
    //asks user what shape
    public static String getType(Scanner console, int x) 
    {
        System.out.println("Information for figure " + x + ":");
        System.out.println("Type 1) rectangle 2) triangle 3) circle");
        int type = console.nextInt();
        // String choice;
        switch(type)
        {
            case 1:
                if(type == 1) 
                {
                    return "Rectangle";
                }
            case 2:
                if(type == 2) 
                {
                    return "Triangle";
                }
            case 3: 
                if(type == 3) 
                {
                    return "Circle";
                }
            break;
            default: return "Invalid type. The type must be 1, 2, or 3.";
        }
        return null;
    }
    // Acquire area for type1 & type2
    public static double getArea(Scanner console, String type) 
    {
        double result = 0.0;
        if(type == "Rectangle") 
        {
             result = rectangle(console);
        }
        else if(type == "Triangle") 
        {
             result = triangle(console);
        }
        else if(type == "Circle") 
        {
            result = circle(console);
        }
        return result;
    }
    // Rectangle parameters
    public static double rectangle(Scanner console) 
    {
        System.out.println("Height?");
        double height = console.nextDouble();
        System.out.println("Width?");
        double width = console.nextDouble();
        double result = resultRectangle(height, width);
        return result;
    }
    // Rectangle formula
    public static double resultRectangle(double height, double width) 
    {
        return height * width;
    } 
    // Triangle parameters
    public static double triangle(Scanner console) 
    {
        System.out.println("Base?");
        double base = console.nextDouble();
        System.out.println("Height?");
        double height = console.nextDouble();
        double result = resultTriangle(base, height);
        return result;
    }    
    // Triangle formula
    public static double resultTriangle(double base, double height) 
    {
        return base * height / 2;
    }
    // Circle parameters
    public static double circle(Scanner console) 
    {
        System.out.println("Radius?");
        double radius = console.nextDouble();
        double result = resultCircle(radius);
        return result;
    }
    // Circle formula
    public static double resultCircle(double radius) 
    {
        return radius * radius * Math.PI;
    }
    //reports result of both figures and sends them to reportStatus
    public static void reportResults(String type1, String type2, double result1, double result2) 
    {
        System.out.println(type1 + " result = " + result1);
        System.out.println(type2 + " result = " + result2); 
        reportStatus(type1, type2, result1, result2);
    } 
    //claims which result is larger or if they are equal
    public static void reportStatus(String type1, String type2, double result1, double result2) 
    {
        if(result1 == result2) 
        {
            System.out.println("Both results appear to be equal.");
        } 
        else if(result1 >= result2) 
        {
            System.out.println("The " + type1 + " seems to be bigger.");
        } 
        else if(result1 <= result2) 
        {
            System.out.println("The " + type2 + " seems to be bigger.");
        }
    }
}