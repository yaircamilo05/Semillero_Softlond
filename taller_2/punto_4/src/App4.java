/**
4. Sistema de Reservas de Hotel:
Crear un sistema de reservas de hotel que permita a los clientes corporativos reservar múltiples habitaciones
en diferentes hoteles para hospedar a su personal.
Debes tener clases como Hotel, Habitación, Cliente, y Reserva. 
Implementa métodos para listar habitaciones disponibles, realizar reservas y cancelar reservas. 
Al final de la ejecución del programa debe mostrar la siguiente info:
Nombre de la empresa que reservó
Nombre y cédula de quien ocupará cada habitación y número de la habitación que ocupará. Esto para cada hotel.
 */
import java.time.LocalDate;



public class App4 {
    public static void main(String[] args) throws Exception {
        Hotel hotel1 = new Hotel("Hotel 1");
        Hotel hotel2 = new Hotel("Hotel 2");

        Habitacion habitacion1 = new Habitacion("1");
        Habitacion habitacion2 = new Habitacion("2");
        Habitacion habitacion3 = new Habitacion("3");
        Habitacion habitacion4 = new Habitacion("4");
        Habitacion habitacion5 = new Habitacion("5");

        hotel1.adicionarHabitacion(habitacion1);
        hotel1.adicionarHabitacion(habitacion2);
        hotel1.adicionarHabitacion(habitacion3);
        hotel2.adicionarHabitacion(habitacion4);
        hotel2.adicionarHabitacion(habitacion5);

        Cliente cliente1 = new Cliente("Empresa 1");
        Cliente cliente2 = new Cliente("Empresa 2");
        
        LocalDate fechaInicio1 = LocalDate.of(2021, 10, 1);
        LocalDate fechaFin1 = LocalDate.of(2021, 10, 10);

        Reserva reserva1 = new Reserva(cliente1,habitacion1,fechaInicio1,fechaFin1);

        LocalDate fechaInicio2 = LocalDate.of(2021, 10, 5);
        LocalDate fechaFin2 = LocalDate.of(2021, 10, 15);

        Reserva reserva2 = new Reserva(cliente1,habitacion2,fechaInicio2,fechaFin2);


        LocalDate fechaInicio3 = LocalDate.of(2021, 10, 1);
        LocalDate fechaFin3 = LocalDate.of(2021, 10, 10);

        Reserva reserva3 = new Reserva(cliente2,habitacion3,fechaInicio3,fechaFin3);

        LocalDate fechaInicio4 = LocalDate.of(2021, 10, 5);
        LocalDate fechaFin4 = LocalDate.of(2021, 10, 15);

        Reserva reserva4 = new Reserva(cliente2,habitacion4,fechaInicio4,fechaFin4);


        hotel1.AñadirReserva(reserva1);
        hotel1.AñadirReserva(reserva2);
        hotel2.AñadirReserva(reserva3);
        hotel2.AñadirReserva(reserva4);
        hotel1.listarHabitaciones();
        hotel2.listarHabitaciones();

        System.out.println("Reservas del cliente " + cliente1.getNombreEmpresa());

        



    }
}
