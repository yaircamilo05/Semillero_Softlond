public class Libro extends ProductoPapeleria {

    private String autor;

    public Libro(String nombre, double precio, String marca, String descripcion, String autor) {
        super(nombre, precio, marca, descripcion);
        this.autor = autor;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Autor: " + this.autor);
    }
    
}
