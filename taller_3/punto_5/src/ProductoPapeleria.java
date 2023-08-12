public abstract class ProductoPapeleria  implements IProducto{

    private String nombre;
    private double precio;
    private String marca;
    private String color;
    private String descripcion;

    public ProductoPapeleria(String nombre, double precio, String marca, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.descripcion = descripcion;
    }

    @Override
    public double calcularPrecio() {
        return this.precio*1.15;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Marca: " + this.marca);
        System.out.println("Color: " + this.color);
        System.out.println("Descripcion: " + this.descripcion);
    }
    
}
