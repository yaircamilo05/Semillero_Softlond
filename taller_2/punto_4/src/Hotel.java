import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Habitacion> habitaciones ;
    private String nombre;

    public Hotel(String nombre) {
        this.habitaciones = new ArrayList<Habitacion>();
        this.nombre = nombre;
    }

    public void adicionarHabitacion(Habitacion habitacion) {
        this.habitaciones.add(habitacion);
    }

    public void listarHabitaciones() {
        System.out.println("Habitaciones del hotel " + this.nombre);
        for (Habitacion habitacion : this.habitaciones) {
            System.out.println("Habitacion " + habitacion.getNumero());
        }
    }

    public void AñadirReserva(Reserva reserva) {
        for (Habitacion habitacion : this.habitaciones) {
            if (habitacion.getNumero().equals(reserva.getHabitacion().getNumero())) {
                habitacion.adicionarReserva(reserva);
                reserva.getCliente().adicionarReserva(reserva);
            }
        }
    }

    public void RevisarDisponibilidad (LocalDate fecha){
        for (Habitacion habitacion : this.habitaciones) {
            if (habitacion.getReservas().isEmpty()) {
                System.out.println("Habitacion " + habitacion.getNumero() + " disponible");
            } else {
                for (Reserva reserva : habitacion.getReservas()) {
                    if (fecha.compareTo(reserva.getFechaInicio()) >= 0
                            && fecha.compareTo(reserva.getFechaFin()) <= 0) {
                        System.out.println("Habitacion " + habitacion.getNumero() + " no disponible");
                    } else {
                        System.out.println("Habitacion " + habitacion.getNumero() + " disponible");
                    }
                }
            }
        }

    }

    public void listarHabitacionesDisponibles(LocalDate fechaInicioP, LocalDate fechaFinP) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getReservas().isEmpty()) {
                System.out.println("Habitacion " + habitacion.getNumero() + " disponible");
            } else {
                for (Reserva reserva : habitacion.getReservas()) {
                    if (fechaInicioP.compareTo(reserva.getFechaInicio()) >= 0
                            && fechaInicioP.compareTo(reserva.getFechaFin()) <= 0) {
                        System.out.println("Habitacion " + habitacion.getNumero() + " no disponible");
                    } else if (fechaFinP.compareTo(reserva.getFechaInicio()) >= 0
                            && fechaFinP.compareTo(reserva.getFechaFin()) <= 0) {
                        System.out.println("Habitacion " + habitacion.getNumero() + " no disponible");
                    } else {
                        System.out.println("Habitacion " + habitacion.getNumero() + " disponible");
                    }
                }
            }
            
        }

    }

    public void cancelarReserva(Reserva reserva1) {
        for (Habitacion habitacion : this.habitaciones) {
            if (habitacion.getNumero().equals(reserva1.getHabitacion().getNumero())) {
                habitacion.cancelarReserva(reserva1);
            }
        }

    }

    
}
