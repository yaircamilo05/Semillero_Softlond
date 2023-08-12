public class Asalariado extends Empleado {

    private double salario;

    public Asalariado(String nombre, String apellido, String cedula, String telefono, String direccion, double salario) throws Exception {
        super(nombre, apellido, cedula, telefono, direccion);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws Exception {
        if (salario < 0) {
            throw new Exception("El salario no puede ser negativo");
        }
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() + "Salario: " + salario + "\n";
    }

    
    
}
