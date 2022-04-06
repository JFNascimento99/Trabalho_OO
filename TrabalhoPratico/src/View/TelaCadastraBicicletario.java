package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Classes.Dados;
import Classes.Bicicletario;

//Fazer antes uma tela de selecao de usuario

public class TelaCadastraBicicletario implements ActionListener {

	private JFrame janela = new JFrame("Menu de Cadastro");
	private JLabel titulo = new JLabel("Cadastro de Bicicletario");

	// Declarando Labels e caixas de texto
	private JLabel Checkin = new JLabel("Lugar de Check-in");
	private JTextField caixaCheckIn = new JTextField();

	private JLabel Checkout = new JLabel("Lugar de Check-out");
	private JTextField caixaCheckOut = new JTextField(15);
	private static JButton concluir = new JButton("Concluir");

	public TelaCadastraBicicletario() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20)); // definindo fonte do titulo
		// definindo as medidas dos botoes
		// Legenda: X, Y, Largura, Altura
		titulo.setBounds(145, 10, 200, 30);

		Checkin.setBounds(100, 50, 180, 30);
		caixaCheckIn.setBounds(200, 50, 180, 30);

		Checkout.setBounds(100, 100, 180, 30);
		caixaCheckOut.setBounds(200, 100, 180, 30);
		concluir.setBounds(360, 400, 100, 30);

		janela.setLayout(null);
		// chamando as informação que estarão na janela
		janela.add(titulo);
		janela.add(Checkin);
		janela.add(caixaCheckIn);
		janela.add(Checkout);
		janela.add(caixaCheckOut);
		janela.add(concluir);

		// Setando dimensões e funções padrão da janela
		janela.setSize(480, 480);
		janela.setVisible(true);

		// Retorna o texto
		// Ver como fazer a l�gica de armazenar
		caixaCheckIn.getText();
		caixaCheckOut.getText();
		janela.setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		TelaCadastraBicicletario menu = new TelaCadastraBicicletario();
		System.out.println("teste");
		concluir.addActionListener(menu);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		// Quando o botão concluir for presionado, deve pegar os valores nos getText e
		// colocar nos respectivos lugares
		if (src == concluir) {

			if (caixaCheckIn.getText().length() == 0 ||
					caixaCheckOut.getText().length() == 0 ) {
				JOptionPane.showMessageDialog(null, "Todos os campos devem ser prenchidos", "Erro",
						JOptionPane.ERROR_MESSAGE);

			} else {
				String mensagemErro = "";

				if (!Bicicletario.verificaCheckIn(caixaCheckIn.getText())) {
					mensagemErro += "Check In INVALIDO - valida somente estacoes existentes\n";

				}
				if (!Bicicletario.verificaCheckOut(caixaCheckOut.getText())) {
					mensagemErro += "Check Out INVALIDO - valida somente estacoes existentes \n";

				}
				if (mensagemErro.length() > 0) {
					JOptionPane.showMessageDialog(null, mensagemErro, "Erro",
							JOptionPane.ERROR_MESSAGE);
				} else {
					Dados.getBicicletarios().add(new Bicicletario(caixaCheckIn.getText(), caixaCheckOut.getText()));// salvar
					System.out.println(Dados.getBicicletarios().get(0).getChegada());
					janela.dispose();
					TelaMenuUsuario.main(null);
				}

			}

			// Fazer lógica para alterals os valores
		}
	}
}
