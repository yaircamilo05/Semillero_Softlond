public class Pollo extends Animal{

    private String raza;
    private String color;

    public Pollo(String nombre, int edad, String genero, String raza, String color) {
        super(nombre, edad, genero);
        this.raza = raza;
        this.color = color;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Pio pio");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Raza: " + this.raza);
        System.out.println("Color: " + this.color);
    }

    
}
