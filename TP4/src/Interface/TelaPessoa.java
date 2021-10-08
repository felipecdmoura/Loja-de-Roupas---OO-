package Interface;

//seçao que importa os objetos e classes que usaremos na nossa aplicação

import java.util.ArrayList;
import java.util.Arrays;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.print.DocFlavor.STRING;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import App.TelaPrincipal;
import Objetos.Cliente;
import Objetos.Funcionario;
/**
 * implementa as nossas telas que herdam do objeto pessoa como cliente e funcionario.
 * @author Felipe e João
 * 
 * @version TP5 (Outubro 2021)
 */
public class TelaPessoa implements ActionListener, ListSelectionListener, MouseListener {
    private JFrame janela;

    private JList<String> listaclientes ;
    private JList<String> listafuncionarios ;
    private JScrollPane listascroll;

    private JLabel titulo;

    private JTextField pesqcliente;
    private JTextField pesqfuncionario;

    private JButton cadastrarcliente;
    private JButton cadastrarfuncionario;
    private JButton voltar;

    private static ArrayList <Cliente> clienteTelaPessoa;
    private static ArrayList <Funcionario> funcionariosTelaPessoa;
    private String[] todosclientes;
    private String[] todosfunc;

    
    /** 
     * Gera a nossa tela do cliente:
     * (1)iguala a arraylist recebida a instanciada no codigo.
     * (2)instancia os componentes das telas e suas posições.
     * @param clientes
     * @return a nossa tela de cliente
     */
    public void telaCliente(ArrayList<Cliente> clientes) {
        
        clienteTelaPessoa = clientes;
        todosclientes = new String[clientes.size()];
        int count = 0;

        for(Cliente cliente : clientes){
            todosclientes[count]= cliente.getNome();
            count++;
        }

        janela = new JFrame("Clientes");
        listaclientes = new JList<String>(todosclientes);
        listascroll = new JScrollPane();
        titulo = new JLabel("Clientes Cadastrados");
        pesqcliente = new JTextField("Pesquisar pelo nome");
        cadastrarcliente = new JButton("Cadastrar");
        voltar = new JButton("Voltar");

        titulo.setFont(new Font("Arial", Font.BOLD, 40));
        titulo.setBounds(300, 10, 500, 30);

        pesqcliente.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        pesqcliente.setBounds(60, 70, 200, 30);

        listaclientes.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 35));
        listaclientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaclientes.setVisibleRowCount(10);

        listascroll.setBounds(60, 120, 790, 250);
        listascroll.setViewportView(listaclientes);

        voltar.setBounds(2, 399, 150, 60);
        cadastrarcliente.setBounds(425, 399, 150, 60);
        //pesquisar.setBounds(832, 399, 150, 60);

        janela.setLayout(null);
        janela.add(titulo);
        janela.add(pesqcliente);
        janela.add(listascroll);
        janela.add(cadastrarcliente);
        janela.add(voltar);

        janela.setSize(1000, 500);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cadastrarcliente.addActionListener(this);
        voltar.addActionListener(this);

        pesqcliente.addMouseListener(this);
        pesqcliente.addActionListener(this);

        listaclientes.addListSelectionListener(this);
    }

    
    /** 
     * Gera a nossa tela do funcionario:
     * (1)iguala a arraylist recebida a instanciada no codigo.
     * (2)instancia os componentes das telas e suas posições.
     * @param funcionarios
     */
    public void telaFuncionario(ArrayList<Funcionario> funcionarios) {
 
        funcionariosTelaPessoa = funcionarios;
        todosfunc = new String[funcionarios.size()];
        int count = 0;

        for(Funcionario funcionario : funcionarios){
            todosfunc[count]= funcionario.getNome();
            count++;
        }
        

        listafuncionarios = new JList<String>(todosfunc);
        listascroll = new JScrollPane();
        janela = new JFrame("Funcionarios");
        titulo = new JLabel("Funcionarios Cadastrados");
        pesqfuncionario = new JTextField("Pesquisar por nome");
        cadastrarfuncionario = new JButton("Cadastrar");
        voltar = new JButton("Voltar");

        titulo.setFont(new Font("Arial", Font.BOLD, 40));
        titulo.setBounds(300, 10, 500, 30);

        pesqfuncionario.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        pesqfuncionario.setBounds(60, 70, 200, 30);

        listafuncionarios.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 35));
        listafuncionarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listafuncionarios.setVisibleRowCount(10);
        
        listascroll.setBounds(60, 120, 790, 250);
        listascroll.setViewportView(listafuncionarios);

        voltar.setBounds(2, 399, 150, 60);
        cadastrarfuncionario.setBounds(425, 399, 150, 60);

        janela.setLayout(null);
        janela.add(titulo);
        janela.add(pesqfuncionario);
        janela.add(listascroll);
        janela.add(cadastrarfuncionario);
        janela.add(voltar);

        janela.setSize(1000, 500);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cadastrarfuncionario.addActionListener(this);
        voltar.addActionListener(this);

        pesqfuncionario.addMouseListener(this);
        pesqfuncionario.addActionListener(this);

        listafuncionarios.addListSelectionListener(this);
        
    }

        
        @Override
        public void actionPerformed(ActionEvent e) {
            Object src = e.getSource();
        //evento que observa o clique do botão cadastrar da tela cliente e gera uma nova tela para o mesmo.
            if(src == cadastrarcliente){
                janela.dispose();
                new TelaCadastrar().cadastroCliente(clienteTelaPessoa);
            }
            //evento que compara os textos da pesqcliente e retorna apenas o mesmo na nossa lista.
            if(src == pesqcliente){
                if(pesqcliente.getText().equals("")){
                    listaclientes.setListData(todosclientes);
                }else{
                    listaclientes.setListData(Pesquisar.pesquisarCliente(clienteTelaPessoa, pesqcliente.getText()));
                }
            }
            //evento que observa o clique do botão cadastrar da tela funcionario e gera uma nova tela para o mesmo.
            if(src == cadastrarfuncionario){
                janela.dispose();
                new TelaCadastrar().cadastrofuncionario(funcionariosTelaPessoa);
            }
            //evento que compara os textos da pesqfuncionario e retorna apenas o mesmo na nossa lista.
            if(src == pesqfuncionario){
                if(src == pesqfuncionario){
                    if(pesqfuncionario.getText().equals("")){
                        listafuncionarios.setListData(todosfunc);
                    }else{
                        listafuncionarios.setListData(Pesquisar.pesquisarFuncionario(funcionariosTelaPessoa, pesqfuncionario.getText()));
                    }
                }

                pesqfuncionario.setText("");
            }
            //evento que volta ao menu principal.
            if (src == voltar){
                janela.dispose();
                new TelaPrincipal().telaPrincipal();
            }
            
        }

        
        /** 
         * evento que observa o clique do botão na lista e cria nossa tela editar/visualizar para clientes ou funcionarios.
         * @param e
         * @return tela editar cliente e funcionario
         */
        @Override
        public void valueChanged(ListSelectionEvent e) {
            Object src = e.getSource();

            try{
                
                if (e.getValueIsAdjusting() && src == listaclientes) {
                    janela.dispose();
                    new TelaEditarVizualizarDeletar().editarCliente(clienteTelaPessoa, listaclientes.getSelectedValue());
                }
            }catch(IndexOutOfBoundsException exc){
                janela.dispose();
                new TelaPessoa().telaCliente(clienteTelaPessoa);
            }

            try{
                
                if (e.getValueIsAdjusting() && src == listafuncionarios) {
                    janela.dispose();
                    new TelaEditarVizualizarDeletar().editarFuncionario(funcionariosTelaPessoa, listafuncionarios.getSelectedValue());
                }
            }catch(IndexOutOfBoundsException exc){
                janela.dispose();
                new TelaPessoa().telaFuncionario(funcionariosTelaPessoa);
            }
            
        }

        
        /** 
         * evento que recebe o  clique do mouse e limpa o textfield de pesquisar.
         * @param e
         * @return textfield limpo
         */
        
        @Override
        public void mouseClicked(MouseEvent e) {
            Object src = e.getSource();
            
            if(src == pesqcliente){
                pesqcliente.setText(null);
            }

            if(src == pesqfuncionario){
                pesqfuncionario.setText(null);
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
}