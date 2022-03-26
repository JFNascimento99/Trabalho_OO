package Classes;
import java.util.Scanner;
import java.util.Date;

public class FormaDePagamento {
	//Forma de pagamento é composição de pedido...vista que não tem oq pagar sem pedido.
	//Forma de pagamento está agregada a usuario...faz parte de usuario
	//Atributos
	private String bandeiraCartao;
	private double numeroCartao;
	private int codigoSeguranca;
	private String tipoPagamento;
	//Variaveis extra pra implementar algumas logicas
	String respostaBandeira;
	double respostaNumero;
	int respostaSeguranca;
	String respostaPagamento;
	Boolean validaBandeira = true;
	Boolean validaPagamento = true;
	Boolean validaCodigo = true;
	Boolean validaNumero = true;
	
	static Scanner ler = new Scanner(System.in);
	
	//Metodo construtor da Forma de Pagamento
	public FormaDePagamento (String bandeiraCartao, double numeroCartao, int codigoSeguranca, String tipoPagamento) {
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
	
	public String getTipoPagamento() {
		return tipoPagamento;
	}
	
	public void setTipoPagamento(String  tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	
	//Metodos
	public void cadastrarFormaPagamento() {
		//Cadastrar os cartoes.
		
		//Validando Bandeira do cartao, so aceitaremos esses 3 cartoes escritos nessa forma.
		System.out.println("Cadastrar bandeira do cartao (Visa,Mastercard,Elo):");
		setBandeiraCartao(ler.next());
		respostaBandeira = getBandeiraCartao();
		  if(respostaBandeira != "Visa" || respostaBandeira != "Mastercard" || respostaBandeira != "Elo") {
			  validaBandeira = false;
			  do {
			  		System.out.println("Erro, so aceitamos as seguintes bandeiras" + "Visa, " + "MasterCard, " + "Elo. ");
			  		System.out.println("Cadastrar bandeira do cartao (Visa,Mastercard,Elo):");
					setBandeiraCartao(ler.next());
					respostaBandeira = getBandeiraCartao();
					  if(respostaBandeira != "Visa" || respostaBandeira != "Mastercard" || respostaBandeira != "Elo") {
						  validaBandeira = false;
					  }  
			  }while(validaBandeira == false); //Ficarei nesse looping ate colocar uma bandeira valida		
		  }
		
		//Validando forma de pagamento  
		System.out.println("Cadastrar forma de pagamento: ");
		System.out.println("Forma de Pagamento(debito, credito): ");
		setTipoPagamento(ler.next());
		respostaPagamento = getTipoPagamento();
			if(respostaPagamento != "debito" || respostaPagamento != "Credito") { //So aceitaremos esses dois e escritos assim
				validaPagamento = false;
				do {
					System.out.println("Erro, so aceitamos credito ou debito, escritos dessa forma.");
					System.out.println("Cadastrar forma de pagamento: ");
					System.out.println("Forma de Pagamento(debito, credito): ");
					setTipoPagamento(ler.next());
					respostaPagamento = getTipoPagamento();
						if(respostaPagamento != "debito" || respostaPagamento != "Credito") { //So aceitaremos esses dois e escritos assim
							validaPagamento = false;
						}
				}while(validaPagamento == false); //Ficarei nesse looping ate por uma resposta valida
			}
			
		//Validando numero do cartao
		System.out.println("Cadastrar numero do cartao para pagamento: ");
		setNumeroCartao(ler.nextDouble());
		respostaNumero = getNumeroCartao();
			//Erro pq length so pd ser p string e nao sei como fazer agr so com Double
			if(respostaNumero.length() != 16) {
				validaNumero = false;
				do {
					System.out.println("Erro, um cartao precisa ter 16 numeros.");
					System.out.println("Cadastrar numero do cartao para pagamento: ");
					setNumeroCartao(ler.nextDouble());
					respostaNumero = getNumeroCartao();
						//Erro pq length so pd ser p string e nao sei como fazer agr so com Double
						if(respostaNumero.length() != 16) {
							validaNumero = false;
						}
				}while(validaNumero == false); //Ficarei nesse looping ate por uma resposta valida
			}
		
		//Validando codigo de seguranca
		System.out.println("Cadastrar codigo de seguranca do cartao: ");
		setCodigoSeguranca(ler.nextInt());
		respostaSeguranca = getCodigoSeguranca();
		if(respostaSeguranca >= 1000 || respostaSeguranca < 100) { //Logica para termos aqueles 3 numeros do codigo de seguranca
			validaCodigo = false;
			do {
				System.out.println("Erro, um codigo de seguranca precisa ter 3 digitos e maiores ou iguais a 100");
				System.out.println("Cadastrar codigo de seguranca do cartao: ");
				setCodigoSeguranca(ler.nextInt());
				respostaSeguranca = getCodigoSeguranca();
				if(respostaSeguranca >= 1000 || respostaSeguranca < 100) { //Logica para termos aqueles 3 numeros do codigo de seguranca
					validaCodigo = false;
				}
			}while(validaCodigo == false); //Ficarei nesse looping ate por uma resposta valida.
			
		}
		System.out.println("Cartao cadastrado com sucesso");
	}
	public void editarFormaPagamento() {
		//Editar os cartoes cadastrados
		

		//Validando Bandeira do cartao, so aceitaremos esses 3 cartoes escritos nessa forma.
		System.out.println("Cadastrar bandeira do cartao (Visa,Mastercard,Elo):");
		setBandeiraCartao(ler.next());
		respostaBandeira = getBandeiraCartao();
		  if(respostaBandeira != "Visa" || respostaBandeira != "Mastercard" || respostaBandeira != "Elo") {
			  validaBandeira = false;
			  do {
			  		System.out.println("Erro, so aceitamos as seguintes bandeiras" + "Visa, " + "MasterCard, " + "Elo. ");
			  		System.out.println("Cadastrar bandeira do cartao (Visa,Mastercard,Elo):");
					setBandeiraCartao(ler.next());
					respostaBandeira = getBandeiraCartao();
					  if(respostaBandeira != "Visa" || respostaBandeira != "Mastercard" || respostaBandeira != "Elo") {
						  validaBandeira = false;
					  }  
			  }while(validaBandeira == false); //Ficarei nesse looping ate colocar uma bandeira valida		
		  }
		
		//Validando forma de pagamento  
		System.out.println("Cadastrar forma de pagamento: ");
		System.out.println("Forma de Pagamento(debito, credito): ");
		setTipoPagamento(ler.next());
		respostaPagamento = getTipoPagamento();
			if(respostaPagamento != "debito" || respostaPagamento != "Credito") { //So aceitaremos esses dois e escritos assim
				validaPagamento = false;
				do {
					System.out.println("Erro, so aceitamos credito ou debito, escritos dessa forma.");
					System.out.println("Cadastrar forma de pagamento: ");
					System.out.println("Forma de Pagamento(debito, credito): ");
					setTipoPagamento(ler.next());
					respostaPagamento = getTipoPagamento();
						if(respostaPagamento != "debito" || respostaPagamento != "Credito") { //So aceitaremos esses dois e escritos assim
							validaPagamento = false;
						}
				}while(validaPagamento == false); //Ficarei nesse looping ate por uma resposta valida
			}
			
		//Validando numero do cartao
		System.out.println("Cadastrar numero do cartao para pagamento: ");
		setNumeroCartao(ler.nextDouble());
		respostaNumero = getNumeroCartao();
			//Erro pq length so pd ser p string e nao sei como fazer agr so com Double
			if(respostaNumero.length() != 16) {
				validaNumero = false;
				do {
					System.out.println("Erro, um cartao precisa ter 16 numeros.");
					System.out.println("Cadastrar numero do cartao para pagamento: ");
					setNumeroCartao(ler.nextDouble());
					respostaNumero = getNumeroCartao();
						//Erro pq length so pd ser p string e nao sei como fazer agr so com Double
						if(respostaNumero.length() != 16) {
							validaNumero = false;
						}
				}while(validaNumero == false); //Ficarei nesse looping ate por uma resposta valida
			}
		
		//Validando codigo de seguranca
		System.out.println("Cadastrar codigo de seguranca do cartao: ");
		setCodigoSeguranca(ler.nextInt());
		respostaSeguranca = getCodigoSeguranca();
		if(respostaSeguranca >= 1000 || respostaSeguranca < 100) { //Logica para termos aqueles 3 numeros do codigo de seguranca
			validaCodigo = false;
			do {
				System.out.println("Erro, um codigo de seguranca precisa ter 3 digitos e maiores ou iguais a 100");
				System.out.println("Cadastrar codigo de seguranca do cartao: ");
				setCodigoSeguranca(ler.nextInt());
				respostaSeguranca = getCodigoSeguranca();
				if(respostaSeguranca >= 1000 || respostaSeguranca < 100) { //Logica para termos aqueles 3 numeros do codigo de seguranca
					validaCodigo = false;
				}
			}while(validaCodigo == false); //Ficarei nesse looping ate por uma resposta valida.
			
		}
		System.out.println("Cartao editado com sucesso");
	}
	public void deletarFormaPagamento() { 
		// Escolher qual carta e Resetar todos os dados fazendo virar null.
		setTipoPagamento("");
		setNumeroCartao(0);
		setBandeiraCartao("");
		setCodigoSeguranca(0);
	}
	public void atualizarFormaPgamento() {
		//Atualizar todos os cartoes que forem editados e cadastrados
		
	}
}