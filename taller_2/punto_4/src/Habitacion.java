import java.util.ArrayList;
import java.time.LocalDate;

public class Habitacion {

    private String numero;
    private ArrayList<Reserva> reservas;

    public Habitacion(String numero) {
        this.numero = numero;
        this.reservas = new ArrayList<Reserva>();
    }

    public void adicionarReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

    public boolean reservarHabitacion(Reserva reservaP) {

        LocalDate fechaInicio = reservaP.getFechaInicio();
        LocalDate fechaFin = reservaP.getFechaFin();
        for (Reserva reserva : this.reservas) {
            if (fechaInicio.compareTo(reserva.getFechaInicio()) >= 0
                    && fechaInicio.compareTo(reserva.getFechaFin()) <= 0) {
                return false;
            }
            if (fechaFin.compareTo(reserva.getFechaInicio()) >= 0
                    && fechaFin.compareTo(reserva.getFechaFin()) <= 0) {
                return false;
            }
        }
        this.reservas.add(reservaP);
        return true;
    }

    public String getNumero() {
        return this.numero;
    }

    public ArrayList<Reserva> getReservas() {
        return this.reservas;
    }

    public void cancelarReserva(Reserva reserva1) {
        for (Reserva reserva : this.reservas) {
            if (reserva.getFechaInicio().equals(reserva1.getFechaInicio())
                    && reserva.getFechaFin().equals(reserva1.getFechaFin())) {
                this.reservas.remove(reserva);
            }
        }

    }

}
