package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionListener;

public class TelaBicicletas implements ActionListener, ListSelectionListener{
	private JFrame janela;
	private JLabel titulo;
	
	//Bicicletas tradicionaois
	private JLabel bicicletaT1 = new JLabel("Bicicleta Tradicional 01");
	private JLabel bicicletaT2 = new JLabel("Bicicleta Tradicional 02");
	private JLabel bicicletaT3 = new JLabel("Bicicleta Tradicional 03");
	private JLabel bicicletaT4 = new JLabel("Bicicleta Tradicional 04");
	private JLabel bicicletaT5 = new JLabel("Bicicleta Tradicional 05");
	private JLabel bicicletaT6 = new JLabel("Bicicleta Tradicional 06");
	private JLabel bicicletaT7 = new JLabel("Bicicleta Tradicional 07");
	private JLabel bicicletaT8 = new JLabel("Bicicleta Tradicional 08");
	private JLabel bicicletaT9 = new JLabel("Bicicleta Tradicional 09");
	private JLabel bicicletaT10 = new JLabel("Bicicleta Tradicional 10");
	
	//Bicicletas El�tricas
	private JLabel bicicletaE1 = new JLabel("Bicicleta El�trica 01");
	private JLabel bicicletaE2 = new JLabel("Bicicleta El�trica 02");
	private JLabel bicicletaE3 = new JLabel("Bicicleta El�trica 03");
	private JLabel bicicletaE4 = new JLabel("Bicicleta El�trica 04");
	private JLabel bicicletaE5 = new JLabel("Bicicleta El�trica 05");
	private JLabel bicicletaE6 = new JLabel("Bicicleta El�trica 06");
	private JLabel bicicletaE7 = new JLabel("Bicicleta El�trica 07");
	private JLabel bicicletaE8 = new JLabel("Bicicleta El�trica 08");
	private JLabel bicicletaE9 = new JLabel("Bicicleta El�trica 09");
	private JLabel bicicletaE10 = new JLabel("Bicicleta El�trica 10");
	
	//Lista de Dropdown
	//Lista de teste
	String[] users = {"Jo�o", "Felipe", "Lucas"};
	private JComboBox usuarios = new JComboBox(users);
}
