package Classes;
import java.util.Scanner;
import java.util.Date;

public class Bicicleta {
	//Bicicleta faz parte de bicicletario...agregação pois podem viver separadas.
	//Bicicleta faz parte de pedido de forma obrigatoria...composição pois sem bicicleta sem pedido.
	//Atributos de bicicleta
	
	public String Bicicletario[];
	private String tipoBicicleta;
	private boolean disponibilidadeBicicleta;
	
	//Metodo construtor da Bicicleta
	public Bicicleta(String nomeBicicleta, String tipoBicicleta, boolean disponibilidadeBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
		this.disponibilidadeBicicleta = disponibilidadeBicicleta;
	}
	
	//Getters & Setters
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
	//Metodos
	public void cadastrarBicicleta() { //Cadastrar as bicicletas que teremos
		//Devemos ter um vetor de bicicletas que tambem esteja contido num vetor de bicicletarios (similar a uma matriz)
		
	}
	public void editarBicicletas() { //Editar as bicicletas que teremos
		
	}
	public void deletarBicicletas() { //Resetar as biclcetas escolhidas pelo usuario
		//Zerando todos os dados cadastrados pras bicicletas
		setTipoBicicleta(null); 
		setDisponibilidadeBicicleta(true); //Corrigir esses erros; teoricamente ta certo agora
		
	}
	public void atualizarBicicletas() { //Atualizar as bicicletas que forem editadas e cadastradas
		
	}
	public void verBicicletas() { //Listar/ ver as bicicletas cadastradas
		
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