package Classes;
import java.util.Scanner;
import java.util.Date;

public class Bicicletario {
	//Bicicleta faz parte de bicicletario...bicicleta está agregada a bicicletario.
	//Atributos
	private String chegada;
	private String saida;
	public String Bicicletario[];
	
	//Outras variaveis:
	String respostaChegada;
	String respostaSaida;
	Boolean validaChegada = true;
	Boolean validaSaida = true;
	
	
	static Scanner ler = new Scanner(System.in);
	
	//Metodo construtor do Bicicletario
	public Bicicletario(String chegada, String saida) {
		this.chegada = chegada;
		this.saida = saida;
	}
	//Gets and sets.
	//Ver os retornos para poder testar 
	public String getChegada() {
		return chegada;
	}

	public void setChegada(String chegada) {
		this.chegada = chegada;
	}

	public String getSaida() {
		return saida;
	}

	public void setSaida(String saida) {
		this.saida = saida;
	}
	
	//Metodos
	//Verificar se é tudo void mesmo
	public static Boolean verificaCheckIn(String respostaChegada) {
			if(respostaChegada.equals(Bicicletarios)) { //Comparando com os bicicletarios existentes
				return  false;
			}
	}
	public static Boolean verificaCheckOut(String respostaSaida) {
			if(respostaSaida.equals(Bicicletarios)) { //Comparando com os bicicletarios existentes
				return false;
			}
	}
	public void editarBicletario() {
		//Editar os locais cadastrados
		 
		//Se der ruim pega daqui dnv
		for(int a = 0; a<=100; a++) { //Vetor de bicicletarios
			System.out.println("Cadastrar lugar de checkin ");
			setChegada(ler.next());
			respostaChegada = getChegada();
			if(respostaChegada.equals(Bicicletario[a])) { //Comparando com os bicicletarios existentes
				validaChegada = false;
				do {
					System.out.println("Erro, insira um bicicletario valido");
					System.out.println("Cadastrar lugar de checkin ");
					setChegada(ler.next());
					respostaChegada = getChegada();
					if(respostaChegada.equals(Bicicletario[a])) { //Comparando com os bicicletarios existentes
						validaChegada = false;
					}
				}while(validaChegada == false); //Ficarei nesse looping ate digitar um local existente
			}
		}
		
		
				//Validando lugar de Checkout
				for(int a = 0; a<=100; a++) { //Vetor de bicicletarios
					System.out.println("Cadastrar lugar de checkout");
					setSaida(ler.next());
					respostaSaida = getSaida();
					if(respostaSaida.equals(Bicicletario[a])) { //Comparando com os bicicletarios existentes
						validaSaida = false;
						do {
							System.out.println("Erro, insira um bicicletario valido");
							System.out.println("Cadastrar lugar de checkin ");
							setSaida(ler.next());
							respostaSaida = getSaida();
							if(respostaSaida.equals(Bicicletario[a])) { //Comparando com os bicicletarios existentes
								validaSaida = false;
							}
						}while(validaSaida == false); //Ficarei nesse looping ate digitar um local existente
				  }
				}
	}
	public void deletarBicicletario() {
		//Resetar os dados cadastrados
			setChegada(null); //
			setSaida(null);
		
	}
	public void atualizarBicicletario() {
		//Atualizar os bicicletarios que foram editados
		System.out.println("Lugar de Check-in"+getChegada());
		System.out.println("Lugar de Check-out"+getSaida());
	}
	public void buscarBicicletario() { 
		  //buscar todos bicicletarios cadastrados...talvez fosse mais interessante o usuario digitar, agt comparar texto e mostrar se achar. 
		  //Precisamos que cada bicicletario seja armazenado em uma posicao do vetor(por isso que vai ta dando esse erro ali embaixo por enquanto) 
		  //Seria legal fora o horario, mostrar as bicicletas cadastradas tbm. 
		   
		  String procuraBicicletario =""; //Utilizaremos para comparar o que o usuario digitou com o que temos armazenado. 
		  Boolean encontrado = false; //Para vermos se achamos o bicicletario procurado 
		  Scanner resposta = new Scanner(System.in); //Leitura de dados  
		  
		  //Logica de busca que usei no meu TP1. 
		  for(int a=0; a<=100; a++){ //Passando por todo vetor de bicicletarios 
		   System.out.println("Digite o bicicletario que se deseja buscar:"); 
		   procuraBicicletario = resposta.next(); //Lendo o bicicletario desejado. 
		    if(Bicicletario[a].equals(procuraBicicletario)) {  //Devemos arrumar e ter esse vetor de bicicletarios. 
		     System.out.println("Na posicao: " + a + " foi encontrado " + Bicicletario[a]); //Mostrando os dados que foram achados para esse bicicletario 
		     encontrado = true; //A palavra digitada foi igual a alguma armazenada, logo existe o bicicletario 
		    } 
		    
		  } 
		  if(!encontrado) { //Caso oq for digitado nao for igual ao que tinhamos armazenado 
		   System.out.println("Este bicicletario nao existe ainda "); 
		  } 
		   
		 } 
	public void listarBicicletarios() {
		 //Listar todos os bicicletrarios cadastrados...esses pre cadastrados e os que o usuario adicionar. 
		  //Mostrar somente os bicicletarios mesmo. 
		  //Colocando as que estavam na main já. 
		   
		  //Bicicletarios da Asa norte 
		  System.out.println("Asa Norte: SQN 116 "); 
		  System.out.println( "Horarios: Atendimento 24 horas. "); 
		   
		  System.out.println("Asa Norte: SQN 114"); 
		  System.out.println("Horarios: Atendimento 24 horas. "); 
		   
		  System.out.println("Asa Norte: SQN 112 "); 
		  System.out.println( "Horarios: Atendimento 24 horas. "); 
		   
		  System.out.println("Asa Norte: SQN 110"); 
		  System.out.println("Horarios:Atendimento 24 horas. "); 
		  System.out.println("Asa Norte: SQN 108 "); 
		  System.out.println( "Horarios: Atendimento 24 horas. "); 
		   
		  //Bicicletarios da Asa Sul 
		   
		  System.out.println("Asa Sul: SQS 116 "); 
		  System.out.println( "Horarios: Atendimento 24 horas. "); 
		   
		  System.out.println("Asa Sul: SQS 114 "); 
		  System.out.println( "Horarios: Atendimento 24 horas. "); 
		   
		  System.out.println("Asa Sul: SQS 112 "); 
		  System.out.println( "Horarios: Atendimento 24 horas. "); 
		   
		  System.out.println("Asa Sul: SQS 110 "); 
		  System.out.println( "Horarios: Atendimento 24 horas. "); 
		   
		  System.out.println("Asa Sul: SQS 108 "); 
		  System.out.println( "Horarios: Atendimento 24 horas. "); 
		 
	}
	
}
