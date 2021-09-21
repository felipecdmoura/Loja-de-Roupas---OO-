package Interface.MenuCliente;


import java.awt.Container;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;

import Objetos.Cliente;

public class MenuCliente extends JFrame {
       
       private static ArrayList <Cliente> clientes = new ArrayList<Cliente>();


       private static final long serialVersionUID = 1L;

    public static void main(String[] args)
    {
        MenuCliente field = new MenuCliente();
       field.testaJFormattedTextField();
    }

    //tela cadastro cliente
    private void testaJFormattedTextField() {
             Container janela = getContentPane();
             setLayout(null);

             //Define os rótulos dos botões
             JLabel labelnome = new JLabel("Nome: ");
             JLabel labelemail = new JLabel("Email: ");
             JLabel labelCpf = new JLabel("CPF: ");
             JLabel labelData = new JLabel("Data: ");
             JLabel labetelefone = new JLabel("Telefone: ");
             labelnome.setBounds(50,40,100,20);
             labelemail.setBounds(50,80,100,20);
             labetelefone.setBounds(50,120,100,20);
             labelCpf.setBounds(50,160,100,20);
             labelData.setBounds(50,200,100,20);

             //Define as máscaras
             MaskFormatter mascaranome = null;
             MaskFormatter mascaraemail = null;
             MaskFormatter mascaraTel = null;
             MaskFormatter mascaraCpf = null;
             MaskFormatter mascaraData = null;

             try{
                    
                    mascaraTel = new MaskFormatter("(##)####-####");
                    mascaraCpf = new MaskFormatter("#########-##");
                    mascaraData = new MaskFormatter("##/##/####");
                    mascaraTel.setPlaceholderCharacter('_');
                    mascaraCpf.setPlaceholderCharacter('_');
                    mascaraData.setPlaceholderCharacter('_');
             }
             catch(ParseException excp) {
                    System.err.println("Erro na formatação: " + excp.getMessage());
                    System.exit(-1);
             }

             //Seta as máscaras nos objetos JFormattedTextField
             JFormattedTextField jFormattedTextNome = new JFormattedTextField(mascaranome);
             JFormattedTextField jFormattedTextEmail= new JFormattedTextField(mascaraemail);
             JFormattedTextField jFormattedTextTel = new JFormattedTextField(mascaraTel);
             JFormattedTextField jFormattedTextCpf = new JFormattedTextField(mascaraCpf);
             JFormattedTextField jFormattedTextData = new JFormattedTextField(mascaraData);
             jFormattedTextNome.setBounds(150,40,100,20);
             jFormattedTextEmail.setBounds(150,80,100,20);
             jFormattedTextTel.setBounds(150,120,100,20);
             jFormattedTextCpf.setBounds(150,160,100,20);
             jFormattedTextData.setBounds(150,200,100,20);

             //Adiciona os rótulos e os campos de textos com máscaras na tela
             janela.add(labelnome);
             janela.add(labelemail);
             janela.add(labetelefone);
             janela.add(labelCpf);
             janela.add(labelData);
             janela.add(jFormattedTextNome);
             janela.add(jFormattedTextEmail);
             janela.add(jFormattedTextTel);
             janela.add(jFormattedTextCpf);
             janela.add(jFormattedTextData);
             setSize(400, 250);
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             setVisible(true);


    }


}