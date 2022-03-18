package Classes;
import Classes.*; // O "*" importa todas as classes
import java.util.Scanner;

public class Main {
	//Precisa arrumar essa main pra ficar lisa
	public static void main(String[] args) {
		
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
		
		//Faltou um while nesse "do" para funcionar e testarmos n ?
		/*
		//Menu
		
		char chamarMenu, chamarMenuUsuario, chamarMenuEdidaUsuario;
		
		do {
			chamarMenu = menu();
			switch(chamarMenu) {
			case'1': //Exibir menu usuário
				chamarMenuUsuario = menuUsuario();
				switch(chamarMenuUsuario) {
				case'1': // Cadastro de usuário
					usuario[0].cadastrUsuario(usuario);
					break;
				case'2':
					chamarMenuEdidaUsuario = menuEdidaUsuario();
					switch (chamarMenuEdidaUsuario) {
					case'1': //Informações do usuário
						usuario[0].editaPessoa();
					}
				}
			}
		}
		
		System.out.println("---------------------------------");
		System.out.println(" Sistema de aluguel de bicicleta ");
		System.out.println("---------------------------------");*/
		
	}

}