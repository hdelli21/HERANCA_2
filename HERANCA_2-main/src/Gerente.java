import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Gerente extends Pessoas {

    double salario_base;
    String depertamento;
    LocalDate Dt_contratacao;

    public Gerente() {
    }

    public Gerente(String depertamento, int salario_base, LocalDate Dt_contratacao) {
        this.depertamento = depertamento;
        this.salario_base = salario_base;
        this.Dt_contratacao = Dt_contratacao;
    }

    public void Gerenciar(String Liderar) {
        System.out.println("Gerenciando a equipe: " + Liderar);
    }

    public void setDataContracacao(LocalDate Dt_contratacao) {
        this.Dt_contratacao = Dt_contratacao;
    }

    public LocalDate getDataContratacao() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Formata a data de nascimento se não for nula
        String dt_Formatada = (Dt_contratacao != null) ? Dt_contratacao.format(formatter) : "Não informada";
        return Dt_contratacao; // Retorna a data de nascimento
    }

    public double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    public String getDepertamento() {
        return depertamento;
    }

    public void setDepertamento(String depertamento) {
        this.depertamento = depertamento;
    }
}
