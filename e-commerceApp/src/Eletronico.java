import java.math.BigDecimal;

public class Eletronico extends Produto{
    private String marca;
    private String modelo;

    public Eletronico(String nome, BigDecimal preco, String marca, String modelo) {
        super(nome, preco);
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String retornarDados() {
        super.retornarDados();
        return "Descrição: " + getNome() + " " +"Preço: R$" + getPreco() + " " + "Marca: " + getMarca() +
                " " + "Modelo: " + getModelo();
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}
