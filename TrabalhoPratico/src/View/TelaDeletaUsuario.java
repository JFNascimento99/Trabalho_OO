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
	private JLabel nome = new JLabel("Nome");
	private JTextField caixaNome = new JTextField();

	private JLabel cpf = new JLabel("CPF");
	private JTextField caixaCpf = new JTextField(15);

	private JLabel rg = new JLabel("RG");
	private JTextField caixaRg = new JTextField(15);

	private JLabel telefone = new JLabel("Tel.");
	private JTextField caixaTelefone = new JTextField(15);

	private JLabel idade = new JLabel("Idade");
	private JTextField caixaIdade = new JTextField(15);

	private JLabel email = new JLabel("Email");
	private JTextField caixaEmail = new JTextField(15);

	private JLabel senha = new JLabel("Senha");
	private JTextField caixaSenha = new JTextField(15);

	private static JButton deletar = new JButton("deletar");
	private static JButton confirmar = new JButton("Confirmar");

	public TelaDeletaUsuario() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20)); // definindo fonte do t�tulo
		// definindo as medidas dos botões
		// Legenda: X, Y, Largura, Altura
		titulo.setBounds(145, 10, 200, 30);

		nome.setBounds(100, 50, 180, 30);
		caixaNome.setBounds(200, 50, 180, 30);

		cpf.setBounds(100, 100, 180, 30);
		caixaCpf.setBounds(200, 100, 180, 30);

		rg.setBounds(100, 150, 180, 30);
		caixaRg.setBounds(200, 150, 180, 30);

		telefone.setBounds(100, 200, 180, 30);
		caixaTelefone.setBounds(200, 200, 180, 30);

		idade.setBounds(100, 250, 180, 30);
		caixaIdade.setBounds(200, 250, 180, 30);

		email.setBounds(100, 300, 180, 30);
		caixaEmail.setBounds(200, 300, 180, 30);

		senha.setBounds(100, 350, 180, 30);
		caixaSenha.setBounds(200, 350, 180, 30);

		confirmar.setBounds(360, 400, 100, 30);

		janela.setLayout(null);
		// chamando as informação que estarão na janela
		janela.add(titulo);
		janela.add(nome);
		janela.add(caixaNome);
		janela.add(cpf);
		janela.add(caixaCpf);
		janela.add(rg);
		janela.add(caixaRg);
		janela.add(telefone);
		janela.add(caixaTelefone);
		janela.add(idade);
		janela.add(caixaIdade);
		janela.add(email);
		janela.add(caixaEmail);
		janela.add(senha);
		janela.add(caixaSenha);
		janela.add(deletar);
		janela.add(confirmar);

		// Setando dimensões e funções padrão da janela
		janela.setSize(480, 480);
		janela.setVisible(true);

		// Retorna o texto
		// Ver como fazer a l�gica de armazenar
		caixaNome.getText();
		caixaCpf.getText();
		caixaRg.getText();
		caixaTelefone.getText();
		caixaIdade.getText();
		caixaEmail.getText();
		caixaSenha.getText();

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
		if (src == confirmar) {
			Dados.getUsuarios().remove(this); 
			System.out.println("Usuario deletado.");
		}
				} 
		
	}
