public abstract class Triangulo implements IFiguraGeometrica {

    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) throws Exception {
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            throw new Exception("Los lados deben ser mayores a 0");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public double getLado1() {
        return lado1;
    }
    
    public double getLado2() {
        return lado2;
    }
    
    public double getLado3() {
        return lado3;
    }
    
    public void setLado1(double lado1) throws Exception {
        if (lado1 <= 0) {
            throw new Exception("El lado debe ser mayor a 0");
        }
        this.lado1 = lado1;
    }
    
    public void setLado2(double lado2) throws Exception {
        if (lado2 <= 0) {
            throw new Exception("El lado debe ser mayor a 0");
        }
        this.lado2 = lado2;
    }
    
    public void setLado3(double lado3) throws Exception {
        if (lado3 <= 0) {
            throw new Exception("El lado debe ser mayor a 0");
        }
        this.lado3 = lado3;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + '}';
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override 
    public  double calcularArea(){
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    };



}
