public class Violin extends Instrumento {

    public Violin(String nombre) {
        super(nombre);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando el violin");
    }
    
}
