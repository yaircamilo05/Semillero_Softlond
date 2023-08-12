public abstract class Empleado {

    private String nombre;
    private String apellido;
    private String cedula;
    private String telefono;
    private String direccion;

    public Empleado(String nombre, String apellido, String cedula, String telefono, String direccion) throws Exception {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public String getCedula() {
        return cedula;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setNombre(String nombre) throws Exception {
        if (nombre == null || nombre.isEmpty()) {
            throw new Exception("El nombre no puede ser nulo o vacio");
        }
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) throws Exception {
        if (apellido == null || apellido.isEmpty()) {
            throw new Exception("El apellido no puede ser nulo o vacio");
        }
        this.apellido = apellido;
    }
    
    public void setCedula(String cedula) throws Exception {
        if (cedula == null || cedula.isEmpty()) {
            throw new Exception("La cedula no puede ser nula o vacia");
        }
        this.cedula = cedula;
    }
    
    public void setTelefono(String telefono) throws Exception {
        if (telefono == null || telefono.isEmpty()) {
            throw new Exception("El telefono no puede ser nulo o vacio");
        }
        this.telefono = telefono;

    
}

    public double calcularSalario() {
        return 0;
    }

    public double calcularSalario(int horasTrabajadas) {
        return 0;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nCedula: " + cedula + "\nTelefono: " + telefono + "\nDireccion: " + direccion + "\n";
    }
}
