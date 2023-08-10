/**
 * 3. Banco y cuentas: Desarrolla un sistema bancario que incluya una interfaz para representar
 *  cuentas bancarias y métodos para depositar y retirar dinero. Crea una clase abstracta que
 *  implemente parte de la lógica común de las cuentas, y luego implementa clases concretas para
 *  diferentes tipos de cuentas, como cuentas de ahorro y cuentas corrientes.
 */

public class App3_3 {
    public static void main(String[] args) throws Exception {

        ICuenta cuentaCorriente = new CuentaCorriente(1000, 500);
        ICuenta cuentaAhorros = new CuentaAhorros(1000, 0.05);


        //prueba de la clase y metodos de la cuenta corriente
        cuentaCorriente.mostrarSaldo();
        cuentaCorriente.depositar(1000);
        cuentaCorriente.mostrarSaldo();
        cuentaCorriente.retirar(2000);
        cuentaCorriente.mostrarSaldo();
        cuentaCorriente.retirar(1000);
        cuentaCorriente.mostrarSaldo();
        cuentaCorriente.retirar(1000);
        cuentaCorriente.mostrarSaldo();

        //prueba de la clase y metodos de la cuenta de ahorros
        cuentaAhorros.mostrarSaldo();
        cuentaAhorros.depositar(1000);
        cuentaAhorros.mostrarSaldo();
        cuentaAhorros.retirar(2000);
        cuentaAhorros.mostrarSaldo();
        cuentaAhorros.retirar(1000);
        cuentaAhorros.mostrarSaldo();
        cuentaAhorros.retirar(1000);
        cuentaAhorros.mostrarSaldo();
        ((CuentaAhorros) cuentaAhorros).aplicarInteres();
        cuentaAhorros.mostrarSaldo();

    }
}
