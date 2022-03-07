package Classes;

public class Tempo {
	
	//Atributos
	private double horaCheckin;
	private double horaCheckout;
	private double tempoTotal;
	
	//Método construtor do Tempo
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

}
