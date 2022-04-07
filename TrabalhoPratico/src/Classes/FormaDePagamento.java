package classes;

public class FormaDePagamento {
	// Forma de pagamento � composi��o de pedido...vista que n�o tem oq pagar sem
	// pedido.
	// Forma de pagamento est� agregada a usuario...faz parte de usuario
	// Atributos
	private String bandeiraCartao;
	private String numeroCartao;
	private String codigoSeguranca;
	private String tipoPagamento;
	// Variaveis extra pra implementar algumas logicas
	String respostaBandeira;
	String respostaNumero;
	String respostaSeguranca;
	String respostaPagamento;
	Boolean validaBandeira = true;
	Boolean validaPagamento = true;
	Boolean validaCodigo = true;
	Boolean validaNumero = true;

	// Metodo construtor da Forma de Pagamento
	public FormaDePagamento(String bandeiraCartao, String numeroCartao, String codigoSeguranca, String tipoPagamento) {
		this.bandeiraCartao = bandeiraCartao;
		this.numeroCartao = numeroCartao;
		this.codigoSeguranca = codigoSeguranca;
		this.tipoPagamento = tipoPagamento;
	}

	// Gets and sets.
	// Ver os retornos para poder testar
	public String getBandeiraCartao() {
		return bandeiraCartao;
	}

	public void setBandeiraCartao(String bandeiraCartao) {
		this.bandeiraCartao = bandeiraCartao;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getCodigoSeguranca() {
		return codigoSeguranca;
	}

	public void setCodigoSeguranca(String codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	// Adaptacao para usar esses dados na tela
	public static boolean verificaBandeira(String respostaBandeira) {
		if (!respostaBandeira.contains("Visa") || !respostaBandeira.contains("Mastercard")
				|| !respostaBandeira.contains("Elo")) {
			return false;
		}
		return true;
	}

	// Adaptacao para usar esses dados na tela
	public static boolean verificaTipo(String respostaPagamento) {
		if (!respostaPagamento.contains("debito") || !respostaPagamento.contains("Credito")) { // So aceitaremos esses
																								// dois e escritos assim
			return false;
		}
		return true;
	}

	// Adaptacao para usar esses dados na tela
	public static boolean verificaNumero(String respostaNumero) {
		if (respostaNumero.length() != 16) { // Verificando se tenho 16 digitos
			return false;
		}
		return true;
	}

	public static boolean verificaCodigo(String respostaSeguranca) {
		if (respostaSeguranca.length() != 3) { // Verificando que temos 3 digitos
			return false;
		}
		return true;
	}

	public void editarFormaPagamento() {

	}

	public void deletarFormaPagamento() {
		Dados.getFormaDePagamento().remove(this);
	}

}