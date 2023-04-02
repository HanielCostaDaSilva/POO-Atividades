package Brazilian;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Brazil {
	
	private int brazilGol=0 ;
	
	private int agentenaGol=0;

	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	boolean verify() {
		
		if(brazilGol==5) {
			return true;
		}
		if(agentenaGol==5) {
			return true;	
		}
		return false;
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Brazil window = new Brazil();
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
	public Brazil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		JLabel ganhouB = new JLabel("BRASIL GANHOU!!!");
		ganhouB.setBounds(144, 161, 69, 15);
		JLabel ganhouA = new JLabel("ARGENTINA GANHOU! AOBA");
		ganhouA.setBounds(144, 161, 69, 15);
		
		JLabel lblNewLabel_1 = new JLabel("agentena");
		lblNewLabel_1.setBounds(144, 161, 69, 15);
		
		JLabel Brasil = new JLabel("Brazel");
		Brasil.setBounds(181, 38, 45, 39);
		
		JButton buttonBrasil = new JButton("Marcar Gol");
		buttonBrasil.setBounds(244, 38, 130, 39);
		
		JButton buttonArgentina = new JButton("Marcar Gol");
		buttonArgentina.setBounds(227, 161, 134, 25);
		
		JLabel golBrasilQuantidade = new JLabel("Gol: 0");
		golBrasilQuantidade.setBounds(392, 50, 40, 15);
		
		JLabel golArgentinaQuantidade = new JLabel("Gol: 0");
		golArgentinaQuantidade.setBounds(392, 161, 40, 15);
		
		JLabel bandeiraAgentena = new JLabel();
		bandeiraAgentena.setBounds(12, 136, 125, 62);
		bandeiraAgentena.setLabelFor(lblNewLabel_1);
		bandeiraAgentena.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel bandeiraBrazil = new JLabel();
		bandeiraBrazil.setSize(new Dimension(200, 300));
		bandeiraBrazil.setRequestFocusEnabled(false);
		bandeiraBrazil.setOpaque(true);
		bandeiraBrazil.setFocusTraversalKeysEnabled(false);
		bandeiraBrazil.setDoubleBuffered(true);
		bandeiraBrazil.setBounds(12, 38, 130, 62);
		
		JButton btnResetarPlacar = new JButton("Resetar Placar");
		btnResetarPlacar.setBounds(144, 234, 138, 25);
		
		ImageIcon iconBrazil = new ImageIcon(Brazil.class.getResource("/Imagem/brazil.png"));
		iconBrazil.setImage(iconBrazil.getImage().getScaledInstance(bandeiraBrazil.getWidth() , bandeiraBrazil.getHeight(), Image.SCALE_DEFAULT));
		
		ImageIcon iconAgentena = new ImageIcon(Brazil.class.getResource("/Imagem/agentena.jpeg"));
		iconAgentena.setImage(iconAgentena.getImage().getScaledInstance(bandeiraAgentena.getWidth() , bandeiraAgentena.getHeight(), Image.SCALE_DEFAULT));
		
		bandeiraAgentena.setIcon(iconAgentena);
		bandeiraBrazil.setIcon(iconBrazil);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnResetarPlacar);
		frame.getContentPane().add(lblNewLabel_1);
		frame.getContentPane().add(bandeiraBrazil);
		frame.getContentPane().add(Brasil);
		frame.getContentPane().add(bandeiraAgentena);
		frame.getContentPane().add(buttonBrasil);
		frame.getContentPane().add(golArgentinaQuantidade);
		frame.getContentPane().add(golBrasilQuantidade);
		frame.getContentPane().add(buttonArgentina);
	
		buttonBrasil.addActionListener(new ActionListener() {
		

			@Override
			public void actionPerformed(ActionEvent e) {
				brazilGol+=1;
				golBrasilQuantidade.setText("Gol: "+Integer.toString(brazilGol));
				if (verify()) {
					
					buttonBrasil.setEnabled(false);
					buttonArgentina.setEnabled(false);
					frame = new JFrame();
					frame.setBounds(0, 100, 450, 300);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.add(ganhouB);
					frame.setVisible(true);
				}
			}
		});
		btnResetarPlacar.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				brazilGol=0;
				agentenaGol=0;
				golArgentinaQuantidade.setText("Gol: "+Integer.toString(agentenaGol));
				golBrasilQuantidade.setText("Gol: "+Integer.toString(brazilGol));
				
				buttonBrasil.setEnabled(true);
				buttonArgentina.setEnabled(true);
				
			}
		});
		buttonArgentina.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				agentenaGol+=1;
				golArgentinaQuantidade.setText("Gol: "+Integer.toString(agentenaGol));
				if (verify()) {
					
					buttonBrasil.setEnabled(false);
					buttonArgentina.setEnabled(false);
					frame = new JFrame();
					frame.add(ganhouA);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.setBounds(300, 100, 450, 300);
					frame.setVisible(true);
				}
			}
		});
		
	}
}
