package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.text.MaskFormatter;

import Objetos.Cliente;

public class TelaCliente extends JFrame {

       //private JFrame janela = new JFrame();
       private JLabel labelnome = new JLabel("Nome: ");
       private JLabel labelemail = new JLabel("Email: ");
       private JLabel labelCpf = new JLabel("CPF: ");
       private JLabel labelData = new JLabel("Data: ");
       private JLabel labetelefone = new JLabel("Telefone: ");
       private JPanel menucliente = new JPanel();
       private JButton voltar = new JButton("Voltar");
       // tela cadastro cliente
       public TelaCliente() {
              //janela.getContentPane().removeAll();
              //janela.repaint();
              // Define os rótulos dos botões

              labelnome.setBounds(50, 40, 100, 20);
              labelemail.setBounds(50, 80, 100, 20);
              labetelefone.setBounds(50, 120, 100, 20);
              labelCpf.setBounds(50, 160, 100, 20);
              labelData.setBounds(50, 200, 100, 20);

              // Define as máscaras
              MaskFormatter mascaranome = null;
              MaskFormatter mascaraemail = null;
              MaskFormatter mascaraTel = null;
              MaskFormatter mascaraCpf = null;
              MaskFormatter mascaraData = null;

              try {

                     mascaraTel = new MaskFormatter("(##)####-####");
                     mascaraCpf = new MaskFormatter("#########-##");
                     mascaraData = new MaskFormatter("##/##/####");
                     mascaraTel.setPlaceholderCharacter('_');
                     mascaraCpf.setPlaceholderCharacter('_');
                     mascaraData.setPlaceholderCharacter('_');
              } catch (ParseException excp) {
                     System.err.println("Erro na formatação: " + excp.getMessage());
                     System.exit(-1);
              }

              // Seta as máscaras nos objetos JFormattedTextField
              JFormattedTextField jFormattedTextNome = new JFormattedTextField(mascaranome);
              JFormattedTextField jFormattedTextEmail = new JFormattedTextField(mascaraemail);
              JFormattedTextField jFormattedTextTel = new JFormattedTextField(mascaraTel);
              JFormattedTextField jFormattedTextCpf = new JFormattedTextField(mascaraCpf);
              JFormattedTextField jFormattedTextData = new JFormattedTextField(mascaraData);
              jFormattedTextNome.setBounds(150, 40, 100, 20);
              jFormattedTextEmail.setBounds(150, 80, 100, 20);
              jFormattedTextTel.setBounds(150, 120, 100, 20);
              jFormattedTextCpf.setBounds(150, 160, 100, 20);
              jFormattedTextData.setBounds(150, 200, 100, 20);

              // Adiciona os rótulos e os campos de textos com máscaras na tela
              //janela.add(labelnome);
              //janela.add(labelemail);
              //janela.add(labetelefone);
              //janela.add(labelCpf);
              //janela.add(labelData);
              //janela.add(jFormattedTextNome);
              //janela.add(jFormattedTextEmail);
              //janela.add(jFormattedTextTel);
              //janela.add(jFormattedTextCpf);
              //janela.add(jFormattedTextData);
              
              voltar.setBounds(2, 399, 150, 60);
              voltar.addActionListener(new ActionListener(){
                     @Override
                     public void actionPerformed(ActionEvent e) {
                            dispose();
                            new TelaPrincipal();  
                     }
              });

              menucliente.setLayout(null);
              menucliente.add(labelnome);
              menucliente.add(jFormattedTextNome);
              menucliente.add(labelemail);
              menucliente.add(jFormattedTextEmail);
              menucliente.add(labetelefone);
              menucliente.add(jFormattedTextTel);
              menucliente.add(labelCpf);
              menucliente.add(jFormattedTextCpf);
              menucliente.add(labelData);
              menucliente.add(jFormattedTextData);
              menucliente.add(voltar);

              add(menucliente);
              setSize(1000, 500);
              setResizable(false);
              setVisible(true);
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }
       
       
}
