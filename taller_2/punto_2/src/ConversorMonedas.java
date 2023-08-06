public class ConversorMonedas {

    public static double convertirDolaresAEuros(double dolares) {
        return dolares * 0.85;
    }

    public static double convertirEurosADolares(double euros) {
        return euros * 1.18;
    }

    public static double convertirPesosADolares(double pesos) {
        return pesos * 0.00027;
    }

    public static double convertirDolaresAPesos(double dolares) {
        return dolares * 3700;
    }

    public static double convertirPesosAEuros(double pesos) {
        return convertirDolaresAEuros(convertirPesosADolares(pesos));
    }

    public static double convertirEurosAPesos(double euros) {
        return convertirDolaresAPesos(convertirEurosADolares(euros));
    }
    
}
