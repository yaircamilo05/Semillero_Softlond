import java.util.ArrayList;

/**
 * 6. Animales y sonidos: Crea una jerarquía de clases que representen diferentes tipos de animales,
 *  como perros, gatos y pájaros. Cada clase de animal debe tener un método hacerSonido() que imprima 
 * el sonido característico del animal. Luego, crea un array de animales y recorre el array llamando al
 *  método hacerSonido() en cada uno. Esto demuestra cómo el polimorfismo permite tratar objetos de diferentes
 *  clases de manera uniforme.
 */

public class App3_6 {
    public static void main(String[] args) throws Exception {

        ArrayList <Animal> animales = new ArrayList<Animal>();

        animales.add(new Perro("Mailo",7,"Macho","Pitbull","Cafe"));
        animales.add(new Gato("Mishu",3,"Hembra","Siames","Blanco"));
        animales.add(new Pollo("Piolin",1,"Macho","Pollo de engorde","Blanco"));

        for (Animal animal : animales) {
            System.out.println("El animal "+animal.getClass().getSimpleName()  + " hace el sonido: ");
            animal.hacerSonido();
        }
    }
}
