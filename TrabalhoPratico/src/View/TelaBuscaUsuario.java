package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import classes.Dados;
import classes.Usuario;

public class TelaBuscaUsuario implements ActionListener {
	private static JFrame janela = new JFrame("Busca"); // nome da janela
	private static JLabel titulo = new JLabel("Buscar Usuario"); // Texto que aparece na janela

	private JLabel nome = new JLabel("Nome");
	private JTextField caixaNome = new JTextField();

	private static JButton buscar = new JButton("Buscar");

	public TelaBuscaUsuario() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20)); // definindo fonte do titulo
		// Legenda: X, Y, Largura, Altura
		titulo.setBounds(155, 10, 200, 30);

		nome.setBounds(100, 55, 180, 30);
		caixaNome.setBounds(200, 55, 180, 30);

		buscar.setBounds(300, 160, 130, 30);

		janela.setLayout(null);
		// chamando as informacao que estarao na janela
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

			if (caixaNome.getText().length() == 0) {
				JOptionPane.showMessageDialog(null, "Todos os campos devem ser prenchidos", "Erro",
						JOptionPane.ERROR_MESSAGE);
			} else {
				String mensagemErro = "";

				if (!Usuario.verificaNome(caixaNome.getText())) {
					mensagemErro += "NOME INVALIDO - valida somente com letras minusculas\n";
				} else {
					System.out.println(Dados.getUsuarios().get(0).getNome());
					janela.dispose();
					// dar um jeito de pegar o user certo
					TelaVisualizaUsuario.main(null);
				}
			}
		}
	}
}
