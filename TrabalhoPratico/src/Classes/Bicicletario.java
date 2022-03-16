package Classes;
import java.util.Scanner;
import java.util.Date;

public class Bicicletario {
	//Bicicleta faz parte de bicicletario...bicicleta está agregada a bicicletario.
	//Atributos
	private String endereco;
	private String quadra;
	public String Bicicletario[];
	static Scanner ler = new Scanner(System.in);
	
	//Metodo construtor do Bicicletario
	public Bicicletario(String endereco, String quadra) {
		this.endereco = endereco;
		this.quadra = quadra;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getQuadra() {
		return quadra;
	}

	public void setQuadra(String quadra) {
		this.quadra = quadra;
	}
	
	//Metodos
	//Verificar se é tudo void mesmo
	public void cadastrarBicicletario() {
		//Cadastrar os locais onde se pode pegar ou deixar bicicletas.
		//Deveremos ter estacoes pre cadastradas.
		
		//Ele vai poder cadastrar onde quer sair ou chegar de acordo com as estacoes pre cadastradas.
		System.out.println("Cadastrar lugar de checkin ");
		setEndereco(ler.next());
		System.out.println("Cadastrar lugar de checkout ");
		setQuadra(ler.next());
	}
	public void editarBicletario() {
		//Editar os locais cadastrados
	}
	public void deletarBicicletario() {
		//Resetar os dados cadastrados
		setEndereco(null); //
		setQuadra(null);
	}
	public void atualizarBicicletario() {
		//Atualizar os bicicletarios que foram editados
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
