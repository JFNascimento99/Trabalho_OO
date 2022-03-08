package Classes;
import Classes.*; // O "*" importa todas as classes
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Menu
		
		char chamarMenu, chamarMenuUsuario;
		
		do {
			chamarMenu = menu();
			switch(chamarMenu) {
			case'1': //Exibir menu usuário
				chamarMenuUsuario = menuUsuario();
				switch(chamarMenuUsuario) {
				case'1': // Cadastro de usuário
					usuario[0].cadastrUsuario(usuario)
				}
			}
		}
		
		System.out.println("---------------------------------");
		System.out.println(" Sistema de aluguel de bicicleta ");
		System.out.println("---------------------------------");
		
	}

}
