package Interface;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Objetos.Cliente;
import Objetos.Funcionario;
import Objetos.Telefone;

public class TelaEditarVizualizar implements ActionListener {
    private JFrame janela;
    private JLabel nome;
    private JLabel email;
    private JLabel cpf;
    private JLabel datanac;
    private JLabel tel;

    private JTextField textnome;
    private JTextField textemail;
    private JTextField textcpf;
    private JTextField textdatanasc;
    private JTextField textddd;
    private JTextField texttel;

    private JButton voltarcliente;
    private JButton voltarfuncionario;

    private ArrayList<Cliente> clientesTelaEditar;
    private ArrayList<Funcionario> funcionariosEditar;
    private int posicao;

    public void editarCliente(ArrayList<Cliente> clientes, int pos) {
        posicao = pos;
        clientesTelaEditar = clientes;

        janela = new JFrame("Cliente " + clientes.get(pos).getNome());
        nome = new JLabel("Nome: ");
        email = new JLabel("Email: ");
        cpf = new JLabel("CPF: ");
        datanac = new JLabel("Data de Nascimento:");
        tel = new JLabel("Telefone: ");

        textnome = new JTextField(clientes.get(pos).getNome());
        textemail = new JTextField(clientes.get(pos).getEmail());
        textcpf = new JTextField(clientes.get(pos).getCpf());
        textdatanasc = new JTextField(clientes.get(pos).getData());
        textddd = new JTextField(String.valueOf(clientes.get(pos).getNumtel().getDDD()));
        texttel = new JTextField(String.valueOf(clientes.get(pos).getNumtel().getNumero()));

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

        textdatanasc.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
        textdatanasc.setBounds(345, 238, 200, 40);

        tel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        tel.setBounds(10, 305, 305, 50);

        textddd.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
        textddd.setBounds(175, 313, 40, 40);

        texttel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
        texttel.setBounds(235, 313, 160, 40);

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
        janela.add(textdatanasc);
        janela.add(textddd);
        janela.add(texttel);
        janela.add(voltarcliente);

        janela.setSize(1000, 500);
        janela.setResizable(true);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        voltarcliente.addActionListener(this);

    }

    public void editarFuncionario(ArrayList<Funcionario> funcionarios, int pos) {
        posicao = pos;
        funcionariosEditar = funcionarios;

        janela = new JFrame("Funcionario " + funcionarios.get(pos).getNome());
        nome = new JLabel("Nome: ");
        email = new JLabel("Email: ");
        cpf = new JLabel("CPF: ");
        datanac = new JLabel("Data de Nascimento:");
        tel = new JLabel("Telefone: ");

        textnome = new JTextField(funcionarios.get(pos).getNome());
        textemail = new JTextField(funcionarios.get(pos).getEmail());
        textcpf = new JTextField(funcionarios.get(pos).getCpf());
        textdatanasc = new JTextField(funcionarios.get(pos).getDatacontrat());
        textddd = new JTextField(String.valueOf(funcionarios.get(pos).getNumtel().getDDD()));
        texttel = new JTextField(String.valueOf(funcionarios.get(pos).getNumtel().getNumero()));

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
    
        datanac.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        datanac.setBounds(10, 230, 350, 50);

        textdatanasc.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
        textdatanasc.setBounds(345, 238, 200, 40);

        tel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        tel.setBounds(10, 305, 305, 50);

        textddd.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
        textddd.setBounds(175, 313, 40, 40);

        texttel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
        texttel.setBounds(235, 313, 160, 40);

        voltarfuncionario.setBounds(2, 399, 150, 60);

        janela.setLayout(null);
        janela.add(nome);
        janela.add(email);
        janela.add(cpf);
        janela.add(datanac);
        janela.add(tel);
        janela.add(textnome);
        janela.add(textemail);
        janela.add(textcpf);
        janela.add(textdatanasc);
        janela.add(textddd);
        janela.add(texttel);
        janela.add(voltarfuncionario);

        janela.setSize(1000, 500);
        janela.setResizable(true);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        voltarfuncionario.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == voltarcliente) {
            janela.dispose();
            
            clientesTelaEditar.get(posicao).setNome(textnome.getText());
            clientesTelaEditar.get(posicao).setEmail(textemail.getText());
            clientesTelaEditar.get(posicao).setCpf(textcpf.getText());
            clientesTelaEditar.get(posicao).setData(textdatanasc.getText());
            clientesTelaEditar.get(posicao).setNumtel(new Telefone(Integer.parseInt(textddd.getText()), Integer.parseInt(texttel.getText())));
            
            new TelaPessoa().telaCliente(clientesTelaEditar);
        }
        if (src == voltarfuncionario) {
            janela.dispose();
            
            funcionariosEditar.get(posicao).setNome(textnome.getText());
            funcionariosEditar.get(posicao).setEmail(textemail.getText());
            funcionariosEditar.get(posicao).setCpf(textcpf.getText());
            funcionariosEditar.get(posicao).setDatacontrat(textdatanasc.getText());
            funcionariosEditar.get(posicao).setNumtel(new Telefone(Integer.parseInt(textddd.getText()), Integer.parseInt(texttel.getText())));
            
            new TelaPessoa().telaFuncionario(funcionariosEditar);
        }
        
    }
}
