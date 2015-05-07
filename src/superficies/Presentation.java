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
    
    
    
    
}
