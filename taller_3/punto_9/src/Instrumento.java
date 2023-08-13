public abstract class Instrumento {

    private String nombre;

    public Instrumento(String nombre) {
        this.nombre = nombre;
    }

    public abstract void tocar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Exception("El nombre no puede ser nulo o vacio");
        }
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n";
    }
    
}
