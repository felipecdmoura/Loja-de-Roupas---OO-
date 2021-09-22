package Interface.MenuLoja;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class MenuLoja {
    private JTextArea vizualizar = new JTextArea();
    private JButton editar = new JButton();
    private JLabel painel = new JLabel();
    public MenuLoja(JFrame janela) {
        janela.getContentPane().removeAll();
        janela.repaint();

        vizualizar.setText("Nome da Filial: " + "\n" 
        + "Endereço: " + "\n" 
        + "CNPJ: "  );
        painel.add(vizualizar);

        painel.add(editar);
        painel.setLocation(0, 0);
        
        janela.add(painel);
    }   
}
