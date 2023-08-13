public class Lienzo {

    private Dibujable[] figuras;

    public Lienzo(Dibujable[] figuras) {
        this.figuras = figuras;
    }

    public Dibujable[] getFiguras() {
        return figuras;
    }

    public void setFiguras(Dibujable[] figuras) {
        this.figuras = figuras;
    }

    public void dibujar() {
        for (Dibujable figura : figuras) {
            figura.dibujar();
        }
    }

    
}