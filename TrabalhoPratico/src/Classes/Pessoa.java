import java.util.Date;
import java.util.Scanner;
public class Pessoa {
	//Atributos
	private String nome;
	private double telefone;
	private double identidade;
	private String cpf;
	private Date dataNascimento;
	private int idade;
	private int opcaoMenu; //Utilizarei para o menu de ediçoes.
	private Usuario usuario;
	private Scanner ler = new Scanner (System.in); // Utilizarei para fazer os metodos.
	//Construtor
	public Pessoa(String n,double t, double rg, String c, Date nascimento, int anos) {
		nome=n;
		telefone=t;
		identidade=rg;
		cpf=c;
		dataNascimento=nascimento;
		idade=anos;
	}
	//Gets e Sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getTelefone() {
		return telefone;
	}
	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}
	public double getIdentidade() {
		return identidade;
	}
	public void setIdentidade(double identidade) {
		this.identidade = identidade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		usuario.cadastrarUsuario();
	}
	//Metodos
	public void cadastrarPessoa() {  //Cadastro dos dados basicos das pessoas que será herdado pra classe usuario.
		System.out.print("\nDigite seu nome:");
		setNome(ler.nextLine());
		System.out.print("Digite seu CPF:");
		setCpf(ler.nextLine());
		System.out.print("Digite seu telefone:");
		setTelefone(ler.nextDouble());
		System.out.println("Digite seu RG:");
		setIdentidade(ler.nextDouble());
		System.out.print("Digite sua idade: ");
		setIdade(ler.nextInt());
		System.out.print("Digite sua data de Nascimento: ");
		setDataNascimento(ler.nextDate()); //Preciso descobrir como se faz pra datas.
		setUsuario(usuario);// Chama funcao que edita o usuario
		System.out.println("\nPressione Enter para continuar...");
		ler.nextLine();
	}
	public void editarPessoa() { //Editar os dados da pessoa em questão, e consequentemente alterando em usuario
		System.out.println("Digite a opcao que se deseja editar: \n");
		System.out.println(" 1 - Nome \n");
		System.out.println(" 2 - Telefone \n");
		System.out.println(" 3 - Idade \n");
		System.out.println(" 4 - Email \n");
		System.out.println(" 5 - Senha \n");
		opcaoMenu = ler.nextInt(); //Lendo a opcao desejada pelo usuario
		if(opcaoMenu < 1 ||opcaoMenu>5) { //Não existe essas opcoes.
			System.out.println("Ops, não existe essa opcao. \n");
		}else {
			if(opcaoMenu==1) {
				System.out.print("Digite seu nome:");
				setNome(ler.nextLine());
				System.out.println("Nome alterado com sucesso.");
			}else if(opcaoMenu==2) {
				System.out.print("Digite seu novo telefone:");
				setTelefone(ler.nextInt());
				System.out.println("Telefone alterado com sucesso.");
			}else if(opcaoMenu==3) {
				System.out.println("Digite sua idade:");
				setIdade(ler.nextInt());
				System.out.print("Idade alterada com sucesso.");	
			}else if(opcaoMenu==4) {
				System.out.print("Digite seu Email:");
				Usuario.setEmail(ler.nextLine());
				System.out.println("Email alterado com sucesso.");
			}else if(opcaoMenu==5) {
				System.out.print("Digite sua Senha:");
				Usuario.setSenha(ler.nextLine());
				System.out.println("Senha alterada com sucesso.");
			}
		}
	}
	public void deletaPessoa() {// Zerando todos os dados da pessoa/Usuario
		setCpf(null);
		setNome(null);
		setIdentidade(null); //Preciso descobrir como se faz pra esses dois.
		setTelefone(null);
		setUsuario(null);
		System.out.println("\nUsuario deletado com sucesso.");
		System.out.println("\nPressione Enter para continuar...");
		ler.nextLine();
	}

}
