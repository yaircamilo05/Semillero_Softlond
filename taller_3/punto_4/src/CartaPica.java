public class CartaPica implements ICartaPoker{

    private int numero;
    private Palo palo;

    public CartaPica(int numero) {
        this.numero = numero;
        this.palo = Palo.PICAS;
    }

    @Override
    public String toString() {
        String mensaje = " Soy el " + this.numero + " de " + this.palo + "";
        return mensaje;
    }

    @Override
    public void mostrarCarta() {
        System.out.println(this.toString());
    }

    @Override
    public int valorNumerico() {
        return this.numero;
    }
    
}
