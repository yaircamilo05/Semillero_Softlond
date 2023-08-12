import java.util.ArrayList;

/***
 * 5. Tienda en línea: Construye un sistema básico para una tienda en línea.
 *  Crea una interfaz para representar productos y métodos como calcularPrecio y mostrarDetalles.
 *  Luego, implementa clases abstractas para diferentes categorías de productos (electrónica, ropa, libros, etc.)
 *  y clases concretas para productos específicos en cada categoría.
 */

public class App3_5 {
    public static void main(String[] args) throws Exception {
        ArrayList <IProducto> productos = new ArrayList<IProducto>();

        productos.add(new Libro("El señor de los anillos", 100000, "Papeleria Norma", "Libro de genero de la fantasia medievale", "J.R.R Tolkien"));
        productos.add(new Libro("El hobbit", 50000, "Papeleria Norma", "Libro de genero de la fantasia medievale", "J.R.R Tolkien"));
        productos.add(new Portatil("NITRO 5", 2700000, "ACER", "Portatil gamer de gama baja", "Intel core i5 8200k", "8GB", "1 TB", "Nvidia Geforce GTX 1050", "Windows 10"));
        productos.add(new Camiseta("Camiseta de la seleccion Colombia", 100000, "Adidas", "Camiseta de la seleccion Colombia", "Algodon", "M", "Masculino", "Corta", "Redondo"));

        for (IProducto producto : productos) {
            producto.mostrarDetalles();
            System.out.println("Precio: " + producto.calcularPrecio());
            System.out.println();
        }
    }
}
