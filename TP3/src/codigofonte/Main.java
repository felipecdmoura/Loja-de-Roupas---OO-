package codigofonte;

public class Main {
   public static void main(String[] args) {
        int opcoes;
        Cliente clientes = new Cliente();
        Funcionario funcionario = new Funcionario();
        Venda venda = new Venda();
        opcoes = Read.getInt();

        switch (opcoes) {
            case 1:
                //clientes.cadatrarCliente();
                venda.cadatrarVenda();
                
            case 2:
                /*System.out.println(clientes.getNome());
                System.out.println(clientes.getCpf());
                System.out.println(clientes.getEmail());
                System.out.println(clientes.getData());
                System.out.println(clientes.getNumtel());
               
                System.out.println(funcionario.getNome());*/
                //System.out.println("O nome do cliente e: "+venda.getNome());
                //System.out.println("O valor da venda e R$ "+venda.getValorcompra());
                //System.out.println("O numero de identificação da venda e: "+venda.getNumident());
                System.out.println(clientes);

                break;
            default:
                break;
        }
   }
}