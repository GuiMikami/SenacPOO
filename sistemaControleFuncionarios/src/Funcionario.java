import java.math.BigDecimal;

public abstract class Funcionario {

    private int codigo;
    private String nome;
    private BigDecimal salario;

    public Funcionario(int codigo, String nome, BigDecimal salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
    }

    public abstract BigDecimal calculaSalario();

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
