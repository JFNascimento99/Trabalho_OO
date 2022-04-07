package classes;

public class Pedido {
	// Pedido n�o pode herdar de tempo...devemos ter uma composicao
	// Bicicleta faz parte de pedido assim como pedido faz parte de forma de
	// pagamento
	// Atributos
	private double precoHora;
	private double precoPromocao;
	private double precoFinal;
	private Tempo tempo;
	private String tempoTotalStr;
	private double tempoTotal;

	// Variaveis extra:
	Double precoPorHora;

	// Metodo construtor do Pedido
	public Pedido(double precoHora, double precoFinal, double precoPromocao, Tempo tempo) {
		this.precoHora = precoHora;
		this.precoFinal = precoFinal;
		this.precoPromocao = precoPromocao;
		this.tempo = tempo;
		this.tempoTotalStr = Tempo.horaDoubleToStr(tempo.getTempoTotal());
		this.tempoTotal = tempo.getTempoTotal();
	}

	// Gets and sets.
	// Precisa ver os retornos para poder testar as paradas.
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

	// Metodos
	public void verPedido() {

	}

	public void atualizarPedido() {

	}

	public void listarPedido() {

	}

	public Tempo getTempo() {
		return tempo;
	}

	public void setTempo(Tempo tempo) {
		this.tempo = tempo;
	}

	public String getTempoTotalStr() {
		return tempoTotalStr;
	}

	public void setTempoTotalStr(String tempoTotalStr) {
		this.tempoTotalStr = tempoTotalStr;
	}

	public double getTempoTotal() {
		return tempoTotal;
	}

	public void setTempoTotal(double tempoTotal) {
		this.tempoTotal = tempoTotal;
	}

	public Double getPrecoPorHora() {
		return precoPorHora;
	}

	public void setPrecoPorHora(Double precoPorHora) {
		this.precoPorHora = precoPorHora;
	}

}