package superficies;

import java.util.Scanner;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @author damian
 */
public class Logic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Presentation pt = new Presentation();
        Data dt = new Data();
        
        dt = pt.selectShapeType(dt);
        if (dt.getShapeType().equalsIgnoreCase("square")) {
            pt.square(dt);
        }
        if (dt.getShapeType().equalsIgnoreCase("rectangle")) {
            pt.rectangle(dt);
        }
        if (dt.getShapeType().equalsIgnoreCase("triangle")) {
            pt.triangle(dt);
        }
        if (dt.getShapeType().equalsIgnoreCase("circle")) {
            pt.circle(dt);
        }

    }

}
