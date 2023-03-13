import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

    var guilherme = new Engenheiro(1, "Guilherme", new BigDecimal(4500.5), 113523, "Engenharia");
        System.out.println(guilherme.retornarDados());

        var joao = new Gerente(2,"João",new BigDecimal(5260), "Comercial", new BigDecimal(550));
        System.out.println(joao.retornarDados());

        var rafael = new Presidente(3,"Rafael", new BigDecimal(45000), new BigDecimal(25000));
        System.out.println(rafael.retornarDados());

        var folhaDePagamento = new FolhaDePagamento();
        folhaDePagamento.registrar(guilherme);
        folhaDePagamento.registrar(joao);
        folhaDePagamento.registrar(rafael);

        folhaDePagamento.login(joao);
        folhaDePagamento.login(rafael);
        folhaDePagamento.login(new Auditor());

        System.out.println(folhaDePagamento.getTotalDaFolhaDePagamento());
    }

}