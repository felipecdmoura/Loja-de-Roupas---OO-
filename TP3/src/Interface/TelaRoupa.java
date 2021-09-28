package Interface;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import App.DadosAleatorios;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Objetos.*;


public class TelaRoupa implements ActionListener, ListSelectionListener, MouseListener {
    private JFrame janela;

    private JLabel titulo;

    private JList<String> listacamisas ;
    private JList<String> listacalcas ;
    private JScrollPane listascroll;

    private JTextField pesqcamisa;
    private JTextField pesqcalca;

    private JButton calca;
    private JButton cadastrarcamisa;
    private JButton cadastrarcalca;
    private JButton voltar;

    private static ArrayList <Camisa> camisasTelaRoupa;
    private static ArrayList <Calca> calcasTelaRoupa;
    private static ArrayList <Calca> calcasTelaPrincipal = new ArrayList<Calca>();
    private String[] todascamisas;
    private String[] todascalcas;


    public void telacamisa(ArrayList<Camisa> camisas, ArrayList<Calca> calcas) {
        camisasTelaRoupa = camisas;
        calcasTelaRoupa = calcas;
        todascamisas = new String[camisas.size()];
        int count = 0;

        for(Camisa camisa : camisas){
            todascamisas[count]= camisa.getNome();
            count++;
        }

   
        janela = new JFrame("Camisas");
        listacamisas = new JList<String>(todascamisas);
        listascroll = new JScrollPane();
        titulo = new JLabel("Camisas Cadastradas");
        pesqcamisa = new JTextField("Pesquisar nome da camisa");
        calca = new JButton("Calças");
        cadastrarcamisa = new JButton("Cadastrar");
        voltar = new JButton("Voltar");

        titulo.setFont(new Font("Arial", Font.BOLD, 40));
        titulo.setBounds(300, 10, 500, 30);

        pesqcamisa.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        pesqcamisa.setBounds(60, 70, 200, 30);

        calca.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        calca.setBounds(700, 70, 200, 30);

        listacamisas.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 35));
        listacamisas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listacamisas.setVisibleRowCount(10);

        listascroll.setBounds(60, 120, 790, 250);
        listascroll.setViewportView(listacamisas);

        voltar.setBounds(2, 399, 150, 60);
        cadastrarcamisa.setBounds(425, 399, 150, 60);

        janela.setLayout(null);
        janela.add(titulo);
        janela.add(pesqcamisa);
        janela.add(calca);
        janela.add(listascroll);
        janela.add(cadastrarcamisa);
        janela.add(voltar);

        janela.setSize(1000, 500);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cadastrarcamisa.addActionListener(this);
        voltar.addActionListener(this);

        calca.addActionListener(this);
        pesqcamisa.addMouseListener(this);
        pesqcamisa.addActionListener(this);

        listacamisas.addListSelectionListener(this);
    }

    public void telacalca(ArrayList<Camisa> camisas, ArrayList<Calca> calcas) {
        camisasTelaRoupa = camisas;
        calcasTelaRoupa = calcas;
        todascalcas = new String[calcas.size()];
        int count = 0;

        for(Calca calca : calcas){
            todascalcas[count]= calca.getNome();
            count++;
        }

   
        janela = new JFrame("Calças");
        listacalcas = new JList<String>(todascalcas);
        listascroll = new JScrollPane();
        titulo = new JLabel("Calças Cadastradas");
        pesqcalca = new JTextField("nome da calça");
        cadastrarcalca = new JButton("Cadastrar");
        voltar = new JButton("Voltar");

        titulo.setFont(new Font("Arial", Font.BOLD, 40));
        titulo.setBounds(300, 10, 500, 30);

        pesqcalca.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        pesqcalca.setBounds(60, 70, 200, 30);

        listacalcas.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 35));
        listacalcas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listacalcas.setVisibleRowCount(10);

        listascroll.setBounds(60, 120, 790, 250);
        listascroll.setViewportView(listacalcas);

        voltar.setBounds(2, 399, 150, 60);
        cadastrarcalca.setBounds(425, 399, 150, 60);

        janela.setLayout(null);
        janela.add(titulo);
        janela.add(pesqcalca);
        janela.add(listascroll);
        janela.add(cadastrarcalca);
        janela.add(voltar);

        janela.setSize(1000, 500);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cadastrarcalca.addActionListener(this);
        voltar.addActionListener(this);

        pesqcalca.addMouseListener(this);
        pesqcalca.addActionListener(this);

        listacalcas.addListSelectionListener(this);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
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

    @Override
    public void valueChanged(ListSelectionEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == voltar){
            janela.dispose();
            new TelaPrincipal().telaPrincipal();
        }
        if(src == calca){
            janela.dispose();
            new TelaRoupa().telacalca(camisasTelaRoupa,calcasTelaRoupa);
        }
        if(src == cadastrarcamisa){
            janela.dispose();
            new TelaCadastrar().cadastroCamisa(camisasTelaRoupa);
        }
        if(src == cadastrarcalca){
            janela.dispose();
            new TelaCadastrar().cadastroCalca(calcasTelaRoupa);
        }
    }


}
