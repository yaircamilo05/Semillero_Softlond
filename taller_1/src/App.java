import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner Elector = new Scanner(System.in);
        System.out.println("Ingrese el numero de ejercicio que quiere ver: ");
        int numEjercicio = Elector.nextInt();
        Elector.close();

        switch (numEjercicio) {
            case 1:
                // Realiza un programa que solicite al usuario dos números enteros y muestre su
                // suma, resta, multiplicación y división.

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
                break;

            case 2:

                // Escribe un programa que pida al usuario un número entero y determine si es
                // par o impar.

                Scanner escaner2 = new Scanner(System.in);
                System.out.println("Ingrese un número: ");
                int num3 = escaner2.nextInt();
                escaner2.close();
                if (num3 % 2 == 0) {
                    System.out.println("El número es par");
                } else {
                    System.out.println("El número es impar");
                }
                break;

            case 3:
                // Crea un programa que calcule y muestre el área y el perímetro de un círculo.
                // El usuario debe proporcionar el radio del círculo.

                Scanner escaner3 = new Scanner(System.in);
                System.out.println("Ingrese el radio del círculo: ");
                double radio = escaner3.nextDouble();
                escaner3.close();
                double area = Math.PI * Math.pow(radio, 2);
                double perimetro = 2 * Math.PI * radio;
                System.out.println("El área del círculo es: " + area);
                System.out.println("El perímetro del círculo es: " + perimetro);
                break;

            case 4:

                // Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad o
                // menor de edad.

                Scanner escaner4 = new Scanner(System.in);
                System.out.println("Ingrese su edad: ");
                int edad = escaner4.nextInt();
                escaner4.close();
                if (edad >= 18) {
                    System.out.println("Usted es mayor de edad");
                } else {
                    System.out.println("Usted es menor de edad");
                }
                break;

            case 5:
                // Realiza un programa que solicite al usuario dos números enteros y determine
                // cuál es el mayor de ellos.

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
                break;

            case 6:
                // Escribe un programa que pida al usuario un número y verifique si es positivo,
                // negativo o cero.

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
                break;

            case 7:
                // Crea un programa que pida al usuario un número entero positivo y muestre su
                // tabla de multiplicar hasta el 10.

                Scanner escaner7 = new Scanner(System.in);
                System.out.println("Ingrese un número: ");
                int num7 = escaner7.nextInt();
                escaner7.close();
                for (int i = 1; i <= 10; i++) {
                    System.out.println(num7 + " x " + i + " = " + (num7 * i));
                }
                break;

            case 8:

                // Realiza un programa que simule un juego de adivinar un número. El programa
                // debe generar un número aleatorio entre 1 y 100,
                // y el usuario debe adivinarlo. El programa debe indicar si el número ingresado
                // es mayor o menor que el número a adivinar.

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

                break;

            case 9:
                // Escribe un programa que solicite al usuario un número entero positivo y
                // calcule su factorial.

                Scanner escaner9 = new Scanner(System.in);
                System.out.println("Ingrese un número: ");
                int num10 = escaner9.nextInt();
                escaner9.close();
                int factorial = 1;
                for (int i = 1; i <= num10; i++) {
                    factorial *= i;
                }
                System.out.println("El factorial de " + num10 + " es: " + factorial);

                break;

            case 10:

                // Ejercicio 10: Crea un programa que muestre los primeros 20 números de la
                // serie Fibonacci.
                // La serie Fibonacci se forma sumando los dos números anteriores para obtener
                // el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …

                int num11 = 0;
                int num12 = 1;
                int num13 = 0;
                for (int i = 0; i < 20; i++) {
                    System.out.println(num11);
                    num13 = num11 + num12;
                    num11 = num12;
                    num12 = num13;
                }

                break;

            case 11:

                // Escribe un programa que calcule el área de un triángulo utilizando la fórmula
                // de Herón.
                // El usuario debe ingresar las longitudes de los tres lados.

                Scanner escaner10 = new Scanner(System.in);
                System.out.println("Ingrese la longitud del primer lado: ");
                double lado1 = escaner10.nextDouble();
                System.out.println("Ingrese la longitud del segundo lado: ");
                double lado2 = escaner10.nextDouble();
                System.out.println("Ingrese la longitud del tercer lado: ");
                double lado3 = escaner10.nextDouble();
                escaner10.close();
                double s = (lado1 + lado2 + lado3) / 2;
                double area2 = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
                System.out.println("El área del triángulo es: " + area2);

                break;

            case 12:

                // Realiza un programa que pida al usuario un número entero y determine si es un
                // número primo o no

                Scanner escaner11 = new Scanner(System.in);
                System.out.println("Ingrese un número: ");
                int num14 = escaner11.nextInt();
                escaner11.close();
                boolean primo = true;
                for (int i = 2; i < num14; i++) {
                    if (num14 % i == 0) {
                        primo = false;
                        break;
                    }
                }
                if (primo) {
                    System.out.println("El número es primo");
                } else {
                    System.out.println("El número no es primo");

                }

                break;

            case 13:
                // Pide al usuario un número decimal y muestra su valor redondeado a un número
                // específico de decimales

                Scanner escaner12 = new Scanner(System.in);
                System.out.println("Ingrese un número decimal: ");
                double num15 = escaner12.nextDouble();
                System.out.println("Ingrese la cantidad de decimales: ");
                int num16 = escaner12.nextInt();
                escaner12.close();
                double num17 = Math.round(num15 * Math.pow(10, num16)) / Math.pow(10, num16);
                System.out.println("El número redondeado es: " + num17);
                break;

            case 14:

                // Escribe un programa que solicite al usuario un número entero positivo y
                // verifique si es un número perfecto.
                // Un número perfecto es aquel cuya suma de sus divisores propios (excluyendo al
                // propio número) es igual al número.

                Scanner escaner13 = new Scanner(System.in);
                System.out.println("Ingrese un número: ");
                int num18 = escaner13.nextInt();
                escaner13.close();
                int suma = 0;
                for (int i = 1; i < num18; i++) {
                    if (num18 % i == 0) {
                        suma += i;
                    }
                }

                if (suma == num18) {
                    System.out.println("El número es perfecto");
                } else {
                    System.out.println("El número no es perfecto");
                }

                break;

            case 15:

                // Crea un programa que pida al usuario un número entero y determine si es un
                // número capicúa.
                // Un número capicúa es aquel que se lee igual de izquierda a derecha que de
                // derecha a izquierda.

                Scanner escaner14 = new Scanner(System.in);
                System.out.println("Ingrese un número: ");
                int num19 = escaner14.nextInt();
                escaner14.close();
                int num20 = num19;
                int num21 = 0;
                while (num19 != 0) {
                    num21 = num21 * 10 + num19 % 10;
                    num19 /= 10;
                }
                if (num20 == num21) {
                    System.out.println("El número es capicúa");
                } else {
                    System.out.println("El número no es capicúa");
                }

            case 16:

                // Realiza un programa que calcule e imprima la serie de Fibonacci hasta un
                // número dado ingresado por el usuario.

                Scanner escaner15 = new Scanner(System.in);
                System.out.println("Ingrese un número: ");
                int num22 = escaner15.nextInt();
                escaner15.close();
                int num23 = 0;
                int num24 = 1;
                int num25 = 0;
                while (num23 <= num22) {
                    System.out.println(num23);
                    num25 = num23 + num24;
                    num23 = num24;
                    num24 = num25;
                }

                break;

            case 17:

                // Pide al usuario dos números enteros y muestra todos los números primos que se
                // encuentran en ese rango.

                Scanner escaner16 = new Scanner(System.in);
                System.out.println("Ingrese un número: ");
                int num26 = escaner16.nextInt();
                System.out.println("Ingrese otro número: ");
                int num27 = escaner16.nextInt();
                escaner16.close();
                for (int i = num26; i <= num27; i++) {
                    boolean primo2 = true;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            primo2 = false;
                            break;
                        }
                    }
                    if (primo2) {
                        System.out.println(i);
                    }
                }

                break;

            case 18:

                // Crea un programa que genere una contraseña aleatoria de 8 caracteres que
                // contenga letras mayúsculas, letras minúsculas y dígitos.
                // Puedes utilizar la clase Math para generar números aleatorios y la clase
                // String para manipular la contraseña.

                String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                String minusculas = "abcdefghijklmnopqrstuvwxyz";
                String numeros = "0123456789";
                String caracteres = mayusculas + minusculas + numeros;
                Random random = new Random();
                char[] password = new char[8];
                for (int i = 0; i < 8; i++) {
                    password[i] = caracteres.charAt(random.nextInt(caracteres.length()));
                }
                System.out.println(password);

                break;

            case 19:

                // Escribe un programa que solicite al usuario su nombre y luego lo imprima en
                // mayúsculas y minúsculas

                Scanner escaner17 = new Scanner(System.in);
                System.out.println("Ingrese su nombre: ");
                String nombre = escaner17.nextLine();
                escaner17.close();
                System.out.println(nombre.toUpperCase());
                System.out.println(nombre.toLowerCase());

                break;

            case 20:

                // Crea un programa que solicite al usuario una cadena y luego invierta su orden

                Scanner escaner18 = new Scanner(System.in);
                System.out.println("Ingrese una cadena: ");
                String cadena = escaner18.nextLine();
                escaner18.close();
                String cadenaInvertida = "";
                for (int i = cadena.length() - 1; i >= 0; i--) {
                    cadenaInvertida += cadena.charAt(i);
                }
                System.out.println(cadenaInvertida);

                break;

            case 21:

                // Pide al usuario una cadena y muestra cuántas veces aparece una letra
                // específica en ella

                Scanner escaner19 = new Scanner(System.in);
                System.out.println("Ingrese una cadena: ");
                String cadena2 = escaner19.nextLine();
                System.out.println("Ingrese una letra: ");
                String letra = escaner19.nextLine();
                escaner19.close();
                int contador = 0;
                for (int i = 0; i < cadena2.length(); i++) {
                    if (cadena2.charAt(i) == letra.charAt(0)) {
                        contador++;
                    }
                }
                System.out.println("La letra " + letra + " aparece " + contador + " veces");

                break;

            case 22:

                // Escribe un programa que solicite al usuario una frase y verifique si es un
                // palíndromo
                // (se lee igual de izquierda a derecha que de derecha a izquierda)

                Scanner escaner20 = new Scanner(System.in);
                System.out.println("Ingrese una frase: ");
                String frase = escaner20.nextLine();
                escaner20.close();
                String fraseSinEspacios = frase.replace(" ", "");
                String fraseInvertida = "";
                for (int i = fraseSinEspacios.length() - 1; i >= 0; i--) {
                    fraseInvertida += fraseSinEspacios.charAt(i);
                }

                if (fraseSinEspacios.equals(fraseInvertida)) {
                    System.out.println("La frase es un palíndromo");
                } else {
                    System.out.println("La frase no es un palíndromo");
                }

                break;

            case 23:

                // Crea un programa que pida al usuario una oración y muestre cuántas palabras
                // contiene

                Scanner escaner21 = new Scanner(System.in);
                System.out.println("Ingrese una oración: ");
                String oracion = escaner21.nextLine();
                escaner21.close();
                int contador2 = 1;
                for (int i = 0; i < oracion.length(); i++) {
                    if (oracion.charAt(i) == ' ') {
                        contador2++;
                    }
                }
                System.out.println("La oración tiene " + contador2 + " palabras");

                break;

            case 24:
                // Realiza un programa que solicite al usuario una cadena y reemplace todas las
                // apariciones de una letra específica por otra

                Scanner escaner22 = new Scanner(System.in);
                System.out.println("Ingrese una cadena: ");
                String cadena3 = escaner22.nextLine();
                System.out.println("Ingrese una letra: ");
                String letra2 = escaner22.nextLine();
                System.out.println("Ingrese otra letra: ");
                String letra3 = escaner22.nextLine();
                escaner22.close();
                String cadenaReemplazada = cadena3.replace(letra2, letra3);
                System.out.println(cadenaReemplazada);

                break;

            case 25:
                // Pide al usuario una frase y muestra cada palabra por separado

                Scanner escaner23 = new Scanner(System.in);
                System.out.println("Ingrese una frase: ");
                String frase2 = escaner23.nextLine();
                escaner23.close();
                String[] palabras = frase2.split(" ");
                for (int i = 0; i < palabras.length; i++) {
                    System.out.println(palabras[i]);
                }

                break;

            case 26:

                // Escribe un programa que pida al usuario una cadena y muestre cuántos
                // caracteres tiene sin contar los espacios en blanco

                Scanner escaner24 = new Scanner(System.in);
                System.out.println("Ingrese una cadena: ");
                String cadena4 = escaner24.nextLine();
                escaner24.close();
                int contador3 = 0;
                for (int i = 0; i < cadena4.length(); i++) {
                    if (cadena4.charAt(i) != ' ') {
                        contador3++;
                    }
                }
                System.out.println("La cadena tiene " + contador3 + " caracteres sin contar los espacios en blanco");

                break;

            case 27:

                // Crea un programa que solicite al usuario una frase y luego muestre las
                // palabras ordenadas alfabéticamente

                Scanner escaner25 = new Scanner(System.in);
                System.out.println("Ingrese una frase: ");
                String frase3 = escaner25.nextLine();
                escaner25.close();
                String[] palabras2 = frase3.split(" ");
                Arrays.sort(palabras2);
                for (int i = 0; i < palabras2.length; i++) {
                    System.out.println(palabras2[i]);
                }

                break;

            case 28:

                // Suma de elementos: Escribe un programa que calcule la suma de todos los
                // elementos en un arreglo de enteros.

                int[] numeros2 = { 1, 2, 3, 4, 5 };
                int suma2 = 0;
                for (int i = 0; i < numeros2.length; i++) {
                    suma2 += numeros2[i];
                }
                System.out.println(suma2);

                break;

            case 29:

                // Encontrar el número más grande: Crea un programa que encuentre el número más
                // grande en un arreglo de enteros.

                int[] numeros3 = { 1, 2, 3, 4, 5 };
                int maximo = numeros3[0];
                for (int i = 0; i < numeros3.length; i++) {
                    if (numeros3[i] > maximo) {
                        maximo = numeros3[i];
                    }
                }

                System.out.println(maximo);

                break;

            case 30:

                // Eliminar duplicados: Diseña un programa que elimine los elementos duplicados
                // de un arreglo.

                int[] numeros4 = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 };
                int[] numerosSinDuplicados = new int[numeros4.length];
                int contador4 = 0;

                for (int i = 0; i < numeros4.length; i++) {
                    boolean existe = false;
                    for (int j = 0; j < numerosSinDuplicados.length; j++) {
                        if (numeros4[i] == numerosSinDuplicados[j]) {
                            existe = true;
                            break;
                        }
                    }
                    if (!existe) {
                        numerosSinDuplicados[contador4] = numeros4[i];
                        contador4++;
                    }
                }

                for (int i = 0; i < numerosSinDuplicados.length; i++) {
                    System.out.println(numerosSinDuplicados[i]);
                }

                break;

            case 31:

                // Ordenar elementos: Implementa un algoritmo de ordenamiento
                // (por ejemplo, el algoritmo de burbuja o el de selección) para ordenar un
                // arreglo de enteros de manera ascendente.

                /**
                 * Algoritmo de burbuja
                 */
                int[] numeros5 = { 5, 4, 3, 2, 1 };
                for (int i = 0; i < numeros5.length - 1; i++) {
                    for (int j = 0; j < numeros5.length - 1; j++) {
                        if (numeros5[j] > numeros5[j + 1]) {
                            int aux = numeros5[j];
                            numeros5[j] = numeros5[j + 1];
                            numeros5[j + 1] = aux;
                        }
                    }
                }

                for (int i = 0; i < numeros5.length; i++) {
                    System.out.println(numeros5[i]);
                }

                break;

            case 32:

                // Buscar un elemento: Escribe un programa que busque un número específico en un
                // arreglo y muestre su índice
                // (o un mensaje si no se encuentra).

                int[] numeros6 = { 1, 2, 3, 4, 5 };
                int numeroBuscado = 3;
                int indice = -1;
                for (int i = 0; i < numeros6.length; i++) {
                    if (numeros6[i] == numeroBuscado) {
                        indice = i;
                        break;
                    }
                }
                if (indice != -1) {
                    System.out.println("El número " + numeroBuscado + " se encuentra en el índice " + indice);
                } else {
                    System.out.println("El número " + numeroBuscado + " no se encuentra en el arreglo");
                }

                break;

            case 33:

                // Frecuencia de elementos: Escribe un programa que cuente la frecuencia de cada
                // elemento en un arreglo.

                int[] numeros7 = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 };
                int[] frecuencias = new int[numeros7.length];
                for (int i = 0; i < numeros7.length; i++) {
                    int contador5 = 0;
                    for (int j = 0; j < numeros7.length; j++) {
                        if (numeros7[i] == numeros7[j]) {
                            contador5++;
                        }
                    }
                    frecuencias[i] = contador5;
                }

                for (int i = 0; i < numeros7.length; i++) {
                    System.out.println(numeros7[i] + " se repite " + frecuencias[i] + " veces");
                }

                break;

            case 34:

                // Rotación de elementos: Implementa un programa que rote los elementos de un
                // arreglo hacia la izquierda
                // o la derecha una cierta cantidad de posiciones.

                int[] numeros8 = { 1, 2, 3, 4, 5 };
                int[] numerosRotados = new int[numeros8.length];
                int rotacion = 2;
                for (int i = 0; i < numeros8.length; i++) {
                    int indiceRotado = i - rotacion;
                    if (indiceRotado < 0) {
                        indiceRotado = numeros8.length + indiceRotado;
                    }
                    numerosRotados[indiceRotado] = numeros8[i];
                }

                for (int i = 0; i < numerosRotados.length; i++) {
                    System.out.println(numerosRotados[i]);
                }

                break;

            case 35:

                // Tabla de multiplicar: Crea un programa que imprima las tablas de multiplicar
                // del 1 al 10. Usa para esto una matriz

                int[][] tablas = new int[10][10];
                for (int i = 0; i < tablas.length; i++) {
                    for (int j = 0; j < tablas[i].length; j++) {
                        tablas[i][j] = (i + 1) * (j + 1);
                    }
                }
                for (int i = 0; i < tablas.length; i++) {
                    for (int j = 0; j < tablas[i].length; j++) {
                        System.out.print(tablas[i][j] + "\t");
                    }
                    System.out.println();
                }

            default:
                System.out.println("El ejercicio no existe");
                break;
        }

    }

}