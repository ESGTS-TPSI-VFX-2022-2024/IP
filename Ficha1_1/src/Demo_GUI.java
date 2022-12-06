import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Demo_GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo_GUI window = new Demo_GUI();
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
	public Demo_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 530, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnInicio = new JButton("INICIO");
		btnInicio.setForeground(new Color(255, 255, 255));
		btnInicio.setBackground(new Color(0,0,255));
		btnInicio.setBounds(20, 80, 80, 80);
		frame.getContentPane().add(btnInicio, BorderLayout.WEST);
		
		JButton btnMeio = new JButton("MEIO");
		btnMeio.setForeground(new Color(255, 255, 255));
		btnMeio.setBackground(new Color(255, 0, 0));
		btnMeio.setBounds(200, 80, 80, 80);
		frame.getContentPane().add(btnMeio);
		
		JButton btnFim = new JButton("FIM");
		btnFim.setForeground(new Color(255, 255, 255));
		btnFim.setBackground(new Color(0, 255, 0));
		btnFim.setBounds(400, 80, 80, 80);
		frame.getContentPane().add(btnFim);
		
		JButton btnAvancar = new JButton("AVAN\u00C7AR");
		btnAvancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//System.out.println("teste");
				
				// Avançar com o botão para a frente
				if (btnInicio.getX() + btnInicio.getWidth() < btnMeio.getX()) {
					btnInicio.setLocation(btnInicio.getX() + 20, btnInicio.getY());
				} else if (btnInicio.getX() + btnInicio.getWidth() == btnMeio.getX() &&
						btnInicio.getY() + btnInicio.getHeight() > btnMeio.getY()) {
					// Subir o botão
					btnInicio.setLocation(btnInicio.getX(), btnInicio.getY() - 20);
				} else if (btnInicio.getY() + btnInicio.getHeight() == btnMeio.getY()
						&& btnInicio.getX() < btnMeio.getX() + btnMeio.getWidth()){
					// Avançar botão
					btnInicio.setLocation(btnInicio.getX() + 20, btnInicio.getY());
				} else if (btnInicio.getX() == btnMeio.getX() + btnMeio.getWidth()
						&& btnInicio.getY() < btnMeio.getY()) {
					// Descer
					btnInicio.setLocation(btnInicio.getX(), btnInicio.getY() + 20);
				} else if (btnInicio.getX() + btnInicio.getWidth() < btnFim.getX()) {
					btnInicio.setLocation(btnInicio.getX() + 20, btnInicio.getY());
				}

				
				
			}
		});
		btnAvancar.setBounds(172, 261, 173, 40);
		frame.getContentPane().add(btnAvancar);
	}
}
