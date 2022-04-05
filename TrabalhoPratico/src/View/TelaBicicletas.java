package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionListener;

public class TelaBicicletas implements ActionListener, ListSelectionListener{
	private JFrame janela = new JFrame ("Seleção de Bicicletas");
	private JLabel titulo = new JLabel("Bicicletas");
	
	//Legenda da página
	private JLabel tipoBicicleta = new JLabel("Tipo");
	private JLabel locador = new JLabel("Locador");
	private JLabel horaCheckIn = new JLabel("Check In");
	private JLabel horaCheckOut = new JLabel("Check Out");
	
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
	
	//Bicicletas Elétricas
	private JLabel bicicletaE1 = new JLabel("Bicicleta Elétrica 01");
	private JLabel bicicletaE2 = new JLabel("Bicicleta Elétrica 02");
	private JLabel bicicletaE3 = new JLabel("Bicicleta Elétrica 03");
	private JLabel bicicletaE4 = new JLabel("Bicicleta Elétrica 04");
	private JLabel bicicletaE5 = new JLabel("Bicicleta Elétrica 05");
	private JLabel bicicletaE6 = new JLabel("Bicicleta Elétrica 06");
	private JLabel bicicletaE7 = new JLabel("Bicicleta Elétrica 07");
	private JLabel bicicletaE8 = new JLabel("Bicicleta Elétrica 08");
	private JLabel bicicletaE9 = new JLabel("Bicicleta Elétrica 09");
	private JLabel bicicletaE10 = new JLabel("Bicicleta Elétrica 10");
	
	// Dois pontos da separação de horas
	private JLabel separa = new JLabel(":");
	
	//Hora de CheckIn
	private JTextField horaIn1 = new JTextField();
	private JTextField minIn1 = new JTextField();
	
	//Hora de CheckOut
	private JTextField horaOut1 = new JTextField();
	private JTextField minOut1 = new JTextField();
	
	//Lista de Dropdown
	String[] users = {"João", "Felipe", "Lucas"};//Lista para testar
	private JComboBox usuarios = new JComboBox(users);
	
	//Botões da tela
	private JButton deleta = new JButton("Deletar");
	private JButton confirma = new JButton("Confirmar");
	
	public TelaBicicletas() {
		titulo.setFont(new Font("Arial" , Font.BOLD, 20)); // definindo fonte do título
		// Legenda: X, Y, Largura, Altura
		titulo.setBounds(145, 10, 200, 30);
		
		janela.setLayout(null);
		//chamando as informação que estarão na janela
		
		//Setando dimenções e funções padrão da janela
		janela.setSize(480, 480);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
}
