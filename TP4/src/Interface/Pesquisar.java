package Interface;

import java.util.ArrayList;

import Objetos.*;
/**
 * classe responsavel por instanciar os metodos que serao utilizados para realizar as pesquisas
 * @author Felipe e João
 * @version TP5 (Outubro 2021)
 */
public class Pesquisar {
    
    /** 
     * metodo que obtem uma String[] de todos os nomes dos clientes igual ao pesquisado.
     * @param clientes
     * @param clientepesquisado
     * @return String[]
     */
    
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

    
    /** 
     * metodo que obtem uma String[] de todos os nomes dos funcionarios igual ao pesquisado.
     * @param funcionarios
     * @param funcionariopesquisado
     * @return String[]
     */
    
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

    
    /** 
     * metodo que obtem uma String[] de todos os nomes das camisas igual ao pesquisado.
     * @param camisas
     * @param id
     * @return String[]
     */
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
    
    /** 
     * metodo que obtem uma String[] de todos os nomes das calças igual ao pesquisado.
     * @param calcas
     * @param id
     * @return String[]
     */

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
    
    /** 
     * metodo que obtem uma String[] da venda igual ao pesquisado.
     * @param vendas
     * @param protoc
     * @return String[]
     */
    
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
