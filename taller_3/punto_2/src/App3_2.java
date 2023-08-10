import java.util.ArrayList;

/**
 * 2. Sistema de notificaciones: Diseña un sistema de notificaciones que pueda manejar varios tipos de notificaciones,
 *  como correos electrónicos, mensajes de texto y notificaciones push. Crea una interfaz que defina un método enviar
 *  y clases abstractas para cada tipo de notificación. Luego, implementa las clases concretas para cada tipo de notificación.
 */

public class App3_2 {
    public static void main(String[] args) throws Exception {

        ArrayList<INotificacion> notificaciones = new ArrayList<INotificacion>();

        INotificacion notificacion1 = new CorreoElectronico("semillero@softlond.com", "taller 3", "punto 2");
        INotificacion notificacion2 = new MensajeTexto("3000000000", "taller 3 punto 2");
        INotificacion notificacion3 = new NotificacionPush("taller 3 punto 2");

        notificaciones.add(notificacion1);
        notificaciones.add(notificacion2);
        notificaciones.add(notificacion3);

        for (INotificacion notificacion : notificaciones) {
            notificacion.enviar();
        }

    }
}
