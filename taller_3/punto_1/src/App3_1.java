import java.util.ArrayList;

/**
 * 1. Figuras geométricas: Crea una jerarquía de clases que representan diferentes figuras geométricas,
 *  como círculos, triángulos y cuadrados. Utiliza una interfaz para definir métodos comunes como cálculo
 *  de área y perímetro. Cada figura debe tener su propia implementación de estos métodos.
 */

public class App3_1 {
    public static void main(String[] args) throws Exception {

        ArrayList<IFiguraGeometrica> arrayFiguras = new ArrayList<IFiguraGeometrica>();

        arrayFiguras.add(new Circulo(5));
        arrayFiguras.add(new TrianguloEquilatero(5, 5));
        arrayFiguras.add(new Cuadrado(5));

        for (IFiguraGeometrica figura : arrayFiguras) {
            System.out.println("Figura: " + figura.getClass().getSimpleName());
            System.out.println("Area: " + figura.calcularArea());
            System.out.println("Perimetro: " + figura.calcularPerimetro());
        }

    }
}
