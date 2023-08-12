public class Cuadrado implements IFiguraGeometrica {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 4 * lado;
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double area = Math.pow(lado, 2);
        return area;
    }
    
}
