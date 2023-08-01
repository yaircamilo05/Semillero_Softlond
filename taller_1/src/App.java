import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
    //Realiza un programa que solicite al usuario dos números enteros y muestre su suma, resta, multiplicación y división.

    Scanner escaner = new Scanner(System.in);
    System.out.println("Ingrese el primer número: ");
    int num1 = escaner.nextInt();
    System.out.println("Ingrese el segundo número: ");
    int num2 = escaner.nextInt();
    escaner.close();
    System.out.println("La suma de los números es: " + (num1 + num2));
    System.out.println("La resta de los números es: " + (num1 - num2));
    System.out.println("La multiplicación de los números es: " + (num1 * num2));
    System.out.println("La división de los números es: " + (num1 / num2));

    //Escribe un programa que pida al usuario un número entero y determine si es par o impar.

    Scanner escaner2 = new Scanner(System.in);
    System.out.println("Ingrese un número: ");
    int num3 = escaner2.nextInt();
    escaner2.close();
    if (num3 % 2 == 0) {
        System.out.println("El número es par");
    } else {
        System.out.println("El número es impar");
        }


    //Crea un programa que calcule y muestre el área y el perímetro de un círculo. El usuario debe proporcionar el radio del círculo.
      
    Scanner escaner3 = new Scanner(System.in);
    System.out.println("Ingrese el radio del círculo: ");
    double radio = escaner3.nextDouble();
    escaner3.close();
    double area = Math.PI * Math.pow(radio, 2);
    double perimetro = 2 * Math.PI * radio;
    System.out.println("El área del círculo es: " + area);
    System.out.println("El perímetro del círculo es: " + perimetro);

    //Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad o menor de edad.

    Scanner escaner4 = new Scanner(System.in);
    System.out.println("Ingrese su edad: ");
    int edad = escaner4.nextInt();
    escaner4.close();
    if (edad >= 18) {
        System.out.println("Usted es mayor de edad");
    } else {
        System.out.println("Usted es menor de edad");
        }
    
    //Realiza un programa que solicite al usuario dos números enteros y determine cuál es el mayor de ellos.

    Scanner escaner5 = new Scanner(System.in);
    System.out.println("Ingrese el primer número: ");
    int num4 = escaner5.nextInt();
    System.out.println("Ingrese el segundo número: ");
    int num5 = escaner5.nextInt();
    escaner5.close();
    if (num4 > num5) {
        System.out.println("El primer número es mayor");
    } else {
        System.out.println("El segundo número es mayor");
        }
    
    //Escribe un programa que pida al usuario un número y verifique si es positivo, negativo o cero.

    Scanner escaner6 = new Scanner(System.in);
    System.out.println("Ingrese un número: ");
    int num6 = escaner6.nextInt();
    escaner6.close();
    if (num6 > 0) {
        System.out.println("El número es positivo");
    } else if (num6 < 0) {
        System.out.println("El número es negativo");
    } else {
        System.out.println("El número es cero");
        }
    
    //Crea un programa que pida al usuario un número entero positivo y muestre su tabla de multiplicar hasta el 10.

    Scanner escaner7 = new Scanner(System.in);
    System.out.println("Ingrese un número: ");
    int num7 = escaner7.nextInt();
    escaner7.close();
    for (int i = 1; i <= 10; i++) {
        System.out.println(num7 + " x " + i + " = " + (num7 * i));
        }
    
    //Realiza un programa que simule un juego de adivinar un número. El programa debe generar un número aleatorio entre 1 y 100,
    // y el usuario debe adivinarlo. El programa debe indicar si el número ingresado es mayor o menor que el número a adivinar.

    Scanner escaner8 = new Scanner(System.in);
    int num8 = (int) (Math.random() * 100 + 1);
    int num9 = 0;
    while (num8 != num9) {
        System.out.println("Ingrese un número: ");
        num9 = escaner8.nextInt();
        if (num9 > num8) {
            System.out.println("El número ingresado es mayor");
        } else if (num9 < num8) {
            System.out.println("El número ingresado es menor");
        } else {
            System.out.println("¡Adivinaste!");
            }
        }
    escaner8.close();

    }
    
}