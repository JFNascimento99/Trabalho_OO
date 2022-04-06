package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Classes.Dados;
import Classes.Pedido;

//Fazer antes uma tela de seleção de usuário

public class TelaVisualizaPedido implements ActionListener {

	private JFrame janela = new JFrame("Menu de Visualizacao");
	private JLabel titulo = new JLabel("Visualizar Pedidos");


	private static JButton ver = new JButton("ver");

	public TelaVisualizaPedido() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20)); // definindo fonte do t�tulo
		// definindo as medidas dos botões
		// Legenda: X, Y, Largura, Altura
		titulo.setBounds(145, 10, 200, 30);
		ver.setBounds(360, 400, 100, 30);

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
		TelaVisualizaPedido menu = new TelaVisualizaPedido();
		System.out.println("teste");
		ver.addActionListener(menu);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		// Quando o botão concluir for presionado, deve pegar os valores nos getText e
		// colocar nos respectivos lugares
		if (src == ver) {
			("Pedidos : \n" + Dados.getPedidos());
			

	}
			}

			// Fazer lógica para alterals os valores
		
	}


