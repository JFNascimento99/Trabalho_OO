package Classes;


import java.util.Scanner;

public  abstract class Pessoa {
	//Pessoa vai herdar tudo pra usuario
	//Atributos
	private String nome;
	private String telefone;
	private String identidade;
	private String cpf;
	private String idade;
	
	private Usuario usuario;
	private Scanner ler = new Scanner (System.in); // Utilizarei para fazer os metodos.*/
	
	//Variaveis extra:
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
	
	
	//precisamos arrumar os metodos da classe pessoa tbm, ter uma lista de pessoas pre cadastradas e em vetor.
	//usuario vai corresponder as mesmas pessoas do vetor de pessoas...pessoa[a]==usuario[a] e etc
	
	//Construtor
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome,String telefone, String identidade, String cpf,String idade) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.identidade = identidade;
		this.cpf = cpf;
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
		if(respostaCpf.length() != 11) { //Verificando se temos 11 digitos
			validaCpf = false; //Nao tem 11 digitos e ou nao tem apenas numeros.
			do {
				System.out.println("Erro, um CPF precisa ter 11 digitos e apenas numeros.");
				System.out.print("Digite seu CPF:");
				System.out.println("Somente numeros");
				setCpf(ler.nextLine());
				respostaCpf = getCpf();
				if(respostaCpf.length() != 11) { //Verificando  se tem 11 digitos
					validaCpf = false; //Nao tem 11 digitos 
				}
				
			}while(validaCpf = false); //Ficarei no looping ate digitar 11 digitos
		}
		if(!respostaCpf.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros
			validaCpf = false;
			do {
				System.out.println("Erro, um CPF precisa ter 11 digitos e apenas numeros.");
				System.out.print("Digite seu CPF:");
				System.out.println("Somente numeros");
				setCpf(ler.nextLine());
				respostaCpf = getCpf();
				if(!respostaCpf.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros
					validaCpf = false;
				}
			}while(validaCpf == false); //Ficarei nesse looping ate digitar apenas numeros 
		}
	
		//Validando Telefone
		System.out.print("Digite seu telefone:");
		System.out.println("Somente os numeros, um telefone tem 9 numeros  ");
		setTelefone(ler.next());
		respostaTel = getTelefone();
		if(respostaTel.length() != 9) { //Verificando se tem os 9 digitos
			validaTel = false; //Nao temos 9 digitos
			do {
				System.out.println("Erro, um telefone e composto por 9 numeros.");
				System.out.print("Digite seu telefone:");
				System.out.println("Somente os numeros, insira o 9 mas não bote o DDD  ");
				setTelefone(ler.next());
				respostaTel = getTelefone();
				if(respostaTel.length() != 9) { //Verificando se tem os 9 digitos 
					validaTel = false; //Nao temos 9 digitos
				}
			}while(validaTel = false); //Enquanto nao receber 9 digitos
			
		}
		if(!respostaTel.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros
			validaTel = false;
			do {
				System.out.println("Erro, um telefone e composto por 9 numeros.");
				System.out.print("Digite seu telefone:");
				System.out.println("Somente os numeros, insira o 9 mas não bote o DDD  ");
				setTelefone(ler.next());
				respostaTel = getTelefone();
				if(!respostaTel.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros
					validaTel = false;
				}
			}while(validaTel == false); //Ficarei nesse looping ate por apenas numeros
		}
		
		//Validade a Identidade
		System.out.println("Digite seu RG:");
		System.out.println("Somente os numeros");
		setIdentidade(ler.next());
		respostaRg = getIdentidade();
		if(respostaRg.length() != 7) { //Verificando se tenho 7 digitos 
			validaRg = false; //Nao temos 7 digitos
			do {
				System.out.println("Erro, um RG e composto por 7 numeros");
				System.out.println("Digite seu RG:");
				System.out.println("Somente os numeros");
				setIdentidade(ler.next());
				respostaRg = getIdentidade();
				if(respostaRg.length() != 7) { //Verificando se tenho 7 digitos e todos numeros
					validaRg = false; //Nao temos 7 digitos
				}
			}while(validaRg == false); //Enquanto nao tivermos 7 numeros ficaremos nesse looping
		}
		if(!respostaRg.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros
			validaRg = false;
			System.out.println("Erro, um RG e composto por 7 numeros");
			System.out.println("Digite seu RG:");
			System.out.println("Somente os numeros");
			setIdentidade(ler.next());
			respostaRg = getIdentidade();
			if(!respostaRg.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros
				validaRg = false;
			}
		}
		
		//Validando a idade
		System.out.print("Digite sua idade: ");
		setIdade(ler.next());
		respostaIdade = getIdade();
		if(!respostaIdade.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros.
			validaIdade = false; //Tenho letras e simbolos.
			do {
				System.out.println("Erro, a idade e composta apenas por numeros inteiros");
				System.out.print("Digite sua idade: ");
				setIdade(ler.next());
				respostaIdade = getIdade();
				if(!respostaIdade.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros.
					validaIdade = false; //Tenho letras e simbolos.
				}
				
			}while(validaIdade == false); //Ficarei no looping ate digitar uma idade valida
			
		}
		System.out.println("Cadastrado com sucesso");
	}
	public void editarPessoa() { //Editar os dados da pessoa em questão, e consequentemente alterando em usuario
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
				if(respostaCpf.length() != 11) { //Verificando se temos 11 digitos
					validaCpf = false; //Nao tem 11 digitos e ou nao tem apenas numeros.
					do {
						System.out.println("Erro, um CPF precisa ter 11 digitos e apenas numeros.");
						System.out.print("Digite seu CPF:");
						System.out.println("Somente numeros");
						setCpf(ler.nextLine());
						respostaCpf = getCpf();
						if(respostaCpf.length() != 11) { //Verificando  se tem 11 digitos
							validaCpf = false; //Nao tem 11 digitos 
						}
						
					}while(validaCpf = false); //Ficarei no looping ate digitar 11 digitos
				}
				if(!respostaCpf.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros
					validaCpf = false;
					do {
						System.out.println("Erro, um CPF precisa ter 11 digitos e apenas numeros.");
						System.out.print("Digite seu CPF:");
						System.out.println("Somente numeros");
						setCpf(ler.nextLine());
						respostaCpf = getCpf();
						if(!respostaCpf.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros
							validaCpf = false;
						}
					}while(validaCpf == false); //Ficarei nesse looping ate digitar apenas numeros 
				}
			
				//Validando Telefone
				System.out.print("Digite seu telefone:");
				System.out.println("Somente os numeros, um telefone tem 9 numeros  ");
				setTelefone(ler.next());
				respostaTel = getTelefone();
				if(respostaTel.length() != 9) { //Verificando se tem os 9 digitos
					validaTel = false; //Nao temos 9 digitos
					do {
						System.out.println("Erro, um telefone e composto por 9 numeros.");
						System.out.print("Digite seu telefone:");
						System.out.println("Somente os numeros, insira o 9 mas não bote o DDD  ");
						setTelefone(ler.next());
						respostaTel = getTelefone();
						if(respostaTel.length() != 9) { //Verificando se tem os 9 digitos 
							validaTel = false; //Nao temos 9 digitos
						}
					}while(validaTel = false); //Enquanto nao receber 9 digitos
					
				}
				if(!respostaTel.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros
					validaTel = false;
					do {
						System.out.println("Erro, um telefone e composto por 9 numeros.");
						System.out.print("Digite seu telefone:");
						System.out.println("Somente os numeros, insira o 9 mas não bote o DDD  ");
						setTelefone(ler.next());
						respostaTel = getTelefone();
						if(!respostaTel.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros
							validaTel = false;
						}
					}while(validaTel == false); //Ficarei nesse looping ate por apenas numeros
				}
				
				//Validade a Identidade
				System.out.println("Digite seu RG:");
				System.out.println("Somente os numeros");
				setIdentidade(ler.next());
				respostaRg = getIdentidade();
				if(respostaRg.length() != 7) { //Verificando se tenho 7 digitos 
					validaRg = false; //Nao temos 7 digitos
					do {
						System.out.println("Erro, um RG e composto por 7 numeros");
						System.out.println("Digite seu RG:");
						System.out.println("Somente os numeros");
						setIdentidade(ler.next());
						respostaRg = getIdentidade();
						if(respostaRg.length() != 7) { //Verificando se tenho 7 digitos e todos numeros
							validaRg = false; //Nao temos 7 digitos
						}
					}while(validaRg == false); //Enquanto nao tivermos 7 numeros ficaremos nesse looping
				}
				if(!respostaRg.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros
					validaRg = false;
					System.out.println("Erro, um RG e composto por 7 numeros");
					System.out.println("Digite seu RG:");
					System.out.println("Somente os numeros");
					setIdentidade(ler.next());
					respostaRg = getIdentidade();
					if(!respostaRg.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros
						validaRg = false;
					}
				}
				
				//Validando a idade
				System.out.print("Digite sua idade: ");
				setIdade(ler.next());
				respostaIdade = getIdade();
				if(!respostaIdade.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros.
					validaIdade = false; //Tenho letras e simbolos.
					do {
						System.out.println("Erro, a idade e composta apenas por numeros inteiros");
						System.out.print("Digite sua idade: ");
						setIdade(ler.next());
						respostaIdade = getIdade();
						if(!respostaIdade.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros.
							validaIdade = false; //Tenho letras e simbolos.
						}
						
					}while(validaIdade == false); //Ficarei no looping ate digitar uma idade valida
					
				}
				System.out.println("Cadastrado com sucesso");
	}
	public void deletaPessoa() {// Zerando todos os dados da pessoa/Usuario
		setCpf(null);
		setNome(null);
		setIdentidade(null); //Preciso descobrir como se faz pra esses dois.
		setTelefone(null);
		setUsuario(null);
		System.out.println("Usuario deletado com sucesso.");
	}

}