package Interface;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import Objetos.*;

public class TelaRoupa implements ActionListener, ItemListener {
    private JFrame janela;
    private CardLayout cardlayout;

    private JPanel painelprincipal;
    private JPanel painelcamisa;
    private JPanel painelcalca;

    private JComboBox<String> menusuperior;

    private JList<String> listacamisas ;
    private JList<String> listacalcas ;
    private JScrollPane listascroll;

    private JTextField pesqcamisa;
    private JTextField pesqcalca;

    private JButton cadastrarcamisa;
    private JButton cadastrarcalca;
    private JButton voltar;

    private static ArrayList <Camisa> camisasTelaRoupa;
    private static ArrayList <Calca> calcasTelaRoupa;
    private String[] todascamisas;
    private String[] todascalcas;

    public void telaRoupa(ArrayList<Camisa> camisas, ArrayList<Calca> calcas) {
        cardlayout = new CardLayout(20,40);
        camisasTelaRoupa = camisas;
        todascamisas = new String[camisas.size()];
        int count = 0;

        for(Camisa camisa : camisas){
            todascamisas[count]= camisa.getNome();
            count++;
        }

        calcasTelaRoupa = calcas;
        todascalcas = new String[calcas.size()];
        count = 0;

        for(Calca calca : calcas){
            todascalcas[count]= calca.getNome();
            count++;
        }
   
        janela = new JFrame("Roupas");
        painelprincipal = new JPanel();
        String itensmenu[] = {"Camisa", "Calca"};
        menusuperior = new JComboBox<String>(itensmenu);
        voltar = new JButton("Voltar");

        menusuperior.setEditable(false);
        menusuperior.addItemListener(this);
        menusuperior.setBounds(10, 10, 100, 40);

        voltar.setBounds(2, 399, 150, 60);

        painelprincipal.setLayout(cardlayout);
        painelprincipal.add(painelCamisa(), "Camisas");
        painelprincipal.add(painelCalca(), "Calças");
        painelprincipal.setBounds(60, 120, 900, 400);
        cardlayout.show(painelprincipal, "Camisas");

        janela.setLayout(null);
        janela.add(painelCamisa());
        janela.add(menusuperior);

        janela.setSize(1000, 500);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cadastrarcamisa.addActionListener(this);
        cadastrarcalca.addActionListener(this);
        voltar.addActionListener(this);
    }

    public JPanel painelCamisa() {
        painelcamisa = new JPanel();
        listacamisas = new JList<String>(todascamisas);
        listascroll = new JScrollPane();
        pesqcamisa = new JTextField("Pesquisar pelo Id");
        cadastrarcamisa = new JButton("Cadastrar");

        listacamisas.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 35));
        listacamisas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listacamisas.setVisibleRowCount(10);

        listascroll.setBounds(60, 120, 790, 250);
        listascroll.setViewportView(listacamisas);

        cadastrarcamisa.setBounds(425, 399, 150, 60);

        painelcamisa.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        painelcamisa.setBounds(60, 120, 790, 250);
        painelcamisa.add(listacamisas);
        painelcamisa.add(listascroll);
        painelcamisa.add(pesqcamisa);
        painelcamisa.add(cadastrarcamisa);

        return painelcamisa;
    }

    public JPanel painelCalca() {
        painelcalca = new JPanel();
        listacalcas = new JList<String>(todascalcas);
        listascroll = new JScrollPane();
        pesqcalca = new JTextField("Pesquisar pelo Id");
        cadastrarcalca = new JButton("Cadastrar");

        listacalcas.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 35));
        listacalcas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listacalcas.setVisibleRowCount(10);

        listascroll.setBounds(60, 120, 790, 250);
        listascroll.setViewportView(listacalcas);

        cadastrarcalca.setBounds(425, 399, 150, 60);
        
        painelcalca.setLayout(null);
        painelcalca.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        painelcalca.setBounds(60, 70, 200, 30);
        painelcalca.add(listacalcas);
        painelcalca.add(listascroll);
        painelcalca.add(pesqcalca);
        painelcalca.add(cadastrarcalca);
        
        return painelcalca;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if(src == voltar){
            janela.dispose();
            new TelaPrincipal().telaPrincipal();
        }

        if (src == cadastrarcamisa) {
            cardlayout.show(painelprincipal, "Calças");
        }

        if (src == cadastrarcalca) {
            cardlayout.show(painelprincipal, "Camisas");
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        
    }
}
