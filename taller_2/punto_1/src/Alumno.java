import java.util.ArrayList;

public class Alumno {

    private String nombre;
    private int edad;
    private ArrayList<Double> notas;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.notas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public double getPromedio() {
        double suma = 0;
        for (Double nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0) {
            throw new Exception("La edad no puede ser negativa");
        }
        this.edad = edad;
    }

    public void añadirNota(double nota) throws Exception {
        if (nota < 0 || nota > 5) {
            throw new Exception("La nota debe estar entre 0 y 10");
        }
        notas.add(nota);
    }

    

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", edad=" + edad + ", notas=" + notas + "]";
    }



    
}
