package Classes;

import java.util.Date;

public class Pedido {
	//Pedido não pode herdar de tempo...devemos ter uma composicao
	//Bicicleta faz parte de pedido assim como pedido faz parte de  forma de pagamento
	//Atributos
	private double precoHora;
	private double precoFinal;
	
	//Metodo construtor do Pedido
	public Pedido(double precoHora, double precoFinal) {
		this.precoHora = precoHora;
		this.precoFinal = precoFinal; 
	}
	//Gets and sets.
	//Precisa ver os retornos para poder testar as paradas.
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
		System.out.println("---------------------------------");
		System.out.println("        Tabela de preços: ");
		System.out.println("  R$ 2,00 por hora até a 3ª hora ");
		System.out.println("  R$ 1,50 a partir da quarta hora");
		System.out.println("---------------------------------");
			//if(tempoTotal > 4) { 
				//precoFinal = tempoTotal*1.50;
				// System.out.println("O valor do seu aluguel ficou: " + precoFinal);
			//}
			//if(tempoTotal < 4){
		         //precoFinal = 2.00;
				//System.out.println("O valor do seu aluguel ficou: 2.00 reais");
	        //}
	}
	public void atualizarPedido() {
		//Atualizar os pedidos a cada novo tempo final (já que o valor é preco por hora/minuto)
	}
	public void listarPedido() {
		//Listar todos os pedidos cadastrados
	}
	
}