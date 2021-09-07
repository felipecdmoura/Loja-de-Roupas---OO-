package codigofonte;

public class Main {
   public static void main(String[] args) {
        int opcoes;
        Cliente clientes = new Cliente();
        Funcionario funcionario = new Funcionario();

        opcoes = Read.getInt();

        switch (opcoes) {
            case 1:
                //clientes.cadatrarCliente();
            case 2:
                /*System.out.println(clientes.getNome());
                System.out.println(clientes.getCpf());
                System.out.println(clientes.getEmail());
                System.out.println(clientes.getData());
                System.out.println(clientes.getNumtel());
               
                System.out.println(funcionario.getNome());*/

                System.out.println(clientes.toString());

                break;
            default:
                break;
        }
   }
}