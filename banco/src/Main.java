public class Main {
    public static void main(String[] args) {


        var conta = new Conta(1234,100);
        System.out.println(conta.calcularSaldo());

        var contaCorrente = new ContaCorrente(4321,200,10);
        System.out.println(contaCorrente.getTarifa());


        var contaVip = new ContaVip(4321,200,1000);
        System.out.println(contaVip.calcularSaldo());
    }
}