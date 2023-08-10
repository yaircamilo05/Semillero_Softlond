public class TrianguloEquilatero implements IFiguraGeometrica {

    private double base;
    private double altura;

    public TrianguloEquilatero(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 3 * base;
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double area = (base * altura) / 2;
        return area;
    }
    
}
