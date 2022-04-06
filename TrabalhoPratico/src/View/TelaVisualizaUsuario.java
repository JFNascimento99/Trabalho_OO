package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Classes.Dados;
import Classes.Usuario;

//Fazer antes uma tela de seleção de usuário

public class TelaVisualizaUsuario implements ActionListener {

	private JFrame janela = new JFrame("Menu de Visualizacao");
	private JLabel titulo = new JLabel("Visualizar usuários");


	private static JButton ver = new JButton("ver");

	public TelaVisualizaUsuario() {
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
		TelaVisualizaUsuario menu = new TelaVisualizaUsuario();
		System.out.println("teste");
		ver.addActionListener(menu);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		// Quando o botão concluir for presionado, deve pegar os valores nos getText e
		// colocar nos respectivos lugares
		if (src == ver) {
			//Descobrir como que faz pra importar doGetUsusrios na posicao certa
			
			//("Nome : " + Dados.getUsuarios(nome);
			JOptionPane.showMessageDialog(null,"Nome: \n" + 
					Dados.getUsuarios(nome), null, JOptionPane.INFORMATION_MESSAGE);
			//("Telefone: " + Dados.getUsuario(telefone));
			JOptionPane.showMessageDialog(null,"Telefone: \n" +
					Dados.getUsuarios(telefone), null, JOptionPane.INFORMATION_MESSAGE);
			//("RG: " + Dados.getUsuario(identidade));
			JOptionPane.showMessageDialog(null,"RG: \n" +
					Dados.getUsuarios(identidade), null, JOptionPane.INFORMATION_MESSAGE);
			//("CPF: " + Dados.getUsuario(cpf));
			JOptionPane.showMessageDialog(null,"CPF: \n" +
					Dados.getUsuarios(cpf), null, JOptionPane.INFORMATION_MESSAGE);
			//("Idade" + Dados.getUsuario(idade));
			JOptionPane.showMessageDialog(null,"Idade: \n" +
					Dados.getUsuarios(idade), null, JOptionPane.INFORMATION_MESSAGE);
			//("Email" + Dados.getUsuario(email));
			JOptionPane.showMessageDialog(null,"Email: \n" +
					Dados.getUsuarios(email), null, JOptionPane.INFORMATION_MESSAGE);
			//("Senha" + Dados.getUsuario(senha));
			JOptionPane.showMessageDialog(null,"Senha: \n" +
					Dados.getUsuarios(senha), null, JOptionPane.INFORMATION_MESSAGE);

	}
			}

			// Fazer lógica para alterals os valores
		
	}


