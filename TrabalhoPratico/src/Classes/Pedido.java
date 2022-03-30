package Classes;



public class Pedido {
	//Pedido não pode herdar de tempo...devemos ter uma composicao
	//Bicicleta faz parte de pedido assim como pedido faz parte de  forma de pagamento
	//Atributos
	private double precoHora;
	private double precoPromocao;
	private double precoFinal;
	private String horaCheckin;
	private String horaCheckout;
	private int horaInicial, minInicial;
	private int horaFinal, minFinal;
	private double tempoTotal;
	
		//Variaveis extra:
		Double precoPorHora;
		
		

	//Metodo construtor do Pedido
	public Pedido(double precoHora, double precoFinal, double precoPromocao) {
		this.precoHora = precoHora;
		this.precoFinal = precoFinal; 
		this.precoPromocao = precoPromocao;
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
	public double getPrecoPromocao() {
		return precoPromocao;
	}
	public void setPrecoPromocao(double precoPromocao) {
		this.precoPromocao = precoPromocao;
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
			if(tempoTotal > 4) { 
				precoFinal = getPrecoFinal();
				precoFinal = tempoTotal*1.50;
				System.out.println("O valor do seu aluguel ficou: " + precoFinal);
			}
			if(tempoTotal < 4){
		        precoFinal = 2.00;
				System.out.println("O valor do seu aluguel ficou: 2.00 reais");
	        }
			if(precoFinal < 2.00) { //Menos que 3 horas
				precoPorHora = 2.00; 
				precoPorHora=getPrecoPromocao();
			}
			if(precoFinal > 2.00) { //Mais que 3 horas
				precoPorHora = tempoTotal*1.50; 
				precoPorHora = getPrecoHora();
			}
	}
	public void atualizarPedido() {
		//Atualizar os pedidos a cada novo tempo final (já que o valor é preco por hora/minuto)
		System.out.println("Preco por hora ate 3 horas:" + getPrecoPromocao());
		System.out.println("Preco por hora para periodos maiores que 3 horas: " +getPrecoHora());
		System.out.println("Preco final: " +getPrecoFinal());
	}
	public void listarPedido() {
		//Listar todos os pedidos cadastrados
		System.out.println("---------------------------------");
		System.out.println("        Tabela de preços: ");
		System.out.println("  R$ 2,00 por hora até a 3ª hora ");
		System.out.println("  R$ 1,50 a partir da quarta hora");
		System.out.println("---------------------------------");
			if(tempoTotal > 4) { 
				precoFinal = getPrecoFinal();
				precoFinal = tempoTotal*1.50;
				System.out.println("O valor do seu aluguel ficou: " + precoFinal);
			}
			if(tempoTotal < 4){
		        precoFinal = 2.00;
				System.out.println("O valor do seu aluguel ficou: 2.00 reais");
	        }
			if(precoFinal < 2.00) { //Menos que 3 horas
				precoPorHora = 2.00; 
				precoPorHora=getPrecoPromocao();
			}
			if(precoFinal > 2.00) { //Mais que 3 horas
				precoPorHora = tempoTotal*1.50; 
				precoPorHora = getPrecoHora();
			}
	}
	
}