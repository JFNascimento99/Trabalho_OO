package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import classes.Dados;
import classes.FormaDePagamento;

//Fazer antes uma tela de seleção de usuário

public class TelaEditaPagamento implements ActionListener {

	private JFrame janela = new JFrame("Menu de Edicao");
	private JLabel titulo = new JLabel("Edicao de Forma de Pagamento");

	// Declarando Labels e caixas de texto
	private JLabel Bandeira = new JLabel("Bandeira do Cartao");
	private JTextField caixaBandeira = new JTextField();

	private JLabel Numero = new JLabel("Numero do Cartao");
	private JTextField caixaNumero = new JTextField(15);

	private JLabel Codigo = new JLabel("Codigo de Seguranca");
	private JTextField caixaCodigo = new JTextField(15);

	private JLabel Tipo = new JLabel("Tipo de Pagamento");
	private JTextField caixaTipo = new JTextField(15);

	private static JButton Edita = new JButton("Edita");

	public TelaEditaPagamento() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20)); // definindo fonte do t�tulo
		// definindo as medidas dos botões
		// Legenda: X, Y, Largura, Altura
		titulo.setBounds(145, 10, 200, 30);

		Bandeira.setBounds(100, 50, 180, 30);
		caixaBandeira.setBounds(200, 50, 180, 30);

		Numero.setBounds(100, 100, 180, 30);
		caixaNumero.setBounds(200, 100, 180, 30);

		Codigo.setBounds(100, 150, 180, 30);
		caixaCodigo.setBounds(200, 150, 180, 30);

		Tipo.setBounds(100, 200, 180, 30);
		caixaTipo.setBounds(200, 200, 180, 30);

		Edita.setBounds(360, 400, 100, 30);

		janela.setLayout(null);
		// chamando as informação que estarão na janela
		janela.add(titulo);
		janela.add(Bandeira);
		janela.add(caixaBandeira);
		janela.add(Numero);
		janela.add(caixaNumero);
		janela.add(Codigo);
		janela.add(caixaCodigo);
		janela.add(Tipo);
		janela.add(caixaTipo);
		janela.add(Edita);

		// Setando dimensões e funções padrão da janela
		janela.setSize(480, 480);
		janela.setVisible(true);

		// Retorna o texto
		// Ver como fazer a l�gica de armazenar
		caixaBandeira.getText();
		caixaNumero.getText();
		caixaCodigo.getText();
		caixaTipo.getText();

		janela.setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		TelaEditaPagamento menu = new TelaEditaPagamento();
		System.out.println("teste");
		Edita.addActionListener(menu);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		// Quando o botão concluir for presionado, deve pegar os valores nos getText e
		// colocar nos respectivos lugares
		if (src == Edita) {

			if (caixaBandeira.getText().length() == 0 ||
					caixaNumero.getText().length() == 0 ||
					caixaCodigo.getText().length() == 0 ||
					caixaTipo.getText().length() == 0) {
				JOptionPane.showMessageDialog(null, "Todos os campos devem ser prenchidos", "Erro",
						JOptionPane.ERROR_MESSAGE);

			} else {
				String mensagemErro = "";

				if (!FormaDePagamento.verificaBandeira(caixaBandeira.getText())) {
					mensagemErro += "Bandeira invalida - valida somente com: Visa,Elo ou Mastercard\n";

				}
				if (!FormaDePagamento.verificaNumero(caixaNumero.getText())) {
					mensagemErro += "Numero invalido - valida somente com 16 numeros \n";

				}
				if (!FormaDePagamento.verificaCodigo(caixaCodigo.getText())) {
					mensagemErro += "Codigo invalido - valida somente com 3 numeros\n";

				}
				if (!FormaDePagamento.verificaTipo(caixaTipo.getText())) {
					mensagemErro += "Tipo de pagamento invalido- valida somente: debito ou credito\n";

				}

				if (mensagemErro.length() > 0) {
					JOptionPane.showMessageDialog(null, mensagemErro, "Erro",
							JOptionPane.ERROR_MESSAGE);
				} else {
					Dados.getFormaDePagamento()
							.add(new FormaDePagamento(caixaBandeira.getText(), caixaNumero.getText(),
									caixaCodigo.getText(),
									caixaTipo.getText()));// salvar
					System.out.println(Dados.getFormaDePagamento().get(0).getBandeiraCartao());
					janela.dispose();
					TelaMenuUsuario.main(null);
				}

			}

			// Fazer lógica para alterals os valores
		}
	}
}
