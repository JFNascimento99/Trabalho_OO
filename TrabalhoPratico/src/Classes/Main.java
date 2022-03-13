package Classes;
import Classes.*; // O "*" importa todas as classes
import java.util.Scanner;

public class Main {

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
		tipoBicicleta[][] bicicletas = new bicicletas[][] { //Matriz pq e um vetor p bicicletario e outro para os dois tipos de bicileta que teremos
			//cadastro das 10 bicicletas tradicionais
			new bicicletas("Bicicleta 1", "Tradicional");
			new bicicletas("Bicicleta 2", "Tradicional");
			new bicicletas("Bicicleta 3", "Tradicional");
			new bicicletas("Bicicleta 4", "Tradicional");
			new bicicletas("Bicicleta 5", "Tradicional");
			new bicicletas("Bicicleta 6", "Tradicional");
			new bicicletas("Bicicleta 7", "Tradicional");
			new bicicletas("Bicicleta 8", "Tradicional");
			new bicicletas("Bicicleta 9", "Tradicional");
			new bicicletas("Bicicleta 10", "Tradicional");
			//Cadastro das 10 bicicletas eletricas
			new bicicletas("Bicicleta 11", "Eletrica");
			new bicicletas("Bicicleta 12", "Eletrica");
			new bicicletas("Bicicleta 13", "Eletrica");
			new bicicletas("Bicicleta 14", "Eletrica");
			new bicicletas("Bicicleta 15", "Eletrica");
			new bicicletas("Bicicleta 16", "Eletrica");
			new bicicletas("Bicicleta 17", "Eletrica");
			new bicicletas("Bicicleta 18", "Eletrica");
			new bicicletas("Bicicleta 19", "Eletrica");
			new bicicletas("Bicicleta 20", "Eletrica");
				
		}
		//Devemos criar uma lista de pessoas e usuarios previamente cadastrados.
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
