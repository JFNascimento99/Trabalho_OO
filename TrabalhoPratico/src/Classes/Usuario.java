import java.util.Date;
import java.util.Scanner;
import java.util.Scanner;
public class Usuario extends Pessoa {
	//Atributos
	private String email;
	private String senha;
	private String verificaSenha;
	private Scanner ler = new Scanner (System.in); // Utilizarei para fazer os metodos.
	
	public Usuario( String e, String s,String vs,String n,double t,double rg,String c,Date nascimento,int anos) {
		super();
		email=e;
		senha=s;
		verificaSenha=vs;
		nome=n;
		telefone=t;
		identidade=rg;
		cpf=c;
		dataNascimento=nascimento;
		idade=anos;
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
	//Metodos
	public void cadastrarUsuario() { //Cadastrando email e senha, vista que os outros dados devem ser coletados na classe pessoa
		do { //Validando o email.
			System.out.print("Insira seu email: ");
			setEmail(ler.nextLine());
		}while(email.length==0 || email.contains==('@')); //Email tem que ter @ e nao pode ser vazia
		do {
			System.out.print("Insira a senha: ");
			setSenha(ler.nextLine()); 
			System.out.print("Digite novamente a senha para se confirmar: ");
			setverificaSenha(ler.nextLine());
				if(senha != verificaSenha) {
					System.out.print("As senhas n�o correspondem.");
				}else {
					if(senha.length()==0) {
						System.out.print("A senha n�o pode ser nula. Tente novamente");
					}
		}while(senha !=verificaSenha || (senha.length()==0)); //As senha e verifificacao devem ser iguais e nao nulas
	}
	public void editarUsuario() {
		
	}
	public void deletarUsuario() { //Zerando email e senha do usuario
		setEmail(null);
		setSenha(null);
	}
	public void atualizarUsuario() {
		
	}
	public void listarUsuario() {
		
	}
	public void buscarUsuario() {
		
	}
	}
	

}
