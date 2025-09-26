import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<Livro>();
    private List<Autor> autores = new ArrayList<Autor>();
    private List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarAutor(Autor autor) {
        autores.add(autor);
    }

    public void listarLivros(){
        for (Livro livro : livros) {
            if (livro.isDisponivel()){
                System.out.println(livro);
            }
        }
    }

    public void emprestarLivro(Cliente cliente, int id){
        boolean achou = false;
        for (Livro livro : livros) {
            if (livro.getId() == id && livro.isDisponivel()){
                livro.setDisponivel(false);
                System.out.println(livro +  " emprestado");
                Emprestimo emprestimo = new Emprestimo(cliente, livro);
                emprestimos.add(emprestimo);
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("Livro de id " + id + " não encontrado!");
        }
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
}
