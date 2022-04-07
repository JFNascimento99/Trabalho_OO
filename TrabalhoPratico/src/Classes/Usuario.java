package classes;

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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getNome() + "   " + this.getEmail() + "   " + this.getCpf() + "   " + this.getTelefone();
	}

	public static boolean verificaEmail(String respostaEmail) {
		// Adaptacao do que havia feito para tentar por na tela do Swing
		if (!respostaEmail.substring(0).contains("@")) { // Verificando se o email nao e nulo e se tem
															// arroba
			return false;
		}

		return true;
	}

	public static boolean verificaSenha(String respostaSenha) {
		// Adaptacao do que havia feito para tentar por na tela do Swing
		boolean validaSenha = true;

		if (respostaSenha.length() != 5) { // Verificando se tenho os 5 digitos
			return false;

		}

		// Validando se inicio a senha com duas letras maisculas
		if (!respostaSenha.substring(0, 2).matches("[A-Z]*")) { // Verificando se comeco com 2 letras
			// Adaptacao do que havia feito para tentar por na tela do Swing // maisculas
			validaSenha = false;

		}

		// Validando se termino a senha com 3 numeros
		if (!respostaSenha.substring(2).matches("[0-9]*")) { // Verificando se do 3 ao 5 digito da senha sao
			// Adaptacao do que havia feito para tentar por na tela do Swing // numeros
			validaSenha = false;
		}

		return validaSenha;
	}

	public void deletarUsuario() { // Zerando email e senha do usuario
		// Adaptacao do que havia feito para tentar por na tela do Swing
		Dados.getUsuarios().remove(this);
	}

	public void atualizarUsuario() {

	}

	public void listarUsuario() {
		// Listar todos os usuarios cadastrados
	}

	public void buscarUsuario() {

	}

}