public class Camiseta extends ProductoTextil{

    private String talla;
    private String genero;
    private String tipoManga;
    private String tipoCuello;


    public Camiseta(String nombre, double precio, String marca, String descripcion, String material, String talla,
            String genero, String tipoManga, String tipoCuello) {
        super(nombre, precio, marca, descripcion, material);
        this.talla = talla;
        this.genero = genero;
        this.tipoManga = tipoManga;
        this.tipoCuello = tipoCuello;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Talla: " + this.talla);
        System.out.println("Genero: " + this.genero);
        System.out.println("Tipo de manga: " + this.tipoManga);
        System.out.println("Tipo de cuello: " + this.tipoCuello);
    }
    
}
