import java.util.ArrayList;

public class SistemaAlumnos {

    private ArrayList<Alumno> alumnos;

    public SistemaAlumnos() {
        this.alumnos = new ArrayList<>();
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void añadirAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void añadirNota(String nombre, double nota) throws Exception {
        Alumno alumno = buscarAlumno(nombre);
        alumno.añadirNota(nota);
    }

    public Alumno buscarAlumno(String nombre) throws Exception {
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equals(nombre)) {
                return alumno;
            }
        }
        throw new Exception("No se encontró el alumno");
    }

    public void informacionAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.toString());
        }

    }

    public void promedioCalificaciones() {

        for (Alumno alumno : alumnos) {
            System.out.println("El promedio de " + alumno.getNombre() + " es: " + alumno.getPromedio());
        }
    }

    


    

  
}
