package Classes;

import java.util.Scanner;

public class Usuario extends Pessoa {
	// Usuario precisa estar em vetor para podermos fazer as buscas, o ideal seria
	// no mesmo vetor de pessoas tbm

	// Atributos
	private String email;
	private String senha;

	// Outras variaveis:
	Boolean validaEmail = true;
	String respostaEmail;
	Boolean validaSenha = true;
	String respostaSenha;
	FormaDePagamento formaDePagamento;

	private Scanner ler = new Scanner(System.in); // Utilizarei para fazer os metodos.

	public String Usuario[];

	public Usuario(String nome, String telefone, String identidade, String cpf, String idade, String email,
			String senha) {
		super(nome, telefone, identidade, cpf, idade);
		this.email = email;
		this.senha = senha;
	}

	// Gets and sets
	// Precisa arrumar os retornos para podermos testar.
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

	public void addFormaPagamento(FormaDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public static boolean verificaEmail(String respostaEmail) {
		//Adaptacao do que havia feito para tentar por na tela do Swing
		if (!respostaEmail.substring(0).contains("@")) { // Verificando se o email nao e nulo e se tem
															// arroba
			return false;
		}

		return true;
	}

	public static boolean verificaSenha(String respostaSenha) {
		//Adaptacao do que havia feito para tentar por na tela do Swing
		boolean validaSenha = true;

		if (respostaSenha.length() != 5) { // Verificando se tenho os 5 digitos
			return  false;

		}

		// Validando se inicio a senha com duas letras maisculas
		if (!respostaSenha.substring(0, 2).matches("[A-Z]*")) { // Verificando se comeco com 2 letras
			//Adaptacao do que havia feito para tentar por na tela do Swing													// maisculas
			validaSenha = false;

		}

		// Validando se termino a senha com 3 numeros
		if (!respostaSenha.substring(2).matches("[0-9]*")) { // Verificando se do 3 ao 5 digito da senha sao
			//Adaptacao do que havia feito para tentar por na tela do Swing													// numeros
			validaSenha = false;
		}

		return validaSenha;
	}

	public void deletarUsuario() { // Zerando email e senha do usuario
		//Adaptacao do que havia feito para tentar por na tela do Swing
		Dados.getUsuarios().remove(this);
	}

	public void atualizarUsuario() {
		// Atualizando os dados que forem ou cadastrados ou editados

		System.out.println("Informacoes dos usuarios");
		System.out.println("Nome: \n" + getNome());
		System.out.println("Email: \n" + getEmail());
		System.out.println("Rg: \n" + getIdentidade());
		System.out.println("Cpf: \n" + getCpf());
		System.out.println("Senha: \n" + getSenha());
		System.out.println("Telefone: \n" + getTelefone());
	}

	public void listarUsuario() {
		// Listar todos os usuarios cadastrados

		System.out.println("Informacoes dos usuarios");
		System.out.println("Nome: \n" + getNome());
		System.out.println("Email: \n" + getEmail());
		System.out.println("Rg: \n" + getIdentidade());
		System.out.println("Cpf: \n" + getCpf());
		System.out.println("Senha: \n" + getSenha());
		System.out.println("Telefone: \n" + getTelefone());
	}

	public void buscarUsuario() {
		// Buscar usuario por nome
		String buscarUsuario;
		Boolean encontrado = false;
		for (int b = 0; b <= 100; b++) { // Vetor de usuarios
			System.out.println("Insira o nome do usuario que se deseja buscar: ");
			buscarUsuario = ler.next(); // Lendo o nome digitado.
			if (Usuario[b].equals(buscarUsuario)) { // Comparando o que o usuario digitou com o que tinhamos armazenado
				System.out.println("Na posicao " + b + "foi encontrado " + Usuario[b]);
				encontrado = true;
			}
			if (!encontrado) { // Caso nao seja igual o que foi digitado
				encontrado = false;
				System.out.println("Esse usuario nao existe.");
			}
		}

	}

}