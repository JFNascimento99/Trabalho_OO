package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Classes.Dados;
import Classes.FormaDePagamento;

//Fazer antes uma tela de seleção de usuário

public class TelaDeletaPagamento implements ActionListener {

	private JFrame janela = new JFrame("Menu de delecao");
	private JLabel titulo = new JLabel("Deletar Forma de Pagamento");
	// Declarando Labels e caixas de texto

	private static JButton deletar = new JButton("deletar");

	public TelaDeletaPagamento() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20)); // definindo fonte do t�tulo
		// definindo as medidas dos botões
		// Legenda: X, Y, Largura, Altura
		titulo.setBounds(145, 10, 200, 30);

		deletar.setBounds(360, 400, 100, 30);

		janela.setLayout(null);
		// chamando as informação que estarão na janela
		janela.add(titulo);
		janela.add(deletar);

		// Setando dimensões e funções padrão da janela
		janela.setSize(480, 480);
		janela.setVisible(true);

		// Retorna o texto

		janela.setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		TelaDeletaPagamento menu = new TelaDeletaPagamento();
		System.out.println("teste");
		deletar.addActionListener(menu);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		// Quando o botão concluir for presionado, deve pegar os valores nos getText e
		// colocar nos respectivos lugares
		if (src == deletar) {
			Dados.getFormaDePagamento().remove(this); 
			System.out.println("Forma de Pagamento deletado.");
		}
				} 
		
	}
