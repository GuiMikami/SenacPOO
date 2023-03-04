import java.math.BigDecimal;

public class Engenheiro extends Funcionario{

    private int crea;
    private String departamento;
    public Engenheiro(int codigo, String nome, BigDecimal salario) {

        super(codigo, nome, salario);
    }

    @Override
     public  BigDecimal calculaSalario() {
        return ((getSalario()).multiply(new BigDecimal("0.5")).add(getSalario()));
    }

    @Override
    public String toString() {
        return "Salário: R$" + calculaSalario();
    }
}
