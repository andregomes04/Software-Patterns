package ex3;

public class Livro {

    private State state; //livro tem uma instancia de State (o estado em que se encontra)

    private String titulo;
    private int isbn;
    private int ano;
    private String autor;

    public Livro(String titulo, int isbn, int ano, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.ano = ano;
        this.autor = autor;
        this.state = new Inventario(); //quando criamos um livro, este está automaticamente em inventário
    }

    public void setState(State state){  
        this.state = state;
    }

    public void regista(){ //implementar os mesmos métodos que estão listados em State, passando 'this' (este livro) como argumento
        this.state.regista(this);
    }
    public void requisista(){
        this.state.requisista(this);
    }
    public void devolve(){
        this.state.devolve(this);
    }
    public void reserva(){
        this.state.reserva(this);
    }
    public void cancelaReserva(){
        this.state.cancelaReserva(this);
    }

    public String getName(){
        return this.titulo;
    }

     public int getIsbn() {
        return this.isbn;
    }

    @Override
    public String toString() {
        return String.format("Book: %-5d %-20s %-20s %-15s", isbn, titulo, autor,"[" + state.getClass().getSimpleName() + "]");
    }
}
