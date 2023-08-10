public class MensajeTexto implements INotificacion{

    private String numero;
    private String mensaje;

    public MensajeTexto(String numero, String mensaje) {
        this.numero = numero;
        this.mensaje = mensaje;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando mensaje de texto a " + numero);
        System.out.println("Mensaje: " + mensaje);
    }
    
}
