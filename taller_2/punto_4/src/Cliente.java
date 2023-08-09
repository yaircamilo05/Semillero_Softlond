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

    
    
}
