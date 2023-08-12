import java.util.ArrayList;

/**
 * 7. Formas geométricas y áreas: Utiliza la jerarquía de clases de formas geométricas que creaste en el ejercicio anterior
 *  (con interfaces y clases abstractas). Agrega un método calcularArea() 
 * a la interfaz de las formas y luego implementa este método en las clases concretas. 
 * Crea un array de formas y calcula el área de cada una utilizando polimorfismo.
 */

public class App3_7 {

    /**
     * Este punto es igual al punto 1, solo que se agrega el metodo calcularArea() a la interfaz IFiguraGeometrica
     * se le puede añadir una clase Triangulo que implemente la interfaz IFiguraGeometrica y que tenga un metodo calcularArea()
     * y un metodo calcularPerimetro() que se implementa en la clase TrianguloEquilatero
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        ArrayList<IFiguraGeometrica> figuras = new ArrayList<IFiguraGeometrica>();

        figuras.add(new Circulo(5));
        figuras.add(new TrianguloEquilatero(5, 5, 5));
        figuras.add(new Cuadrado(5));

        for (IFiguraGeometrica figura : figuras) {
            System.out.println("Area: " + figura.calcularArea());
        }
        
    }
}
