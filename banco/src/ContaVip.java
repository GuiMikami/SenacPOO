public class ContaVip extends Conta{
    public ContaVip(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }
    private double limite;

    public double calcularSaldo(){    //subscrita de metodo

        return saldo + limite;
    }
    public double getLimite() {
        return limite;
    }
}
