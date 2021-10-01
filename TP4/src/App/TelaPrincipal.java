package App;

//importa as bibliotecas e classes que usaremos.

import javax.swing.*;

import Interface.TelaLoja;
import Interface.TelaPessoa;
import Interface.TelaRoupa;
import Interface.TelaVenda;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Objetos.*;
import Interface.*;

public class TelaPrincipal extends JFrame implements ActionListener  {

    
    //Instancia as ArrayList que usaremos para inserir nos metodos.
    private static ArrayList <Cliente> clientesTelaPrincipal = new ArrayList<Cliente>();
    private static ArrayList <Funcionario> funcionariosTelaPrincipal = new ArrayList<Funcionario>();
    private static ArrayList <Venda> vendasTelaPrincipal = new ArrayList<Venda>();
    private static ArrayList <Camisa> camisasTelaPrincipal = new ArrayList<Camisa>();
    private static ArrayList <Calca> calcasTelaPrincipal = new ArrayList<Calca>();
    private static Loja lojaTelaPrincipal  = new Loja("51.882.182/0001-12","qr 312 cj f loja 315 Gama DF", "Filial Guimarães");

    //Instancia os Botoes que serão utilizados para o metodo do MenuPrincipal.
    private JButton cliente = new JButton("Cliente");
    private JButton funcionario = new JButton("Funcionario");
    private JButton venda = new JButton("Venda");
    private JButton loja = new JButton("Loja");
    private JButton roupa = new JButton("Roupas");
    private JButton sair = new JButton("Sair");

      //Metodo do MenuPrincipal da nossa aplicação.
    public void telaPrincipal(){
        setTitle("Menu principal");

        cliente.setBounds(105, 190, 150, 60);
        funcionario.setBounds(265, 190, 150, 60);
        loja.setBounds(425, 190, 150, 60);
        roupa.setBounds(585, 190, 150, 60);
        venda.setBounds(745, 190, 150, 60);
        sair.setBounds(2, 399, 150, 60);
        
        setLayout(null);
        add(cliente);
        add(funcionario);
        add(venda);
        add(loja);
        add(roupa);
        add(sair);
        
        setSize(1000, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cliente.addActionListener(this);
        funcionario.addActionListener(this);
        loja.addActionListener(this);
        roupa.addActionListener(this);
        venda.addActionListener(this);
        sair.addActionListener(this);
    }
   
    //Metodo que executa nossa aplicação
    public static void main(String[] args) {
        DadosAleatorios.setDefaultData(clientesTelaPrincipal, funcionariosTelaPrincipal, vendasTelaPrincipal, calcasTelaPrincipal, camisasTelaPrincipal);
        new TelaPrincipal().telaPrincipal();
    }

     //configura os eventos que acontecerão ao acionarmos os botões.
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        
         //instancia uma condição que se o objeto src receber o botao cliente ele ira criar uma tela pessoa e executara o metodo da telaCliente.
        if(src == cliente){
            dispose();
            new TelaPessoa().telaCliente(clientesTelaPrincipal);
        }

        if(src == funcionario){
            dispose();
            new TelaPessoa().telaFuncionario(funcionariosTelaPrincipal);
        }

        if (src == loja) {
            dispose();
            new TelaLoja().telaLoja(lojaTelaPrincipal);
        }

        if(src == roupa){
            dispose();
            new TelaRoupa().telacamisa(camisasTelaPrincipal, calcasTelaPrincipal);
        }

        if (src == venda){
            dispose();
            new TelaVenda().telaVenda(clientesTelaPrincipal, funcionariosTelaPrincipal, camisasTelaPrincipal, calcasTelaPrincipal, vendasTelaPrincipal);
        }

        //se o objeto src receber o botao sair ele ira fechar nossa aplicação.
        if(src == sair){
            System.exit(0);
        }
    }

    
    
}