import java.util.ArrayList;

public class Cliente {

    private String nombreEmpresa;
    private ArrayList<Reserva> reservas;

    public Cliente(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.reservas = new ArrayList<>();
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void listarReservas() {
        System.out.println("Reservas de la empresa " + this.nombreEmpresa);
        for (Reserva reserva : this.reservas) {
            System.out.println("Reserva " + reserva.getFechaInicio() + " - " + reserva.getFechaFin());
        }

    }

    public void adicionarReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

    
    
}
