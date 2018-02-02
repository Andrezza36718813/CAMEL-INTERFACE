package img;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JMenu;

import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JProgressBar;
import javax.swing.JMenuBar;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		this.setExtendedState(Frame.MAXIMIZED_HORIZ);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(5, 5, 1350, 730);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel logo = new JLabel("New label");
		logo.setBounds(25, 0, 238, 89);
		
		ImageIcon imagem = new ImageIcon(TelaPrincipal.class.getResource("/img/logo.png"));
		Image imag = imagem.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);
		contentPane.setLayout(null);
		
		logo.setIcon(new ImageIcon(imag));
		
		contentPane.add(logo);
		
		JPanel panelFornec = new JPanel();
		panelFornec.setBounds(44, 156, 1245, 496);
		panelFornec.setBackground(new Color(25, 25, 112));
		//contentPane.add(panelFornec);
		GroupLayout gl_panel = new GroupLayout(panelFornec);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1245, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 496, Short.MAX_VALUE)
		);
		panelFornec.setLayout(gl_panel);
		
		
		JPanel panelEst = new JPanel();
		panelEst.setBounds(44, 156, 1245, 496);
		panelEst.setBackground(new Color(25, 25, 112));
		//contentPane.add(panelEst);
		GroupLayout gl_panel2 = new GroupLayout(panelEst);
		gl_panel2.setHorizontalGroup(
			gl_panel2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1245, Short.MAX_VALUE)
		);
		gl_panel2.setVerticalGroup(
			gl_panel2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 496, Short.MAX_VALUE)
		);
		panelEst.setLayout(gl_panel2);
		
		JPanel panelFunc = new JPanel();
		panelFunc.setBounds(44, 156, 1245, 496);
		panelFunc.setBackground(new Color(25, 25, 112));
		//contentPane.add(panelFunc);
		GroupLayout gl_panel3 = new GroupLayout(panelFunc);
		gl_panel3.setHorizontalGroup(
			gl_panel3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1245, Short.MAX_VALUE)
		);
		gl_panel3.setVerticalGroup(
			gl_panel3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 496, Short.MAX_VALUE)
		);
		panelFunc.setLayout(gl_panel3);
		
		JPanel panelHist = new JPanel();
		panelHist.setBounds(44, 156, 1245, 496);
		panelHist.setBackground(new Color(25, 25, 112));
		contentPane.add(panelFornec);
		GroupLayout gl_panel5 = new GroupLayout(panelHist);
		gl_panel5.setHorizontalGroup(
			gl_panel5.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1245, Short.MAX_VALUE)
		);
		gl_panel5.setVerticalGroup(
			gl_panel5.createParallelGroup(Alignment.LEADING)
				.addGap(0, 496, Short.MAX_VALUE)
		);
		panelHist.setLayout(gl_panel5);
		
		JMenu menuFornec = new JMenu("Fornecedores");
		JMenu menuEstoque = new JMenu("Estoque");
		JMenu menuFunc = new JMenu("Funcionários");
		JMenu menuCai = new JMenu("Caixa");
		JMenu menuHist = new JMenu("Histórico");
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(255, 255, 255));
		menuBar.setBackground(new Color(0, 0, 128));
		menuBar.setBounds(44, 135, 350, 21);
		contentPane.add(menuBar);
		menuBar.add(menuFornec);
		menuBar.add(menuEstoque);
		menuBar.add(menuFunc);
		menuBar.add(menuCai);
		menuBar.add(menuHist);
		
		//menuFornec.add(panelFornec);
		//menuEstoque.add(panelEst);
		//menuFunc.add(panelFunc);
		//menuCai.add(panelCai);
	//	menuHist.add(panelHist);
	}
}
