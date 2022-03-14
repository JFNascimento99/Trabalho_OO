package Classes;

import java.util.Date;

public class Usuario extends Pessoa {
	//Usuario herda de pessoa...precisa arrumar pra receber isso
	//Atributos
	private String email;
	private String senha;
	private String verificaSenha;
	
	// Pra Main
	//private Scanner ler = new Scanner (System.in); // Utilizarei para fazer os metodos.
	
	public Usuario() {
		
	}
	
	public Usuario( String nome,double telefone, double identidade, String cpf, Date nascimento, int idade, String email,
			String senha, String verificaSenha) {
		super(nome, telefone, identidade, cpf, nascimento, idade);
		this.email = email;
		this.senha = senha;
		this.verificaSenha = verificaSenha;
	}
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
	public String getVerificaSenha() {
		return verificaSenha;
	}
	public void setVerificaSenha(String verificaSenha) {
		this.verificaSenha = verificaSenha;
	}
	
	//E interessante que cada usuario seja armazenado numa posicao de um vetor e que pegue os mesmos dados do vetor de pessoas.
	
	// Pra Main
	//Metodos
	/*public void cadastrarUsuario() { //Cadastrando email e senha, vista que os outros dados devem ser coletados na classe pessoa
		do { //Validando o email.
			System.out.print("Insira seu email: ");
			setEmail(ler.nextLine());
		}while(email.length()==0 || email.contains=='@'); //Email tem que ter @ e nao pode ser vazia
		do {
			System.out.print("Insira a senha: ");
			setSenha(ler.nextLine()); 
			System.out.print("Digite novamente a senha para se confirmar: ");
			setVerificaSenha(ler.nextLine());
				if(senha != verificaSenha) {
					System.out.print("As senhas não correspondem.");
				}else {
					if(senha.length()==0) {
						System.out.print("A senha não pode ser nula. Tente novamente");
					}
		}while(senha !=verificaSenha || (senha.length()==0)); //As senha e verifificacao devem ser iguais e nao nulas
	}
	public void editarUsuario() {
		//Editar os dados dos usuarios
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
	*/
}