public class EmpleadoPorHoras extends Empleado {

    private double valorHora;

    public EmpleadoPorHoras(String nombre, String apellido, String cedula, String telefono, String direccion, double valorHora) throws Exception {
        super(nombre, apellido, cedula, telefono, direccion);
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) throws Exception {
        if (valorHora < 0) {
            throw new Exception("El valor de la hora no puede ser negativo");
        }
        this.valorHora = valorHora;
    }


    @Override
    public double calcularSalario(int horasTrabajadas) {
        return valorHora * horasTrabajadas;
    }

    @Override
    public String toString() {
        return super.toString() + "Valor hora: " + valorHora;
    }
    
}
