package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import classes.Dados;

//Fazer antes uma tela de selecao de usuario

public class TelaVisualizaPagamento implements ActionListener {

	private JFrame janela = new JFrame("Menu de Visualizacao");
	private JLabel titulo = new JLabel("Visualizar cartoes cadastrados");

	private static JButton ver = new JButton("ver");

	public TelaVisualizaPagamento() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20)); // definindo fonte do titulo
		// definindo as medidas dos botões
		// Legenda: X, Y, Largura, Altura
		titulo.setBounds(145, 10, 200, 30);
		ver.setBounds(360, 400, 100, 30);

		janela.setLayout(null);
		// chamando as informacoo que estarao na janela
		janela.add(titulo);
		janela.add(ver);

		// Setando dimensões e funcoes padrao da janela
		janela.setSize(480, 480);
		janela.setVisible(true);

		// Retorna o texto

		janela.setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		TelaVisualizaPagamento menu = new TelaVisualizaPagamento();
		System.out.println("teste");
		ver.addActionListener(menu);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		// Quando o botao concluir for presionado, deve pegar os valores nos getText e
		// colocar nos respectivos lugares
		if (src == ver) {
			// ("Cartoes : \n" + Dados.getFormaDePagamento());
			JOptionPane.showMessageDialog(null, "Cartoes: \n" +
					Dados.getFormaDePagamento(), null, JOptionPane.INFORMATION_MESSAGE);
		}
	}
}