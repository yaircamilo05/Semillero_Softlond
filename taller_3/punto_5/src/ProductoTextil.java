public abstract class ProductoTextil implements IProducto {

    private String nombre;
    private double precio;
    private String marca;
    private String color;
    private String descripcion;
    private String material;

    public ProductoTextil(String nombre, double precio, String marca, String descripcion, String material) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.descripcion = descripcion;
        this.material = material;
    }

    @Override
    public double calcularPrecio() {
        return this.precio*1.12;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Marca: " + this.marca);
        System.out.println("Color: " + this.color);
        System.out.println("Descripcion: " + this.descripcion);
        System.out.println("Material: " + this.material);
    }
    
}
