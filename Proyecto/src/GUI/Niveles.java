package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Concentrate.Juego;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Niveles extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Niveles() {
		setTitle("Concentrate");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("1");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new nivel()); //crea la ventana del juego 
		btnNewButton.setBounds(212, 123, 89, 46);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("4");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.addActionListener(new nivel()); //crea la ventana del juego 
		btnNewButton_1.setBounds(212, 195, 89, 46);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("7");
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.addActionListener(new nivel()); //crea la ventana del juego 
		btnNewButton_2.setBounds(212, 266, 89, 46);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_1_1 = new JButton("9");
		btnNewButton_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_1.addActionListener(new nivel()); //crea la ventana del juego 
		btnNewButton_1_1.setBounds(434, 266, 89, 46);
		contentPane.add(btnNewButton_1_1);
		
		btnNewButton_3 = new JButton("2");
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.addActionListener(new nivel()); //crea la ventana del juego 
		btnNewButton_3.setBounds(324, 123, 89, 46);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_1_2 = new JButton("5");
		btnNewButton_1_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2.addActionListener(new nivel()); //crea la ventana del juego 
		btnNewButton_1_2.setBounds(324, 195, 89, 46);
		contentPane.add(btnNewButton_1_2);
		
		btnNewButton_4 = new JButton("8");
		btnNewButton_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton_4.addActionListener(new nivel()); //crea la ventana del juego 
		btnNewButton_4.setBounds(324, 266, 89, 46);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_1_3 = new JButton("10");
		btnNewButton_1_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_3.addActionListener(new nivel()); //crea la ventana del juego 
		btnNewButton_1_3.setBounds(324, 330, 89, 46);
		contentPane.add(btnNewButton_1_3);
		
		btnNewButton_5 = new JButton("3");
		btnNewButton_5.setBackground(Color.LIGHT_GRAY);
		btnNewButton_5.addActionListener(new nivel()); //crea la ventana del juego 
		btnNewButton_5.setBounds(434, 123, 89, 46);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_1_4 = new JButton("6");
		btnNewButton_1_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_4.addActionListener(new nivel()); //crea la ventana del juego 
		btnNewButton_1_4.setBounds(434, 195, 89, 46);
		contentPane.add(btnNewButton_1_4);
		
		btnNewButton_1_3_1 = new JButton("Volver");
		btnNewButton_1_3_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose(); //cierra la ventana actual
				
				Diseno vp = new Diseno();
				vp.setVisible(true);
			}
		});
		btnNewButton_1_3_1.setBounds(434, 330, 89, 46);
		contentPane.add(btnNewButton_1_3_1);
	}

	private class nivel implements ActionListener{ //clase donde se instancia la ventana del juego 
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			dispose();
			System.out.println(arg0.getSource()); //trae el identificador del boton que se selecciono
			
			JuegoI j = new JuegoI();
			j.setVisible(true);			
		}
		
	}
	
	private JButton btnNewButton, btnNewButton_1,btnNewButton_2,btnNewButton_1_1,btnNewButton_3,btnNewButton_1_2,
	btnNewButton_4,btnNewButton_1_3,btnNewButton_5,btnNewButton_1_4,btnNewButton_1_3_1;
	
}
