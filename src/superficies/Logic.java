/**
 * Clase lógica del programa. Evalúa simplemente su ejecución. 
 * Es el núcleo central del funcionamiento del programa, desde donde se ejecuta. 
 */
package superficies;

import java.util.Scanner;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @author ddizoya
 */
public class Logic {

    /**
     * @param args La ejecución lineal del programa.
     */
    public static void main(String[] args) {
        Presentation pt = new Presentation();
        Data dt = new Data();

        /*Sobreescribimos el objeto Data, porque el método del objeto
         Presentation recibe el objeto Data y lo retorna de nuevo.
         Ahora se podrá evaluar el ShapeType que el usuario ha escogido. 
         */
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
