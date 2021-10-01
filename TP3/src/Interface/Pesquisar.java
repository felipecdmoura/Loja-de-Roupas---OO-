package Interface;

import java.util.ArrayList;

import Objetos.*;

public class Pesquisar {
    //metodo que obtem uma String[] de todos os nomes igual ao pesquisado.
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

    //metodo que obtem uma String[] de todos os nomes igual ao pesquisado.
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

    //metodo que obtem uma String[] de todos os nomes igual ao pesquisado.
    public static String[] pesquisarCamisa(ArrayList<Camisa> camisas , String id) {
        String [] camisapesq = new String[camisas.size()];
        int count = 0;

        for (Camisa idpesq : camisas) {
            if(idpesq.getId().equalsIgnoreCase(id)){
                camisapesq[count] = idpesq.getId() + "-" + idpesq.getNome();
                count++;
            }
        }

        return camisapesq;
    }
    //metodo que obtem uma String[] de todos os nomes igual ao pesquisado.
    public static String[] pesquisarCalca(ArrayList<Calca> calcas ,String id) {
        String [] calcapesq = new String[calcas.size()];
        int count = 0;

        for (Calca idpesq : calcas) {
            if(idpesq.getId().equalsIgnoreCase(id)){
                calcapesq[count] = idpesq.getId() + "-" + idpesq.getNome();
                count++;
            }
        }

        return calcapesq;
    }
    //metodo que obtem uma String[] de todos os nomes igual ao pesquisado.
    public static String[] pesquisarVenda(ArrayList<Venda> vendas, String protoc) {
        String [] vendapesq = new String[vendas.size()];
        int count = 0;

        for (Venda protocpesq : vendas) {
            if(protocpesq.getProtocolo().equalsIgnoreCase(protoc)){
                vendapesq[count] = protocpesq.getProtocolo() + "-" + protocpesq.getCliente().getNome();
                count++;
            }
        }

        return vendapesq;
    }
}
