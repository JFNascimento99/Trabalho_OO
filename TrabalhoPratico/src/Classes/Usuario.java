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
		String emailProvisorio=""; //Variavel provisoria apenas pra receber os emails por enquanto.
		String senhaProvisoria=""; //Variavel provisoria apenas pra receber senha por enquanto
		String confirmaSenha=""; //Variavel pra comparar se a senha foi escrita igual.
		
		do { //Validando o email.
			System.out.print("Insira seu email: ");
			emailProvisorio=ler.nextLine(); //lendo o email do usuario
			if(emailProvisorio.length()==0) {  //Verificando se tenho pelo menos algum caracter no email.
				System.out.println("Email invalido, nao existe email nulo");
			}else {
			if(!emailProvisorio.contains("@")) { //Verificando se tenho @ no email.
				System.out.println("Email invalido, nao existe email sem @");
			}
			}
		}while(emailProvisorio.length()==0 || !emailProvisorio.contains("@")); //Email tem que ter @ e nao pode ser vazia
		
		do {
			System.out.print("Insira a senha: ");
			senhaProvisoria = ler.nextLine(); //Lendo a senha do usuario 
			System.out.print("Digite novamente a senha para se confirmar: ");
			confirmaSenha = ler.nextLine(); //Lendo novamente a senha se foi escrita igual.
				if(senha != confirmaSenha) { //As senhas sao diferentes
					System.out.print("As senhas não correspondem.");
				}else {
					if(senhaProvisoria.length()==0) { //Garantindo que o usuario digitou algo
						System.out.print("A senha não pode ser nula. Tente novamente");
					}
				}
		}while( (senhaProvisoria != confirmaSenha) || (senhaProvisoria.length() == 0) ); //As senha e verifificacao devem ser iguais e nao nulas
		
		System.out.println("Usuario cadastrado com sucesso !!! ");
	}
	
	public void editarUsuario() {
		//Editar os dados dos usuarios
		int opcaoEdita = 0 ; //Pro menu de edicoes que terei pra usuario.
		String emailProvisorio=""; //Variavel provisoria apenas pra receber os emails por enquanto.
		String senhaProvisoria=""; //Variavel provisoria apenas pra receber senha por enquanto
		String confirmaSenha=""; //Variavel pra comparar se a senha foi escrita igual.
		
		do {
			System.out.println("O que deseja editar?");
			System.out.println("\n1 - E-mail\n2 Senha\n3 Sair");
			opcaoEdita = ler.nextInt(); //Lendo qual das opcoes o usuario quer.
			switch(opcaoEdita) {
			
			case 1:
				System.out.println("1 Email");
				System.out.println("Insira o novo email:");
				
				do { //Validando o email.
					emailProvisorio=ler.nextLine(); //lendo o email do usuario
					if(emailProvisorio.length()==0) {  //Verificando se tenho pelo menos algum caracter no email.
						System.out.println("Email invalido, nao existe email nulo");
					}else {
						if(!emailProvisorio.contains("@")) { //Verificando se tenho @ no email.
							System.out.println("Email invalido, nao existe email sem @");
						}
					}
				}while(emailProvisorio.length()==0 || !emailProvisorio.contains("@")); //Email tem que ter @ e nao pode ser vazia
				System.out.println("Email alterado com sucesso !");
				
			break;
			case 2:
				System.out.println("2 Senha");
				System.out.println("Insira a nova senha:");
				
				do {
					System.out.print("Insira a senha: ");
					senhaProvisoria = ler.nextLine(); //Lendo a senha do usuario 
					System.out.print("Digite novamente a senha para se confirmar: ");
					confirmaSenha = ler.nextLine(); //Lendo novamente a senha se foi escrita igual.
						if(senha != confirmaSenha) { //As senhas sao diferentes
							System.out.print("As senhas não correspondem.");
						}else {
							if(senhaProvisoria.length()==0) { //Garantindo que o usuario digitou algo
								System.out.print("A senha não pode ser nula. Tente novamente");
							}
						}
				}while( (senhaProvisoria != confirmaSenha) || (senhaProvisoria.length() == 0) ); //As senha e verifificacao devem ser iguais e nao nulas
				System.out.println("Senha alterada com sucesso !!!");
				
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
	}
	public void buscarUsuario() {
		//Buscar usuario por nome ou cpf
	
	}
	
}