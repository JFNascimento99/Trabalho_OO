package View;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TelaMenu implements ActionListener {
	
	private static JFrame janela = new JFrame("Controle de Bicicletas"); //nome da janela
	private static JLabel titulo = new JLabel("Menu principal"); // T�tulo que aparece na janela
	//Nomes dos bot�es
	private static JButton cadastrar = new JButton("Cadastrar usu�rio");
	private static JButton editar = new JButton("Editar usu�rio");
	private static JButton vizualizar = new JButton("Vizualizar cadastrados");
	
	public TelaMenu() {
		titulo.setFont(new Font("Arial" , Font.BOLD, 20)); // definindo fonte do t�tulo
		// definindo as medidas dos bot�es
		titulo.setBounds(165, 10, 150, 30);
		cadastrar.setBounds(140, 50 ,180, 30);
		editar.setBounds(140, 100, 180, 30);
		vizualizar.setBounds(140, 150, 180, 30);
		
		janela.setLayout(null);
		//chamando as informa��o que estar�o na janela
		janela.add(titulo);
		janela.add(cadastrar);
		janela.add(editar);
		janela.add(vizualizar);
		
		janela.setSize(480, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		cadastrar.addActionListener(menu);
		editar.addActionListener(menu);
		vizualizar.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == cadastrar)
			//Ainda a criar a tela de cadastro
			new TelaCadastro().mostraDados(dados, 1);
		
		if(src == editar)
			// ainda a criar tela de edi��o
			new TelaEditar().mostraDados(dados, 1);
		
		if(src == vizualizar)
			JOptionPane.showMessageDialog(null, "Ainda precisam ser implementadas funcionalidades\n"
					+ "relacionadas ao curso e a matr�cula", null, JOptionPane.INFORMATION_MESSAGE);
	}
}
