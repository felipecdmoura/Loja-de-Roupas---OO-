package Interface;
//importa as bibliotecas e classes que usaremos
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import App.TelaPrincipal;
import Objetos.Calca;
import Objetos.Camisa;
import Objetos.Cliente;
import Objetos.Funcionario;
import Objetos.Venda;

/**
 * instancia a classe de TelaVendano qual implementa ActionListeners para que possamos utilizar dos evento.
 * @author Felipe e João
 * @version TP5 (Outubro 2021)
 */

public class TelaVenda implements ActionListener, ListSelectionListener, MouseListener {

    private JFrame janela;

    private JList<String> listavendas;
    private JScrollPane listascroll;

    private JLabel titulo;
    private JLabel perguntselec;

    private JTextField pesqvenda;

    private JButton cadastrarvenda;
    private JButton seleccamisa;
    private JButton seleccalca;
    private JButton voltar;

    private static ArrayList <Cliente> clientesTelaVenda;
    private static ArrayList <Funcionario> funcionariosTelaVenda;
    private static ArrayList <Camisa> camisasTelaVenda;
    private static ArrayList <Calca> calcasTelaVenda;
    private static ArrayList <Venda> vendasTelaVenda;

    private String[] todasvendas;
    
    /** 
     * Metodo que ira nos mostrar a nos tela venda principal .Este metodo recebe 5 arraylists como parametros.
     * (1)iguala as arraylists recebidas a instanciadas no codigo.
     * (2)Percorre o for each
     * (3)instancia os componentes e suas posições
     * @param Arraylist<Cliente> contendo os clientes cadastrados no sistema.
     * @param Arraylist<Funcionario> contendo os funcionarios cadastrados no sistema.
     * @param Arraylist<Camisa> contendo as camisas cadastrados no sistema.
     * @param Arraylist<Calca> contendo as calcas cadastrados no sistema.
     * @param Arraylist<Venda> contendo as vendas cadastrados no sistema.
     */
    
    public void telaVenda(ArrayList<Cliente> clientes, ArrayList<Funcionario> funcionarios, ArrayList<Camisa> camisas ,ArrayList<Calca> calcas, ArrayList<Venda> vendas) {
        
        
        clientesTelaVenda = clientes;
        funcionariosTelaVenda = funcionarios;
        camisasTelaVenda = camisas;
        calcasTelaVenda= calcas;
        vendasTelaVenda = vendas;

        todasvendas = new String[camisas.size()];
        int count = 0;

        for(Venda venda : vendas){
            todasvendas[count] = venda.getProtocolo() + "-" + venda.getCliente().getNome();
            count++;
        }


        janela = new JFrame("Camisas");
        listavendas = new JList<String>(todasvendas);
        listascroll = new JScrollPane();
        titulo = new JLabel("Camisas Cadastradas");
        pesqvenda = new JTextField("ID do Produto");
        cadastrarvenda = new JButton("Cadastrar");
        voltar = new JButton("Voltar");

        titulo.setFont(new Font("Arial", Font.BOLD, 40));
        titulo.setBounds(300, 10, 500, 30);

        pesqvenda.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        pesqvenda.setBounds(60, 70, 200, 30);

        listavendas.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 35));
        listavendas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listavendas.setVisibleRowCount(10);

        listascroll.setBounds(60, 120, 790, 250);
        listascroll.setViewportView(listavendas);

        voltar.setBounds(2, 399, 150, 60);
        cadastrarvenda.setBounds(425, 399, 150, 60);

        janela.setLayout(null);
        janela.add(titulo);
        janela.add(pesqvenda);
        janela.add(listascroll);
        janela.add(cadastrarvenda);
        janela.add(voltar);

        janela.setSize(1000, 500);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cadastrarvenda.addActionListener(this);
        voltar.addActionListener(this);

        pesqvenda.addMouseListener(this);
        pesqvenda.addActionListener(this);

        listavendas.addListSelectionListener(this);
    }

    
    /** 
     * Tela para escolha do tipo de produto vendido (aparece apos clicar em cadastrar venda).
     * (1)instancia os componentes e suas posições
     * @param Arraylist<Cliente> contendo os clientes cadastrados no sistema.
     * @param Arraylist<Funcionario> contendo os funcionarios cadastrados no sistema.
     * @param Arraylist<Camisa> contendo as camisas cadastrados no sistema.
     * @param Arraylist<Calca> contendo as calcas cadastrados no sistema.
     * @param Arraylist<Venda> contendo as vendas cadastrados no sistema.
     */
    
    public void telaPreCadastro(ArrayList<Cliente> clientes, ArrayList<Funcionario> funcionarios, ArrayList<Camisa> camisas ,ArrayList<Calca> calcas, ArrayList<Venda> vendas) {
        janela = new JFrame("Cadasto de Venda");

        perguntselec = new JLabel("Qual o produto a ser comprado?");

        seleccamisa = new JButton("Camisa");
        seleccalca = new JButton("Calça");

        perguntselec.setFont(new Font("Arial", Font.BOLD, 40));
        perguntselec.setBounds(200, 10, 700, 40);

        seleccamisa.setBounds(335, 190, 150, 60);
        seleccalca.setBounds(515, 190, 150, 60);

        janela.setLayout(null);
        janela.add(perguntselec);
        janela.add(seleccamisa);
        janela.add(seleccalca);

        janela.setSize(1000, 500);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        seleccamisa.addActionListener(this);
        seleccalca.addActionListener(this);
    }

    
    /** 
     * Evento que recebe o  clique do mouse e limpa o textfield de pesquisar a venda.
     * @param e
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        Object src = e.getSource();
         
        if(src == pesqvenda){
            pesqvenda.setText(null);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    
    /** 
     * Observa o clique na lista da venda e monstra os dados
     * @param e
     */
    @Override
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();
        try{
            if (e.getValueIsAdjusting() && src == listavendas) {
                janela.dispose();
                // Passa apenas o protocolo (4 primeiros numeros).
                new TelaEditarVizualizarDeletar().vizualizarVenda(clientesTelaVenda, funcionariosTelaVenda, camisasTelaVenda, calcasTelaVenda, vendasTelaVenda, 
                    listavendas.getSelectedValue().substring(0,4));
            }
        }catch(NullPointerException exc){
            janela.dispose();
            new TelaVenda().telaVenda(clientesTelaVenda, funcionariosTelaVenda, camisasTelaVenda, calcasTelaVenda, vendasTelaVenda);
        }        
    }

    
    /** Metodo que configura os actions dos botões
     * (pesqvenda) obtem o textfield e realiza a pesquisa na lista
     * (cadastrarvenda) abre a nossa tela pre cadastro de venda onde voce selecionara as opçoes.
     * (voltar) volta para a tela principal da aplicação.
     * (seleccamisa) seleciona a camisa e abre o cadastro de venda para camisa
     * (seleccalca) seleciona a calça e abre o cadastro de venda para calça
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();   
        
        if (src == pesqvenda) {
            if(pesqvenda.getText().equals("")){
                listavendas.setListData(todasvendas);
            }else{
                try{
                    // Passa apenas os tres primeiros digitos, sendo o ID, como agrumento de pesquisa.
                    listavendas.setListData(Pesquisar.pesquisarVenda(vendasTelaVenda, pesqvenda.getText().substring(0, 4))); 
                }catch(StringIndexOutOfBoundsException exc){
                }
            }
        }

        if (src == cadastrarvenda) {
            
            janela.dispose();
            new TelaVenda().telaPreCadastro(clientesTelaVenda, funcionariosTelaVenda, camisasTelaVenda, calcasTelaVenda, vendasTelaVenda);
        }

        if (src == voltar) {
            
            janela.dispose();
            new TelaPrincipal().telaPrincipal();
        }

        if (src == seleccamisa) {
            
            janela.dispose();
            new TelaCadastrar().cadastrarVendaComCamisa(clientesTelaVenda, funcionariosTelaVenda, camisasTelaVenda, calcasTelaVenda, vendasTelaVenda);
        }

        if (src == seleccalca) {
            
            janela.dispose();
            new TelaCadastrar().cadastrarVendaComCalca(clientesTelaVenda, funcionariosTelaVenda, camisasTelaVenda, calcasTelaVenda, vendasTelaVenda);
        }
    }
}
