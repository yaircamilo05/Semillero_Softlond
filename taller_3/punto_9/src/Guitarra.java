public class Guitarra extends Instrumento {

    public Guitarra(String nombre) {
        super(nombre);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando la guitarra");
    }
    
}
