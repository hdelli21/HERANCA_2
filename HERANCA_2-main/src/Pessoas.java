import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoas {

    public String Nome;
    public String Cpf;
    public LocalDate data;

    public Pessoas() {
    }

    public Pessoas(String Nome, String Cpf, LocalDate data) {

        this.Nome = Nome;
        this.Cpf = Cpf;
        this.data = data;
    }
        public LocalDate getDataNascimento() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Formata a data de nascimento se não for nula
        String dt_Formatada = (data != null) ? data.format(formatter) : "Não informada";
        return data; // Retorna a data de nascimento
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    
    }

    public void setDataNascimento(LocalDate data) {
        this.data = data;
    }
}
