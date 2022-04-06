package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Classes.Dados;
import Classes.Usuario;

public class TelaMenu implements ActionListener {

	private static JFrame janela = new JFrame("Controle de Bicicletas"); // nome da janela
	private static JLabel titulo = new JLabel("Menu principal"); // Texto que aparece na janela
	// Nomes dos botoes
	private static JButton cadastrar = new JButton("Cadastrar usuário");
	private static JButton editar = new JButton("Editar usuário");
	private static JButton visualizar = new JButton("Vizualizar usuario");
	private static JButton deletar = new JButton("deletar usuario");

	public TelaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20)); // definindo fonte do t�tulo
		// definindo as medidas dos bot�es
		// Legenda: X, Y, Largura, Altura
		titulo.setBounds(165, 10, 150, 30);
		cadastrar.setBounds(140, 50, 180, 30);
		editar.setBounds(140, 100, 180, 30);
		visualizar.setBounds(140, 150, 180, 30);
		deletar.setBounds(140, 150, 180, 30);

		janela.setLayout(null);
		// chamando as informa��o que estar�o na janela
		janela.add(titulo);
		janela.add(cadastrar);
		janela.add(editar);
		janela.add(visualizar);
		janela.add(deletar);

		// Setando dimensoes e funcoes padrao da janela
		janela.setSize(480, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);

		// Setando a tela para aparecer no centro
		janela.setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();

		// Implementação do Action Listener
		cadastrar.addActionListener(menu);
		editar.addActionListener(menu);
		visualizar.addActionListener(menu);
		deletar.addActionListener(menu);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == cadastrar)
			TelaCadastroUsuario.main(null);
		/*
		 * JOptionPane.showMessageDialog(null,
		 * "Ainda precisam ser implementadas funcionalidades\n"
		 * + "relacionadas ao curso e a matr�cula", null,
		 * JOptionPane.INFORMATION_MESSAGE);
		 */

		if (src == editar)
			TelaEditaUsuario.main(null);
		/*
		 * JOptionPane.showMessageDialog(null,
		 * "Ainda precisam ser implementadas funcionalidades\n"
		 * + "relacionadas ao curso e a matr�cula", null,
		 * JOptionPane.INFORMATION_MESSAGE);
		 */

		if (src == visualizar)
			TelaBicicletas.main(null);
			//TelaVisusalizarUsuario.main(null);
		//if(src == deletar)
			//TelaDeletaUsuario.main(null);
	}
}