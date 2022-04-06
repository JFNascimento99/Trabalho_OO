package Classes;
import java.util.Scanner;
import java.util.Date;

public class FormaDePagamento {
	//Forma de pagamento � composi��o de pedido...vista que n�o tem oq pagar sem pedido.
	//Forma de pagamento est� agregada a usuario...faz parte de usuario
	//Atributos
	private String bandeiraCartao;
	private String numeroCartao;
	private String codigoSeguranca;
	private String tipoPagamento;
	//Variaveis extra pra implementar algumas logicas
	String respostaBandeira;
	String respostaNumero;
	String respostaSeguranca;
	String respostaPagamento;
	Boolean validaBandeira = true;
	Boolean validaPagamento = true;
	Boolean validaCodigo = true;
	Boolean validaNumero = true;
	
	static Scanner ler = new Scanner(System.in);
	
	//Metodo construtor da Forma de Pagamento
	public FormaDePagamento (String bandeiraCartao, String numeroCartao, String codigoSeguranca, String tipoPagamento) {
		this.bandeiraCartao = bandeiraCartao;
		this.numeroCartao = numeroCartao;
		this.codigoSeguranca = codigoSeguranca;
		this.tipoPagamento = tipoPagamento;
	}
	//Gets and sets.
	//Ver os retornos para poder testar
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
	
	public void setTipoPagamento(String  tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	
	//Adaptacao para usar esses dados na tela
	public static boolean verificaBandeira(String respostaBandeira) {
		  if(!respostaBandeira.contains ("Visa") || !respostaBandeira.contains ("Mastercard") || !respostaBandeira.contains ("Elo")) {
			  return false;
		  }
			  return true;
	}
	//Adaptacao para usar esses dados na tela
	public static boolean verificaTipo(String respostaPagamento) {
		if(!respostaPagamento.contains ("debito") || !respostaPagamento.contains ("Credito")) { //So aceitaremos esses dois e escritos assim
			return  false;
		}
			return  true;
	}
	//Adaptacao para usar esses dados na tela
	public static boolean verificaNumero(String respostaNumero) {
		if(respostaNumero.length() != 16) { //Verificando se tenho 16 digitos
			return false;
		}
			return true;
	}
	public static boolean verificaCodigo(String respostaSeguranca) {
		if(respostaSeguranca.length() != 3) { //Verificando que temos 3 digitos
			return false;
		}
			return true;
	}

	public void editarFormaPagamento() {
		//Versao antiga do que fiz sem adaptar pra tentar por na tela, se der ruim usar esse
		//Editar os cartoes cadastrados
		
		//Validando Bandeira do cartao, so aceitaremos esses 3 cartoes escritos nessa forma.
		System.out.println("Cadastrar nova bandeira do cartao (Visa,Mastercard,Elo):");
		setBandeiraCartao(ler.next());
		respostaBandeira = getBandeiraCartao();
		  if(respostaBandeira.contains ("Visa") || respostaBandeira.contains ("Mastercard") || respostaBandeira.contains ("Elo")) {
			  validaBandeira = false;
			  do {
			  		System.out.println("Erro, so aceitamos as seguintes bandeiras" + "Visa, " + "MasterCard, " + "Elo. ");
			  		System.out.println("Cadastrar nova bandeira do cartao (Visa,Mastercard,Elo):");
					setBandeiraCartao(ler.next());
					respostaBandeira = getBandeiraCartao();
					  if(respostaBandeira.contains ("Visa") || respostaBandeira.contains ("Mastercard") || respostaBandeira.contains ("Elo")) {
						  validaBandeira = false;
					  }  
			  }while(validaBandeira == false); //Ficarei nesse looping ate colocar uma bandeira valida		
		  }
		
		//Validando forma de pagamento  
		System.out.println("Cadastrar  nova forma de pagamento: ");
		System.out.println("Forma de Pagamento(debito, credito): ");
		setTipoPagamento(ler.next());
		respostaPagamento = getTipoPagamento();
			if(respostaPagamento.contains ("debito") || respostaPagamento.contains ("Credito")) { //So aceitaremos esses dois e escritos assim
				validaPagamento = false;
				do {
					System.out.println("Erro, so aceitamos credito ou debito, escritos dessa forma.");
					System.out.println("Cadastrar nova forma de pagamento: ");
					System.out.println("Forma de Pagamento(debito, credito): ");
					setTipoPagamento(ler.next());
					respostaPagamento = getTipoPagamento();
						if(respostaPagamento.contains ("debito") || respostaPagamento.contains ("Credito")) { //So aceitaremos esses dois e escritos assim
							validaPagamento = false;
						}
				}while(validaPagamento == false); //Ficarei nesse looping ate pelo menos 16 digitos
			}
			
		//Validando numero do cartao
		System.out.println("Cadastrar novo numero do cartao para pagamento: ");
		setNumeroCartao(ler.next());
		respostaNumero = getNumeroCartao();
			if(respostaNumero.length() != 16) { //Verificando se tenho 16 digitos
				validaNumero = false;
				do {
					System.out.println("Erro, um cartao precisa ter 16 numeros.");
					System.out.println("Cadastrar novo numero do cartao para pagamento: ");
					setNumeroCartao(ler.next());
					respostaNumero = getNumeroCartao();
						if(respostaNumero.length() != 16) {
							validaNumero = false;
						}
				}while(validaNumero == false); //Ficarei nesse looping ate por uma resposta valida
			}
			if(!respostaNumero.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros
				validaNumero = false;
				do {
					System.out.println("Erro, um cartao precisa ter 16 numeros.");
					System.out.println("Cadastrar  novo numero do cartao para pagamento: ");
					setNumeroCartao(ler.next());
					respostaNumero = getNumeroCartao();
					if(!respostaNumero.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros
						validaNumero = false;
					}
				}while(validaNumero == false); //Ficarei nesse looping ate digitar apenas numeros
			}
		
		//Validando codigo de seguranca
		System.out.println("Cadastrar codigo de seguranca do cartao: ");
		setCodigoSeguranca(ler.next());
		respostaSeguranca = getCodigoSeguranca();
		if(respostaSeguranca.length() != 3) { //Verificando que temos 3 digitos
			validaCodigo = false;
			do {
				System.out.println("Erro, um codigo de seguranca precisa ter 3 digitos");
				System.out.println("Cadastrar novo codigo de seguranca do cartao: ");
				setCodigoSeguranca(ler.next());
				respostaSeguranca = getCodigoSeguranca();
				if(respostaSeguranca.length() != 3) { //Verificando que temos 3 digitos
					validaCodigo = false;
				}
			}while(validaCodigo == false); //Ficarei nesse looping ate por pelo menos 3 digitos
			
		}
		if(!respostaSeguranca.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros
			validaCodigo = false;
			do {
				System.out.println("Erro, um codigo de seguranca precisa ter 3 digitos");
				System.out.println("Cadastrar  novo codigo de seguranca do cartao: ");
				setCodigoSeguranca(ler.next());
				respostaSeguranca = getCodigoSeguranca();
				if(!respostaSeguranca.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros
					validaCodigo = false;
				}
				
			}while(validaCodigo == false); //Ficarei nesse looping ate por apenas digitos
			
		}
		System.out.println("Cartao editado com sucesso");
	}
	public void deletarFormaPagamento() { 
		// Escolher qual carta e Resetar todos os dados fazendo virar null.
		//Versao antiga delecao
		//setTipoPagamento(null);
		//setNumeroCartao(null);
		//setBandeiraCartao(null);
		//setCodigoSeguranca(null);
		Dados.getFormaDePagamento().remove(this);
	}
	public void atualizarFormaPgamento() {
		//Atualizar todos os cartoes que forem editados e cadastrados
		System.out.println("Bandeira: "+ getBandeiraCartao());
		System.out.println("Tipo de pagamento: "+ getTipoPagamento());
		System.out.println("Numero do cartao: "+ getNumeroCartao());
		System.out.println("Codigo de seguranca: "+ getCodigoSeguranca());
	}
}