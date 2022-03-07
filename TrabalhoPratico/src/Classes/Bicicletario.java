package Classes;

public class Bicicletario {

	//Atributos
	private String lugarCheckin;
	private String lugarCheckout;
	
	//Metodo construtor do Bicicletário
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

	public void setLugarCheckout(String lugarCheckout) {
		this.lugarCheckout = lugarCheckout;
	}
	//Metodos
	public cadastrarBicicletario() {
		//Cadastrar os locais onde se pode pegar ou deixar bicicletas
	}
	public editarBicletario() {
		//Editar os locais cadastrados
	}
	public deletarBicicletario() {
		//Resetar os dados cadastrados
		setLugarCheckin(null);
		setLugarCheckout(null);
	}
	public atualizarBicicletario() {
		//Atualizar os bicicletarios que foram editados
	}
	public verBicicletario() {
		//Ver todos bicicletarios cadastrados
	}
	public listarBicicletarios() {
		//Listar todos os bicicletrarios cadastrados
	}
	
}
