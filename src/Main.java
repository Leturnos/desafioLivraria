import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String opt;
        do {
            System.out.println("Bem vindo à livraria, o que deseja?\n" +
                    "1 - Adicionar livro\n" +
                    "2 - Listar livros\n" +
                    "3 - Realizar emprestimo\n" +
                    "4 - Sair\n");
                opt = scanner.next();
        } while (!opt.equals("4"));
    }
}