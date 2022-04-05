package Classes;

import java.util.Scanner;

public abstract class Pessoa {
	// Pessoa vai herdar tudo pra usuario
	// Atributos
	private String nome;
	private String telefone;
	private String identidade;
	private String cpf;
	private String idade;

	private Usuario usuario;
	private Scanner ler = new Scanner(System.in); // Utilizarei para fazer os metodos.*/

	// Variaveis extra:
	Boolean validaNome = true;
	String respostaNome;
	Boolean validaCpf = true;
	String respostaCpf;
	Boolean validaTel = true;
	String respostaTel;
	Boolean validaRg = true;
	String respostaRg;
	Boolean validaIdade = true;
	String respostaIdade;

	// precisamos arrumar os metodos da classe pessoa tbm, ter uma lista de pessoas
	// pre cadastradas e em vetor.
	// usuario vai corresponder as mesmas pessoas do vetor de
	// pessoas...pessoa[a]==usuario[a] e etc

	// Construtor

	public Pessoa() {

	}

	public Pessoa(String nome, String telefone, String identidade, String cpf, String idade) {
		this.nome = nome;
		this.telefone = telefone;
		this.identidade = identidade;
		this.cpf = cpf;
		this.idade = idade;
	}

	// Gets e Sets
	// Precisa ver os retornos para testar.
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	// E interessante cadastrar cada pessoa como um vetor e que os usuarios sejam
	// cadastrados na mesma posicao.

	// Pra Main tudo q t� em baixo
	public Usuario getUsuario() {
		return usuario;
	}

	public static boolean verificaNome(String respostaNome) {
		if (!respostaNome.substring(0).matches("[a-z]*"))

		{ // Verificando se nao e nulo e so tem letras
			return false;
		}
		return true;
	}

	public static boolean verificaCpf(String respostaCpf) {
		if (respostaCpf.length() != 11) { // Verificando se temos 11 digitos
			return false; // Nao tem 11 digitos e ou nao tem apenas numeros.
		}
		if (!respostaCpf.substring(0).matches("[0-9]*")) { // Verificando se tenho apenas numeros
			return false;
		}
		return true;
	}

	public static boolean verificaRg(String respostaRg) {
		if (!respostaRg.substring(0).matches("[0-9]*")) {
			return false;
		}
		if (respostaRg.length() != 7) {
			return false;
		}
		return true;
	}

	public static boolean verificaIdade(String respostaIdade) {
		if (!respostaIdade.substring(0).matches("[0-9]*")) {
			return false;
		}
		return true;
	}

	public static boolean verificaTelefone(String respostaTel) {
		if (respostaTel.length() != 9) { // Verificando se tem os 9 digitos
			return false; // Nao temos 9 digitos
		}

		if (!respostaTel.substring(0).matches("[0-9]*")) { // Verificando se tenho apenas numeros
			return false;
		}
		return true;
	}

}