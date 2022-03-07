package Classes;

public class Pedido {
	
	//Atributos
	private double precoHora;
	private double precoFinal;
	
	//Método construtor do Pedido
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
	public verPedido() {
		//Vizualizar o pedido...lembrando que pedido herdatempoe precisausuario e bicicleta
	}
	public atualizarPedido() {
		//Atualizar os pedidos a cada novo tempo final (já que o valor é preco por hora/minuto)
	}
	public listarPedido() {
		//Listar todos os pedidos cadastrados
	}
	
}
