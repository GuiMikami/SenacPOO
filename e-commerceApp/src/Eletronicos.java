public class Eletronicos extends Produtos{
    public Eletronicos(String nome, double preco, String marca, String modelo) {
        super(nome, preco);
        this.marca = marca;
        this.modelo = modelo;
    }

    private String marca;
    private String modelo;

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

    @Override
    public void retornarDados() {
        super.retornarDados();
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
    }
}
