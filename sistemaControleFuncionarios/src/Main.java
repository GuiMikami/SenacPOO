import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

    var funcionario1 = new Engenheiro(1, "Guilherme", new BigDecimal(4500.5), 113523, "Engenharia");
        System.out.println(funcionario1.retornarDados());
    }
}