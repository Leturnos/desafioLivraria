import java.time.LocalDate;

public class Livro {
    private long id;
    private String titulo;
    private String autor;
    private boolean disponivel = true;
    private LocalDate dataCadastro;
    private LocalDate dataAtualizacao;

    private static int contadorId = 0;

    @Override
    public String toString() {
        return "Livro: " +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", disponivel=" + disponivel;
    }

    public Livro(String titulo, String autor) {
        this.id = ++contadorId;
        this.titulo = titulo;
        this.autor = autor;
        this.dataCadastro = LocalDate.now();
        this.dataAtualizacao = LocalDate.now();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setDataAtualizacao(LocalDate dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
