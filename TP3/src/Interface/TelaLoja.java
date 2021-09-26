package Interface;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Objetos.Loja;

public class TelaLoja implements ActionListener {

    private JFrame janela;
    private JLabel nomefilial;
    private JLabel cnpj;
    private JLabel endereco;

    private JTextField textnomefilial;
    private JTextField textcnpj;
    private JTextField textendereco;

    private JButton voltar;

    private Loja lojaTelaLoja;
    
    public void telaLoja(Loja loja) {
        lojaTelaLoja = loja;

        janela = new JFrame("Informações Loja");
        nomefilial = new JLabel("Nome da Filial: ");
        cnpj = new JLabel("CNPJ: ");
        endereco = new JLabel("Endereço: ");

        textnomefilial = new JTextField(lojaTelaLoja.getNomefilial());
        textcnpj= new JTextField(lojaTelaLoja.getCnpj());
        textendereco = new JTextField(lojaTelaLoja.getEndereco());
        
        voltar = new JButton("Voltar");

        nomefilial.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 35));
        nomefilial.setBounds(10, 30, 275, 50);

        textnomefilial.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 35));
        textnomefilial.setBounds(280, 38, 450, 40);
        
        cnpj.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 35));
        cnpj.setBounds(10, 150, 230, 50);

        textcnpj.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 35));
        textcnpj.setBounds(140, 158, 330, 40);

        endereco.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 35));
        endereco.setBounds(10, 270, 200, 50);

        textendereco.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 35));
        textendereco.setBounds(205, 278, 600, 40);

        voltar.setBounds(2, 399, 150, 60);

        janela.setLayout(null);
        janela.add(nomefilial);
        janela.add(cnpj);
        janela.add(endereco);
        janela.add(textnomefilial);
        janela.add(textcnpj);
        janela.add(textendereco);
        janela.add(voltar);

        janela.setSize(1000, 500);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        voltar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            lojaTelaLoja.setNomefilial(textnomefilial.getText());
            lojaTelaLoja.setCnpj(textcnpj.getText());
            lojaTelaLoja.setEndereco(textendereco.getText());
        }catch(NumberFormatException exep){
            JOptionPane.showMessageDialog(null, "Alguma informação está incorreta", "Erro Cadastro", JOptionPane.ERROR_MESSAGE);
        }

        janela.dispose();
        new TelaPrincipal().telaPrincipal();
    }
}
