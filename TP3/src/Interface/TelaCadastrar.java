package Interface;

import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Objetos.Cliente;
import Objetos.Telefone;
import Objetos.Funcionario;

public class TelaCadastrar implements ActionListener {
    private JFrame janela;
    private JLabel nome;
    private JLabel email;
    private JLabel cpf;
    private JLabel datanac;
    private JLabel datacontract ;
    private JLabel tel;
    private JLabel barradata1;
    private JLabel barradata2;

    private JTextField textnome;
    private JTextField textemail;
    private JTextField textcpf;
    private JTextField textdia;
    private JTextField textmes;
    private JTextField textano;
    private JTextField textddd;
    private JTextField texttel;

    private JButton cadastrarc;
    private JButton voltarcliente;
    private JButton cadastrarf;
    private JButton voltarfuncionario;

    private ArrayList<Cliente> clienteTeleCadastrar;
    private ArrayList<Funcionario> funcionariotelacadastrar;

    public void cadastroCliente(ArrayList<Cliente> clientes) {
        clienteTeleCadastrar = clientes;

        janela = new JFrame("Cadastrar Cliente");
        nome = new JLabel("Nome: ");
        email = new JLabel("Email: ");
        cpf = new JLabel("CPF: ");
        datanac = new JLabel("Data de Nascimento:");
        tel = new JLabel("Telefone: ");
        barradata1 = new JLabel("/");
        barradata2 = new JLabel("/");

        textnome = new JTextField();
        textemail = new JTextField();
        textcpf = new JTextField(11);
        textdia = new JTextField(2);
        textmes = new JTextField(2);
        textano = new JTextField(4);
        textddd = new JTextField(2);
        texttel = new JTextField(9);

        cadastrarc = new JButton("Cadastrar");
        voltarcliente = new JButton("Voltar");

        nome.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        nome.setBounds(10, 5, 150, 50);

        textnome.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
        textnome.setBounds(145, 13, 450, 40);
        
        email.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        email.setBounds(10, 80, 150, 50);

        textemail.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
        textemail.setBounds(145, 88, 450, 40);

        cpf.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        cpf.setBounds(10, 155, 150, 50);

        textcpf.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
        textcpf.setBounds(125, 163, 200, 40);
    
        datanac.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        datanac.setBounds(10, 230, 350, 50);

        textdia.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
        textdia.setBounds(345, 238, 40, 40);

        barradata1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
        barradata1.setBounds(400, 238, 40, 40);

        textmes.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
        textmes.setBounds(425, 238, 40, 40);

        barradata2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
        barradata2.setBounds(480, 238, 40, 40);

        textano.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
        textano.setBounds(505, 238, 80, 40);

        tel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        tel.setBounds(10, 305, 305, 50);

        textddd.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
        textddd.setBounds(175, 313, 40, 40);

        texttel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
        texttel.setBounds(235, 313, 160, 40);

        cadastrarc.setBounds(425, 400, 150, 60);
        voltarcliente.setBounds(2, 399, 150, 60);

        janela.setLayout(null);
        janela.add(nome);
        janela.add(email);
        janela.add(cpf);
        janela.add(datanac);
        janela.add(tel);
        janela.add(textnome);
        janela.add(textemail);
        janela.add(textcpf);
        janela.add(textdia);
        janela.add(barradata1);
        janela.add(textmes);
        janela.add(barradata2);
        janela.add(textano);
        janela.add(textddd);
        janela.add(texttel);
        janela.add(cadastrarc);
        janela.add(voltarcliente);

        janela.setSize(1000, 500);
        janela.setResizable(true);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cadastrarc.addActionListener(this);
        voltarcliente.addActionListener(this);
    }

    public void cadastrofuncionario(ArrayList<Funcionario> funcionario) {
        funcionariotelacadastrar = funcionario;

        janela = new JFrame("Cadastrar Funcionario");
        nome = new JLabel("Nome: ");
        email = new JLabel("Email: ");
        cpf = new JLabel("CPF: ");
        datacontract = new JLabel("Data de Contratacao:");
        tel = new JLabel("Telefone: ");
        barradata1 = new JLabel("/");
        barradata2 = new JLabel("/");

        textnome = new JTextField();
        textemail = new JTextField();
        textcpf = new JTextField(11);
        textdia = new JTextField(2);
        textmes = new JTextField(2);
        textano = new JTextField(4);
        textddd = new JTextField(2);
        texttel = new JTextField(9);

        cadastrarf = new JButton("Cadastrar");
        voltarfuncionario = new JButton("Voltar");

        nome.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        nome.setBounds(10, 5, 150, 50);

        textnome.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
        textnome.setBounds(145, 13, 450, 40);
        
        email.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        email.setBounds(10, 80, 150, 50);

        textemail.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
        textemail.setBounds(145, 88, 450, 40);

        cpf.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        cpf.setBounds(10, 155, 150, 50);

        textcpf.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
        textcpf.setBounds(125, 163, 200, 40);
    
        datacontract.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        datacontract.setBounds(10, 230, 350, 50);

        textdia.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
        textdia.setBounds(345, 238, 40, 40);

        barradata1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
        barradata1.setBounds(400, 238, 40, 40);

        textmes.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
        textmes.setBounds(425, 238, 40, 40);

        barradata2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
        barradata2.setBounds(480, 238, 40, 40);

        textano.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
        textano.setBounds(505, 238, 80, 40);

        tel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        tel.setBounds(10, 305, 305, 50);

        textddd.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
        textddd.setBounds(175, 313, 40, 40);

        texttel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
        texttel.setBounds(235, 313, 160, 40);

        cadastrarf.setBounds(425, 400, 150, 60);
        voltarfuncionario.setBounds(2, 399, 150, 60);

        janela.setLayout(null);
        janela.add(nome);
        janela.add(email);
        janela.add(cpf);
        janela.add(datacontract);
        janela.add(tel);
        janela.add(textnome);
        janela.add(textemail);
        janela.add(textcpf);
        janela.add(textdia);
        janela.add(barradata1);
        janela.add(textmes);
        janela.add(barradata2);
        janela.add(textano);
        janela.add(textddd);
        janela.add(texttel);
        janela.add(cadastrarf);
        janela.add(voltarfuncionario);

        janela.setSize(1000, 500);
        janela.setResizable(true);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cadastrarf.addActionListener(this);
        voltarfuncionario.addActionListener(this);
    }

        
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        String dataformatada = textdia.getText() + "/" + textmes.getText() + "/" + textano.getText();

        if (src == cadastrarc) {
            try{
                clienteTeleCadastrar.add(new Cliente(
                    textnome.getText(), 
                    textemail.getText(), 
                    textcpf.getText(), 
                    new Telefone(Integer.parseInt(textddd.getText()), Integer.parseInt(texttel.getText())), 
                    dataformatada));
            }catch(NumberFormatException exep){
                JOptionPane.showMessageDialog(null, "Alguma informação está incorreta", "Erro Cadastro", JOptionPane.ERROR_MESSAGE);
            }

            janela.dispose();
            new TelaPessoa().telaCliente(clienteTeleCadastrar);
        }
        
        if (src == voltarcliente) {
            janela.dispose();
            new TelaPessoa().telaCliente(clienteTeleCadastrar);;
        }
        
        if (src == cadastrarf) {
            try{
            funcionariotelacadastrar.add(new Funcionario(
                textnome.getText(), 
                textemail.getText(), 
                textcpf.getText(), 
                new Telefone(Integer.parseInt(textddd.getText()), Integer.parseInt(texttel.getText())), 
                dataformatada));
            }catch(NumberFormatException exep){
                JOptionPane.showMessageDialog(null, "Alguma informação está incorreta", "Erro Cadastro", JOptionPane.ERROR_MESSAGE);
            }
            
            janela.dispose(); 
            new TelaPessoa().telaFuncionario(funcionariotelacadastrar);
        }
        
        if (src == voltarfuncionario) {
            janela.dispose();
            new TelaPessoa().telaFuncionario(funcionariotelacadastrar);
        }
    }
}