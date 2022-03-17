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
	
	//Metodo construtor da Bicicleta
	public Bicicleta(String nomeBicicleta, String tipoBicicleta, boolean disponibilidadeBicicleta) {
		this.nomeBicicleta = nomeBicicleta;
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
	public String getNomeBicicleta() {
		return nomeBicicleta;
	}
	public void setNomeBicicleta(String nomeBicicleta) {
		this.nomeBicicleta = nomeBicicleta;
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
	public void buscarBicicletas() { 
		  //buscar todas bicicletas cadastradas...talvez fosse mais interessante o usuario digitar, agt comparar texto e mostrar se achar. 
		  //Precisamos que cada bicicleta seja armazenado em uma posicao do vetor(por isso que vai ta dando esse erro ali embaixo por enquanto)
		
		String buscaBicicleta = ""; //Utilizaremos para comparar oq o usuario digitou com o que estava armazenado
		Boolean encontradoBicicleta = false; //Para vermos se achamos a bicicleta procurada.
		Scanner resposta = new Scanner(System.in); //Leitura de dados
		
		//Logica de busca que usei no meu TP1
		for(int a=0; a<=100; a++){ //Passando por todo vetor de bicicletarios 
			   System.out.println("Digite o bicicletario que se deseja buscar as Bicicletas:"); 
			   procuraBicicletario = resposta.next(); //Lendo o bicicletario desejado. 
			    if(Bicicletario[a].equals(procuraBicicletario)) {  //Devemos arrumar e ter esse vetor de bicicletarios. 
			     System.out.println("Na posicao: " + a + " foi encontrado " + Bicicletario[a]); //Mostrando os dados que foram achados para esse bicicletario 
			     encontradoBicicleta = true; //A palavra digitada foi igual a alguma armazenada, logo existe o bicicletario 
			     for(int b=0; b<=100; b++) { //Passando agora por todo vetor de bicicletas.
			    	 System.out.println("Digite a bicicleta que se deseja buscar:");
			    	 buscaBicicleta = resposta.next(); //Lendo a bicicleta que o usuario quer buscar (se pah ler o numero dela é melhor)
			    	 if(Bicicleta[a][b].equals(buscaBicicleta)) { //Comparando o que foi digitado com o que tinhamos armazenado
			    		 System.out.println("Na posicao: " + b + "foi encontrado " + Bicicleta[a][b]);
			    		 enontradoBicicleta = true;
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