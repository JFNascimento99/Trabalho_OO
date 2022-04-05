package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import javax.swing.event.ListSelectionListener;

public class TelaBicicletas implements ActionListener{
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
	
	private JTextField horaIn2 = new JTextField();
	private JTextField minIn2 = new JTextField();
	
	private JTextField horaIn3 = new JTextField();
	private JTextField minIn3 = new JTextField();
	
	private JTextField horaIn4 = new JTextField();
	private JTextField minIn4 = new JTextField();
	
	private JTextField horaIn5 = new JTextField();
	private JTextField minIn5 = new JTextField();
	
	private JTextField horaIn6 = new JTextField();
	private JTextField minIn6 = new JTextField();
	
	private JTextField horaIn7 = new JTextField();
	private JTextField minIn7 = new JTextField();
	
	private JTextField horaIn8 = new JTextField();
	private JTextField minIn8 = new JTextField();
	
	private JTextField horaIn9 = new JTextField();
	private JTextField minIn9 = new JTextField();
	
	private JTextField horaIn10 = new JTextField();
	private JTextField minIn10 = new JTextField();
	
	//Hora de CheckOut
	private JTextField horaOut1 = new JTextField();
	private JTextField minOut1 = new JTextField();
	
	private JTextField horaOut2 = new JTextField();
	private JTextField minOut2 = new JTextField();
	
	private JTextField horaOut3 = new JTextField();
	private JTextField minOut3 = new JTextField();
	
	private JTextField horaOut4 = new JTextField();
	private JTextField minOut4 = new JTextField();
	
	private JTextField horaOut5 = new JTextField();
	private JTextField minOut5 = new JTextField();
	
	private JTextField horaOut6 = new JTextField();
	private JTextField minOut6 = new JTextField();
	
	private JTextField horaOut7 = new JTextField();
	private JTextField minOut7 = new JTextField();
	
	private JTextField horaOut8 = new JTextField();
	private JTextField minOut8 = new JTextField();
	
	private JTextField horaOut9 = new JTextField();
	private JTextField minOut9 = new JTextField();
	
	private JTextField horaOut10 = new JTextField();
	private JTextField minOut10 = new JTextField();
	
	//Lista de Dropdown
	String[] users = {"João", "Felipe", "Lucas"};//Lista para testar
	private JComboBox usuarios = new JComboBox(users);
	
	//Botões da tela
	private static JButton cobrar = new JButton("Cobrar");
	private static JButton confirma = new JButton("Confirmar");
	
	public TelaBicicletas() {
		titulo.setFont(new Font("Arial" , Font.BOLD, 20)); // definindo fonte do título
		// Legenda: X, Y, Largura, Altura
		// Legenda da página
		titulo.setBounds(180, 10, 200, 30);
		tipoBicicleta.setBounds(50, 50 ,180, 30);
		locador.setBounds(155, 50 ,180, 30);
		horaCheckIn.setBounds(280, 50 ,180, 30);
		horaCheckOut.setBounds(355, 50 ,180, 30);
		
		janela.setLayout(null);
		//Chamando a legenda
		janela.add(titulo);
		janela.add(tipoBicicleta);
		janela.add(locador);
		janela.add(horaCheckIn);
		janela.add(horaCheckOut);
		
		//Chamando as informação que estarão na janela
		
		//Setando dimenções e funções padrão da janela
		janela.setSize(480, 480);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaBicicletas menu = new TelaBicicletas();
		cobrar.addActionListener(menu);
		confirma.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == cobrar) {
			//fazer retitar o cadastro dos que possuem hora de check out e lançar o valor na tela
			JOptionPane.showMessageDialog(null, "O valor a ser cobrado é de \n"
					+ "R$ ", null, JOptionPane.INFORMATION_MESSAGE);
		}
		
		if (src == confirma) {
			//Aplicar logica salvar o locador
			new TelaMenu();
		}
	}
	
}
