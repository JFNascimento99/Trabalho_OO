package Classes;
import java.util.Scanner;
import java.util.Date;

public class Bicicleta {
	//Bicicleta faz parte de bicicletario...agregação pois podem viver separadas.
	//Bicicleta faz parte de pedido de forma obrigatoria...composição pois sem bicicleta sem pedido.
	//Atributos de bicicleta
	
	public String Bicicleta[][]; //Um e a posicao em relacao aos bicicletarios e outro em relacao as bicicletas
	
	private String tipoBicicleta;
	private String nomeBicicleta;
	private boolean disponibilidadeBicicleta;
	
	static Scanner ler = new Scanner(System.in);
	//Variaveis extra:
	String respostaTipo;
	String respostaId;
	Boolean validaTipo = true;
	Boolean validaId = true;
	
	//Metodo construtor da Bicicleta
	public Bicicleta(String nomeBicicleta, String tipoBicicleta, boolean disponibilidadeBicicleta) {
		this.nomeBicicleta = nomeBicicleta;
		this.tipoBicicleta = tipoBicicleta;
		this.disponibilidadeBicicleta = disponibilidadeBicicleta;
	}
	
	//Getters & Setters
	//Ver os retornos para podermos ir testando
	public String getTipoBicicleta() {
		return tipoBicicleta;
	}
	public void setTipoBicicleta(String tipoBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
	}
	public boolean isDisponibilidadeBicicleta() {
		return disponibilidadeBicicleta;
	}
	public void setDisponibilidadeBicicleta(boolean disponibilidadeBicicleta) {
		this.disponibilidadeBicicleta = disponibilidadeBicicleta;
	}
	public String getNomeBicicleta() {
		return nomeBicicleta;
	}
	public void setNomeBicicleta(String nomeBicicleta) {
		this.nomeBicicleta = nomeBicicleta;
	}
	//Metodos
	public void cadastrarBicicleta() { //Cadastrar as bicicletas que teremos
		//Precisamos arrumar em vetor aee
		
		//Validando o ID da bicicleta
		System.out.println("Insira o ID desejado para a nova Bicicleta.");
		setNomeBicicleta(ler.next());
		respostaId = getNomeBicicleta();
		if(!respostaId.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros
			validaId = false;
			do {
				System.out.println("Erro, insira o numero desejado para seu ID.");
				System.out.println("Insira o ID desejado para a nova Bicicleta.");
				setNomeBicicleta(ler.next());
				respostaId = getNomeBicicleta();
				if(!respostaId.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros
					validaId = false;
				}
			}while(validaId == false); //Ficarei nesse looping ate insirar um numero
		}
		
		//Validando o tipo de bicicleta
		System.out.println("Insira o tipo da Bicicleta:");
		System.out.println("As bicicletas podem ser: " + "Normal ou" + "Eletrica");
		setTipoBicicleta(ler.next());
		respostaTipo = getTipoBicicleta();
		if(respostaTipo.contains("Normal")||respostaTipo.contains("Eletrica")) { //Verificando se o usuario digitou os dois tipos de bicicletas que temos
			validaTipo = false;
			do {
				System.out.println("Erro, insira Normal ou Eletrica.");
				System.out.println("Insira o tipo da Bicicleta:");
				System.out.println("As bicicletas podem ser: " + "Normal ou" + "Eletrica");
				setTipoBicicleta(ler.next());
				respostaTipo = getTipoBicicleta();
				if(respostaTipo.contains("Normal")||respostaTipo.contains("Eletrica")) { //Verificando se o usuario digitou os dois tipos de bicicletas que temos
					validaTipo = false;
				}
			}while(validaTipo == false); //Ficaremos nesse looping ate digitar um tipo valido de bicicletas
		}
		
		
	}
	public void editarBicicletas() { //Editar as bicicletas que teremos
		//Precisamos arrumar em vetor para escolher qual bicicleta editar
		
		//Validando o ID da bicicleta
				System.out.println("Insira o ID desejado para a nova Bicicleta.");
				setNomeBicicleta(ler.next());
				respostaId = getNomeBicicleta();
				if(!respostaId.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros
					validaId = false;
					do {
						System.out.println("Erro, insira o numero desejado para seu ID.");
						System.out.println("Insira o ID desejado para a nova Bicicleta.");
						setNomeBicicleta(ler.next());
						respostaId = getNomeBicicleta();
						if(!respostaId.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros
							validaId = false;
						}
					}while(validaId == false); //Ficarei nesse looping ate insirar um numero
				}
				
				//Validando o tipo de bicicleta
				System.out.println("Insira o tipo da Bicicleta:");
				System.out.println("As bicicletas podem ser: " + "Normal ou" + "Eletrica");
				setTipoBicicleta(ler.next());
				respostaTipo = getTipoBicicleta();
				if(respostaTipo.contains("Normal")||respostaTipo.contains("Eletrica")) { //Verificando se o usuario digitou os dois tipos de bicicletas que temos
					validaTipo = false;
					do {
						System.out.println("Erro, insira Normal ou Eletrica.");
						System.out.println("Insira o tipo da Bicicleta:");
						System.out.println("As bicicletas podem ser: " + "Normal ou" + "Eletrica");
						setTipoBicicleta(ler.next());
						respostaTipo = getTipoBicicleta();
						if(respostaTipo.contains("Normal")||respostaTipo.contains("Eletrica")) { //Verificando se o usuario digitou os dois tipos de bicicletas que temos
							validaTipo = false;
						}
					}while(validaTipo == false); //Ficaremos nesse looping ate digitar um tipo valido de bicicletas
				}
				System.out.println("Bicicleta editada com sucesso");
	}
	public void deletarBicicletas() { //Resetar as biclcetas escolhidas pelo usuario
		//Zerando todos os dados cadastrados pras bicicletas
		setTipoBicicleta(null); 
		setDisponibilidadeBicicleta(true); //Corrigir esses erros; teoricamente ta certo agora
		
	}
	public void atualizarBicicletas() { //Atualizar as bicicletas que forem editadas e cadastradas
		System.out.println("Id:" + getNomeBicicleta());
		System.out.println("Tipo:" + getTipoBicicleta());
	}
	public void verBicicletas() { //Listar/ ver as bicicletas cadastradas
		System.out.println("Bicicleta 1"); 
		 System.out.println( "Tradiconal "); 
		   
		 System.out.println("Bicicleta 2"); 
		 System.out.println("Tradicional "); 
		   
		 System.out.println("Bicicleta 3 "); 
		 System.out.println( "Tradicional "); 
		   
		 System.out.println("Bicicleta 4"); 
		 System.out.println("Tradicional "); 
		 
		 System.out.println("Bicicleta 5 "); 
		 System.out.println( "Tradicional "); 
		   
		   
		 System.out.println("Bicicleta 6 "); 
		 System.out.println( "Tradicional "); 
		   
		 System.out.println("Bicicleta 7 "); 
		 System.out.println( "Tradicional "); 
		   
		 System.out.println("Bicicleta 8 "); 
		 System.out.println( "Tradicional "); 
		   
		 System.out.println("Bicicleta 9"); 
		 System.out.println( "Tradicional "); 
		   
		 System.out.println("Bicicleta 10 "); 
		 System.out.println( "Tradicional "); 
		 
		 //Bicicletas Eletricas
		   
		  System.out.println("Bicicleta 11 "); 
		  System.out.println( "Eletrica "); 
		   
		  System.out.println("Bicicleta 12"); 
		  System.out.println( "Eletrica "); 
		   
		  System.out.println("Bicicleta 13 "); 
		  System.out.println( "Eletrica "); 
		   
		  System.out.println("Bicicleta 14 "); 
		  System.out.println( "Eletrica "); 
		   
		  System.out.println("Bicicleta 15 "); 
		  System.out.println( "Eletrica "); 
		  
		  System.out.println("Bicicleta 16 "); 
		  System.out.println( "Eletrica "); 
		   
		  System.out.println("Bicicleta 17 "); 
		  System.out.println( "Eletrica "); 
		   
		  System.out.println("Bicicleta 18 "); 
		  System.out.println( "Eletrica "); 
		   
		  System.out.println("Bicicleta 19 "); 
		  System.out.println( "Eletrica "); 
		   
		  System.out.println("Bicicleta 20 "); 
		  System.out.println( "Eletrica "); 
		
	}
	public void buscarBicicletas() { 
		  //buscar todas bicicletas cadastradas...talvez fosse mais interessante o usuario digitar, agt comparar texto e mostrar se achar. 
		  //Precisamos que cada bicicleta seja armazenado em uma posicao do vetor(por isso que vai ta dando esse erro ali embaixo por enquanto)
		
		String buscaBicicleta = ""; //Utilizaremos para comparar oq o usuario digitou com o que estava armazenado
		Boolean encontradoBicicleta = false; //Para vermos se achamos a bicicleta procurada.
		Scanner resposta = new Scanner(System.in); //Leitura de dados
		
		//Logica de busca que usei no meu TP1
		for(int a=0; a<=100; a++){ //Passando por todo vetor de bicicletarios 
			   System.out.println("Digite o bicicletario que se deseja buscar as Bicicletas:"); 
			   buscaBicicleta = resposta.next(); //Lendo o bicicletario desejado. 
			    if(Bicicleta[a].equals(buscaBicicleta)) {  //Devemos arrumar e ter esse vetor de s. 
			     System.out.println("Na posicao: " + a + " foi encontrado " + Bicicleta[a]); //Mostrando os dados que foram achados para esse bicicletario 
			     encontradoBicicleta = true; //A palavra digitada foi igual a alguma armazenada, logo existe o bicicletario 
			     for(int b=0; b<=100; b++) { //Passando agora por todo vetor de bicicletas.
			    	 System.out.println("Digite a bicicleta que se deseja buscar:");
			    	 buscaBicicleta = resposta.next(); //Lendo a bicicleta que o usuario quer buscar (se pah ler o numero dela é melhor)
			    	 if(Bicicleta[a][b].equals(buscaBicicleta)) { //Comparando o que foi digitado com o que tinhamos armazenado
			    		 System.out.println("Na posicao: " + b + "foi encontrado " + Bicicleta[a][b]);
			    		 encontradoBicicleta = true;
			    	 }
			    	 if(!encontradoBicicleta) {
			    		 System.out.println("Na estacao escolhida, nao ha a bicicleta buscada");
			    	 }
			     }
			    } 
			    
			  } 
			  if(!encontradoBicicleta) { //Caso oq for digitado nao for igual ao que tinhamos armazenado 
			   System.out.println("Este bicicletario nao existe ainda "); 
			  } 
		   
		
		 } 
		 public void listarBicicletas() { 
		  //Listar todas as bicicletas cadastrados...essas pre cadastradas e os que o usuario adicionar. 
			 System.out.println("Bicicleta 1"); 
			 System.out.println( "Tradiconal "); 
			   
			 System.out.println("Bicicleta 2"); 
			 System.out.println("Tradicional "); 
			   
			 System.out.println("Bicicleta 3 "); 
			 System.out.println( "Tradicional "); 
			   
			 System.out.println("Bicicleta 4"); 
			 System.out.println("Tradicional "); 
			 
			 System.out.println("Bicicleta 5 "); 
			 System.out.println( "Tradicional "); 
			   
			   
			 System.out.println("Bicicleta 6 "); 
			 System.out.println( "Tradicional "); 
			   
			 System.out.println("Bicicleta 7 "); 
			 System.out.println( "Tradicional "); 
			   
			 System.out.println("Bicicleta 8 "); 
			 System.out.println( "Tradicional "); 
			   
			 System.out.println("Bicicleta 9"); 
			 System.out.println( "Tradicional "); 
			   
			 System.out.println("Bicicleta 10 "); 
			 System.out.println( "Tradicional "); 
			 
			 //Bicicletas Eletricas
			   
			  System.out.println("Bicicleta 11 "); 
			  System.out.println( "Eletrica "); 
			   
			  System.out.println("Bicicleta 12"); 
			  System.out.println( "Eletrica "); 
			   
			  System.out.println("Bicicleta 13 "); 
			  System.out.println( "Eletrica "); 
			   
			  System.out.println("Bicicleta 14 "); 
			  System.out.println( "Eletrica "); 
			   
			  System.out.println("Bicicleta 15 "); 
			  System.out.println( "Eletrica "); 
			  
			  System.out.println("Bicicleta 16 "); 
			  System.out.println( "Eletrica "); 
			   
			  System.out.println("Bicicleta 17 "); 
			  System.out.println( "Eletrica "); 
			   
			  System.out.println("Bicicleta 18 "); 
			  System.out.println( "Eletrica "); 
			   
			  System.out.println("Bicicleta 19 "); 
			  System.out.println( "Eletrica "); 
			   
			  System.out.println("Bicicleta 20 "); 
			  System.out.println( "Eletrica "); 
		 }

}