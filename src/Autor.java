import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Autor {
    private static long id;
    private String nome;
    private LocalDate dataNascimento;

    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Autor(String nome, String dataNascimento) {
        id++;
        this.nome = nome;
        this.dataNascimento = LocalDate.parse(dataNascimento, formato);
    }
}
