package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import javax.swing.event.ListSelectionListener;

public class TelaBicicletas implements ActionListener{
	//Barra de rolagem
	
	private JFrame janela = new JFrame ("Seleção de Bicicletas");
	//Ver com o monitor como q faz isso muito sono pra resolver
	//Mas em teoria eh só tacar dentro do parameto do JScrollPane
	//Do jeito q tá não precisa, mas se quiser fazer pra dar um tchan tá ai
	private JScrollPane scroll = new JScrollPane();
	private JLabel titulo = new JLabel("Bicicletas");
	
	//Legenda da página
	private JLabel tipoBicicleta = new JLabel("Bicicleta");
	private JLabel locador = new JLabel("Locador");
	private JLabel horaCheckIn = new JLabel("Check In");
	private JLabel horaCheckOut = new JLabel("Check Out");
	
	//Bicicletas tradicionaois
	private JLabel bicicletaT1 = new JLabel("Tradicional 01");
	private JLabel bicicletaT2 = new JLabel("Tradicional 02");
	private JLabel bicicletaT3 = new JLabel("Tradicional 03");
	private JLabel bicicletaT4 = new JLabel("Tradicional 04");
	private JLabel bicicletaT5 = new JLabel("Tradicional 05");
	private JLabel bicicletaT6 = new JLabel("Tradicional 06");
	private JLabel bicicletaT7 = new JLabel("Tradicional 07");
	private JLabel bicicletaT8 = new JLabel("Tradicional 08");
	private JLabel bicicletaT9 = new JLabel("Tradicional 09");
	private JLabel bicicletaT10 = new JLabel("Tradicional 10");
	
	//Bicicletas Elétricas
	private JLabel bicicletaE1 = new JLabel("Elétrica 01");
	private JLabel bicicletaE2 = new JLabel("Elétrica 02");
	private JLabel bicicletaE3 = new JLabel("Elétrica 03");
	private JLabel bicicletaE4 = new JLabel("Elétrica 04");
	private JLabel bicicletaE5 = new JLabel("Elétrica 05");
	private JLabel bicicletaE6 = new JLabel("Elétrica 06");
	private JLabel bicicletaE7 = new JLabel("Elétrica 07");
	private JLabel bicicletaE8 = new JLabel("Elétrica 08");
	private JLabel bicicletaE9 = new JLabel("Elétrica 09");
	private JLabel bicicletaE10 = new JLabel("Elétrica 10");
	
	//Hora de CheckIn
	private JTextField horaIn1 = new JTextField();
	//private JTextField minIn1 = new JTextField();
	
	private JTextField horaIn2 = new JTextField();
	//private JTextField minIn2 = new JTextField();
	
	private JTextField horaIn3 = new JTextField();
	//private JTextField minIn3 = new JTextField();
	
	private JTextField horaIn4 = new JTextField();
	//private JTextField minIn4 = new JTextField();
	
	private JTextField horaIn5 = new JTextField();
	//private JTextField minIn5 = new JTextField();
	
	private JTextField horaIn6 = new JTextField();
	//private JTextField minIn6 = new JTextField();
	
	private JTextField horaIn7 = new JTextField();
	//private JTextField minIn7 = new JTextField();
	
	private JTextField horaIn8 = new JTextField();
	//private JTextField minIn8 = new JTextField();
	
	private JTextField horaIn9 = new JTextField();
	//private JTextField minIn9 = new JTextField();
	
	private JTextField horaIn10 = new JTextField();
	//private JTextField minIn10 = new JTextField();
	
	//Hora de CheckOut
	private JTextField horaOut1 = new JTextField();
	//private JTextField minOut1 = new JTextField();
	
	private JTextField horaOut2 = new JTextField();
	//private JTextField minOut2 = new JTextField();
	
	private JTextField horaOut3 = new JTextField();
	//private JTextField minOut3 = new JTextField();
	
	private JTextField horaOut4 = new JTextField();
	//private JTextField minOut4 = new JTextField();
	
	private JTextField horaOut5 = new JTextField();
	//private JTextField minOut5 = new JTextField();
	
	private JTextField horaOut6 = new JTextField();
	//private JTextField minOut6 = new JTextField();
	
	private JTextField horaOut7 = new JTextField();
	//private JTextField minOut7 = new JTextField();
	
	private JTextField horaOut8 = new JTextField();
	//private JTextField minOut8 = new JTextField();
	
	private JTextField horaOut9 = new JTextField();
	//private JTextField minOut9 = new JTextField();
	
	private JTextField horaOut10 = new JTextField();
	//private JTextField minOut10 = new JTextField();
	
	//Lista de Dropdown
	String[] users = {"Livre", "João", "Felipe", "Lucas"};//Lista para testar
	private JComboBox usuario1 = new JComboBox(users);
	private JComboBox usuario2 = new JComboBox(users);
	private JComboBox usuario3 = new JComboBox(users);
	private JComboBox usuario4 = new JComboBox(users);
	private JComboBox usuario5 = new JComboBox(users);
	private JComboBox usuario6 = new JComboBox(users);
	private JComboBox usuario7 = new JComboBox(users);
	private JComboBox usuario8 = new JComboBox(users);
	private JComboBox usuario9 = new JComboBox(users);
	private JComboBox usuario10 = new JComboBox(users);
	private JComboBox usuario11 = new JComboBox(users);
	private JComboBox usuario12 = new JComboBox(users);
	private JComboBox usuario13 = new JComboBox(users);
	private JComboBox usuario14 = new JComboBox(users);
	private JComboBox usuario15 = new JComboBox(users);
	private JComboBox usuario16 = new JComboBox(users);
	private JComboBox usuario17 = new JComboBox(users);
	private JComboBox usuario18 = new JComboBox(users);
	private JComboBox usuario19 = new JComboBox(users);
	private JComboBox usuario20 = new JComboBox(users);
	
	//Botões da tela
	private static JButton cobrar = new JButton("Cobrar");
	private static JButton confirma = new JButton("Confirmar");
	
	public TelaBicicletas() {
		// definindo fontes
		titulo.setFont(new Font("Arial" , Font.BOLD, 20)); 
		// Legenda: X, Y, Largura, Altura
		// Legenda da página
		titulo.setBounds(180, 10, 200, 30);
		tipoBicicleta.setBounds(40, 50 ,180, 30);
		locador.setBounds(170, 50 ,180, 30);
		horaCheckIn.setBounds(280, 50 ,180, 30);
		horaCheckOut.setBounds(355, 50 ,180, 30);
		
		//Linha Bike trad 1
		bicicletaT1.setBounds(25, 80 ,180, 30);
		usuario1.setBounds(145, 80 ,100, 30);
		horaIn1.setBounds(285, 80 ,40, 30);
		horaOut1.setBounds(365, 80 ,40, 30);
		
		//Linha Bike trad 2
		bicicletaT2.setBounds(25, 130 ,180, 30);
		usuario2.setBounds(145, 130 ,100, 30);
		horaIn2.setBounds(285, 130 ,40, 30);
		horaOut2.setBounds(365, 130 ,40, 30);
		
		//Linha Bike trad 3
		bicicletaT3.setBounds(25, 180 ,180, 30);
		usuario3.setBounds(145, 180 ,100, 30);
		horaIn3.setBounds(285, 180 ,40, 30);
		horaOut3.setBounds(365, 180 ,40, 30);
		
		//Linha Bike trad 4
		bicicletaT4.setBounds(25, 230 ,180, 30);
		usuario4.setBounds(145, 230 ,100, 30);
		horaIn4.setBounds(285, 230 ,40, 30);
		horaOut4.setBounds(365, 230 ,40, 30);
		
		//Linha Bike trad 5
		bicicletaT5.setBounds(25, 280 ,180, 30);
		usuario5.setBounds(145, 280 ,100, 30);
		horaIn5.setBounds(285, 280 ,40, 30);
		horaOut5.setBounds(365, 280 ,40, 30);
		
		//Linha Bike trad 6
		bicicletaT6.setBounds(25, 330 ,180, 30);
		usuario6.setBounds(145, 330 ,100, 30);
		horaIn6.setBounds(285, 330 ,40, 30);
		horaOut6.setBounds(365, 330 ,40, 30);
		
		//Linha Bike trad 7
		bicicletaT7.setBounds(25, 380 ,180, 30);
		usuario7.setBounds(145,380 ,100, 30);
		horaIn7.setBounds(285, 380 ,40, 30);
		horaOut7.setBounds(365, 380 ,40, 30);
		
		//Linha Bike trad 8
		bicicletaT8.setBounds(25, 430 ,180, 30);
		usuario8.setBounds(145, 430 ,100, 30);
		horaIn8.setBounds(285, 430 ,40, 30);
		horaOut8.setBounds(365, 430 ,40, 30);
		
		//Linha Bike trad 9
		bicicletaT9.setBounds(25, 480 ,180, 30);
		usuario9.setBounds(145,480 ,100, 30);
		horaIn9.setBounds(285, 480 ,40, 30);
		horaOut9.setBounds(365, 480 ,40, 30);
		
		//Linha Bike trad 10
		bicicletaT10.setBounds(25, 530 ,180, 30);
		usuario10.setBounds(145, 530 ,100, 30);
		horaIn10.setBounds(285, 530 ,40, 30);
		horaOut10.setBounds(365, 530 ,40, 30);
		
		janela.setLayout(null);
		//Chamando a legenda
		janela.add(titulo);
		janela.add(tipoBicicleta);
		janela.add(locador);
		janela.add(horaCheckIn);
		janela.add(horaCheckOut);
		
		//Chamando as informação que estarão na janela
		janela.add(bicicletaT1);
		janela.add(usuario1);
		janela.add(horaIn1);
		janela.add(horaOut1);
		
		janela.add(bicicletaT2);
		janela.add(usuario2);
		janela.add(horaIn2);
		janela.add(horaOut2);
		
		janela.add(bicicletaT3);
		janela.add(usuario3);
		janela.add(horaIn3);
		janela.add(horaOut3);
		
		janela.add(bicicletaT4);
		janela.add(usuario4);
		janela.add(horaIn4);
		janela.add(horaOut4);
		
		janela.add(bicicletaT5);
		janela.add(usuario5);
		janela.add(horaIn5);
		janela.add(horaOut5);
		
		janela.add(bicicletaT6);
		janela.add(usuario6);
		janela.add(horaIn6);
		janela.add(horaOut6);
		
		janela.add(bicicletaT7);
		janela.add(usuario7);
		janela.add(horaIn7);
		janela.add(horaOut7);
		
		janela.add(bicicletaT8);
		janela.add(usuario8);
		janela.add(horaIn8);
		janela.add(horaOut8);
		
		janela.add(bicicletaT9);
		janela.add(usuario9);
		janela.add(horaIn9);
		janela.add(horaOut9);
		
		janela.add(bicicletaT10);
		janela.add(usuario10);
		janela.add(horaIn10);
		janela.add(horaOut10);
		
		
		//Setando dimenções e funções padrão da janela
		janela.setSize(1200, 625);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		//janela.add(scroll);
	}
	
	public static void main(String[] args) {
		TelaBicicletas menu = new TelaBicicletas();
		cobrar.addActionListener(menu);
		confirma.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == usuario1) {
			//Com isso consegue a informação de qual está na lista
			usuario1.getSelectedItem();
		}
		
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
