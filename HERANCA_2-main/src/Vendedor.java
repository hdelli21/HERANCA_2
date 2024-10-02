import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vendedor extends Pessoas {

    double salario;
    double percentual;
    LocalDate Dt_contratacao;

    public Vendedor() {
    }

    public Vendedor(double salario, double percentual, LocalDate Dt_contratacao) {
        this.salario = salario;
        this.percentual = percentual;
        this.Dt_contratacao = Dt_contratacao;
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

    public void Vender(String venda) {
        System.out.println("Venda realizada: " + venda);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPercentual() {

        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }
}
