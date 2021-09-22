package Interface.MenuPrincipal;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.plaf.DimensionUIResource;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Interface.MenuCliente.*;
import Interface.MenuLoja.MenuLoja;
public class MenuPrincipal extends JFrame  {
    private JPanel menuinicial = new JPanel();

    private JButton cliente = new JButton("Cliente");
    private JButton funcionario = new JButton("Funcionario");
    private JButton venda = new JButton("Venda");
    private JButton loja = new JButton("Loja");
    private JButton roupa = new JButton("Roupas");
    private JButton sair = new JButton("Sair");

    public MenuPrincipal(){
    
        cliente.setBounds(105, 190, 150, 60);
        cliente.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new MenuCliente();
            }
        });

        loja.setBounds(265, 190, 150, 60);
        loja.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.println("Lojaa!");
            }
        });

        funcionario.setBounds(425, 190, 150, 60);

        venda.setBounds(585, 190, 150, 60); 

        roupa.setBounds(745, 190, 150, 60);

        sair.setBounds(2, 399, 150, 60);
        sair.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuinicial.setLayout(null);
        menuinicial.add(cliente);
        menuinicial.add(funcionario);
        menuinicial.add(venda);
        menuinicial.add(loja);
        menuinicial.add(roupa);
        menuinicial.add(sair);

        
        add(menuinicial);
        setSize(1000, 500);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    public static void main(String[] args) {
        new MenuPrincipal();
    }

    
    
}
