public class TrianguloEquilatero  extends Triangulo {

    public TrianguloEquilatero(double lado1, double lado2, double lado3) throws Exception {
        super(lado1, lado2, lado3);
        if (lado1 != lado2 || lado2 != lado3 || lado1 != lado3) {
            throw new Exception("Los lados deben ser iguales");
        }
    }

    @Override
    public String toString() {
        return "TrianguloEquilatero{" + "lado1=" + getLado1() + ", lado2=" + getLado2() + ", lado3=" + getLado3() + '}';
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(3) / 4) * Math.pow(getLado1(), 2);
    }

    @Override
    public double calcularPerimetro() {
        return getLado1() * 3;
    }
    
}
