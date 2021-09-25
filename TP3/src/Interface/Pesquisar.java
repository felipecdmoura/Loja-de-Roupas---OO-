package Interface;

import java.util.ArrayList;

import Objetos.Cliente;
import Objetos.Funcionario;

public class Pesquisar {

    public static String[] pesquisarCliente(ArrayList<Cliente> clientes, String clientepesquisado) {
        String [] nomespesq = new String[clientes.size()];
        int count = 0;

        for (Cliente clientePsq : clientes) {
            if(clientePsq.getNome().equalsIgnoreCase(clientepesquisado)){
                nomespesq[count] = clientePsq.getNome();
                count++;
            }
        }

        return nomespesq;
    }

    public static String[] pesquisarFuncionario(ArrayList<Funcionario> funcionarios ,String funcionariopesquisado) {
        String [] nomespesq = new String[funcionarios.size()];
        int count = 0;

        for (Funcionario funcpesq : funcionarios) {
            if(funcpesq.getNome().equalsIgnoreCase(funcionariopesquisado)){
                nomespesq[count] = funcpesq.getNome();
                count++;
            }
        }

        return nomespesq;
    }
}
