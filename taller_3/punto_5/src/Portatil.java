public class Portatil extends ProductoElectronica {

    private String procesador;
    private String ram;
    private String discoDuro;
    private String tarjetaGrafica;
    private String sistemaOperativo;


    public Portatil(String nombre, double precio, String marca, String descripcion, String procesador, String ram, String discoDuro, String tarjetaGrafica, String sistemaOperativo) {
        super(nombre, precio, marca, descripcion);
        this.procesador = procesador;
        this.ram = ram;
        this.discoDuro = discoDuro;
        this.tarjetaGrafica = tarjetaGrafica;
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Procesador: " + this.procesador);
        System.out.println("RAM: " + this.ram);
        System.out.println("Disco Duro: " + this.discoDuro);
        System.out.println("Tarjeta Grafica: " + this.tarjetaGrafica);
        System.out.println("Sistema Operativo: " + this.sistemaOperativo);
    }
    
}
