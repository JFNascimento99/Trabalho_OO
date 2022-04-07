package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaMenuPrincipal implements ActionListener {

	private static JFrame janela = new JFrame("Menu principal"); // nome da janela
	private static JLabel titulo = new JLabel("Menu principal"); // Texto que aparece na janela
	// Nomes dos botoes
	private static JButton Usuario = new JButton("Usuario");
	private static JButton Bicicletario = new JButton("Bicicletario");
	private static JButton Bicicleta = new JButton("Bicicleta");
	private static JButton Pedido = new JButton("pedido");
	private static JButton Pagamento = new JButton("Forma de pagamento");

	public TelaMenuPrincipal() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20)); // definindo fonte do titulo
		// definindo as medidas dos botoes
		// Legenda: X, Y, Largura, Altura
		titulo.setBounds(165, 10, 150, 30);
		Usuario.setBounds(140, 50, 180, 30);
		Bicicletario.setBounds(140, 100, 180, 30);
		Bicicleta.setBounds(140, 150, 180, 30);
		Pedido.setBounds(140, 150, 180, 30);
		Pagamento.setBounds(140, 150, 180, 30);

		janela.setLayout(null);
		// chamando as informacoes que estarao na janela
		janela.add(titulo);
		janela.add(Usuario);
		janela.add(Bicicletario);
		janela.add(Bicicleta);
		janela.add(Pedido);
		janela.add(Pagamento);

		// Setando dimensoes e funcoes padrao da janela
		janela.setSize(480, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);

		// Setando a tela para aparecer no centro
		janela.setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		TelaMenuPrincipal menu = new TelaMenuPrincipal();

		// Implementacao do Action Listener
		Usuario.addActionListener(menu);
		Bicicletario.addActionListener(menu);
		Bicicleta.addActionListener(menu);
		Pedido.addActionListener(menu);
		Pagamento.addActionListener(menu);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == Usuario)
			TelaMenuUsuario.main(null);

		if (src == Bicicletario)
			TelaCadastraBicicletario.main(null);

		if (src == Bicicleta)
			TelaBicicletas.main(null);
	}
}