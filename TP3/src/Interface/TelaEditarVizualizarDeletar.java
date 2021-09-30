package Interface;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Objetos.*;

public class TelaEditarVizualizarDeletar implements ActionListener {
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

    // labels Roupa
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

    // Texts Roupa
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

    private JButton voltarcliente;
    private JButton voltarfuncionario;
    private JButton deletarcliente;
    private JButton deletarfuncionario;
    private JButton deletarcam;
    private JButton voltarcam;
    private JButton deletarcalca;
    private JButton voltarcalca;

    private ArrayList<Cliente> clientesTelaEditar;
    private ArrayList<Funcionario> funcionariosTelaEditar;
    private ArrayList<Camisa> camisaTelaEditar;
    private ArrayList<Calca> calcaTelaEditar;
    private int posicao;

    public void editarCliente(ArrayList<Cliente> clientes, String nomecliente) {
        posicao = 0;

        for (Cliente posicaolista : clientes) {
            if (posicaolista.getNome().equalsIgnoreCase(nomecliente)) {
                break;
            }
            posicao++;
        }

        clientesTelaEditar = clientes;

        janela = new JFrame("Cliente " + clientes.get(posicao).getNome());
        nome = new JLabel("Nome: ");
        email = new JLabel("Email: ");
        cpf = new JLabel("CPF: ");
        datanac = new JLabel("Data de Nascimento:");
        tel = new JLabel("Telefone: ");

        textnome = new JTextField(clientes.get(posicao).getNome());
        textemail = new JTextField(clientes.get(posicao).getEmail());
        textcpf = new JTextField(clientes.get(posicao).getCpf());
        textdatanasc = new JTextField(clientes.get(posicao).getData());
        textddd = new JTextField(String.valueOf(clientes.get(posicao).getNumtel().getDDD()));
        texttel = new JTextField(String.valueOf(clientes.get(posicao).getNumtel().getNumero()));

        voltarcliente = new JButton("Voltar");
        deletarcliente = new JButton("Deletar");

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
        deletarcliente.setBounds(832, 399, 150, 60);

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
        janela.add(deletarcliente);

        janela.setSize(1000, 500);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        voltarcliente.addActionListener(this);
        deletarcliente.addActionListener(this);

    }

    public void editarFuncionario(ArrayList<Funcionario> funcionarios, String nomefunc) {
        posicao = 0;

        for (Funcionario posicaolista : funcionarios) {
            if (posicaolista.getNome().equalsIgnoreCase(nomefunc)) {
                break;
            }
            posicao++;
        }

        funcionariosTelaEditar = funcionarios;

        janela = new JFrame("Funcionario " + funcionarios.get(posicao).getNome());
        nome = new JLabel("Nome: ");
        email = new JLabel("Email: ");
        cpf = new JLabel("CPF: ");
        datanac = new JLabel("Data de Nascimento:");
        tel = new JLabel("Telefone: ");

        textnome = new JTextField(funcionarios.get(posicao).getNome());
        textemail = new JTextField(funcionarios.get(posicao).getEmail());
        textcpf = new JTextField(funcionarios.get(posicao).getCpf());
        textdatanasc = new JTextField(funcionarios.get(posicao).getDatacontrat());
        textddd = new JTextField(String.valueOf(funcionarios.get(posicao).getNumtel().getDDD()));
        texttel = new JTextField(String.valueOf(funcionarios.get(posicao).getNumtel().getNumero()));

        voltarfuncionario = new JButton("Voltar");
        deletarfuncionario = new JButton("Deletar");

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
        deletarfuncionario.setBounds(832, 399, 150, 60);

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
        janela.add(deletarfuncionario);

        janela.setSize(1000, 500);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        voltarfuncionario.addActionListener(this);
        deletarfuncionario.addActionListener(this);
    }

    public void editarCamisa(ArrayList<Camisa> camisas, ArrayList<Calca> calcas, String idcamisa) {
        posicao = 0;

        for (Camisa posicaolista : camisas) {
            if (posicaolista.getId().equalsIgnoreCase(idcamisa)) {
                break;
            }
            posicao++;
        }

        camisaTelaEditar = camisas;
        calcaTelaEditar = calcas;

        janela = new JFrame("Camisa " + camisas.get(posicao).getNome());
        id = new JLabel("id: ");
        nomec = new JLabel("Nome: ");
        descricao = new JLabel("Descrição: ");
        genero = new JLabel("Genêro:");
        preco = new JLabel("Preço: ");
        marca = new JLabel("Marca: ");
        cor = new JLabel("Cor: ");
        tamanho = new JLabel("Tamanho:");
        estoque = new JLabel("Estoque:");

        textid = new JTextField(camisas.get(posicao).getId());
        textnomec = new JTextField(camisas.get(posicao).getNome());
        textdescricao = new JTextField(camisas.get(posicao).getDescricao());
        textgenero = new JTextField(String.valueOf(camisas.get(posicao).getGenero()));
        textpreco = new JTextField(Float.toString(camisas.get(posicao).getPreco()));
        textmarca = new JTextField(camisas.get(posicao).getMarca());
        textcor = new JTextField(camisas.get(posicao).getCor());
        texttamanho = new JTextField(camisas.get(posicao).getTamanho());
        textestoque = new JTextField(String.valueOf(camisas.get(posicao).getEstoqueCamisa()));

        voltarcam = new JButton("Voltar");
        deletarcam = new JButton("Deletar");

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

        deletarcam.setBounds(425, 410, 150, 50);
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
        janela.add(deletarcam);
        janela.add(voltarcam);

        janela.setSize(1000, 500);
        janela.setResizable(true);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        deletarcam.addActionListener(this);
        voltarcam.addActionListener(this);
    }

    public void editarCalca(ArrayList<Camisa> camisas, ArrayList<Calca> calcas, String nomecalca) {
        posicao = 0;

        for (Calca posicaolista : calcas) {
            if (posicaolista.getId().equalsIgnoreCase(nomecalca)) {
                break;
            }
            posicao++;
        }

        camisaTelaEditar = camisas;
        calcaTelaEditar = calcas;

        janela = new JFrame("Calca" + calcas.get(posicao).getNome());
        id = new JLabel("id: ");
        nomec = new JLabel("Nome: ");
        descricao = new JLabel("Descrição: ");
        genero = new JLabel("Genêro:");
        preco = new JLabel("Preço: ");
        marca = new JLabel("Marca: ");
        cor = new JLabel("Cor: ");
        tamanhocintura = new JLabel("Cintura(cm):");
        estoquecalca = new JLabel("Estoque:");

        textid = new JTextField(calcas.get(posicao).getId());
        textnomec = new JTextField(calcas.get(posicao).getNome());
        textdescricao = new JTextField(calcas.get(posicao).getDescricao());
        textgenero = new JTextField(String.valueOf(calcas.get(posicao).getGenero()));
        textpreco = new JTextField(Float.toString(calcas.get(posicao).getPreco()));
        textmarca = new JTextField(calcas.get(posicao).getMarca());
        textcor = new JTextField(calcas.get(posicao).getCor());
        texttamanhocintura = new JTextField(Float.toString(calcas.get(posicao).getTamanhocintura()));
        textestoquecalca = new JTextField(String.valueOf(calcas.get(posicao).getEstoqueCalca()));

        deletarcalca = new JButton("Deletar");
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

        deletarcalca.setBounds(425, 410, 150, 50);
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
        janela.add(deletarcalca);
        janela.add(voltarcalca);

        janela.setSize(1000, 500);
        janela.setResizable(true);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        deletarcalca.addActionListener(this);
        voltarcalca.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == voltarcliente) {

            try {
                clientesTelaEditar.get(posicao).setNome(textnome.getText());
                clientesTelaEditar.get(posicao).setEmail(textemail.getText());
                clientesTelaEditar.get(posicao).setCpf(textcpf.getText());
                clientesTelaEditar.get(posicao).setData(textdatanasc.getText());
                clientesTelaEditar.get(posicao).setNumtel(
                        new Telefone(Integer.parseInt(textddd.getText()), Integer.parseInt(texttel.getText())));
            } catch (NumberFormatException exep) {
                JOptionPane.showMessageDialog(null, "Alguma informação está incorreta", "Erro Cadastro",
                        JOptionPane.ERROR_MESSAGE);
            }

            janela.dispose();
            new TelaPessoa().telaCliente(clientesTelaEditar);
        }

        if (src == deletarcliente) {
            janela.dispose();
            clientesTelaEditar.remove(posicao);

            new TelaPessoa().telaCliente(clientesTelaEditar);
        }

        if (src == voltarfuncionario) {

            try {
                funcionariosTelaEditar.get(posicao).setNome(textnome.getText());
                funcionariosTelaEditar.get(posicao).setEmail(textemail.getText());
                funcionariosTelaEditar.get(posicao).setCpf(textcpf.getText());
                funcionariosTelaEditar.get(posicao).setDatacontrat(textdatanasc.getText());
                funcionariosTelaEditar.get(posicao).setNumtel(
                        new Telefone(Integer.parseInt(textddd.getText()), Integer.parseInt(texttel.getText())));
            } catch (NumberFormatException exep) {
                JOptionPane.showMessageDialog(null, "Alguma informação está incorreta", "Erro Cadastro",
                        JOptionPane.ERROR_MESSAGE);
            }

            janela.dispose();
            new TelaPessoa().telaFuncionario(funcionariosTelaEditar);
        }

        if (src == deletarfuncionario) {
            janela.dispose();
            funcionariosTelaEditar.remove(posicao);

            new TelaPessoa().telaFuncionario(funcionariosTelaEditar);

        }

        if (src == voltarcam) {
            try {
                camisaTelaEditar.get(posicao).setId(textid.getText());
                camisaTelaEditar.get(posicao).setNome(textnomec.getText());
                camisaTelaEditar.get(posicao).setDescricao(textdescricao.getText());
                camisaTelaEditar.get(posicao).setGenero(textgenero.getText().charAt(0));
                camisaTelaEditar.get(posicao).setPreco(Float.parseFloat(textpreco.getText()));
                camisaTelaEditar.get(posicao).setMarca(textmarca.getText());
                camisaTelaEditar.get(posicao).setCor(textcor.getText());
                camisaTelaEditar.get(posicao).setTamanho(texttamanho.getText());
                camisaTelaEditar.get(posicao).setEstoqueCamisa(Integer.parseInt(textestoque.getText()));

            } catch (NumberFormatException exep) {
                JOptionPane.showMessageDialog(null, "Alguma informação está incorreta", "Erro Cadastro",
                        JOptionPane.ERROR_MESSAGE);
            }

            janela.dispose();
            new TelaRoupa().telacamisa(camisaTelaEditar, calcaTelaEditar);
        }
        if (src == deletarcam) {
            janela.dispose();
            camisaTelaEditar.remove(posicao);

            new TelaRoupa().telacamisa(camisaTelaEditar, calcaTelaEditar);
        }


        if (src == voltarcalca) {
            try {
                calcaTelaEditar.get(posicao).setId(textid.getText());
                calcaTelaEditar.get(posicao).setNome(textnomec.getText());
                calcaTelaEditar.get(posicao).setDescricao(textdescricao.getText());
                calcaTelaEditar.get(posicao).setGenero(textgenero.getText().charAt(0));
                calcaTelaEditar.get(posicao).setPreco(Float.parseFloat(textpreco.getText()));
                calcaTelaEditar.get(posicao).setMarca(textmarca.getText());
                calcaTelaEditar.get(posicao).setCor(textcor.getText());
                calcaTelaEditar.get(posicao).setTamanhocintura(Float.parseFloat(texttamanhocintura.getText()));
                calcaTelaEditar.get(posicao).setEstoqueCalca(Integer.parseInt(textestoquecalca.getText()));

            } catch (NumberFormatException exep) {
                JOptionPane.showMessageDialog(null, "Alguma informação está incorreta", "Erro Cadastro",
                        JOptionPane.ERROR_MESSAGE);
            }

            janela.dispose();
            new TelaRoupa().telaCalca(camisaTelaEditar, calcaTelaEditar);
        }
        if (src == deletarcalca) {
            janela.dispose();
            calcaTelaEditar.remove(posicao);

            new TelaRoupa().telaCalca(camisaTelaEditar, calcaTelaEditar);
        }
    }
    
    
}
