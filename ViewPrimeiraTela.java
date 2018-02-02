import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.*;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

public class ViewPrimeiraTela extends JFrame {
	private JTextField txtHv;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPrimeiraTela frame = new ViewPrimeiraTela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewPrimeiraTela() {
		this.setExtendedState(Frame.MAXIMIZED_HORIZ);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 900, 600);
		getContentPane().setLayout(null);
		
		txtHv = new JTextField();
		txtHv.setHorizontalAlignment(SwingConstants.CENTER);
		txtHv.setBackground(SystemColor.scrollbar);
		txtHv.setBounds(343, 237, 198, 20);
		getContentPane().add(txtHv);
		txtHv.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBackground(Color.LIGHT_GRAY);
		passwordField.setBounds(343, 287, 198, 20);
		getContentPane().add(passwordField);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenha.setBounds(328, 268, 66, 20);
		getContentPane().add(lblSenha);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(328, 216, 59, 20);
		getContentPane().add(lblLogin);
		
		JToggleButton btnNewButton = new JToggleButton("ENTRAR");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 102));
		btnNewButton.setBounds(382, 335, 120, 34);
		getContentPane().add(btnNewButton);
		
		JLabel foto = new JLabel("New label");
		foto.setHorizontalAlignment(SwingConstants.CENTER);
		foto.setBounds(330, 100, 224, 105);
		
		ImageIcon imagem = new ImageIcon(ViewPrimeiraTela.class.getResource("/img/logo.png"));
		Image imag = imagem.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_SMOOTH);
		
		foto.setIcon(new ImageIcon(imag));
		
		getContentPane().add(foto);
	}
}

