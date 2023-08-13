/**
 * 9. Instrumentos musicales: Diseña una jerarquía de clases para instrumentos musicales,
 *  como guitarras, pianos y violines. Cada instrumento debe tener un método tocar() que imprima cómo suena.
 *  Luego, crea un método que acepte un arreglo de instrumentos y los haga tocar a todos utilizando polimorfismo.

 */

public class App3_9 {
    public static void main(String[] args) throws Exception {

        Instrumento[] instrumentos = new Instrumento[3];
        instrumentos[0] = new Guitarra("Guitarra");
        instrumentos[1] = new Piano("Piano");
        instrumentos[2] = new Violin("Violin");

        tocarInstrumentos(instrumentos);

    }

    public static void tocarInstrumentos(Instrumento[] instrumentos) {
        for (Instrumento instrumento : instrumentos) {
            instrumento.tocar();
        }
    }
}
