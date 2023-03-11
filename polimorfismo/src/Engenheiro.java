import java.math.BigDecimal;

public class Engenheiro extends Funcionario{

    private int crea;
    private String departamento;
    public Engenheiro(int codigo, String nome, BigDecimal salario, int crea, String departamento) {
        super(codigo, nome, salario);
        this.crea = crea;
        this.departamento = departamento;
    }

    @Override
     public  BigDecimal calculaSalario() {
        return ((getSalario()).multiply(new BigDecimal("0.5")).add(getSalario()));
    }

    @Override
    public String retornarDados() {
        return "ID:" + getCodigo() + " Nome:" + getNome() + " CREA:" + getCrea() + " Departamento:" + getDepartamento() +
                " Salário:R$" + calculaSalario() ;
    }

    public int getCrea() {
        return crea;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
