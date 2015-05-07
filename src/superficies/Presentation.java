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
    Scanner sc;
    
    public Data selectShapeType(Data dt){
        
        sc = new Scanner(System.in);
        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        dt.setShapeType(sc.nextLine());
        System.out.println("You said: " + dt.getShapeType());
        
        return dt;
    }
    
    
    
    
    
}
