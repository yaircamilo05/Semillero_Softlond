/**
 * 10. Figuras en un lienzo: Crea una interfaz llamada Dibujable que tenga un método dibujar()
 *  y una clase abstracta Figura que implemente esta interfaz. Luego, implementa diferentes 
 * clases de figuras (círculos, rectángulos, etc.) que extiendan la clase Figura. 
 * Crea una clase Lienzo que tenga un arreglo de objetos Dibujable y, utilizando polimorfismo,
 *  llama al método dibujar() en cada objeto.
 */
public class App3_10 {
    public static void main(String[] args) throws Exception {
        Dibujable[] figuras = new Dibujable[3];
        figuras[0] = new Rectangulo();
        figuras[1] = new Circulo();
        figuras[2] = new Triangulo();
        Lienzo lienzo = new Lienzo(figuras);
        lienzo.dibujar();
    }
}
