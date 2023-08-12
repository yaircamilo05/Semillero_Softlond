/**
 * 8. Empleados y salarios: Crea una jerarquía de clases para representar diferentes tipos de empleados,
 *  como asalariados y por horas. Cada clase debe tener un método para calcular el salario.
 *  Utiliza el polimorfismo para calcular el salario de diferentes tipos de empleados en un array.
 */


public class App3_8 {

    /**
     * en este ejemplo se crea un array de empleados, se recorre el array y se imprime el nombre y el salario de cada empleado
     * los empleados de tipo por horas se les calcula con 40 horas trabajadas
     */
    public static void main(String[] args) throws Exception {
        Empleado[] empleados = new Empleado[4];
        empleados[0] = new Asalariado("Juan", "Perez", "123456789", "123456789", "Calle 123", 1000000);
        empleados[1] = new EmpleadoPorHoras("Pedro", "Perez", "123456789", "123456789", "Calle 123", 10000);
        empleados[2] = new Asalariado("Maria", "Perez", "123456789", "123456789", "Calle 123", 2000000);
        empleados[3] = new EmpleadoPorHoras("Luis", "Perez", "123456789", "123456789", "Calle 123", 20000);

        for (Empleado empleado : empleados) {
            if(empleado instanceof Asalariado){
                System.out.println("Asalariado: " + empleado.getNombre() + " " + empleado.getApellido() + " Salario: " + empleado.calcularSalario());
        }
            if(empleado instanceof EmpleadoPorHoras){
                System.out.println("Empleado por horas: " + empleado.getNombre() + " " + empleado.getApellido() + " Salario: " + empleado.calcularSalario(40));
        }   
    
    }
}
}
