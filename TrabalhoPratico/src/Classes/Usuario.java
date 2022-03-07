import java.util.Date;
import java.util.Scanner;
public class Usuario extends Pessoa {
	//Atributos
	private String email;
	private String senha;
	private Scanner ler = new Scanner (System.in); // Utilizarei para fazer os metodos.
	
	public Usuario( String e, String s,String n,double t,double rg,String c,Date nascimento,int anos) {
		super();
		email=e;
		senha=s;
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
	

}
