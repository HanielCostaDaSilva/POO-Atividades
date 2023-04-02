package klnjnjl;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.SystemColor;
import javax.swing.JMenuItem;

public class window1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window1 window = new window1();
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
	public window1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JButton btnIrParaJanela = new JButton("Ir para Janela2");
		btnIrParaJanela.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			window2 macaco = new window2(); 
			}
		});
		
		
		
		springLayout.putConstraint(SpringLayout.NORTH, btnIrParaJanela, 69, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnIrParaJanela, 155, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(btnIrParaJanela);
		
		JButton btnIrParaJanela_2 = new JButton("Ir para Janela3");
			btnIrParaJanela_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int cont=4;
				while (cont>0){
					window3 esposa= new window3();
					cont-=1;
				}
			}
		});
		
		
		springLayout.putConstraint(SpringLayout.NORTH, btnIrParaJanela_2, 50, SpringLayout.SOUTH, btnIrParaJanela);
		springLayout.putConstraint(SpringLayout.WEST, btnIrParaJanela_2, 0, SpringLayout.WEST, btnIrParaJanela);
		frame.getContentPane().add(btnIrParaJanela_2);
		
		JMenuBar Exibir = new JMenuBar();
		Exibir.setBackground(SystemColor.controlHighlight);
		frame.setJMenuBar(Exibir);
		
		JMenu mnNewMenu = new JMenu("Exibir");
	
		Exibir.add(mnNewMenu);
		springLayout.putConstraint(SpringLayout.NORTH, mnNewMenu, 95, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, mnNewMenu, 43, SpringLayout.WEST, frame.getContentPane());
		
		JMenuItem janela2Menu = new JMenuItem("Ir Janela 2");
		janela2Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnIrParaJanela.doClick();
				
			}
		});
		mnNewMenu.add(janela2Menu);
		
		JMenuItem janela3Menu = new JMenuItem("Ir Janela3");
		janela3Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnIrParaJanela_2.doClick();
				
			}
		});
		
		mnNewMenu.add(janela3Menu);
		
		JMenu mnNewMenu_1 = new JMenu("Sair");
		Exibir.add(mnNewMenu_1);
		springLayout.putConstraint(SpringLayout.NORTH, mnNewMenu_1, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, mnNewMenu_1, 50, SpringLayout.WEST, frame.getContentPane());
	}
}
