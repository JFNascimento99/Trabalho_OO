package Classes;
import Classes.*; // O "*" importa todas as classes
import java.util.Scanner;

public class Main {
	//Precisa arrumar essa main pra ficar lisa
	public static void main(String[] args) {
		int opcaoMenuInicial = 0;
		Scanner resposta = new Scanner(System.in);
		//Precisa instanciar os objetos.
		
		//Definicao dos Bicicletarios
		Bicicletario[] bicicletarios = new Bicicletario[] {
				new Bicicletario("Asa Norte", "SQN 116"),
				new Bicicletario("Asa Norte", "SQN 114"),
				new Bicicletario("Asa Norte", "SQN 112"),
				new Bicicletario("Asa Norte", "SQN 110"),
				new Bicicletario("Asa Norte", "SQN 108"),
				new Bicicletario("Asa Sul", "SQS 116"),
				new Bicicletario("Asa Sul", "SQS 114"),
				new Bicicletario("Asa Sul", "SQS 112"),
				new Bicicletario("Asa Sul", "SQS 110"),
				new Bicicletario("Asa Sul", "SQS 108"),
		};
		
		//Definicao dos tipos de bicicleta
		Bicicleta[] bicicletas = new Bicicleta[] { //Matriz pq e um vetor p bicicletario e outro para os dois tipos de bicileta que teremos
			//cadastro das 10 bicicletas tradicionais
			new Bicicleta("Bicicleta 1", "Tradicional", true),
			new Bicicleta("Bicicleta 2", "Tradicional", true),
			new Bicicleta("Bicicleta 3", "Tradicional", true),
			new Bicicleta("Bicicleta 4", "Tradicional", true),
			new Bicicleta("Bicicleta 5", "Tradicional", true),
			new Bicicleta("Bicicleta 6", "Tradicional", true),
			new Bicicleta("Bicicleta 7", "Tradicional", true),
			new Bicicleta("Bicicleta 8", "Tradicional", true),
			new Bicicleta("Bicicleta 9", "Tradicional", true),
			new Bicicleta("Bicicleta 10", "Tradicional", true),
			//Cadastro das 10 bicicletas eletricas
			new Bicicleta("Bicicleta 11", "Eletrica", true),
			new Bicicleta("Bicicleta 12", "Eletrica", true),
			new Bicicleta("Bicicleta 13", "Eletrica", true),
			new Bicicleta("Bicicleta 14", "Eletrica", true),
			new Bicicleta("Bicicleta 15", "Eletrica", true),
			new Bicicleta("Bicicleta 16", "Eletrica", true),
			new Bicicleta("Bicicleta 17", "Eletrica", true),
			new Bicicleta("Bicicleta 18", "Eletrica", true),
			new Bicicleta("Bicicleta 19", "Eletrica", true),
			new Bicicleta("Bicicleta 20", "Eletrica", true),
				
		};
		//Devemos criar uma lista de pessoas e usuarios previamente cadastrados.
		
		//Menus
		/*
		//menu inicial.
		do {
			opcaoMenuInicial = Menu(opcaoMenuInicial, resposta);
			switch(opcaoMenuInicial) {
			
			case 1:
				//Usuario
				System.out.println("Usuario: ");
				user.cadastrarUsuario();
				user.editarUsuario();
				user.deletarUsuario();
				user.atualizarUsuario();
				user.listarUsuario();
				user.buscarUsuario();
				break;
				
			case 2:
				//pessoas
				System.out.println("Pessoas: ");
				user.cadastrarPessoa();
				user.editarPessoa();
				user.deletarPessoa();
				break;
			
			case 3:
				//Bicicletario
				System.out.println("Bicicletario: ");
				user.cadastrarBicicletario();
				user.editarBicicletario();
				user.deletarBicicletario();
				user.atualizarBicicletario();
				user.buscarBicicletario();
				user.listarBicicletario();
				break;
				
			case 4:
				//Bicicleta
				System.out.println("Bicicleta: ");
				user.cadastrarBicicleta();
				user.editarBicicleta();
				user.deletarBicicleta();
				user.atualizarBicicleta();
				user.verBicicleta();
				user.buscarBicicleta();
				user.listarBicicleta();
				break;
				
			case 5:
				//Forma de pagamento
				System.out.println("Forma de pagamento: ");
				user.cadastrarFormaPagamento();
				user.editarFormaPagamento();
				user.deletarFormaPagamento();
				user.atualizarFormaPagamento();
				break;
				
			case 6:
				//Pedido
				System.out.println("Pedido: ");
				user.verPedido();
				user.atualizarPedido();
				user.listarPedido();
				break;
				
			case 7:
				//Tempo
				System.out.println("Tempo: ");
				user.cadastrarTempo();
				user.editarTempo();
				user.deletarTempo();
				user.verTempo();
				user.atualizarTempo();
				break;
				
			case 8:
				//Sair
				System.out.println("Obrigado pela preferencia usuario !!!");
				break;
				
				default:
					System.out.println("Opcao invalida, insira uma opcao de 1 a 8. ");
			}
		}while(opcaoMenuInicial==8);
		
		//Menu de opcoes 
		public static int Menu(int opcaoMenuInicial, Scanner resposta) {
			//Tem que ver essa ordem pra fazer sentido.
			
			System.out.print(" Menu: ");
			System.out.print(" Opcao 1 - Usuario: ");
			System.out.print(" Opcao 2 - Pessoa: ");
			System.out.print(" Opcao 3 - Bicicletario: ");
			System.out.print(" Opcao 4 - Bicicleta: ");
			System.out.print(" Opcao 5 - Pagamento: ");
			System.out.print(" Opcao 6 - Pedido: ");
			System.out.print(" Opcao 7 - Tempo: ");
			System.out.print("Opcao 8  - Sair: ");
			System.out.print("\n");
			System.out.println("Digite uma opcao: ");
			opcaoMenuInicial = resposta.nextInt();
			return opcaoMenuInicial;
		}*/
		
		
	}

}