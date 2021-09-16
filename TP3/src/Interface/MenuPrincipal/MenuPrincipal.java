package Interface.MenuPrincipal;

import javax.swing.*;

public class MenuPrincipal {
    public static void main(String[] a) {
        JFrame f = new JFrame("Menu Principal");
        f.setVisible(true);

        JButton cliente = new JButton("cliente");
        JButton funcionario = new JButton("Funcionario");
        JButton venda = new JButton("Venda");
        JButton loja = new JButton("Loja");
        JButton roupa = new JButton("Roupas");
        JButton sair = new JButton("Sair");



        cliente.setBounds(130, 100, 100, 40);
        f.add(cliente);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);

        funcionario.setBounds(130, 150, 100, 40);
        f.add(funcionario);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);

        
        venda.setBounds(130, 200, 100, 40);
        f.add(venda);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);

        loja.setBounds(130, 250, 100, 40);
        f.add(loja);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);

        roupa.setBounds(130, 300, 100, 40);
        f.add(roupa);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);

        sair.setBounds(130, 350, 100, 40);
        f.add(sair);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);

    }
}