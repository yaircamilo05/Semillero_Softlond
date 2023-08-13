public class Piano extends Instrumento{

    public Piano(String nombre) {
        super(nombre);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando el piano");
    }
    
}
