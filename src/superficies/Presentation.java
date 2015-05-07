/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superficies;

import java.util.Scanner;

/**
 *
 * @author ddizoya
 */
public class Presentation {
    Scanner sc = new Scanner(System.in);;
    
    public Data selectShapeType(Data obj){
        
       
        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        obj.setShapeType(sc.nextLine());
        System.out.println("You said: " + obj.getShapeType());
        
        return obj;
    }
    
    public void square(Data obj){
        
            System.out.println("what is the side length?");
            obj.setSideLength(sc.nextFloat());
            obj.setSquareArea(obj.getSideLength()*obj.getSideLength());
            System.out.println("The area for your square: " + obj.getSquareArea());
    }
    
    public void rectangle (Data obj){
            System.out.println("what is the rectangles width?");
            obj.setSideLength(sc.nextFloat());
            System.out.println("What is the rectangles height?");
            obj.setSideHeight(sc.nextFloat());
            obj.setRectangleArea(obj.getSideHeight()*obj.getSideLength());
            System.out.println("The area for your rectangle is: " + obj.getRectangleArea());
    }
    
    public void triangle(Data obj){
            System.out.println("What is the base length of the triangle?");
            obj.setBaseLength(sc.nextFloat());
            System.out.println("What is the height of the triangle?");
            obj.setHeight(sc.nextFloat());
            float triangleArea = (float) (0.5 * obj.getBaseLength() * obj.getHeight());
            obj.setTriangleArea(triangleArea);
            System.out.println("Your triangles area is: " + obj.getTriangleArea());
    }
    
    public void circle (Data obj){
            System.out.println("What is the radius of the circle?");
            obj.setRadius(sc.nextFloat());
            obj.setCircleArea(obj.getRadius()*obj.getRadius());
            obj.setCircleArea((float)3.14159265 *obj.getCircleArea());
            System.out.println("Your Circles area is " + obj.getCircleArea());
    }
    
    
}
