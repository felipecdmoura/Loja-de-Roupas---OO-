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
     * Metodo que retorna uma String[] de todos os nomes dos clientes igual ao pesquisado.
     * @param Arraylist<Cliente> contendo os clientes cadastrados no programa.
     * @param nome a ser pesquisado.
     * @return String array contendo os nomes clientes achados na pesquisa.
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
     * Metodo que retorna uma String[] de todos os nomes dos funcionarios igual ao pesquisado.
     * @param Arraylist<Funcionario> contendo os funcionarios cadastrados no programa.
     * @param nome a ser pesquisado.
     * @return String array contendo os nomes dos funcionarios achados na pesquisa.
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
     * Metodo que retorna uma String[] de todos os nomes das camisas igual a pesquisada.
     * @param Arraylist<Camisa> contendo as camisas cadastrados no programa.
     * @param id da camisa as ser pesquisada.
     * @return String array contendo o id e nome das camisas achadas na pesquisa.
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
     * Metodo que retorna uma String[] de todos os nomes das calças igual a pesquisada.
     * @param Arraylist<Calca> contendo as calcas cadastrados no programa.
     * @param id da calca as ser pesquisada.
     * @return String array contendo o id e nome das calcas achadas na pesquisa.
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
     * Metodo que retorna uma String[] da venda igual a pesquisada.
     * @param Arraylist<Venda> contendo as vendas cadastrados no programa.
     * @param protocolo da venda as ser pesquisada.
     * @return String array contendo o protocolo e nome das vendas achadas na pesquisa.
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
