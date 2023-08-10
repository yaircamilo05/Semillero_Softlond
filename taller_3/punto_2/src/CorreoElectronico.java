public class CorreoElectronico  implements INotificacion{

    private String destinatario;
    private String asunto;
    private String cuerpo;

    public CorreoElectronico(String destinatario, String asunto, String cuerpo) {
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando correo electrónico a " + destinatario);
        System.out.println("Asunto: " + asunto);
        System.out.println("Cuerpo: " + cuerpo);
    }
    
}
