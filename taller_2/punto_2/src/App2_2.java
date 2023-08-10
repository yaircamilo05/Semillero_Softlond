/**
2. Conversor de Monedas:
Crea una clase ConversorMonedas que contenga métodos para convertir una cantidad de
dinero de una moneda a otra, por ejemplo, de dólares a euros o de pesos a dólares.
 */

public class App2_2 {
    public static void main(String[] args) throws Exception {

        System.out.println("Convertir 1000 pesos a dolares: " + ConversorMonedas.convertirPesosADolares(1000));
        System.out.println("Convertir 1000 dolares a pesos: " + ConversorMonedas.convertirDolaresAPesos(1000));
        System.out.println("Convertir 1000 dolares a euros: " + ConversorMonedas.convertirDolaresAEuros(1000));
        System.out.println("Convertir 1000 euros a dolares: " + ConversorMonedas.convertirEurosADolares(1000));
        System.out.println("Convertir 1000 pesos a euros: " + ConversorMonedas.convertirPesosAEuros(1000));
        System.out.println("Convertir 1000 euros a pesos: " + ConversorMonedas.convertirEurosAPesos(1000));
        
        
    }
}
