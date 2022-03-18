package Classes;

import java.util.Scanner;
import java.util.Date;

public class Tempo {
	//Tempo vai herdar o tempo final para pedido para termos o valor final
	//Atributos
	private double horaCheckin;
	private double horaCheckout;
	private double tempoTotal;
	
	//Metodo construtor do Tempo
	public Tempo(double horaCheckin, double horaCheckout, double tempoTotal) {
		this.horaCheckin = horaCheckin;
		this.horaCheckin = horaCheckout;
		this.tempoTotal = tempoTotal;
  	}
	
	public double getHoraCheckIn() {
		return horaCheckin;
	}
	public void setHoraCheckIn(double horaCheckIn) {
		this.horaCheckin = horaCheckIn;
	}
	public double getHoraCheckOut() {
		return horaCheckout;
	}
	public void setHoraCheckOut(double horaCheckOut) {
		this.horaCheckout = horaCheckOut;
	}
	public double getTempoTotal() {
		return tempoTotal;
	}
	public void setTempoTotal(double tempoTotal) {
		this.tempoTotal = tempoTotal;
	}
	
	//Metodos
	public void cadastrarTempo() {
		//Cadastrar a hora de checkin e checkout e com isso ter o tempo final.
		//Utilizaremos o tempo final pro pedido pra gerar o pedido com valor por hora
		
		Scanner resposta = new Scanner(System.in); //Leitura de dados
		//Variaveis pra brincar com a logica apenas, pq tenho que achar como fazer as funcoes de hora mais funcionais
		 double CheckinProvisorio = 0;
		 double checkoutProvisorio = 0;
		 double tempoTotalProvisorio = 0;
		 
		System.out.println("Insira seu horario de checkin: ");
		checkinProvisorio = resposta.next();
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