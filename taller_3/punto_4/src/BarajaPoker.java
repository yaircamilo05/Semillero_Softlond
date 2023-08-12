import java.util.ArrayList;

public class BarajaPoker {

        private ArrayList<ICartaPoker> cartas = new ArrayList<ICartaPoker>();

        public BarajaPoker() {
                for (int i = 1; i <= 13; i++) {
                        cartas.add(new CartaCorazon(i));
                        cartas.add(new CartaDiamante(i));
                        cartas.add(new CartaPica(i));
                        cartas.add(new CartaTrebol(i));
                }
        }

        public void mostrarBaraja() {
                for (ICartaPoker carta : cartas) {
                        carta.mostrarCarta();
                }
        }

        public void ordenarBaraja() {
                for (int i = 0; i < cartas.size(); i++) {
                        for (int j = 0; j < cartas.size() - 1; j++) {
                                if (cartas.get(j).valorNumerico() > cartas.get(j + 1).valorNumerico()) {
                                        ICartaPoker cartaAux = cartas.get(j);
                                        cartas.set(j, cartas.get(j + 1));
                                        cartas.set(j + 1, cartaAux);
                                }
                        }
                }
        }

        public void mezclarBaraja() {
                for (int i = 0; i < cartas.size(); i++) {
                        int random = (int) (Math.random() * cartas.size());
                        ICartaPoker cartaAux = cartas.get(i);
                        cartas.set(i, cartas.get(random));
                        cartas.set(random, cartaAux);
                }
        }

        
    
}

