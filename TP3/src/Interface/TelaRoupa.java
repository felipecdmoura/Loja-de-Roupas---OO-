package Interface;
//importa as bibliotecas e classes que usaremos.
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

//importa as classes da pasta Objetos para que possamos usar seus metodos
import Objetos.*;

//instancia uma classe no qual implementa ActionListeners para que possamos utilizar dos eventos
public class TelaRoupa implements ActionListener, ListSelectionListener, MouseListener {
    //esta seção cria os componentes da biblioteca java swing que utilizaremos para formar nossa tela de camisa ou calça.
    private JFrame janela;
    private JLabel titulo;

    private JList<String> listacamisas ;
    private JList<String> listacalcas ;
    private JScrollPane listascroll;

    private JTextField pesqcamisa;
    private JTextField pesqcalca;

    private JButton calca;
    private JButton camisa;
    private JButton cadastrarcamisa;
    private JButton cadastrarcalca;
    private JButton voltarcamisa;
    private JButton voltarcalca;

    private static ArrayList <Camisa> camisasTelaRoupa;
    private static ArrayList <Calca> calcasTelaRoupa;
    private String[] todascamisas;
    private String[] todascalcas;

    //metodo que ira nos mostrar a tela de camisa.Este metodo recebe duas arraylists como parametros.
    public void telacamisa(ArrayList<Camisa> camisas, ArrayList<Calca> calcas) {
        //iguala as arraylists recebidas a instanciadas no codigo.
        camisasTelaRoupa = camisas;
        calcasTelaRoupa = calcas;
        todascamisas = new String[camisas.size()];
        int count = 0;

        for(Camisa camisa : camisas){
            todascamisas[count]= camisa.getId() + "-" + camisa.getNome();
            count++;
        }

        //aqui instanciamos nossos componentes da tela e instanciamos suas psoições.
        janela = new JFrame("Camisas");
        listacamisas = new JList<String>(todascamisas);
        listascroll = new JScrollPane();
        titulo = new JLabel("Camisas Cadastradas");
        pesqcamisa = new JTextField("ID do Produto");
        calca = new JButton("Calças");
        cadastrarcamisa = new JButton("Cadastrar");
        voltarcamisa = new JButton("Voltar");

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

        voltarcamisa.setBounds(2, 399, 150, 60);
        cadastrarcamisa.setBounds(425, 399, 150, 60);

        janela.setLayout(null);
        janela.add(titulo);
        janela.add(pesqcamisa);
        janela.add(listascroll);
        janela.add(cadastrarcamisa);
        janela.add(voltarcamisa);
        janela.add(calca);

        janela.setSize(1000, 500);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cadastrarcamisa.addActionListener(this);
        voltarcamisa.addActionListener(this);
        calca.addActionListener(this);

        pesqcamisa.addMouseListener(this);
        pesqcamisa.addActionListener(this);

        listacamisas.addListSelectionListener(this);
    }

    public void telaCalca(ArrayList<Camisa> camisas, ArrayList<Calca> calcas) {
        //iguala as arraylists recebidas a instanciadas no codigo.        
        camisasTelaRoupa = camisas;
        calcasTelaRoupa = calcas;
        todascalcas = new String[calcas.size()];
        int count = 0;
        
        
        for(Calca calca : calcas){
            todascalcas[count]= calca.getId() + "-" + calca.getNome();
            count++;
        }

        //aqui instanciamos nossos componentes da tela e instanciamos suas psoições.
        janela = new JFrame("Calças");
        listacalcas = new JList<String>(todascalcas);
        listascroll = new JScrollPane();
        titulo = new JLabel("Calças Cadastradas");
        pesqcalca = new JTextField("ID do Produto");
        camisa = new JButton("Camisas");
        cadastrarcalca = new JButton("Cadastrar");
        voltarcalca = new JButton("Voltar");

        titulo.setFont(new Font("Arial", Font.BOLD, 40));
        titulo.setBounds(300, 10, 500, 30);

        pesqcalca.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        pesqcalca.setBounds(60, 70, 200, 30);

        camisa.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        camisa.setBounds(700, 70, 200, 30);

        listacalcas.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 35));
        listacalcas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listacalcas.setVisibleRowCount(10);

        listascroll.setBounds(60, 120, 790, 250);
        listascroll.setViewportView(listacalcas);

        voltarcalca.setBounds(2, 399, 150, 60);
        cadastrarcalca.setBounds(425, 399, 150, 60);

        janela.setLayout(null);
        janela.add(titulo);
        janela.add(pesqcalca);
        janela.add(listascroll);
        janela.add(cadastrarcalca);
        janela.add(voltarcalca);
        janela.add(camisa);

        janela.setSize(1000, 500);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cadastrarcalca.addActionListener(this);
        voltarcalca.addActionListener(this);
        camisa.addActionListener(this);

        pesqcalca.addMouseListener(this);
        pesqcalca.addActionListener(this);

        listacalcas.addListSelectionListener(this);
    }

    //evento que recebe o  clique do mouse e limpa o textfield de pesquisar.
    @Override
    public void mouseClicked(MouseEvent e) {
        Object src = e.getSource();
        
        if(src == pesqcamisa){
            pesqcamisa.setText(null);
        }

        if(src == pesqcalca){
            pesqcalca.setText(null);
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

    @Override
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();
        try{
            //evento que observa o clique do botão na lista e cria nossa tela editar/visualizar para camisa.
            if (e.getValueIsAdjusting() && src == listacamisas) {
                janela.dispose();
                // Passa apenas os tres primeiros digitos, sendo o ID, como agrumento da posicao da lista.
                new TelaEditarVizualizarDeletar().editarCamisa(camisasTelaRoupa, calcasTelaRoupa, listacamisas.getSelectedValue().substring(0, 3));
            }
        }catch(NullPointerException exc){
            janela.dispose();
            new TelaRoupa().telacamisa(camisasTelaRoupa, calcasTelaRoupa);
        }

        try{
            //evento que observa o clique do botão na lista e cria nossa tela editar/visualizar para calça.
            if (e.getValueIsAdjusting() && src == listacalcas) {
                janela.dispose();
                // Passa apenas os tres primeiros digitos, sendo o ID, como agrumento da posicao da lista.
                new TelaEditarVizualizarDeletar().editarCalca(camisasTelaRoupa, calcasTelaRoupa, listacalcas.getSelectedValue().substring(0, 3));
            }
        }catch(NullPointerException exc){
            janela.dispose();
            new TelaRoupa().telaCalca(camisasTelaRoupa, calcasTelaRoupa);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        //evento que observa o clique do botão calça e gera uma tela expecifica para a mesma
        if(src == calca){
            janela.dispose();
            new TelaRoupa().telaCalca(camisasTelaRoupa, calcasTelaRoupa);
        }
        if(src == camisa){
            janela.dispose();
            new TelaRoupa().telacamisa(camisasTelaRoupa, calcasTelaRoupa);
        }
         //evento que observa o clique do botão voltar e gera a tela  principal da nossa aplicação.
        if (src == voltarcamisa){
            janela.dispose();
            new TelaPrincipal().telaPrincipal();
        }
        //evento que observa o clique do botão voltar e gera a tela  de camisa da nossa aplicação.
        if (src == voltarcalca){
            janela.dispose();
            new TelaRoupa().telacamisa(camisasTelaRoupa, calcasTelaRoupa);
        }
        //evento que observa o clique do botão cadastrar da tela camisa e gera uma nova tela para o mesmo.
        if(src == cadastrarcamisa){
            janela.dispose();
            new TelaCadastrar().cadastroCamisa(camisasTelaRoupa, calcasTelaRoupa);
        }
        //evento que compara os textos da pesqcamisa e retorna apenas o mesmo na nossa lista.
        if(src == pesqcamisa){
            if(pesqcamisa.getText().equals("")){
                listacamisas.setListData(todascamisas);
            }else{
                try{
                    // Passa apenas os tres primeiros digitos, sendo o ID, como agrumento de pesquisa.
                    listacamisas.setListData(Pesquisar.pesquisarCamisa(camisasTelaRoupa, pesqcamisa.getText().substring(0, 3))); 
                }catch(StringIndexOutOfBoundsException exc){
                }
            }
        }
         //evento que observa o clique do botão cadastrar da tela calça e gera uma nova tela para o mesmo.
        if(src == cadastrarcalca){
            janela.dispose();
            new TelaCadastrar().cadastroCalca(camisasTelaRoupa, calcasTelaRoupa);
        }
        //evento que compara os textos da pesqcalca e retorna apenas o mesmo na nossa lista.
        if(src == pesqcalca){
            if(pesqcalca.getText().equals("")){
                listacalcas.setListData(todascalcas);
            }else{
                try{
                    // Passa apenas os tres primeiros digitos, sendo o ID, como agrumento de pesquisa.
                    listacalcas.setListData(Pesquisar.pesquisarCalca(calcasTelaRoupa, pesqcalca.getText().substring(0, 3)));
                }catch(StringIndexOutOfBoundsException exc){
                }
            }
        }
    }


}
