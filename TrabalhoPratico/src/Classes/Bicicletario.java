package Classes;

public class Bicicletario {

	//Atributos
	private String lugarCheckin;
	private String lugarCheckout;
	
	//M�todo construtor do Biciclet�rio
	public Bicicletario(String lugarCheckin, String lugarCheckout) {
		this.lugarCheckin = lugarCheckin;
		this.lugarCheckout = lugarCheckout;
	}
	
	public String getLugarCheckin() {
		return lugarCheckin;
	}

	public void setLugarCheckin(String lugarCheckin) {
		this.lugarCheckin = lugarCheckin;
	}

	public String getLugarCheckout() {
		return lugarCheckout;
	}

	public void setLugarCheckout (String lugarCheckout) {
		this.lugarCheckout = lugarCheckout;
	}

}
