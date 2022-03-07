package Classes;

public class Bicicleta {
	//Atributos de bicicleta
	private String tipoBicicleta;
	private boolean disponibilidadeBicicleta;
	
	//Método construtor da Bicicleta
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
}
