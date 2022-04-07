package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Classes.Dados;
import Classes.Usuario;

public class TelaBuscaBicicleta implements ActionListener {
	private static JFrame janela = new JFrame("Busca"); // nome da janela
	private static JLabel titulo = new JLabel("Buscar Bicicleta"); // Texto que aparece na janela
	
	private JLabel nome = new JLabel("ID:");
	private JTextField caixaId = new JTextField();
	
	private static JButton buscar = new JButton("Buscar");
	
	public TelaBuscaBicicleta() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20)); // definindo fonte do titulo
		// Legenda: X, Y, Largura, Altura
		titulo.setBounds(155, 10, 200, 30);
		
		nome.setBounds(120, 55, 180, 30);
		caixaId.setBounds(190, 55, 180, 30);
		
		buscar.setBounds(300, 160, 130, 30);
		
		janela.setLayout(null);
		// chamando as informacao que estarao na janela
		janela.add(titulo);
		janela.add(nome);
		janela.add(caixaId);
		janela.add(buscar);
		
		// Setando dimensoes e funcoes padrao da janela
		janela.setSize(480, 250);
		janela.setVisible(true);
		
		caixaId.getText();
		janela.setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		TelaBuscaBicicleta menu = new TelaBuscaBicicleta();
		System.out.println("teste");
		buscar.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == buscar) {

			if (caixaId.getText().length() == 0) {
				JOptionPane.showMessageDialog(null, "Todos os campos devem ser prenchidos", "Erro",
						JOptionPane.ERROR_MESSAGE);
			} else {
				String mensagemErro = "";

				if (!Usuario.verificaNome(caixaId.getText())) {
					mensagemErro += "NOME INVALIDO - valida somente com letras minusculas\n";
				}else {
					System.out.println(Dados.getBicicletas().get(1).getNomeBicicleta());
					janela.dispose();
					//dar um jeito de pegar a bike certa certo
					TelaVisualizaUsuario.main(null);
				}
			}
		}
	}
}
