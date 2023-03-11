import java.math.BigDecimal;

public final class Presidente extends Funcionario{

    private BigDecimal prl;

    public Presidente(int codigo, String nome, BigDecimal salario, BigDecimal prl) {
        super(codigo, nome, salario);
        this.prl = prl;
    }

    @Override
    public BigDecimal calculaSalario() {
        return getSalario().add(getPrl());
    }
    @Override
    public String retornarDados() {
        return "ID:" + getCodigo() + " " + "Presidente:" + getNome() +  " Salário:R$" + calculaSalario() ;
    }
    public BigDecimal getPrl() {
        return prl;
    }

    public void setPrl(BigDecimal prl) {
        this.prl = prl;
    }


}
