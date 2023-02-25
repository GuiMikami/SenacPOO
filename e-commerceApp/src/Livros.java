public class Livros extends Produtos{

    public Livros(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }
    private String autor;

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void retornarDados() {
        super.retornarDados();
        System.out.println("Autor: " + getAutor());
    }
}
