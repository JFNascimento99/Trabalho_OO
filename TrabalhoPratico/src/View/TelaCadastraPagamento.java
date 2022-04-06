package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Classes.Dados;
import Classes.FormaDePagamento;

//Fazer antes uma tela de seleção de usuário

public class TelaCadastraPagamento implements ActionListener {

	private JFrame janela = new JFrame("Menu de Cadastro");
	private JLabel titulo = new JLabel("Cadastro de forma de pagamento");

	// Declarando Labels e caixas de texto
	private JLabel Bandeira = new JLabel("Bandeira do cartao");
	private JTextField caixaBandeira = new JTextField();

	private JLabel Numero = new JLabel("Numero do cartao");
	private JTextField caixaNumero = new JTextField(15);

	private JLabel Codigo = new JLabel("Codigo de seguranca");
	private JTextField caixaCodigo = new JTextField(15);

	private JLabel Tipo = new JLabel("Tipo de pagamento");
	private JTextField caixaTipo = new JTextField(15);

	private static JButton concluir = new JButton("Concluir");

	public TelaCadastraPagamento() {
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

		concluir.setBounds(360, 400, 100, 30);

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
		janela.add(concluir);

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
		TelaCadastraPagamento menu = new TelaCadastraPagamento();
		System.out.println("teste");
		concluir.addActionListener(menu);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		// Quando o botão concluir for presionado, deve pegar os valores nos getText e
		// colocar nos respectivos lugares
		if (src == concluir) {

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
					Dados.getFormaDePagamento().add(new FormaDePagamento(caixaBandeira.getText(), caixaNumero.getText(), caixaCodigo.getText(),
							caixaTipo.getText()));// salvar
					System.out.println(Dados.getFormaDePagamento().get(0).getBandeiraCartao());
					janela.dispose();
					TelaMenuUsuario.main(null);
				}

			}

			// Fazer l�gica para alterals os valores
		}
	}
}
