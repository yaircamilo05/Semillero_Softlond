
/**
 * 4. Juego de cartas: Crea un juego de cartas en el que puedas representar diferentes
 *  tipos de cartas (por ejemplo, cartas de póker) utilizando una jerarquía de clases y una interfaz.
 *  La interfaz podría definir métodos como mostrarCarta y valorNumerico. Luego, implementa clases para
 *  los diferentes tipos de cartas y para la baraja.
 */


public class App3_4 {
    public static void main(String[] args) throws Exception {

        BarajaPoker baraja = new BarajaPoker();
        baraja.mostrarBaraja();
        System.out.println("Baraja ordenada");
        baraja.ordenarBaraja();
        baraja.mostrarBaraja();
        System.out.println("Baraja mezclada");
        baraja.mezclarBaraja();
        baraja.mostrarBaraja();


    }
}
