package Classes;

import java.util.Date;
import java.util.Scanner;
import java.util.Random;

public class Usuario extends Pessoa {
	//Usuario herda de pessoa...precisa arrumar pra receber isso
	//Atributos
	private String email;
	private String senha;
	
	private Scanner ler = new Scanner (System.in); // Utilizarei para fazer os metodos.
	
	public Usuario() {
		
	}
	
	public Usuario( String nome,double telefone, double identidade, String cpf, Date nascimento, int idade, String email,
			String senha, String verificaSenha) {
		super(nome, telefone, identidade, cpf, nascimento, idade);
		this.email = email;
		this.senha = senha;
		
	}
	
	//Gets and sets
	//Precisa arrumar os retornos para podermos testar.
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	//E interessante que cada usuario seja armazenado numa posicao de um vetor e que pegue os mesmos dados do vetor de pessoas.
	
	// Pra Main
	//Metodos
	public void cadastrarUsuario() { //Cadastrando email e senha, vista que os outros dados devem ser coletados na classe pessoa
		
		Boolean validaEmail = true;
		String respostaEmail;
		Boolean validaSenha = true;
		String respostaSenha;
		
		System.out.println("Insira o email do usuario: ");
		setEmail(ler.next());
		  //Validando email.
		respostaEmail = getEmail();
		if(!respostaEmail.substring(0).matches("[@]*")){ //Verificando se o email nao e nulo e se tem arroba
			validaEmail = false;
			do {
				System.out.println("Erro, Um e-mail precisa ter @, digite um email valido ");
				setEmail(ler.next());
				respostaEmail = getEmail();
				if(!respostaEmail.substring(0).matches("[@]*")){
					validaEmail = false;
				}
			}while(validaEmail == false); //Enquanto nao digitar um email valido ficarei nesse looping
		}
		
		//Validando a senha
		System.out.println("Insira a senha do usuario, a senha deve conter 2 letras maisculas e depois 3 numeros");
		setSenha(ler.next());
		respostaSenha = getSenha();
		
		//Validando se tenho 5 digitos na senha
		if(respostaSenha.length() != 5) { //Verificando se tenho os 5 digitos
			validaSenha = false; 
			do {
				System.out.println("Erro, a senha tem o tamanho de 5 digitos.");
				System.out.println("Insira a senha do usuario, a senha deve conter 2 letras maisculas e depois 3 numeros");
				setSenha(ler.next());
				respostaSenha = getSenha();
				if(respostaSenha.length() != 5) { //Verificando se tenho os 5 digitos
					validaSenha = false; 
				}
			}while(validaSenha = false); //Enquanto nao tiver pelo menos 5 caracteres ficarei nesse looping
		}
			
			//Validando se inicio a senha com duas letras maisculas
			if(!respostaSenha.substring(0, 2).matches("[A-Z]*")){ //Verificando se comeco com 2 letras maisculas
				validaSenha = false;
				do {
					System.out.println("Erro,Uma senha precisa inicialmente ter 2 letras maiusculas. ");
					System.out.println("Insira a senha do usuario, a senha deve conter 2 letras maisculas e depois 3 numeros");
					setSenha(ler.next());
					respostaSenha = getSenha();
					if(!respostaSenha.substring(0, 2).matches("[A-Z]*")){
						validaSenha = false;
					}
				}while(validaSenha = false); //Enquanto nao iniciar com duas letras maisculas ficarei nesse looping
			}
			
			//Validando se termino a senha com 3 numeros
			if(!respostaSenha.substring(2).matches("[0-9]*")){ //Verificando se do 3 ao 5 digito da senha sao numeros
				validaSenha = false;
				do {
					System.out.println("Erro, Uma senha precisa ter 3 numeros em seu final.");
					setSenha(ler.next());
					respostaSenha = getSenha();
					if(!respostaSenha.substring(2).matches("[0-9]*")){
						validaSenha = false;
					}
				}while(validaSenha == false); //Enquanto nao ter 3 numeros no final ficarei nesse looping
			}
		
		
	}
	
	public void editarUsuario() {
		//Editar os dados dos usuarios
		int opcaoEdita = 0 ; //Pro menu de edicoes que terei pra usuario.
		Boolean validaEmail = true;
		String respostaEmail;
		Boolean validaSenha = true;
		String respostaSenha;
		
		do {
			System.out.println("O que deseja editar?");
			System.out.println("\n1 - E-mail\n2 Senha\n3 Sair");
			opcaoEdita = ler.nextInt(); //Lendo qual das opcoes o usuario quer.
			switch(opcaoEdita) {
			
			case 1:
				System.out.println("1 Email");
				System.out.println("Insira o novo email:");
				setEmail(ler.next());
				  //Validando email.
				respostaEmail = getEmail();
				if(!respostaEmail.substring(0).matches("[@]*")){ //Verificando se o email nao e nulo e se tem arroba
					validaEmail = false;
					do {
						System.out.println("Erro, Um e-mail precisa ter @, digite um email valido ");
						setEmail(ler.next());
						respostaEmail = getEmail();
						if(!respostaEmail.substring(0).matches("[@]*")){
							validaEmail = false;
						}
					}while(validaEmail == false); //Enquanto nao digitar um email valido ficarei nesse looping
				}
				System.out.println("Email alterado com sucesso.");
				
			break;
			case 2:
				System.out.println("2 Senha");
				System.out.println("Insira a  nova senha do usuario, a senha deve conter 2 letras maisculas e depois 3 numeros");
				//Validando a  nova senha.
				setSenha(ler.next());
				respostaSenha = getSenha();
				//Validando se tenho 5 digitos na senha
				if(respostaSenha.length() != 5) { //Verificando se tenho os 5 digitos
					validaSenha = false; 
					do {
						System.out.println("Erro, a senha tem o tamanho de 5 digitos.");
						System.out.println("Insira a senha do usuario, a senha deve conter 2 letras maisculas e depois 3 numeros");
						setSenha(ler.next());
						respostaSenha = getSenha();
						if(respostaSenha.length() != 5) { //Verificando se tenho os 5 digitos
							validaSenha = false; 
						}
					}while(validaSenha = false); //Enquanto nao tiver pelo menos 5 caracteres ficarei nesse looping
				}
					
					//Validando se inicio a senha com duas letras maisculas
					if(!respostaSenha.substring(0, 2).matches("[A-Z]*")){ //Verificando se comeco com 2 letras maisculas
						validaSenha = false;
						do {
							System.out.println("Erro,Uma senha precisa inicialmente ter 2 letras maiusculas. ");
							System.out.println("Insira a senha do usuario, a senha deve conter 2 letras maisculas e depois 3 numeros");
							setSenha(ler.next());
							respostaSenha = getSenha();
							if(!respostaSenha.substring(0, 2).matches("[A-Z]*")){
								validaSenha = false;
							}
						}while(validaSenha = false); //Enquanto nao iniciar com duas letras maisculas ficarei nesse looping
					}
					
					//Validando se termino a senha com 3 numeros
					if(!respostaSenha.substring(2).matches("[0-9]*")){ //Verificando se do 3 ao 5 digito da senha sao numeros
						validaSenha = false;
						do {
							System.out.println("Erro, Uma senha precisa ter 3 numeros em seu final.");
							setSenha(ler.next());
							respostaSenha = getSenha();
							if(!respostaSenha.substring(2).matches("[0-9]*")){
								validaSenha = false;
							}
						}while(validaSenha == false); //Enquanto nao ter 3 numeros no final ficarei nesse looping
					}
					System.out.println("Senha alterada com sucesso.");
				
			break;
			case 3: //Saida do menu
			break;
			default:
				System.out.println("Essa opcao nao existe, tente novamente.");
			}
		}while(opcaoEdita==3); //Saida do menu
		
	}
	public void deletarUsuario() { //Zerando email e senha do usuario
		setEmail(null);
		setSenha(null);
	}
	public void atualizarUsuario() {
		//Atualizando os dados que forem ou cadastrados ou editados
	}
	public void listarUsuario() {
		//Listar todos os usuarios cadastrados
		System.out.println("Informacoes dos usuarios");
		System.out.println("Nome: \n" + getNome());
		System.out.println("Email: \n" + getEmail());
		//Precisa criar o Get
		//System.out.println("Rg: \n" + getRg());
		System.out.println("Cpf: \n" + getCpf());
		System.out.println("Senha: \n" + getSenha());
		System.out.println("Telefone: \n" + getTelefone());
	}
	public void buscarUsuario() {
		//Buscar usuario por nome ou cpf
	
	}
	
}