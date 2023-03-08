import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaCadUsuario extends JFrame {
    private JPanel pnlTelaCadUsuario;
    private JButton btnInserir;
    private JTextField txtLogin;
    private JTextField txtFuncao;
    private JTextField txtSetor;
    private JTextField txtSobrenome;
    private JTextField txtNome;
    private JLabel lblNome;
    private JLabel lblSobrenome;
    private JLabel lblSetor;
    private JLabel lblFuncao;
    private JLabel lblLogin;
    private JLabel lblSenha;
    private JPasswordField pswSenha;

    public telaCadUsuario() {
        iniciarcomponentes();

        btnInserir.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            StringBuilder sb = new StringBuilder();

            String nomeUsuario = txtNome.getText();
            String sobrenomeUsuario = txtSobrenome.getText();
            String setorUsuario = txtSetor.getText();
            String funcaoUsuario = txtFuncao.getText();
            String loginUsuario = txtLogin.getText();
            String senhaUsuario = pswSenha.getText();

            JOptionPane.showMessageDialog(btnInserir, "O seguinte usuario foi cadastrado com sucesso: \n"
                    + "Nome: " + nomeUsuario + "\n"
                    + "Sobrenome: " + sobrenomeUsuario + "\n"
                    + "Setor: " + setorUsuario +"\n"
                    + "Função: " + funcaoUsuario +"\n"
                    + "Login: " + loginUsuario + "\n"
                    + "Senha: " + senhaUsuario + "\n");

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
        setContentPane(pnlTelaCadUsuario);
        setVisible(true);

    }
    public static void main(String[] args) {telaCadUsuario usuario = new telaCadUsuario();
    }
    }
