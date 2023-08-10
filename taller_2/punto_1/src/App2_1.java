/**
1. Registro de Alumnos:
Crea una clase Alumno con propiedades como nombre, edad y calificaciones. Luego, 
crea una clase SistemaAlumnos que permite agregar alumnos,asignar calificaciones ,
 calcular el promedio de sus calificaciones y mostrar la información de cada alumno.
 */

public class App2_1 {
    public static void main(String[] args) throws Exception {

        SistemaAlumnos sistema = new SistemaAlumnos();

        sistema.añadirAlumno(new Alumno("Juan", 20));
        sistema.añadirAlumno(new Alumno("Pedro", 21));
        sistema.añadirAlumno(new Alumno("Maria", 22));

        sistema.añadirNota("Juan", 3.5);
        sistema.añadirNota("Juan", 4.5);
        sistema.añadirNota("Juan", 5.0);

        sistema.añadirNota("Pedro", 3.0);
        sistema.añadirNota("Pedro", 4.0);
        sistema.añadirNota("Pedro", 5.0);

        sistema.añadirNota("Maria", 3.0);
        sistema.añadirNota("Maria", 2.0);
        sistema.añadirNota("Maria", 5.0);

        sistema.informacionAlumnos();

        sistema.promedioCalificaciones();





    }
}
