package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaCadastro implements ActionListener {

	private JFrame janela = new JFrame ("Menu de Cadastro");
	private JLabel titulo = new JLabel ("Cadstro de usuário");
	
	private JLabel nome = new JLabel("Nome");
	private JTextField caixaNome = new JTextField(15);
	
	private JLabel cpf = new JLabel("CPF");
	private JButton concluir = new JButton("Concluir");
	
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
	
	private JTextField caixaCpf = new JTextField(15);
	
	public TelaCadastro() {
		titulo.setFont(new Font("Arial" , Font.BOLD, 20)); // definindo fonte do título
		// definindo as medidas dos botões
		// Legenda: X, Y, Largura, Altura
		titulo.setBounds(145, 10, 200, 30);
		nome.setBounds(14, 50 ,180, 30);
		//caixaNome.setBounds();
		cpf.setBounds(14, 100 ,180, 30);
		rg.setBounds(14, 150 ,180, 30);
		telefone.setBounds(14, 200 ,180, 30);
		idade.setBounds(14, 250 ,180, 30);
		email.setBounds(14, 300 ,180, 30);
		senha.setBounds(14, 350 ,180, 30);
		
		janela.setLayout(null);
		//chamando as informação que estarão na janela
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
		
		
		janela.setSize(480, 480);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
		//Retorna o texto
		caixaNome.getText();
	}
		
		public static void main(String[] args) {
			TelaCadastro menu = new TelaCadastro();
			
	}
}
