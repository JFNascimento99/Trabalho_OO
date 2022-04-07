package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import javax.swing.event.ListSelectionListener;

public class TelaBicicletas implements ActionListener {
	// Barra de rolagem

	private JFrame janela = new JFrame("Sele�ao de Bicicletas");
	private JLabel titulo = new JLabel("Bicicletas");

	

	public TelaBicicletas() {
		
		janela.setSize(1200, 625);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);

	}

	public static void main(String[] args) {
		TelaBicicletas menu = new TelaBicicletas();

	}

	public void actionPerformed(ActionEvent e) {

	}
}
