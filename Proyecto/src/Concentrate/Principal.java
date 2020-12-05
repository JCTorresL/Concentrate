package Concentrate;

import java.awt.EventQueue;

import javax.swing.JFrame;

import GUI.Diseno;

public class Principal {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diseno frame = new Diseno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
