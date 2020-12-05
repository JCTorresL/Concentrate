package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.Icon;

public class Diseno extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Create the frame.
	 */
	public Diseno() {
		setResizable(false);
		setTitle("Concentrate");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton((Icon) null);
		btnNewButton.setText("Jugar");
		//btnNewButton.setSelectedIcon(new ImageIcon("C:\\Users\\FAMILIAR\\git\\Concentrate\\Proyecto\\src\\Botones\\btn_jugar.JPG"));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {				
				dispose(); //cierra la ventana acutal
				
				Niveles lvl = new Niveles();
				lvl.setVisible(true);
			}
			
		});
		btnNewButton.setBounds(293, 132, 194, 55);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Configuracion");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent arg0) {				
				dispose(); //cierra la ventana acutal
				
				Configuracion conf = new Configuracion();
				conf.setVisible(true);
			}			
		});
		btnNewButton_1.setBounds(293, 223, 194, 58);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				dispose(); //cierra la ventana acutal
			}
		});
		btnNewButton_2.setBounds(293, 315, 194, 63);
		contentPane.add(btnNewButton_2);
	}
	
}
