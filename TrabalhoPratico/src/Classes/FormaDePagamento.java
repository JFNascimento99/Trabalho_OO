package Classes;

public class FormaDePagamento {
	
	//Atributos
	private String bandeiraCartao;
	private double numeroCartao;
	private int codigoSeguranca;
	private boolean tipoPagamento;
	
	//Método construtor da Forma de Pagamento
	public FormaDePagamento (String bandeiraCartao, double numeroCartao, int codigoSeguranca, boolean tipoPagamento) {
		this.bandeiraCartao = bandeiraCartao;
		this.numeroCartao = numeroCartao;
		this.codigoSeguranca = codigoSeguranca;
		this.tipoPagamento = tipoPagamento;
	}
	
	public String getBandeiraCartao() {
		return bandeiraCartao;
	}
	public void setBandeiraCartao(String bandeiraCartao) {
		this.bandeiraCartao = bandeiraCartao;
	}
	public double getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(double numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public int getCodigoSeguranca() {
		return codigoSeguranca;
	}
	public void setCodigoSeguranca(int codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}
	public boolean isTipoPagamento() {
		return tipoPagamento;
	}
	public void setTipoPagamento(boolean tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	//Metodos
	public cadastrarFormaPagamento() {
		//Cadastrar os cartoes.
	}
	public editarFormaPagamento() {
		//Editar os cartoes cadastrados
	}
	public deletarFormaPagamento() {
		//Resetar todos os dados fazendo virar null.
	}
	public atualizarFormaPgamento() {
		//Atualizar todos os cartoes que forem editados
	}
}
