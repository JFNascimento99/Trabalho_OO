package Classes;

public class FormaDePagamento {
	
	//Atributos
	private String bandeiraCartao;
	private double numeroCartao;
	private int codigoSeguranca;
	private boolean tipoPagamento;
	
	
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

}
