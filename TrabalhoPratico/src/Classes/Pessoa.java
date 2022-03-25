package Classes;

import java.util.Date;
import java.util.Scanner;

public  abstract class Pessoa {
	//Pessoa vai herdar tudo pra usuario
	//Atributos
	private String nome;
	private double telefone;
	private double identidade;
	private String cpf;
	private Date dataNascimento;
	private int idade;
	
	private int opcaoMenu; //Utilizarei para o menu de ediçoes.
	private Usuario usuario;
	private Scanner ler = new Scanner (System.in); // Utilizarei para fazer os metodos.*/
	
	
	//precisamos arrumar os metodos da classe pessoa tbm, ter uma lista de pessoas pre cadastradas e em vetor.
	//usuario vai corresponder as mesmas pessoas do vetor de pessoas...pessoa[a]==usuario[a] e etc
	
	//Construtor
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome,double telefone, double identidade, String cpf,
			Date nascimento, int idade) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.identidade = identidade;
		this.cpf = cpf;
		this.dataNascimento = nascimento;
		this.idade = idade;
	}
	
	//Gets e Sets
	//Precisa ver os retornos para testar.
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
	
	//E interessante cadastrar cada pessoa como um vetor e que os usuarios sejam cadastrados na mesma posicao.
	
	// Pra Main tudo q tá em baixo
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		usuario.cadastrarUsuario();
	}
	//Metodos
	public void cadastrarPessoa() {  //Cadastro dos dados basicos das pessoas que será herdado pra classe usuario.
		
		Boolean validaNome = true; 
		String respostaNome;
		Boolean validaCpf = true;
		String respostaCpf;
		Boolean validaTel = true;
		Double respostaTel;
		Boolean validaRg = true;
		Double respostaRg;
		Boolean validaIdade = true;
		int respostaIdade;
		
		//Validando nome.
		System.out.println("Digite seu nome:");
		System.out.println("Insira letras minusculas apenas.");
		setNome(ler.nextLine());
			//Validando nome, somente letras
		respostaNome = getNome();
		if(!respostaNome.substring(0).matches("[a-z]*")) { //Verificando se nao e nulo e so tem letras
			validaNome = false;
			do {
				System.out.println("Erro, digite um nome com apenas letras minusculas");
				setNome(ler.nextLine());
					//Validando nome, somente letras
				respostaNome = getNome();
				if(!respostaNome.substring(0).matches("[a-z]*")) { //Verificando se nao e nulo e so tem letras
					validaNome = false;
				}	
				
			}while(validaNome == false); //Ficarei no looping ate digitar um nome valido
		}
		
		//Validando CPF.
		System.out.print("Digite seu CPF:");
		System.out.println("Somente numeros");
		setCpf(ler.nextLine());
			//Validando CPF, se so tem numeros e a quantidade certa.
		respostaCpf = getCpf();
		if(respostaCpf.length() != 11) { //Verificando se tem apenas numeros e se tem 11 digitos
			validaCpf = false; //Nao tem 11 digitos e ou nao tem apenas numeros.
			do {
				System.out.println("Erro, um CPF precisa ter 11 digitos e apenas numeros.");
				System.out.print("Digite seu CPF:");
				System.out.println("Somente numeros");
				setCpf(ler.nextLine());
				respostaCpf = getCpf();
				if(respostaCpf.length() != 11) { //Verificando se tem apenas numeros e se tem 11 digitos
					validaCpf = false; //Nao tem 11 digitos e ou nao tem apenas numeros.
				}
				
			}while(validaCpf = false); //Ficarei no looping ate digitar um CPF valido.	
		}
		
		//Pra arrumar, transformar em string
		//Validando Telefone
		System.out.print("Digite seu telefone:");
		System.out.println("Somente os numeros, insira o 9 mas não bote o DDD  ");
		setTelefone(ler.nextDouble());
		respostaTel = getTelefone();
		if(respostaTel.length() != 9) { //Verificando se tem os 9 digitos
			validaTel = false; //Nao temos 9 digitos
			do {
				System.out.println("Erro, um telefone e composto por 9 numeros.");
				System.out.print("Digite seu telefone:");
				System.out.println("Somente os numeros, insira o 9 mas não bote o DDD  ");
				setTelefone(ler.nextDouble());
				respostaTel = getTelefone();
				if(respostaTel.length() != 9) { //Verificando se tem os 9 digitos e todos numeros
					validaTel = false; //Nao temos 9 digitos
				}
			}while(validaTel = false); //Enquanto nao receber um telefone valido ficarei nesse looping
			
		}
		
		//Validade a Identidade
		System.out.println("Digite seu RG:");
		System.out.println("Somente os numeros");
		setIdentidade(ler.nextDouble());
		respostaRg = getIdentidade();
		if(respostaRg.length() != 7) { //Verificando se tenho 7 digitos e todos numeros
			validaRg = false; //Nao temos 7 digitos
			do {
				System.out.println("Erro, um RG e composto por 7 numeros");
				System.out.println("Digite seu RG:");
				System.out.println("Somente os numeros");
				setIdentidade(ler.nextDouble());
				respostaRg = getIdentidade();
				if(respostaRg.length() != 7) { //Verificando se tenho 7 digitos e todos numeros
					validaRg = false; //Nao temos 7 digitos
				}
			}while(validaRg == false); //Enquanto nao tivermos um RG valido ficaremos nesse looping
		}
		
		//Validando a idade
		System.out.print("Digite sua idade: ");
		setIdade(ler.nextInt());
		respostaIdade = getIdade();
		if(!respostaIdade.substring(0).matches("[1-9]+")) { //Verificando se tenho apenas numeros.
			validaIdade = false; //Tenho letras e simbolos.
			do {
				System.out.println("Erro, a idade e composta apenas por numeros inteiros");
				System.out.print("Digite sua idade: ");
				setIdade(ler.nextInt());
				respostaIdade = getIdade();
				if(!respostaIdade.substring(0).matches("[1-9]+")) { //Verificando se tenho apenas numeros.
					validaIdade = false; //Tenho letras e simbolos.
				}
				
			}while(validaIdade == false); //Ficarei no looping ate digitar uma idade valida
			
		}
		//System.out.print("Digite sua data de Nascimento: ");
		//setDataNascimento(ler.nextDate()); //Preciso descobrir como se faz pra datas.
		//setUsuario(usuario);// Chama funcao que edita o usuario
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