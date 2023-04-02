package klnjnjl;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class window3 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window3 window = new window3();
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
	public window3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.desktop);
		frame.setBounds((int)Math.floor(Math.random() *(300 - 0 + 1) + 0) , (int)Math.floor(Math.random() *(300 - 0 + 1) + 0) , 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnSair = new JButton("Sair2");
		
		btnSair.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
		}
		
	}
		);
		
		
		btnSair.setBackground(SystemColor.windowBorder);
		btnSair.setBounds(114, 78, 213, 111);
		frame.getContentPane().add(btnSair);
	}

}
