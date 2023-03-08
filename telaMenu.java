import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class telaMenu extends JFrame {
    private JPanel pnlTelaMenu;
    private JButton btnCadProdutos;
    private JButton btnCadUsuario;
    public telaMenu() {
        iniarComponentes();
        criarListener();
        btnCadUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnCadUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }
    public void iniarComponentes() {
        setTitle("tela de Menu");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlTelaMenu);
        setVisible(true);
    }
    public void criarListener(){

        btnCadProdutos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               telaCadProdutos produtos = new telaCadProdutos();
                produtos.setVisible(true);
                dispose();
            }
            });
             btnCadUsuario.addActionListener(new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                     telaCadUsuario usuario = new telaCadUsuario();
                     usuario.setVisible(true);
                     dispose();

                 }
             });
    }
                public static void main (String[]args){ telaMenu opcao = new telaMenu();}
                }
