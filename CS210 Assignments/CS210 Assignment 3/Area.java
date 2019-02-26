// Matthew Clark
// CS210 Building Java Programs
// Assignment 3 - Area

import java.util.*;

public class Area 
{
    public static void main(String[] args) 
    {
        Scanner console = new Scanner (System.in);
        int one = 1;
        int two = 2;
        String type1 = getType(console, one);
        double result1 = getArea(console, type1);
        String type2 = getType(console, two);
        while (type2 == "") 
        {
            type1 = getType(console, one); 
        }
        double result2 = getArea(console, type2);
        reportResults(type1, type2, result1, result2);
    }
    // Asks user what shape
    public static String getType(Scanner console, int x) 
    {
        System.out.println("Information for figure " + x + ":");
        System.out.println("Type 1) rectangle 2) triangle 3) circle");
        int type = console.nextInt();
        if(type == 1) 
        {
            return "rectangle";
        }
        else if(type == 2) 
        {
            return "triangle";
        }
        else if(type == 3) 
        {
            return "circle";
        } 
        else 
        {
            System.out.println("Invalid selection, please select type 1, 2, or 3.");
            System.out.println("");
            return "";
        }
    }
    // Acquire area for type1 & type2
    public static double getArea(Scanner console, String type) 
    {
        double result = 0.0;
        if(type == "rectangle") 
        {
            result = rectangle(console);
        }
        else if(type == "triangle") 
        {
            result = triangle(console);
        }
        else if(type == "circle")
        {
            result = circle(console);
        }
        return result;
    }
    //rectangle parameters
    public static double rectangle(Scanner console) 
    {
        System.out.println("height?");
        double height = console.nextDouble();
        System.out.println("width?");
        double width = console.nextDouble();
        double result = resultRectangle(height, width);
        return result;
    }
            
    //rectangle formula
    public static double resultRectangle(double height, double width) 
    {
        return height * width;
    }
         
    //triangle parameters
    public static double triangle(Scanner console) 
    {
        System.out.println("base?");
        double base = console.nextDouble();
        System.out.println("height?");
        double height = console.nextDouble();
        double result = resultTriangle(base, height);
        return result;
    }
            
    //triangle formula
    public static double resultTriangle(double base, double height) 
    {
        return base * height / 2;
    }

    //circle parameters
    public static double circle(Scanner console) 
    {
        System.out.println("radius?");
        double radius = console.nextDouble();
        double result = resultCircle(radius);
        return result;
    }
    
    //circle formula
    public static double resultCircle(double radius) 
    {
        return radius * radius * Math.PI;
    }

    //reports result of both figures and sends them to reportStatus
    public static void reportResults(String type1, String type2, double result1, double result2) 
    {
        System.out.println(type1 + " result = " + result1);
        System.out.println(type2 + " result = " + result2); reportStatus(type1, type2, result1, result2);
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