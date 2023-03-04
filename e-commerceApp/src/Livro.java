import java.math.BigDecimal;

public class Livro extends Produto{

    private String autor;

    public Livro(String nome, BigDecimal preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public String retornarDados() {
        super.retornarDados();
        return "Descrição: " + getNome() + " " + "Preço: R$"
                + getPreco() + " " + "Autor: " + getAutor();
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }


}
