package Classes;
import java.util.Scanner;
import java.util.Date;

public class Bicicleta {
	//Bicicleta faz parte de bicicletario...agregação pois podem viver separadas.
	//Bicicleta faz parte de pedido de forma obrigatoria...composição pois sem bicicleta sem pedido.
	//Atributos de bicicleta
	private String tipoBicicleta;
	private boolean disponibilidadeBicicleta;
	
	//Metodo construtor da Bicicleta
	public Bicicleta(String tipoBicicleta, boolean disponibilidadeBicicleta) {
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
		//Provalvel precisar de vetor e deixar elas cadastradas no propio sistema.
		
	}
	public void editarBicicletas() { //Editar as bicicletas que teremos
		
	}
	public void deletarBicicletas() { //Resetar as biclcetas cadastradas
		//Zerando todos os dados cadastrados pras bicicletas
		setTipoBicicleta(null); 
		setDisponibilidadeBicicleta(true); //Corrigir esses erros; teoricamente ta certo agora
		
	}
	public void atualizarBicicletas() { //Atualizar as bicicletas que forem editadas
		
	}
	public void verBicicletas() { //Listar/ ver as bicicletas cadastradas
		
	}
	public void buscarBicicletas() { //Encontrar a bicicleta pela disponibilidade dela
		int opcaoMenuBike=0; //Para o menu de opcoes de bicicleta.
		 Scanner resposta = new Scanner(System.in); //Leitura de dados.
		 
		
		 do {
			 System.out.println("Olá usuario, tudo bem ? \n");
			 System.out.println("Nossa organizacao trabalha com dois tipos de bicicletas disponiveis para alugueis: \n");
			 System.out.println("As bicicletas eletricas e as bicicletas tradicionais.");
			 System.out.println("\n\n");
			 System.out.println("Busque pela bicicleta.");
			 System.out.println("Digite uma opcao de 1 a 3. \n");
			 System.out.println(" 1 - Bicicletas tradicionais. \n");
			 System.out.println(" 2 - Bicicletas eletricas. \n");
			 System.out.println(" 3- Sair. \n");
			 switch(opcaoMenuBike) {
			 case 1: System.out.println("Disponiveis 10 bicicletas tradicionais para esse bicicletario \n"); //Criar 10 bicicletas dessas pre cadastradas.
			 break;
			 case 2: System.out.println("Disponiveis 10 bicicletas eletricas para esse bicicletario \n"); //Criar 10 bicicletas dessas pre cadastraddas
			 break;
			 case 3: System.out.println("\n\n"); //Saida do menu.
			 break;
			 default: //caso o usuario insira um valor diferente.
					System.out.println("Opcao invalida. Por favor, escolha uma\n"
							+ "opcao de 1 a 3, somente.\n");
					break;
			 }
		 }while(opcaoMenuBike==3); //Se digitar 4 sairei do menu 
	}
}
	
