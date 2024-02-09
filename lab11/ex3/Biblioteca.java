package ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    private List<Livro> livros;
    private Livro liv;

    Biblioteca(){
        this.livros = new ArrayList<>();
    }

    public void novoLivro(Livro livro){
        this.livros.add(livro);
    }

    public void listBiblio(){
        Scanner sc = new Scanner(System.in);
        boolean erro = false;
        do {
        System.out.println("*** Biblioteca ***");
        for (Livro l: livros){
            System.out.println(l);
        }
        System.out.println(">> <livro>, <operação: (1)regista; (2)requisita; (3)devolve; (4)reserva; (5)cancela \n");
        String line = sc.nextLine();

        int isbn = Integer.parseInt(line.split(",")[0]);
        int operacao = Integer.parseInt(line.split(",")[1]);

        for (Livro l: livros){
            if(l.getIsbn()==isbn){
               liv = l;
            }
        }

        switch (operacao) {
            case 1:
                liv.regista();
                break;
            case 2:
                liv.requisista();
                break;

            case 3:
                liv.devolve();
                break;

            case 4:
                liv.reserva(); 
                break;

            case 5:
                liv.cancelaReserva();   
                break;

            default:
                System.out.println("Use uma das operações listadas!");
                erro = true;
                break;
        }
    } while (!erro);
        sc.close();
    }
}
