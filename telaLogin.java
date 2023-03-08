import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaLogin extends JFrame{
    private JPanel telaInicial;
    private JButton btnOk;
    private JTextField txtUsuario;
    private JPasswordField pswSenha;
    private JLabel lblUsuario;
    private JLabel lblSenha;
public telaLogin() {
    iniarComponentes();
    criarListener();
}
    public void iniarComponentes(){
        setTitle("tela de login");
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(telaInicial);
        setVisible(true);
    }
        public void criarListener(){
    btnOk.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            validarLogin();
        }
    });
}
private void validarLogin(){
    String usuario = txtUsuario.getText();
    String senha = new String(pswSenha.getPassword());
    if(usuario.equals("admin") && senha.equals("admin")) {
        telaMenu menu = new telaMenu();
        menu.setVisible(true);
        dispose();
    }else{
        JOptionPane.showMessageDialog(this, "Usuario ou senha incorreta");
         }
}
    public static void main(String[] args) {
        telaLogin iniciar = new telaLogin();
    }
}
