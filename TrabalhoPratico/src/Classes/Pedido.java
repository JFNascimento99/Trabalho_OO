package Classes;

import java.util.Date;

public class Pedido extends Tempo{
	
}

public class Pedido {
	//Pedido herda tempo pra calcular valor por hora.
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
		//Vizualizar o pedido...lembrando que pedido herdatempoe precisausuario e bicicleta
	}
	public void atualizarPedido() {
		//Atualizar os pedidos a cada novo tempo final (já que o valor é preco por hora/minuto)
	}
	public void listarPedido() {
		//Listar todos os pedidos cadastrados
	}
	
}
