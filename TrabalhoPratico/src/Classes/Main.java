package Classes;
import Classes.*; // O "*" importa todas as classes
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Definição dos Bicicletários
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
