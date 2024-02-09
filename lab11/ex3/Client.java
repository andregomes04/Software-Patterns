package ex3;

public class Client {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();
        b.novoLivro(new Livro("Java Anti-Stress", 1, 2015, "Omodionah"));
        b.novoLivro(new Livro("A Guerra dos Padrões", 2, 1999, "Jorge Omel"));
        b.novoLivro(new Livro("A Procura da Luz", 3, 2005, "Khumatkl"));
        b.listBiblio();
    }
}
