package Interface.MenuPrincipal;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.plaf.DimensionUIResource;

import java.awt.*;
public class MenuPrincipal {
    private JFrame f = new JFrame("Menu Principal");
    private JPanel menuinicial = new JPanel();
    private JButton cliente = new JButton("Cliente");
    private JButton funcionario = new JButton("Funcionario");
    private JButton venda = new JButton("Venda");
    private JButton loja = new JButton("Loja");
    private JButton roupa = new JButton("Roupas");
    private JButton sair = new JButton("Sair");

    public MenuPrincipal() {
        

        cliente.setBounds(105, 190, 150, 60);
        
        loja.setBounds(265, 190, 150, 60);

        funcionario.setBounds(425, 190, 150, 60);

        venda.setBounds(585, 190, 150, 60); 

        roupa.setBounds(745, 190, 150, 60);

        sair.setBounds(2, 399, 150, 60);


        menuinicial.setLayout(null);
        menuinicial.add(cliente);
        menuinicial.add(funcionario);
        menuinicial.add(venda);
        menuinicial.add( loja);
        menuinicial.add(roupa);
        menuinicial.add(sair);

        f.setSize(1000, 500);
        f.add(menuinicial);
        f.setResizable(false);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] a) {
        new MenuPrincipal();
    }
}
