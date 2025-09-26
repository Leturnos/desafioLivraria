import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        String opt;
        do {
            System.out.println("Bem vindo à livraria, o que deseja?\n" +
                    "1 - Adicionar livro\n" +
                    "2 - Listar livros\n" +
                    "3 - Realizar emprestimo\n" +
                    "4 - Sair\n");
                opt = scanner.next();

            switch (opt) {
                case "1" -> {
                    System.out.println("Digite o nome do livro:");
                    String titulo = scanner.next();
                    System.out.println("Digite o autor do livro:");
                    String nomeAutor = scanner.next();
                    System.out.println("Quando esse autor nasceu? exemplo: 09/10/2000");
                    String idadeAutor = scanner.next();

                    Livro livro = new Livro(titulo, nomeAutor);
                    Autor autor = new Autor(nomeAutor, idadeAutor);
                    biblioteca.adicionarLivro(livro);
                    biblioteca.adicionarAutor(autor);
                }
                case "2" -> {
                    biblioteca.listarLivros();
                }
                case "3" -> {
                    System.out.println("Digite o id do livro desejado");
                    int id = scanner.nextInt();
                    System.out.println("Qual o seu nome?");
                    String nomeCliente = scanner.next();
                    System.out.println("Quando você nasceu? exemplo: 09/10/2000");
                    String idadeCliente = scanner.next();
                    System.out.println("Digite seu email");
                    String emailCliente = scanner.next();

                    Cliente cliente = new Cliente(nomeCliente, idadeCliente, emailCliente);
                    biblioteca.emprestarLivro(cliente, id);
                }
                case null, default -> {}
            }

        } while (!opt.equals("4"));
    }
}