public class Main {
    public static void main(String[] args) {

        System.out.println("*--Produto 1--*");
        var eletronico1 = new Eletronicos("PS5",4900, "Sony", "Playstation 5");
        eletronico1.retornarDados();

        System.out.println("*------------------------------------------------------------------------------------------*");

        System.out.println("*--Produto 2--*");
        var livro1 = new Livros("Essencialismo", 39.99, "Greg McKeown");
        livro1.retornarDados();
    }
}