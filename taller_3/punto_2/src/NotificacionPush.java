public class NotificacionPush implements INotificacion{

    private String mensaje;

    public NotificacionPush(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificación push");
        System.out.println("Mensaje: " + mensaje);
    }
    
}
