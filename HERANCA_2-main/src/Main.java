import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

    Vendedor vend = new Vendedor();
     vend.setNome ("Maria");
     vend.setCpf("475.112.689-89");
     vend.setDataNascimento(LocalDate.of(2000, 3, 25));
     vend.setDataContracacao(LocalDate.of(2023, 10, 31));
     vend.setSalario(1500);
     vend.setPercentual(15.0);

System.out.println ("Nome:"+ vend.getNome ());
System.out.println ("CPF:"+ vend.getCpf());
System.out.println ("Data de contratacao:"+ vend.getDataContratacao());
System.out.println ("Salario:"+ vend.getSalario());
System.out.println ("Comissao:"+ vend.getPercentual());
vend.Vender("Notebook");

Gerente gerent = new Gerente();
     gerent.setNome ("Mario");
     gerent.setCpf("745.459.777-30");
     gerent.setDataNascimento(LocalDate.of(1982, 10, 10));
     gerent.setDataContracacao(LocalDate.of(2024, 12, 25));
     gerent.setSalario_base(3000);
     gerent.setDepertamento("Estoque");

     System.out.println ("Nome:"+ gerent.getNome ());
System.out.println ("CPF:"+ gerent.getCpf());
System.out.println("Data de Nascimento: " + gerent.getDataNascimento());
System.out.println ("Data de contratacao:"+ gerent.getDataContratacao());
System.out.println ("Salario:"+ gerent.getSalario_base());
System.out.println ("Departamento:"+ gerent.getDepertamento());
gerent.Gerenciar("Estoquistas");

Cliente cliente = new Cliente();
     cliente.setNome ("Lucas");
     cliente.setCpf("444.876.124-21");
     cliente.setDataNascimento(LocalDate.of(2003, 11, 5));
     cliente.setCartaofidelidade("5784569452");
     cliente.setEmail("lucasfaacens@hotmail.com");
cliente.setTelefone("15 9971-3260");
     System.out.println("Nome: " + cliente.getNome());
     System.out.println("CPF: " + cliente.getCpf());
     System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
     System.out.println("Email: " + cliente.getEmail());
     System.out.println("Número do Cartão de Fidelidade: " + cliente.getCartaofidelidade());
     System.out.println("Telefone: " + cliente.getTelefone());
    }

}


    

    


