package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Classes.Dados;
import Classes.Usuario;

//Fazer antes uma tela de seleção de usuário

public class TelaDeletaUsuario implements ActionListener {

	private JFrame janela = new JFrame("Menu de delecao");
	private JLabel titulo = new JLabel("Deletar usuário");
	// Declarando Labels e caixas de texto

	private static JButton deletar = new JButton("deletar");

	public TelaDeletaUsuario() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20)); // definindo fonte do t�tulo
		// definindo as medidas dos botões
		// Legenda: X, Y, Largura, Altura
		titulo.setBounds(145, 10, 200, 30);

		confirmar.setBounds(360, 400, 100, 30);

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
		TelaDeletaUsuario menu = new TelaDeletaUsuario();
		System.out.println("teste");
		confirmar.addActionListener(menu);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		// Quando o botão concluir for presionado, deve pegar os valores nos getText e
		// colocar nos respectivos lugares
		if (src == deletar) {
			Dados.getUsuarios().remove(this); 
			System.out.println("Usuario deletado.");
		}
				} 
		
	}
