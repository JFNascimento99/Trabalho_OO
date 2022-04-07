package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Classes.Dados;
import Classes.Usuario;

public class TelaMenuUsuario implements ActionListener {

	private static JFrame janela = new JFrame("Controle de Bicicletas"); // nome da janela
	private static JLabel titulo = new JLabel("Menu do Usuario"); // Texto que aparece na janela
	// Nomes dos botoes
	private static JButton cadastrar = new JButton("Cadastrar usuario");
	private static JButton editar = new JButton("Editar usuario");
	private static JButton visualizar = new JButton("Vizualizar usuario");
	private static JButton deletar = new JButton("Deletar usuario");

	public TelaMenuUsuario() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20)); // definindo fonte do titulo
		// definindo as medidas dos botoes
		// Legenda: X, Y, Largura, Altura
		titulo.setBounds(155, 10, 165, 30);
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
		TelaMenuUsuario menu = new TelaMenuUsuario();

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

		if (src == editar)
			TelaEditaUsuario.main(null);

		if (src == visualizar)
			TelaBicicletas.main(null);
	}
}