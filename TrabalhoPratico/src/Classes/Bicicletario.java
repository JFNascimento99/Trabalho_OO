package Classes;

import java.util.Date;

public class Bicicletario {
 //Bicicleta faz parte de bicicletario...bicicleta está agregada a bicicletario.
	//Atributos
	private String lugarCheckin;
	private String lugarCheckout;
	
	//Metodo construtor do Bicicletario
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
	//Verificar se é tudo void mesmo
	public void cadastrarBicicletario() {
		//Cadastrar os locais onde se pode pegar ou deixar bicicletas
	}
	public void editarBicletario() {
		//Editar os locais cadastrados
	}
	public void deletarBicicletario() {
		//Resetar os dados cadastrados
		setLugarCheckin(null); //
		setLugarCheckout(null);
	}
	public void atualizarBicicletario() {
		//Atualizar os bicicletarios que foram editados
	}
	public void verBicicletario() {
		//Ver todos bicicletarios cadastrados
	}
	public void listarBicicletarios() {
		//Listar todos os bicicletrarios cadastrados
	}
	
}
