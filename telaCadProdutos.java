import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaCadProdutos extends JFrame{
    private JPanel pnlTelaCadProdutos;
    private JTextField txtQuantidadeEmEstoque;
    private JTextField txtPreco;
    private JTextField txtDescricao;
    private JTextField txtCodigo;
    private JLabel lblCodigo;
    private JLabel lblDescricao;
    private JLabel lblPreco;
    private JLabel lblQuantidadeEmEstoque;
    private JButton btnInserir;
    public telaCadProdutos() {
        iniciarcomponentes();

        btnInserir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String codigoProduto = txtCodigo.getText();
                String descricaoProduto = txtDescricao.getText();
                String precoProduto = txtPreco.getText();
                String quantidadeEmEstoqueProduto = txtQuantidadeEmEstoque.getText();

                JOptionPane.showMessageDialog(btnInserir, "O seguinte produto foi cadastrado com sucesso: \n"
                        + "Código: " + codigoProduto + "\n"
                        + "Descrição: " + descricaoProduto + "\n"
                        + "Preço: " + precoProduto +"\n"
                        + "Quantidade em estoque: " + quantidadeEmEstoqueProduto +"\n");
                telaMenu voltar = new telaMenu();
                voltar.setVisible(true);
                dispose();
            }
        });
    }
    public void iniciarcomponentes() {
        setTitle("tela cadastro de usuario");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlTelaCadProdutos);
        setVisible(true);
    }

    public static void main(String[] args) {telaCadProdutos produtos = new telaCadProdutos();
    }
}
