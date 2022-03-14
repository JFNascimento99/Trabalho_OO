package Classes;

import java.util.Date;

public class Pedido {
	//Pedido n�o pode herdar de tempo...devemos ter uma composicao
	//Bicicleta faz parte de pedido assim como pedido faz parte de  forma de pagamento
	//Atributos
	private double precoHora;
	private double precoFinal;
	
	//Metodo construtor do Pedido
	public Pedido(double precoHora, double precoFinal) {
		this.precoHora = precoHora;
		this.precoFinal = precoFinal; 
	}
	
	public double getPrecoHora() {
		return precoHora;
	}
	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}
	public double getPrecoFinal() {
		return precoFinal;
	}
	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}
	//Metodos
	public void verPedido() {
		//Vizualizar o pedido...lembrando que pedido recebe composicao de tempo e precisa de usuario e bicicleta.
		//Precisamos receber o tempo total e calcular o pedido.
	}
	public void atualizarPedido() {
		//Atualizar os pedidos a cada novo tempo final (j� que o valor � preco por hora/minuto)
	}
	public void listarPedido() {
		//Listar todos os pedidos cadastrados
	}
	
}
