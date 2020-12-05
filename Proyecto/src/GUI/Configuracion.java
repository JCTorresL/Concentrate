package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;

public class Configuracion extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Configuracion() {
		setTitle("Concentrate");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Sonido");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(276, 118, 155, 68);
		contentPane.add(btnNewButton);
		
		JButton btnDificultad = new JButton("Dificultad");
		btnDificultad.setBackground(Color.LIGHT_GRAY);
		btnDificultad.setBounds(276, 229, 155, 58);
		contentPane.add(btnDificultad);
		
		JButton btnTema = new JButton("Tema");
		btnTema.setBackground(Color.LIGHT_GRAY);
		btnTema.setBounds(276, 327, 155, 58);
		contentPane.add(btnTema);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose(); //cierra la ventana actual
				
				Diseno vp = new Diseno();
				vp.setVisible(true);
			}
		});		
		btnVolver.setBounds(276, 418, 155, 58);
		contentPane.add(btnVolver);
	}

}
