package Interface;

import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Objetos.*;

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

    //labels Roupa
    private JLabel id;
    private JLabel nomec;
    private JLabel descricao;
    private JLabel genero;
    private JLabel preco;
    private JLabel marca;
    private JLabel cor;
    private JLabel tamanho;
    private JLabel tamanhocintura;
    private JLabel estoque;
    private JLabel estoquecalca;


    //Texts Roupa
    private JTextField textid;
    private JTextField textnomec;
    private JTextField textdescricao;
    private JTextField textgenero;
    private JTextField textpreco;
    private JTextField textmarca;
    private JTextField textcor;
    private JTextField texttamanho;
    private JTextField texttamanhocintura;
    private JTextField textestoque;
    private JTextField textestoquecalca;

    private JButton cadastrarc;
    private JButton voltarcliente;
    private JButton cadastrarf;
    private JButton voltarfuncionario;
    private JButton cadastrarcam;
    private JButton voltarcam;
    private JButton cadastrarcalca;
    private JButton voltarcalca;
    private ArrayList<Cliente> clienteTeleCadastrar;
    private ArrayList<Funcionario> funcionariotelacadastrar;
    private ArrayList<Camisa> camisatelacadastrar;
    private ArrayList<Calca> calcatelacadastrar;

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

    public void cadastroCamisa(ArrayList<Camisa> camisa) {
        camisatelacadastrar = camisa;

        janela = new JFrame("Cadastrar Camisa");
        id = new JLabel("id: ");
        nomec = new JLabel("Nome: ");
        descricao = new JLabel("Descrição: ");
        genero = new JLabel("Genêro:");
        preco = new JLabel("Preço: ");
        marca = new JLabel("Marca: ");
        cor = new JLabel("Cor: ");
        tamanho = new JLabel("Tamanho:");
        estoque = new JLabel("Estoque:");

        textid = new JTextField();
        textnomec = new JTextField();
        textdescricao = new JTextField(11);
        textgenero = new JTextField(2);
        textpreco = new JTextField(2);
        textmarca = new JTextField(4);
        textcor = new JTextField(2);
        texttamanho = new JTextField(9);
        textestoque = new JTextField(9);

        cadastrarcam = new JButton("Cadastrar");
        voltarcam = new JButton("Voltar");

        id.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        id.setBounds(10, 5, 150, 50);

        textid.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        textid.setBounds(145, 15, 200, 30);
        
        nomec.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        nomec.setBounds(10, 50, 150, 50);

        textnomec.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        textnomec.setBounds(145, 60, 200, 30);

        descricao.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        descricao.setBounds(10, 95, 150, 50);

        textdescricao.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        textdescricao.setBounds(145, 105, 200, 30);
    
        genero.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        genero.setBounds(10, 140, 350, 50);

        textgenero.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        textgenero.setBounds(145, 150, 200, 30);

        preco.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        preco.setBounds(10, 185, 350, 50);

        textpreco.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        textpreco.setBounds(145, 195, 200, 30);

        marca.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        marca.setBounds(10, 230, 350, 50);

        textmarca.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        textmarca.setBounds(145, 240, 200, 30);

        cor.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        cor.setBounds(10, 275, 350, 50);

        textcor.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        textcor.setBounds(145, 285, 200, 30);

        tamanho.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        tamanho.setBounds(10, 320, 350, 50);

        texttamanho.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        texttamanho.setBounds(145, 330, 200, 30);

        estoque.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        estoque.setBounds(10, 365, 350, 50);

        textestoque.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        textestoque.setBounds(145, 375, 200, 30);
        
        cadastrarcam.setBounds(425, 410, 150, 50);
        voltarcam.setBounds(2, 410, 150, 50);

        janela.setLayout(null);
        janela.add(id);
        janela.add(nomec);
        janela.add(descricao);
        janela.add(genero);
        janela.add(preco);
        janela.add(marca);
        janela.add(textid);
        janela.add(cor);
        janela.add(tamanho);
        janela.add(estoque);
        janela.add(textnomec);
        janela.add(textdescricao);
        janela.add(textgenero);
        janela.add(textpreco);
        janela.add(textmarca);
        janela.add(textcor);
        janela.add(texttamanho);
        janela.add(textestoque);
        janela.add(cadastrarcam);
        janela.add(voltarcam);

        janela.setSize(1000, 500);
        janela.setResizable(true);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cadastrarcam.addActionListener(this);
        voltarcam.addActionListener(this);
    }
        
    public void cadastroCalca(ArrayList<Calca> calca) {
        calcatelacadastrar = calca;

        janela = new JFrame("Cadastrar Calça");
        id = new JLabel("id: ");
        nomec = new JLabel("Nome: ");
        descricao = new JLabel("Descrição: ");
        genero = new JLabel("Genêro:");
        preco = new JLabel("Preço: ");
        marca = new JLabel("Marca: ");
        cor = new JLabel("Cor: ");
        tamanhocintura = new JLabel("Cintura(cm):");
        estoquecalca = new JLabel("Estoque:");

        textid = new JTextField();
        textnomec = new JTextField();
        textdescricao = new JTextField(11);
        textgenero = new JTextField(2);
        textpreco = new JTextField(2);
        textmarca = new JTextField(4);
        textcor = new JTextField(2);
        texttamanhocintura = new JTextField(9);
        textestoquecalca = new JTextField(9);

        cadastrarcalca = new JButton("Cadastrar");
        voltarcalca = new JButton("Voltar");

        id.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        id.setBounds(10, 5, 150, 50);

        textid.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        textid.setBounds(145, 15, 200, 30);
        
        nomec.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        nomec.setBounds(10, 50, 150, 50);

        textnomec.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        textnomec.setBounds(145, 60, 200, 30);

        descricao.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        descricao.setBounds(10, 95, 150, 50);

        textdescricao.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        textdescricao.setBounds(145, 105, 200, 30);
    
        genero.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        genero.setBounds(10, 140, 350, 50);

        textgenero.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        textgenero.setBounds(145, 150, 200, 30);

        preco.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        preco.setBounds(10, 185, 350, 50);

        textpreco.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        textpreco.setBounds(145, 195, 200, 30);

        marca.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        marca.setBounds(10, 230, 350, 50);

        textmarca.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        textmarca.setBounds(145, 240, 200, 30);

        cor.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        cor.setBounds(10, 275, 350, 50);

        textcor.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        textcor.setBounds(145, 285, 200, 30);

        tamanhocintura.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        tamanhocintura.setBounds(10, 320, 350, 50);

        texttamanhocintura.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        texttamanhocintura.setBounds(145, 330, 200, 30);

        estoquecalca.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        estoquecalca.setBounds(10, 365, 350, 50);

        textestoquecalca.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        textestoquecalca.setBounds(145, 375, 200, 30);
        
        cadastrarcalca.setBounds(425, 410, 150, 50);
        voltarcalca.setBounds(2, 410, 150, 50);

        janela.setLayout(null);
        janela.add(id);
        janela.add(nomec);
        janela.add(descricao);
        janela.add(genero);
        janela.add(preco);
        janela.add(marca);
        janela.add(textid);
        janela.add(cor);
        janela.add(tamanhocintura);
        janela.add(estoquecalca);
        janela.add(textnomec);
        janela.add(textdescricao);
        janela.add(textgenero);
        janela.add(textpreco);
        janela.add(textmarca);
        janela.add(textcor);
        janela.add(texttamanhocintura);
        janela.add(textestoquecalca);
        janela.add(cadastrarcalca);
        janela.add(voltarcalca);

        janela.setSize(1000, 500);
        janela.setResizable(true);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cadastrarcalca.addActionListener(this);
        voltarcalca.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if(src == cadastrarcam){
            try{
                camisatelacadastrar.add(new Camisa(
                    textid.getText(), 
                    textnomec.getText(), 
                    textdescricao.getText(),
                    textgenero.getText().charAt(0),
                    Float.parseFloat(textpreco.getText()),
                    textmarca.getText(),
                    textcor.getText(),
                    texttamanho.getText(),
                    Integer.parseInt(textestoque.getText())));
            }catch(NumberFormatException exep){
                JOptionPane.showMessageDialog(null, "Alguma informação está incorreta", "Erro Cadastro", JOptionPane.ERROR_MESSAGE);
            }
            janela.dispose();
            new TelaRoupa().telacamisa(camisatelacadastrar,calcatelacadastrar);
        }
        if (src == voltarcam) {
            janela.dispose();
            new TelaRoupa().telacamisa(camisatelacadastrar,calcatelacadastrar);;
        }
        if (src == cadastrarc) {
            String dataformatada = textdia.getText() + "/" + textmes.getText() + "/" + textano.getText();
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
            String dataformatada = textdia.getText() + "/" + textmes.getText() + "/" + textano.getText();
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