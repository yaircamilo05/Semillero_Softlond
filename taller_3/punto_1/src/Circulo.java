public class Circulo implements IFiguraGeometrica{


    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
       double perimetro = 2 * Math.PI * radio;
         return perimetro;
    }

    @Override
    public double calcularArea() {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
    
}
