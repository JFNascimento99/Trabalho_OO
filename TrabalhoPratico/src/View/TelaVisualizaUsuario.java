package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import classes.Dados;
import util.Preencher;

//Fazer antes uma tela de selecao de usuario

public class TelaVisualizaUsuario implements ActionListener {

	private JFrame janela = new JFrame("Menu de Visualizacao");
	private JList list;
	private JLabel titulo = new JLabel("Visualizar usuarios");

	private static JButton ver = new JButton("ver");

	public TelaVisualizaUsuario() {
		Main.main(null);

		titulo.setFont(new Font("Arial", Font.BOLD, 20)); // definindo fonte do t�tulo
		// definindo as medidas dos botões
		// Legenda: X, Y, Largura, Altura
		titulo.setBounds(145, 10, 200, 30);
		ver.setBounds(360, 400, 100, 30);

		list = new JList(Dados.getUsuariosList());
		list.setBounds(25, 40, 400, 300);
		janela.add(list);
		janela.setLayout(null);
		// chamando as informação que estarão na janela
		janela.add(titulo);
		janela.add(ver);

		// Setando dimensões e funções padrão da janela
		janela.setSize(480, 480);
		janela.setVisible(true);

		// Retorna o texto

		janela.setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		TelaVisualizaUsuario menu = new TelaVisualizaUsuario();
		ver.addActionListener(menu);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		// Quando o botão concluir for presionado, deve pegar os valores nos getText e
		// colocar nos respectivos lugares
		if (src == ver) {

		}
	}
}