public abstract class Animal {

    private String nombre;
    private int edad;
    private String genero;

    public Animal(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    
    public abstract void hacerSonido();

    public void mostrarDetalles(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Genero: " + this.genero);
    }
    
}
