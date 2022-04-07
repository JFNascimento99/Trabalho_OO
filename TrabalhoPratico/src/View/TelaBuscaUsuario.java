package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Classes.Dados;
import Classes.Usuario;

public class TelaBuscaUsuario implements ActionListener {
	private static JFrame janela = new JFrame("Busca"); // nome da janela
	private static JLabel titulo = new JLabel("Buscar Usuario"); // Texto que aparece na janela
	
	private JLabel nome = new JLabel("Nome");
	private JTextField caixaNome = new JTextField();
	
	private static JButton buscar = new JButton("Buscar");
	
	public TelaBuscaUsuario() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20)); // definindo fonte do titulo
		// definindo as medidas dos botões
		// Legenda: X, Y, Largura, Altura
		titulo.setBounds(145, 10, 200, 30);
		
		nome.setBounds(100, 55, 180, 30);
		caixaNome.setBounds(200, 55, 180, 30);
		
		buscar.setBounds(300, 160, 130, 30);
		
		janela.setLayout(null);
		// chamando as informação que estarão na janela
		janela.add(titulo);
		janela.add(nome);
		janela.add(caixaNome);
		janela.add(buscar);
		
		// Setando dimensoes e funcoes padrao da janela
		janela.setSize(480, 250);
		janela.setVisible(true);
		
		caixaNome.getText();
		janela.setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		TelaBuscaUsuario menu = new TelaBuscaUsuario();
		System.out.println("teste");
		buscar.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == buscar) {
			
		}
	}
}
