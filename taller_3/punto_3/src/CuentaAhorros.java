public class CuentaAhorros implements ICuenta{

    private double saldo;
    private double interes;

    public CuentaAhorros(double saldo, double interes) {
        this.saldo = saldo;
        this.interes = interes;
    }

    @Override
    public void retirar(double monto) {
        if (monto <= this.saldo) {
            this.saldo -= monto;
        } else {
            System.out.println("No tiene suficiente saldo para retirar");
        }
    }

    @Override
    public void depositar(double monto) {
        this.saldo += monto;
    }

    @Override
    public void mostrarSaldo() {
        System.out.println("Saldo: " + this.saldo);
    }

    public void aplicarInteres() {
        this.saldo += this.saldo * this.interes;
    }
    
}
