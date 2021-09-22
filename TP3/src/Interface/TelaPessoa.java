package Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Objetos.Cliente;
import Objetos.Funcionario;

public class TelaPessoa implements ActionListener, ListSelectionListener {
    private JFrame janela;

    private JList<String> listaclientes ;
    private JList<String> listafuncionarios ;
    private JScrollPane listascroll;

    private JLabel titulo;

    private JButton cadastrarcliente;
    private JButton cadastrarfuncionario;
    private JButton voltar;
    private JButton pesquisar;

    private static ArrayList <Cliente> clienteTelaPessoa;
    private static ArrayList <Funcionario> funcionariosTelaPessoa;
    private String[] nomesclientes;
    private String[] nomesfuncionarios;

    public void telaCliente(ArrayList<Cliente> clientes) {
        clienteTelaPessoa = clientes;
        nomesclientes = new String[clientes.size()];
        int count = 0;

        for(Cliente cliente : clientes){
            nomesclientes[count]= cliente.getNome();
            count++;
        }
        
        listaclientes = new JList<String>(nomesclientes);
        listascroll = new JScrollPane();
        janela = new JFrame("Clientes");
        titulo = new JLabel("Clientes Cadastrados");
        cadastrarcliente = new JButton("Cadastrar");
        voltar = new JButton("Voltar");
        pesquisar = new JButton("Pesquisar");

        titulo.setFont(new Font("Arial", Font.BOLD, 40));
        titulo.setBounds(300, 10, 500, 30);

        listaclientes.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 40));
        listaclientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaclientes.setVisibleRowCount(10);

        listascroll.setBounds(100, 80, 790, 300);
        listascroll.setViewportView(listaclientes);

        voltar.setBounds(2, 399, 150, 60);
        cadastrarcliente.setBounds(425, 399, 150, 60);
        pesquisar.setBounds(832, 399, 150, 60);

        janela.setLayout(null);
        janela.add(titulo);
        janela.add(listascroll);
        janela.add(cadastrarcliente);
        janela.add(voltar);
        janela.add(pesquisar);

        janela.setSize(1000, 500);
        janela.setResizable(false);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cadastrarcliente.addActionListener(this);
        voltar.addActionListener(this);
        pesquisar.addActionListener(this);
        listaclientes.addListSelectionListener(this);
    }

    public void telaFuncionario(ArrayList<Funcionario> funcionarios) {
        funcionariosTelaPessoa = funcionarios;
        nomesfuncionarios = new String[funcionarios.size()];
        int count = 0;

        for(Funcionario funcionario : funcionarios){
            nomesfuncionarios[count]= funcionario.getNome();
            count++;
        }
        
        listafuncionarios = new JList<String>(nomesfuncionarios);
        listascroll = new JScrollPane();
        janela = new JFrame("Funcionarios");
        titulo = new JLabel("Funcionarios Cadastrados");
        cadastrarfuncionario = new JButton("Cadastrar");
        voltar = new JButton("Voltar");
        pesquisar = new JButton("Pesquisar");

        titulo.setFont(new Font("Arial", Font.BOLD, 40));
        titulo.setBounds(300, 10, 500, 30);

        listafuncionarios.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 40));
        listafuncionarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listafuncionarios.setVisibleRowCount(10);
        
        listascroll.setBounds(100, 80, 790, 300);
        listascroll.setViewportView(listafuncionarios);

        voltar.setBounds(2, 399, 150, 60);
        cadastrarfuncionario.setBounds(425, 399, 150, 60);
        pesquisar.setBounds(832, 399, 150, 60);

        janela.setLayout(null);
        janela.add(titulo);
        janela.add(listascroll);
        janela.add(cadastrarfuncionario);
        janela.add(voltar);
        janela.add(pesquisar);

        janela.setSize(1000, 500);
        janela.setResizable(false);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cadastrarfuncionario.addActionListener(this);
        voltar.addActionListener(this);
        pesquisar.addActionListener(this);
        
    }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            Object src = e.getSource();

            if(src == cadastrarcliente){
                janela.dispose();
                new TelaCadastrar().cadastroCliente(clienteTelaPessoa);
            }
            
            if (src == voltar){
                janela.dispose();
                new TelaPrincipal().telaPrincipal();
            }
        }

        @Override
        public void valueChanged(ListSelectionEvent e) {
            Object src = e.getSource();

            if (e.getValueIsAdjusting() && src == listaclientes) {
                janela.dispose();
                new TelaEditarVizualizar().editarCliente(clienteTelaPessoa, listaclientes.getSelectedIndex());
            }
            
        }
}