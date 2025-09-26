import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {
    private long id;
    private String nome;
    private LocalDate dataNascimento;
    private String email;

    private static int contadorId = 0;
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Cliente(){}

    public Cliente(String nome, String dataNascimento, String email) {
        this.id = ++contadorId;
        this.nome = nome;
        this.dataNascimento = LocalDate.parse(dataNascimento, formato);
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Cliente.contadorId = contadorId;
    }
}
