package Classes;

import java.util.Scanner;
import java.util.Date;

public class Tempo {
	//Tempo vai herdar o tempo final para pedido para termos o valor final
	//Atributos
	private String horaCheckin;
	private String horaCheckout;
	private String tempoTotal;
	
	//Variaveis extra
	String respostaCheckin;
	String respostaCheckout;
	Boolean validaCheckin = true;
	Boolean validaCheckout = true;  
	
	Scanner resposta = new Scanner(System.in); //Leitura de dados
	//Metodo construtor do Tempo
	public Tempo(String horaCheckin, String horaCheckout, String tempoTotal) {
		this.horaCheckin = horaCheckin;
		this.horaCheckout = horaCheckout;
		this.tempoTotal = tempoTotal;
  	}
	
	public String getHoraCheckIn() {
		return horaCheckin;
	}
	public void setHoraCheckIn(String horaCheckIn) {
		this.horaCheckin = horaCheckIn;
	}
	public String getHoraCheckOut() {
		return horaCheckout;
	}
	public void setHoraCheckOut(String horaCheckOut) {
		this.horaCheckout = horaCheckOut;
	}
	public String getTempoTotal() {
		return tempoTotal;
	}
	public void setTempoTotal(String tempoTotal) {
		this.tempoTotal = tempoTotal;
	}
	
	//Metodos
	public void cadastrarTempo() {
		//Cadastrar a hora de checkin e checkout e com isso ter o tempo final.
		//Utilizaremos o tempo final pro pedido pra gerar o pedido com valor por hora
		
		//Validando hora Check-in
		System.out.println("Insira a hora de check-in: ");
		setHoraCheckIn(resposta.next());
		respostaCheckin = getHoraCheckIn();
		if(!respostaCheckin.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros
			validaCheckin = false;
			do {
				System.out.println("Digite uma hora valida para seu check-in.");
				System.out.println("Insira a hora de check-in: ");
				setHoraCheckIn(resposta.next());
				respostaCheckin = getHoraCheckIn();
				if(!respostaCheckin.substring(0).matches("[0-9]*")) { //Verificando se tenho apenas numeros
					validaCheckin = false;
				}
			}while(validaCheckin == false); //Ficarei nesse looping ate digitar somente numeros
		}
		
	}
	public void editarTempo() {
		 //Editar hora de checkin e checkout e consequentemente o tempo final
	}
	public void deletarTempo() {
		//Resetar todos os dados de tempo fazendo ficar null
	}
	public void verTempo() {
		 //Ver a hora de check in e checkout e tambem o tempo final.
	}
	public void atualizarTempo() {
		//Quando se editar ou cadastrar ver o tempo atualizado
	}

}