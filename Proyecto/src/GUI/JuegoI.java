package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class JuegoI extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public JuegoI() {
		setTitle("Concentrate");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnReanudar = new JButton("Reanudar");
		btnReanudar.setBackground(Color.LIGHT_GRAY);
		btnReanudar.setBounds(620, 88, 104, 44);
		contentPane.add(btnReanudar);
		
		JButton btnNewButton_1_1 = new JButton("Pausar");
		btnNewButton_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_1.setBounds(620, 33, 104, 44);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Reiniciar");
		btnNewButton_1_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_1_1.setBounds(620, 143, 104, 44);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Volver");
		btnNewButton_1_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose(); //cierra la ventana actual
				
				Niveles lvl = new Niveles();
				lvl.setVisible(true);
			}
		});
		btnNewButton_1_2.setBounds(620, 198, 104, 44);
		contentPane.add(btnNewButton_1_2);
	}
}
