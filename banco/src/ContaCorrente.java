public class ContaCorrente extends Conta {
    public ContaCorrente(int numero, double saldo, double tarifa) {
        super(numero, saldo);
        this.tarifa = tarifa;
    }

    private double tarifa;

    public double getTarifa() {
        return tarifa;
    }
}
