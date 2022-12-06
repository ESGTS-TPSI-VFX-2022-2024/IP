import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Demo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo window = new Demo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Demo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Alterar tipo de layout para conseguir alterar botões
		frame.getContentPane().setLayout(null);
		
		JButton btnEsquerda = new JButton("<");
		btnEsquerda.setBounds(7, 227, 99, 34);
		frame.getContentPane().add(btnEsquerda);
		
		JButton btnCima = new JButton("^");
		
		btnCima.setBounds(113, 227, 99, 34);
		frame.getContentPane().add(btnCima);
		
		JButton btnBaixo = new JButton("|");
		btnBaixo.setBounds(219, 227, 99, 34);
		frame.getContentPane().add(btnBaixo);
		
		JButton btnDireira = new JButton(">");
		btnDireira.setBounds(325, 227, 99, 34);
		frame.getContentPane().add(btnDireira);
		
		JButton btnAzul = new JButton("");
		btnAzul.setBackground(new Color(0, 0, 255));
		btnAzul.setBounds(180, 90, 80, 80);
		frame.getContentPane().add(btnAzul);
		
		JButton btnVermelho = new JButton("");
		btnVermelho.setBackground(new Color(255, 0, 0));
		btnVermelho.setBounds(40, 33, 80, 80);
		frame.getContentPane().add(btnVermelho);
		
		// Botão para a esquerda
		btnEsquerda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (verificarSePodeAndarParaEsquerda()) {
					btnVermelho.setLocation(btnVermelho.getX() - 20, btnVermelho.getY());	
				}
				
			}

			private boolean verificarSePodeAndarParaEsquerda() {
				
				if (btnVermelho.getX() > 0) {
					return true;
				} else {
					return false;
				}
				
			}
		});
		
		// Botão para a direita
		btnDireira.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (verificarSePodeAndarParaDireita()) {
					btnVermelho.setLocation(btnVermelho.getX() + 20, btnVermelho.getY());
				}
				
			}

			private boolean verificarSePodeAndarParaDireita() {

				if(btnVermelho.getX() + btnVermelho.getWidth() < frame.getContentPane().getWidth()) {
					return true;
				} else {
					return false;
				}
			}
		});
		
		// Botão para cima
		btnCima.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (verificarSePodeAndarParaCima()) {
					btnVermelho.setLocation(btnVermelho.getX(), btnVermelho.getY() - 20);
				}
				
			}

			private boolean verificarSePodeAndarParaCima() {
				// TODO Auto-generated method stub
				if (btnVermelho.getY() > 0) {
					return true;
				} else {
					return false;
				}
			}
		});
		
		// Botão para baixo
		btnBaixo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnVermelho.setLocation(btnVermelho.getX(), btnVermelho.getY() + 20);
			}
		});
	}
}
