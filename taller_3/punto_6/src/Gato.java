public class Gato extends Animal{

    private String raza;
    private String color;

    public Gato(String nombre, int edad, String genero, String raza, String color) {
        super(nombre, edad, genero);
        this.raza = raza;
        this.color = color;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau miau");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Raza: " + this.raza);
        System.out.println("Color: " + this.color);
    }
    
}
