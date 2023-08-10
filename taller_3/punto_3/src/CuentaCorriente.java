public class CuentaCorriente implements ICuenta {

    private double saldo;
    private double sobregiro;

    public CuentaCorriente(double saldo, double sobregiro) {
        this.saldo = saldo;
        this.sobregiro = sobregiro;
    }

    @Override
    public void retirar(double monto) {
        if (monto <= this.saldo) {
            this.saldo -= monto;
        } else if (monto <= this.saldo + this.sobregiro) {
            this.saldo = 0;
            this.sobregiro -= monto - this.saldo;
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
    
}
